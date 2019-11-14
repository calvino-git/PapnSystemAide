/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.bean;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.faces.FacesException;
import javax.annotation.Resource;
import javax.transaction.UserTransaction;
import com.github.adminfaces.starter.bean.util.JsfUtil;
import com.github.adminfaces.starter.bean.util.PagingInfo;
import com.github.adminfaces.starter.model.Escale;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.model.SelectItem;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author Calvin ILOKI
 */
public class EscaleController {

    public EscaleController() {
        pagingInfo = new PagingInfo();
        converter = new EscaleConverter();
    }
    private Escale escale = null;
    private List<Escale> escaleItems = null;
    private EscaleFacade jpaController = null;
    private EscaleConverter converter = null;
    private PagingInfo pagingInfo = null;
    @Resource
    private UserTransaction utx = null;
    @PersistenceUnit(unitName = "StarterPU")
    private EntityManagerFactory emf = null;

    public PagingInfo getPagingInfo() {
        if (pagingInfo.getItemCount() == -1) {
            pagingInfo.setItemCount(getJpaController().count());
        }
        return pagingInfo;
    }

    public EscaleFacade getJpaController() {
        if (jpaController == null) {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            jpaController = (EscaleFacade) facesContext.getApplication().getELResolver().getValue(facesContext.getELContext(), null, "escaleJpa");
        }
        return jpaController;
    }

    public SelectItem[] getEscaleItemsAvailableSelectMany() {
        return JsfUtil.getSelectItems(getJpaController().findAll(), false);
    }

    public SelectItem[] getEscaleItemsAvailableSelectOne() {
        return JsfUtil.getSelectItems(getJpaController().findAll(), true);
    }

    public Escale getEscale() {
        if (escale == null) {
            escale = (Escale) JsfUtil.getObjectFromRequestParameter("jsfcrud.currentEscale", converter, null);
        }
        if (escale == null) {
            escale = new Escale();
        }
        return escale;
    }

    public String listSetup() {
        reset(true);
        return "escale_list";
    }

    public String createSetup() {
        reset(false);
        escale = new Escale();
        return "escale_create";
    }

    public String create() {
        try {
            utx.begin();
        } catch (Exception ex) {
        }
        try {
            Exception transactionException = null;
            getJpaController().create(escale);
            try {
                utx.commit();
            } catch (javax.transaction.RollbackException ex) {
                transactionException = ex;
            } catch (Exception ex) {
            }
            if (transactionException == null) {
                JsfUtil.addSuccessMessage("Escale was successfully created.");
            } else {
                JsfUtil.ensureAddErrorMessage(transactionException, "A persistence error occurred.");
            }
        } catch (Exception e) {
            try {
                utx.rollback();
            } catch (Exception ex) {
            }
            JsfUtil.ensureAddErrorMessage(e, "A persistence error occurred.");
            return null;
        }
        return listSetup();
    }

    public String detailSetup() {
        return scalarSetup("escale_detail");
    }

    public String editSetup() {
        return scalarSetup("escale_edit");
    }

    private String scalarSetup(String destination) {
        reset(false);
        escale = (Escale) JsfUtil.getObjectFromRequestParameter("jsfcrud.currentEscale", converter, null);
        if (escale == null) {
            String requestEscaleString = JsfUtil.getRequestParameter("jsfcrud.currentEscale");
            JsfUtil.addErrorMessage("The escale with id " + requestEscaleString + " no longer exists.");
            return relatedOrListOutcome();
        }
        return destination;
    }

