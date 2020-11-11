/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.bean;

import com.github.adminfaces.starter.service.ManifesteService;
import com.github.adminfaces.starter.ws.Awmds;
import com.github.adminfaces.starter.ws.RefManResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipOutputStream;
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
import org.omnifaces.util.Faces;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.file.UploadedFile;

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
    private int i;

    @PostConstruct
    private void init() {

    }

    public void rechercherRefMan() {
        refManList = new ArrayList<>();
        if (trafic.equals("TOUT")) {
            refManList.addAll(manifesteService.rechercherRefMan(debut, fin, "IMP"));
            refManList.addAll(manifesteService.rechercherRefMan(debut, fin, "EXP"));
        } else {
            refManList = manifesteService.rechercherRefMan(debut, fin, trafic);
        }
    }

    public void downloadManifeste(RefManResult ref) throws IOException {
        manifesteService.telechargerManifesteFromDouane(ref);
    }

    public void telechargerTousLesManifestes() throws FileNotFoundException, IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String dossierDouane = "D:\\escales\\manifest\\douane";
        String zipFile = dossierDouane + File.separator + "Manifeste-" + sdf.format(debut) + "-" + sdf.format(fin) + ".zip";

        if (!refManList.isEmpty()) {
            try (FileOutputStream file = new FileOutputStream(zipFile); ZipOutputStream zip = new ZipOutputStream(file)) {
                i = 0;
                refManList.forEach(ref -> {
                    long copy = 0;
                    try {
                        String[] tmp = ref.getDateEnregistrement().split("/");
                        String date_enregistrement_douane = tmp[2] + tmp[1] + tmp[0];
                        String navire = ref.getNavire() != null ? ref.getNavire().replaceAll("/", "").replaceAll("\"", "").replaceAll(" ", "_") : "";
                        String fileName = navire + "-" + ref.getCodeTransporteur()
                                + "-" + ref.getAnneeEnregistrement()
                                + "-" + ref.getNumeroEnregistrement()
                                + "-" + date_enregistrement_douane + ".xml";

                        File xml = new File(dossierDouane + File.separator + tmp[2] + File.separator + tmp[1] + File.separator + tmp[0] + File.separator + fileName);
                        xml.getParentFile().mkdirs();
                        InputStream inputStream = manifesteService.recupererStreamManifeste(ref);
                        Files.copy(inputStream, xml.toPath(), REPLACE_EXISTING);
                        if (!xml.exists()) {
                            Files.createFile(xml.toPath());
                            i++;
                            System.out.println("TECHARGEMENT N° " + i + " => " + xml.getAbsolutePath());
                        }
//                        
//                        try (FileOutputStream fos = new FileOutputStream(xml)) {
//                            byte[] bytes = new byte[1024];
//                            int length;
//                            while ((length = inputStream.read(bytes)) >= 0) {
//                                fos.write(bytes, 0, length);
//                            }
//                            fos.close();
//                        }
                        manifesteService.writeToZipFile(xml, zip);
                    } catch (IOException ex) {
                        Logger.getLogger(ManifestBean.class.getName()).log(Level.SEVERE, "" + copy, ex);
                    }
                });
                zip.close();
                file.close();
            }
        }
        File file = new File(zipFile);
        System.out.println(file.getAbsolutePath());
        Faces.sendFile(file, true);

    }

    public void convertirManifeste(FileUploadEvent event) throws IOException, JAXBException {
        xmlManifeste = event.getFile();
        InputStream inputStream = xmlManifeste.getInputStream();
        Awmds awmds = manifesteService.convertirManifeste(inputStream);
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
