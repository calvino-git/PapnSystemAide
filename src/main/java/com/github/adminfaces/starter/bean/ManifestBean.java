/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.bean;

import com.github.adminfaces.starter.model.Awmds;
import com.github.adminfaces.starter.service.ManifesteService;
import com.github.adminfaces.starter.util.RefManResult;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author Calvin ILOKI
 */
@Named
@SessionScoped
public class ManifestBean implements Serializable {

    private Date debut;
    private Date fin;
    private String trafic;
    private List<RefManResult> refManList;
    private UploadedFile xmlManifeste;

    @Inject
    ManifesteService manifesteService;

    @PostConstruct
    private void init() {

    }

    public void rechercherRefMan() {
        if (trafic.equals("T")) {
            refManList = manifesteService.rechercherRefMan(debut, fin, "IMP");
            refManList.addAll(manifesteService.rechercherRefMan(debut, fin, "EXP"));
        } else {
            refManList = manifesteService.rechercherRefMan(debut, fin, trafic);
        }

    }

    public void downloadManifeste(RefManResult ref) throws IOException {
        manifesteService.telechargerManifesteFromDouane(ref);
    }

    public void convertirManifeste(FileUploadEvent event) throws IOException, JAXBException {
        xmlManifeste = event.getFile();
        Awmds awmds = manifesteService.convertirManifeste(xmlManifeste.getInputstream());
        JAXBContext jaxbContext = JAXBContext.newInstance(Awmds.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        HttpServletResponse response = (HttpServletResponse) externalContext.getResponse();
//      Initialize response.
        response.reset(); // Some JSF component library or some Filter might have set some headers in the buffer beforehand. We want to get rid of them, else it may collide.
        response.setContentType("application/xml"); // Check http://www.iana.org/assignments/media-types for all types. Use if necessary ServletContext#getMimeType() for auto-detection based on filename.
        response.setHeader("Content-disposition", "attachment; filename=\"manifeste.xml\"");
        OutputStream out = response.getOutputStream();
        marshaller.marshal(awmds, out);
        facesContext.responseComplete();
    }

    public String getTrafic() {
        return trafic;
    }

    public void setTrafic(String trafic) {
        this.trafic = trafic;
    }

    public List<RefManResult> getRefManList() {
        return refManList;
    }

    public void setRefManList(List<RefManResult> refManList) {
        this.refManList = refManList;
    }

    public Date getDebut() {
        return debut;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public UploadedFile getXmlManifeste() {
        return xmlManifeste;
    }

    public void setXmlManifeste(UploadedFile xmlManifeste) {
        this.xmlManifeste = xmlManifeste;
    }
}
