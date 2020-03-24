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
import com.github.adminfaces.starter.model.ConteneurDouane;
import com.github.adminfaces.starter.service.ConteneurCongoTerminalService;
import com.github.adminfaces.starter.service.ConteneurDouaneService;
import com.github.adminfaces.template.exception.BusinessException;
import static com.github.adminfaces.template.util.Assert.has;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;

/**
 * Created by rmpestano on 12/02/17.
 */
@Named
@SessionScoped
@BeanService(ConteneurDouaneService.class)
public class ConteneurBean extends CrudMB<ConteneurDouane> implements Serializable {

    @Inject
    ConteneurDouaneService conteneurDouaneService;

    private Integer mois;
    private String numero;
    private Date date;
    private ConteneurDouane selectedConteneur;
    private SimpleDateFormat format;
    private DefaultDashboardModel model;

    @PostConstruct
    public void initBean() {
        format = new SimpleDateFormat("dd/MM/yyyy");
        this.model = new DefaultDashboardModel();
        DashboardColumn mainColumn = new DefaultDashboardColumn();

        mainColumn.addWidget("ct");
        mainColumn.addWidget("douane");

        this.model.addColumn(mainColumn);
    }

    public void findNumero() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        final ELContext elContext = facesContext.getELContext();
        final Application application = facesContext.getApplication();
        ExpressionFactory expressionFactory = application.getExpressionFactory();
        ValueExpression exp = expressionFactory.createValueExpression(elContext, "#{conteneurCongoTerminalBean}", Object.class);
        ConteneurCongoTerminalBean result = (ConteneurCongoTerminalBean) exp.getValue(elContext);
        result.setNumCtn(numero);
        result.findCTNByNumCtn();
        filter.getEntity().setNumero(numero);
    }

    public void onRowSelect(SelectEvent event) {
        FacesMessage msg = new FacesMessage("Conteneur selectionné", ((ConteneurDouane) event.getObject()).getId().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public Integer getMois() {
        return mois;
    }

    public void setMois(Integer mois) {
        this.mois = mois;
    }

    public ConteneurDouane getSelectedConteneur() {
        return selectedConteneur;
    }

    public void setSelectedConteneur(ConteneurDouane selectedConteneur) {
        this.selectedConteneur = selectedConteneur;
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

    public DefaultDashboardModel getModel() {
        return model;
    }

    public void setModel(DefaultDashboardModel model) {
        this.model = model;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
