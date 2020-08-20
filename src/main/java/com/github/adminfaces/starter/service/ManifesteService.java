/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.service;

import com.github.adminfaces.starter.model.Awmds;
import com.github.adminfaces.starter.util.AWPAPNWebService;
import com.github.adminfaces.starter.util.AWPAPNWebService_Service;
import com.github.adminfaces.starter.util.GetManListRef;
import com.github.adminfaces.starter.util.InputReference;
import com.github.adminfaces.starter.util.InputReferenceGetManifest;
import com.github.adminfaces.starter.util.ObjectFactory;
import com.github.adminfaces.starter.util.RefManResult;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import static java.time.temporal.ChronoField.*;
import java.time.temporal.TemporalField;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Stateless;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.omnifaces.util.Faces;

/**
 *
 * @author Calvin ILOKI
 */
@Stateless
@Startup
public class ManifesteService implements Serializable {

    private AWPAPNWebService awService;
    private InputReference inRef;
    private ObjectFactory factory;
    private GetManListRef requestRefListManifest;
    private AWPAPNWebService_Service ws;
    private Unmarshaller unmarshaller;
    private Marshaller marshaller;

    @PostConstruct
    public void init() {
        System.out.println("[" + LocalDateTime.now() + "] Service de recherche de manifestes à douane demarré ...");
        ws = new AWPAPNWebService_Service();
        awService = ws.getAWPAPNWebServicePort();
        factory = new ObjectFactory();
    }

    @Schedule(hour = "*", minute = "*/10", persistent = false)
    public void verifierNouveauManifestDouane() {
        ZoneId defaultZoneId = ZoneId.systemDefault();

        //creating the instance of LocalDate using the day, month, year info
        LocalDate localDate = LocalDate.now();

        //local date + atStartOfDay() + default time zone + toInstant() = Date
        Date today = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());

