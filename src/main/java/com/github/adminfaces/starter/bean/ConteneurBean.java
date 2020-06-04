package com.github.adminfaces.starter.bean;

import com.github.adminfaces.persistence.bean.BeanService;
import java.io.Serializable;
import javax.inject.Inject;
import javax.inject.Named;
import com.github.adminfaces.persistence.bean.CrudMB;
import com.github.adminfaces.starter.model.ConteneurDouane;
import com.github.adminfaces.starter.service.ConteneurDouaneService;
import static com.github.adminfaces.template.util.Assert.has;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    private SimpleDateFormat format2;
    private DefaultDashboardModel model;

    @PostConstruct
    public void initBean() {
        format2 = new SimpleDateFormat("yyyyMM");
        format = new SimpleDateFormat("dd/MM/yyyy");
        this.model = new DefaultDashboardModel();
        DashboardColumn mainColumn = new DefaultDashboardColumn();
        mainColumn.addWidget("ct");
        mainColumn.addWidget("douane");

        this.model.addColumn(mainColumn);
    }

    public void find() {
        if (date != null) {
            filter.getEntity().setMois(format2.format(date));
        } else {
            filter.getEntity().setMois(null);
        }
        if (has(filter.getEntity().getNumero()) || has(filter.getEntity().getNavire()) || has(filter.getEntity().getMois())) {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            final ELContext elContext = facesContext.getELContext();
            final Application application = facesContext.getApplication();
            ExpressionFactory expressionFactory = application.getExpressionFactory();
            ValueExpression exp = expressionFactory.createValueExpression(elContext, "#{conteneurCongoTerminalBean}", Object.class);
            ConteneurCongoTerminalBean result = (ConteneurCongoTerminalBean) exp.getValue(elContext);
            
            //Prendre numero, navire et mois du formulaire de recherche de ce bean(ConteneurBean) pour les charger dans le filtre de #{conteneurCongoTerminalBean}
            if (has(filter.getEntity().getNumero())) {
                result.getFilter().getEntity().setNumCtn(filter.getEntity().getNumero());
            } else {
                result.getFilter().getEntity().setNumCtn(null);
            }
            
            if (has(filter.getEntity().getNavire())) {
                result.getFilter().getEntity().setNavire(filter.getEntity().getNavire());
            } else {
                result.getFilter().getEntity().setNavire(null);
            }

            if (has(filter.getEntity().getMois())) {
                result.getFilter().getEntity().setMois(BigInteger.valueOf(Long.valueOf(filter.getEntity().getMois())));
            } else {
                result.getFilter().getEntity().setMois(null);
            }
        }
    }

    public void findNumero() {
        if (has(filter.getEntity().getNumero())) {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            final ELContext elContext = facesContext.getELContext();
            final Application application = facesContext.getApplication();
            ExpressionFactory expressionFactory = application.getExpressionFactory();
            ValueExpression exp = expressionFactory.createValueExpression(elContext, "#{conteneurCongoTerminalBean}", Object.class);
            ConteneurCongoTerminalBean result = (ConteneurCongoTerminalBean) exp.getValue(elContext);

            result.getFilter().getEntity().setNumCtn(filter.getEntity().getNumero());
        }
    }

    public void findByTrafic() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        final ELContext elContext = facesContext.getELContext();
        final Application application = facesContext.getApplication();
        ExpressionFactory expressionFactory = application.getExpressionFactory();
        ValueExpression exp = expressionFactory.createValueExpression(elContext, "#{conteneurCongoTerminalBean}", Object.class);
        ConteneurCongoTerminalBean result = (ConteneurCongoTerminalBean) exp.getValue(elContext);
        String trafic = filter.getEntity().getTrafic() != null ? filter.getEntity().getTrafic() : "";
        result.getFilter().getEntity().setTrafic(trafic);
        if (trafic.equalsIgnoreCase("I")) {
            filter.getEntity().setTrafic("IMP");
        } else if (trafic.equalsIgnoreCase("E")) {
            filter.getEntity().setTrafic("EXP");
        } else if (trafic.equalsIgnoreCase("T")) {
            filter.getEntity().setTrafic("TRB");
        }
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
