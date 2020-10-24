/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.service;

import com.github.adminfaces.starter.model.ReferenceManifeste;
import com.github.adminfaces.starter.ws.*;
import com.github.adminfaces.template.exception.BusinessException;
import static com.github.adminfaces.template.util.Assert.has;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.ejb.Stateless;
import javax.inject.Inject;
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

    private ManifesteWebService webService;
    private ObjectFactory factory;
    private ManifesteWebService_Service service;
    private Unmarshaller unmarshaller;
    private Marshaller marshaller;
    private int i;
    SimpleDateFormat format;

    @Inject
    ReferenceManifesteService referenceManifesteService;

    @PostConstruct
    public void init() {
        System.out.println("[" + LocalDateTime.now() + "] Service de recherche de manifestes à douane demarré ...");
        format = new SimpleDateFormat("yyyyMMdd-HHmm");
        factory = new ObjectFactory();
        service = new ManifesteWebService_Service();
        webService = service.getManifesteWebServicePort();
    }

//    @Schedule(hour = "*", persistent = false)
    public void verifierNouveauManifestDouane() {
        if (webService == null) {
            service = new ManifesteWebService_Service();
            webService = service.getManifesteWebServicePort();
        }

        ZoneId defaultZoneId = ZoneId.systemDefault();

        //creating the instance of LocalDate using the day, month, year info
        LocalDate localDate = LocalDate.now();

        //local date + atStartOfDay() + default time zone + toInstant() = Date
        Date today_6 = Date.from(localDate.minusDays(6).atStartOfDay(defaultZoneId).toInstant());
        Date today = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());

        //Displaying LocalDate and Date                        
        Logger.getLogger("DOUANE WEB SERVICE").info("Recherche de nouveaux manifestes douanes déposés aujourd'hui ...");
        List<RefManResult> refManList = new ArrayList<>();
        refManList = rechercherRefMan(today_6, today, "IMP");
        refManList.addAll(rechercherRefMan(today_6, today, "EXP"));
        if (!refManList.isEmpty()) {
            i = 0;
            refManList.forEach(ref -> {
                try {
                    InputStream stream = recupererStreamManifeste(ref);
                    JAXBContext jaxbContext = JAXBContext.newInstance(Awmds.class);
                    unmarshaller = jaxbContext.createUnmarshaller();
                    Awmds awmds = (Awmds) unmarshaller.unmarshal(stream);
                    marshaller = jaxbContext.createMarshaller();
                    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                    String[] tmp = ref.getDateEnregistrement().split("/");
                    String date_enregistrement_douane = tmp[2] + tmp[1] + tmp[0];
                    String navire = ref.getNavire() != null ? ref.getNavire().replaceAll("/", "").replaceAll("\"", "").replaceAll(" ", "_") : "";
                    String filename = "D:\\escales\\manifest\\douane" + File.separator + tmp[2] + File.separator + tmp[1] + File.separator + tmp[0] + File.separator + navire + "-" + ref.getCodeTransporteur() + "-" + ref.getAnneeEnregistrement() + "-" + ref.getNumeroEnregistrement() + "-" + date_enregistrement_douane + ".xml";

                    File xml = new File(filename);

                    // Marshalling and saving XML to the file.
                    if (!xml.exists()) {
                        xml.getParentFile().mkdirs();
                        marshaller.marshal(awmds, xml);
                        i++;
                        System.out.println("TECHARGEMENT N° " + i + " => " + xml.getAbsolutePath());
                    }

                } catch (JAXBException ex) {
                    Logger.getLogger(ManifesteService.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
        }
    }

    public List<RefManResult> rechercherRefMan(Date debut, Date fin, String trafic) {
        List<RefManResult> refManList = new ArrayList<>();
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        if (webService == null) {
            service = new ManifesteWebService_Service();
            webService = service.getManifesteWebServicePort();
        }

        if (webService != null) {
            refManList = webService.findManifeste(fmt.format(debut), fmt.format(fin), trafic);
            System.out.println("Manifeste(s) " + trafic + " trouvé(s) : " + refManList.size());
        }
        return refManList;
    }

    public InputStream recupererStreamManifeste(RefManResult ref) {
        if (webService == null) {
            service = new ManifesteWebService_Service();
            webService = service.getManifesteWebServicePort();
        }
        String manifeste = webService.genererManifeste(ref.getNumeroEnregistrement(), ref.getNumeroVoyage(), ref.getDateDepart());
        InputStream stream = new ByteArrayInputStream(manifeste.getBytes(Charset.forName("UTF-8")));
        return stream;
    }

    public void telechargerManifesteFromDouane(RefManResult ref) throws IOException {
        InputStream stream = recupererStreamManifeste(ref);
        String[] tmp = ref.getDateEnregistrement().split("/");
        String date_enregistrement_douane = tmp[2] + tmp[1] + tmp[0];
        String navire = ref.getNavire() != null ? ref.getNavire().replaceAll("/", "").replaceAll("\"", "").replaceAll(" ", "_") : "";
        Faces.sendFile(stream, navire + "-" + ref.getCodeTransporteur() + "-" + ref.getAnneeEnregistrement() + "-" + ref.getNumeroEnregistrement() + "-" + date_enregistrement_douane + ".xml", true);

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

    public static void writeToZipFile(File xml, ZipOutputStream zipStream) throws FileNotFoundException, IOException {
        System.out.println("Writing file : '" + xml + "' to zip file");
//        File aFile = new File(xml);
        try (FileInputStream fis = new FileInputStream(xml)) {
            ZipEntry zipEntry = new ZipEntry(xml.getName());
            zipStream.putNextEntry(zipEntry);
            byte[] bytes = new byte[1024];
            int length;
            while ((length = fis.read(bytes)) >= 0) {
                zipStream.write(bytes, 0, length);
            }
            zipStream.closeEntry();
        }
    }

    public ObjectFactory getFactory() {
        return factory;
    }

    public void setFactory(ObjectFactory factory) {
        this.factory = factory;
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

    public ManifesteWebService getWebService() {
        return webService;
    }

    public void setWebService(ManifesteWebService webService) {
        this.webService = webService;
    }

    public ManifesteWebService_Service getService() {
        return service;
    }

    public void setService(ManifesteWebService_Service service) {
        this.service = service;
    }

}
