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
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
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
        ws = new AWPAPNWebService_Service();
        awService = ws.getAWPAPNWebServicePort();
        factory = new ObjectFactory();
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
            refManList = list.stream().filter(m -> m.getBureauDouane().contains("DD141") || m.getBureauDouane().contains("DD147")).collect(Collectors.toList());
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
