package com.github.adminfaces.starter.bean;

import static com.github.adminfaces.persistence.util.Messages.addDetailMessage;
import static com.github.adminfaces.persistence.util.Messages.getMessage;
import static com.github.adminfaces.template.util.Assert.has;

import java.io.Serializable;
import java.util.List;
import java.math.BigInteger;

import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import com.github.adminfaces.persistence.bean.CrudMB;
import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.persistence.service.Service;
import com.github.adminfaces.starter.model.ConteneurCongoTerminal;
import com.github.adminfaces.starter.service.ConteneurCongoTerminalService;
import com.github.adminfaces.template.exception.BusinessException;
import java.util.Date;
import java.util.Locale;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;

/**
 * Created by rmpestano on 12/02/17.
 */
@Named
@ViewScoped
public class ConteneurCongoTerminalBean extends CrudMB<ConteneurCongoTerminal> implements Serializable {

    @Inject
    ConteneurCongoTerminalService conteneurCongoTerminalService;

    @Inject
    @Service
    CrudService<ConteneurCongoTerminal, Integer> ctnCrudService; //generic injection example

    private Integer mois;
    private String numCtn;
    private Date date;
    private ConteneurCongoTerminal selectedConteneur;

    @Inject
    public void initService() {
        setCrudService(conteneurCongoTerminalService);
    }

    public void findCtnByNumCtn(String numCtn) {
        System.out.println("Recherche du conteneur numero: " + numCtn);
        if (numCtn.isEmpty()) {
            throw new BusinessException("Merci de renseigner le numero de conteneur");
        }
        List<ConteneurCongoTerminal> ctnsFound = conteneurCongoTerminalService.findByNumero(numCtn);
        if (ctnsFound == null || ctnsFound.isEmpty()) {
            throw new BusinessException(String.format("Aucun conteneur trouvé N° %s", numCtn));
        }
        
        filteredValue = ctnsFound;
        getFilter().addParam("numCtn", numCtn);
    }
    
    public void onRowSelect(SelectEvent event) {
        FacesMessage msg = new FacesMessage("Conteneur selectionné", ((ConteneurCongoTerminal) event.getObject()).getId().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public Integer getMois() {
        return mois;
    }

    public void setMois(Integer mois) {
        System.out.println("Mois : " + mois);
        this.mois = mois;
    }

    public ConteneurCongoTerminal getSelectedConteneur() {
        return selectedConteneur;
    }

    public void setSelectedConteneur(ConteneurCongoTerminal selectedConteneur) {
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