        //Displaying LocalDate and Date
        System.out.println("LocalDate is: " + localDate);
        System.out.println("Date is: " + today);
        System.out.println("[" + today.toString() + "] Recherche de nouveaux manifestes douanes déposés aujourd'hui ...");
        List<RefManResult> refManList = null;
        refManList = rechercherRefMan(today, today, "IMP");
        refManList.addAll(rechercherRefMan(today, today, "EXP"));
        if (!refManList.isEmpty()) {
            refManList.forEach(ref -> {
                try {
                    System.out.println("TELECHARGEMENT DE " + ref.getNavire() + "-" + ref.getNumeroVoyage() + "-" + ref.getCodeTransporteur() + "-" + ref.getDateArrivee() + ".xml");
                    InputStream stream = recupererStreamManifeste(ref);
                    JAXBContext jaxbContext = JAXBContext.newInstance(Awmds.class);
                    unmarshaller = jaxbContext.createUnmarshaller();
                    Awmds awmds = (Awmds) unmarshaller.unmarshal(stream);
                    marshaller = jaxbContext.createMarshaller();
                    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                    String[] tmp = ref.getDateEnregistrement().split("/");
                    String date_enregistrement_douane = tmp[2] + tmp[1] + tmp[0];
                    File xml = new File("D:\\escales\\manifest\\douane" + File.separator + ref.getNavire().replaceAll("/", "") + "-" + ref.getCodeTransporteur() + "-" + ref.getAnneeEnregistrement() + "-" + ref.getNumeroEnregistrement() + "-" + date_enregistrement_douane + ".xml");

                    // Marshalling and saving XML to the file.
                    if (!xml.exists()) {
                        marshaller.marshal(awmds, xml);
                        System.out.println("ENREGISTREMENT: " + xml.getAbsolutePath());
                    }

                } catch (JAXBException ex) {
                    Logger.getLogger(ManifesteService.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
        }
    }

    public List<RefManResult> rechercherRefMan(Date debut, Date fin, String trafic) {
        inRef = factory.createInputReference();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        inRef.setDebut(sdf.format(debut));
        inRef.setFin(sdf.format(fin));
        inRef.setType(trafic);
        requestRefListManifest = factory.createGetManListRef();
        requestRefListManifest.setArg0(inRef);
        List<RefManResult> refManList = null;

        if (awService != null) {
            System.out.println("Appel du Web Service de la douane... ");
            System.out.println("Date de debut : " + inRef.getDebut());
            System.out.println("Date de fin : " + inRef.getFin());
            System.out.println("Trafic : " + inRef.getType());
            List<RefManResult> list = awService.getManListRef(inRef);
            System.out.println("Manifeste(s) trouvé(s) : " + list.size());

            refManList = list.stream().filter(m -> m.getBureauDouane() != null && m.getBureauDouane().contains("DD141") || m.getBureauDouane() != null && m.getBureauDouane().contains("DD147")).collect(Collectors.toList());
        }
        return refManList;
    }

    public InputStream recupererStreamManifeste(RefManResult ref) {
        InputReferenceGetManifest refman = factory.createInputReferenceGetManifest();
        refman.setDateDepart(ref.getDateDepart());
        refman.setNumEnreg(ref.getNumeroEnregistrement());
        refman.setNumVoy(ref.getNumeroVoyage());
        String manifeste = awService.genererManifeste(refman);
        InputStream stream = new ByteArrayInputStream(manifeste.getBytes(Charset.forName("UTF-8")));
        return stream;
    }

    public void telechargerManifesteFromDouane(RefManResult ref) throws IOException {
        InputStream stream = recupererStreamManifeste(ref);
        Faces.sendFile(stream, ref.getNavire() + "-" + ref.getNumeroVoyage() + "-" + ref.getCodeTransporteur() + "-" + ref.getDateArrivee() + ".xml", true);

    }

    public Awmds convertirManifeste(InputStream stream) throws JAXBException, IOException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Awmds.class);
        unmarshaller = jaxbContext.createUnmarshaller();
        Awmds awmds = (Awmds) unmarshaller.unmarshal(stream);
//        marshaller = jaxbContext.createMarshaller();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//        FacesContext facesContext = FacesContext.getCurrentInstance();
//        ExternalContext externalContext = facesContext.getExternalContext();
//        HttpServletResponse response = (HttpServletResponse) externalContext.getResponse();

        // Initialize response.
//        response.reset(); // Some JSF component library or some Filter might have set some headers in the buffer beforehand. We want to get rid of them, else it may collide.
//        response.setContentType("application/xml"); // Check http://www.iana.org/assignments/media-types for all types. Use if necessary ServletContext#getMimeType() for auto-detection based on filename.
//        response.setHeader("Content-disposition", "attachment; filename=\"name.xml\"");
//        OutputStream out = response.getOutputStream();
//        File file = new File("man.xml");
//        marshaller.marshal(awmds, file);
//        
//        Faces.sendFile(file, true);
////        facesContext.responseComplete();
        return awmds;
    }

    public AWPAPNWebService getAwService() {
        return awService;
    }

    public void setAwService(AWPAPNWebService awService) {
        this.awService = awService;
    }

    public InputReference getInRef() {
        return inRef;
    }

    public void setInRef(InputReference inRef) {
        this.inRef = inRef;
    }

    public ObjectFactory getFactory() {
        return factory;
    }

    public void setFactory(ObjectFactory factory) {
        this.factory = factory;
    }

    public GetManListRef getRequestRefListManifest() {
        return requestRefListManifest;
    }

    public void setRequestRefListManifest(GetManListRef requestRefListManifest) {
        this.requestRefListManifest = requestRefListManifest;
    }

    public AWPAPNWebService_Service getWs() {
        return ws;
    }

    public void setWs(AWPAPNWebService_Service ws) {
        this.ws = ws;
    }

    public Unmarshaller getUnmarshaller() {
        return unmarshaller;
    }

    public void setUnmarshaller(Unmarshaller unmarshaller) {
        this.unmarshaller = unmarshaller;
    }

    public Marshaller getMarshaller() {
        return marshaller;
    }

    public void setMarshaller(Marshaller marshaller) {
        this.marshaller = marshaller;
    }

}
