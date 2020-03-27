package com.github.adminfaces.starter.bean;

import com.github.adminfaces.persistence.bean.BeanService;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.omnifaces.cdi.ViewScoped;
import com.github.adminfaces.persistence.bean.CrudMB;
import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.persistence.service.Service;
import static com.github.adminfaces.persistence.util.Messages.getMessage;
import com.github.adminfaces.starter.model.Car;
import com.github.adminfaces.starter.model.ConteneurCT;
import com.github.adminfaces.starter.service.ConteneurCTService;
import com.github.adminfaces.starter.service.ConteneurCongoTerminalService;
import com.github.adminfaces.template.exception.BusinessException;
import static com.github.adminfaces.template.util.Assert.has;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;

/**
 * Created by rmpestano on 12/02/17.
 */
@Named
@SessionScoped
@BeanService(ConteneurCTService.class)
public class ConteneurCongoTerminalBean extends CrudMB<ConteneurCT> implements Serializable {

    @Inject
    ConteneurCTService conteneurCTService;

    private Integer mois;
    private String numCtn;
    private Date date;
    private ConteneurCT selectedConteneur;
    private SimpleDateFormat format ;
    
    @PostConstruct
    public void initBean(){
        format = new SimpleDateFormat("dd/MM/yyyy");
    }

    public void findCTNByNumCtn() {
        filter.getEntity().setNumCtn(numCtn);
    }

    public void onRowSelect(SelectEvent event) {
        FacesMessage msg = new FacesMessage("Conteneur selectionné", ((ConteneurCT) event.getObject()).getId().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public Integer getMois() {
        return mois;
    }

    public void setMois(Integer mois) {
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

    public SimpleDateFormat getFormat() {
        return format;
    }

    public void setFormat(SimpleDateFormat format) {
        this.format = format;
    }

}