    public String edit() {
        String escaleString = converter.getAsString(FacesContext.getCurrentInstance(), null, escale);
        String currentEscaleString = JsfUtil.getRequestParameter("jsfcrud.currentEscale");
        if (escaleString == null || escaleString.length() == 0 || !escaleString.equals(currentEscaleString)) {
            String outcome = editSetup();
            if ("escale_edit".equals(outcome)) {
                JsfUtil.addErrorMessage("Could not edit escale. Try again.");
            }
            return outcome;
        }
        try {
            utx.begin();
        } catch (Exception ex) {
        }
        try {
            Exception transactionException = null;
            getJpaController().edit(escale);
            try {
                utx.commit();
            } catch (javax.transaction.RollbackException ex) {
                transactionException = ex;
            } catch (Exception ex) {
            }
            if (transactionException == null) {
                JsfUtil.addSuccessMessage("Escale was successfully updated.");
            } else {
                JsfUtil.ensureAddErrorMessage(transactionException, "A persistence error occurred.");
            }
        } catch (Exception e) {
            try {
                utx.rollback();
            } catch (Exception ex) {
            }
            JsfUtil.ensureAddErrorMessage(e, "A persistence error occurred.");
            return null;
        }
        return detailSetup();
    }

    public String remove() {
        String idAsString = JsfUtil.getRequestParameter("jsfcrud.currentEscale");
        java.math.BigDecimal id = new java.math.BigDecimal(idAsString);
        try {
            utx.begin();
        } catch (Exception ex) {
        }
        try {
            Exception transactionException = null;
            getJpaController().remove(getJpaController().find(id));
            try {
                utx.commit();
            } catch (javax.transaction.RollbackException ex) {
                transactionException = ex;
            } catch (Exception ex) {
            }
            if (transactionException == null) {
                JsfUtil.addSuccessMessage("Escale was successfully deleted.");
            } else {
                JsfUtil.ensureAddErrorMessage(transactionException, "A persistence error occurred.");
            }
        } catch (Exception e) {
            try {
                utx.rollback();
            } catch (Exception ex) {
            }
            JsfUtil.ensureAddErrorMessage(e, "A persistence error occurred.");
            return null;
        }
        return relatedOrListOutcome();
    }

    private String relatedOrListOutcome() {
        String relatedControllerOutcome = relatedControllerOutcome();
//        if ((ERROR)) {
//            return relatedControllerOutcome;
//        }
        return listSetup();
    }

    public List<Escale> getEscaleItems() {
        if (escaleItems == null) {
            getPagingInfo();
            escaleItems = getJpaController().findRange(new int[]{pagingInfo.getFirstItem(), pagingInfo.getFirstItem() + pagingInfo.getBatchSize()});
        }
        return escaleItems;
    }

    public String next() {
        reset(false);
        getPagingInfo().nextPage();
        return "escale_list";
    }

    public String prev() {
        reset(false);
        getPagingInfo().previousPage();
        return "escale_list";
    }

    private String relatedControllerOutcome() {
        String relatedControllerString = JsfUtil.getRequestParameter("jsfcrud.relatedController");
        String relatedControllerTypeString = JsfUtil.getRequestParameter("jsfcrud.relatedControllerType");
        if (relatedControllerString != null && relatedControllerTypeString != null) {
            FacesContext context = FacesContext.getCurrentInstance();
            Object relatedController = context.getApplication().getELResolver().getValue(context.getELContext(), null, relatedControllerString);
            try {
                Class<?> relatedControllerType = Class.forName(relatedControllerTypeString);
                Method detailSetupMethod = relatedControllerType.getMethod("detailSetup");
                return (String) detailSetupMethod.invoke(relatedController);
            } catch (ClassNotFoundException e) {
                throw new FacesException(e);
            } catch (NoSuchMethodException e) {
                throw new FacesException(e);
            } catch (IllegalAccessException e) {
                throw new FacesException(e);
            } catch (InvocationTargetException e) {
                throw new FacesException(e);
            }
        }
        return null;
    }

    private void reset(boolean resetFirstItem) {
        escale = null;
        escaleItems = null;
        pagingInfo.setItemCount(-1);
        if (resetFirstItem) {
            pagingInfo.setFirstItem(0);
        }
    }

    public void validateCreate(FacesContext facesContext, UIComponent component, Object value) {
        Escale newEscale = new Escale();
        String newEscaleString = converter.getAsString(FacesContext.getCurrentInstance(), null, newEscale);
        String escaleString = converter.getAsString(FacesContext.getCurrentInstance(), null, escale);
        if (!newEscaleString.equals(escaleString)) {
            createSetup();
        }
    }

    public Converter getConverter() {
        return converter;
    }
    
}
