package com.github.adminfaces.starter.bean;

import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.omnifaces.cdi.ViewScoped;
import com.github.adminfaces.persistence.bean.CrudMB;
import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.persistence.service.Service;
import com.github.adminfaces.starter.model.Car;
import com.github.adminfaces.starter.model.ConteneurCT;
import com.github.adminfaces.starter.service.ConteneurCongoTerminalService;
import com.github.adminfaces.template.exception.BusinessException;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;

/**
 * Created by rmpestano on 12/02/17.
 */
@Named
@ViewScoped
public class ConteneurCongoTerminalBean extends CrudMB<ConteneurCT> implements Serializable {

    @Inject
    ConteneurCongoTerminalService conteneurCTService;

    @Inject
    @Service
    CrudService<ConteneurCT, Integer> ctnCrudService; //generic injection example

    private Integer mois;
    private String numCtn;
    private Date date;
    private ConteneurCT selectedConteneur;

    @Inject
    public void initService() {
        setCrudService(ctnCrudService);
    }

    public void onRowSelect(SelectEvent event) {
        FacesMessage msg = new FacesMessage("Conteneur selectionné", ((ConteneurCT) event.getObject()).getId().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public Integer getMois() {
        return mois;
    }

    public void setMois(Integer mois) {
        System.out.println("Mois : " + mois);
        this.mois = mois;
    }

    public ConteneurCT getSelectedConteneur() {
        return selectedConteneur;
    }

    public void setSelectedConteneur(ConteneurCT selectedConteneur) {
        this.selectedConteneur = selectedConteneur;
    }

    public String getNumCtn() {
        return numCtn;
    }

    public void setNumCtn(String numCtn) {
        this.numCtn = numCtn;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
