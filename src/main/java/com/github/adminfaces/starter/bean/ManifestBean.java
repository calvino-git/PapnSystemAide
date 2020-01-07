/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.bean;

import com.github.adminfaces.starter.util.AWPAPNWebService;
import com.github.adminfaces.starter.util.AWPAPNWebService_Service;
import com.github.adminfaces.starter.util.GenererManifesteResponse;
import com.github.adminfaces.starter.util.GetManListRef;
import com.github.adminfaces.starter.util.GetManListRefResponse;
import com.github.adminfaces.starter.util.InputReference;
import com.github.adminfaces.starter.util.ObjectFactory;
import com.github.adminfaces.starter.util.RefManResult;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Calvin ILOKI
 */
@Named
@Dependent
public class ManifestBean {

    private String debut;
    private String fin;
    private String trafic;
    private List<RefManResult> refManList;
    private AWPAPNWebService awService;

    @PostConstruct
    private void init() {
        
    }

    public void searchRefMan() {
        AWPAPNWebService_Service ws = new AWPAPNWebService_Service();
        ObjectFactory factory = new ObjectFactory();
        awService = ws.getAWPAPNWebServicePort();
        InputReference inRef = factory.createInputReference();
        inRef.setDebut(debut);
        inRef.setFin(fin);
        inRef.setType(trafic);
        GetManListRef requestRefListManifest = factory.createGetManListRef();
        requestRefListManifest.setArg0(inRef);
        
        if (awService != null) {
            System.out.println("Apple du Web Service de la douane... ");
            System.out.println("Date de debut : " + inRef.getDebut());
            System.out.println("Date de fin : " + inRef.getFin());
            System.out.println("Trafic : " + inRef.getType());
            refManList = awService.getManListRef(inRef);
        }
        
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Successful", "Ref Man resultat : " + refManList.size()));
    }

    public AWPAPNWebService getAwService() {
        return awService;
    }

    public void setAwService(AWPAPNWebService awService) {
        this.awService = awService;
    }

    public String getDebut() {
        return debut;
    }

    public void setDebut(String debut) {
        this.debut = debut;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
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

}
