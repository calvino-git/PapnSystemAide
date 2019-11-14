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
import com.github.adminfaces.starter.model.Navire;
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
public class NavireController {

    public NavireController() {
        pagingInfo = new PagingInfo();
        converter = new NavireConverter();
    }
    private Navire navire = null;
    private List<Navire> navireItems = null;
    private NavireFacade jpaController = null;
    private NavireConverter converter = null;
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

    public NavireFacade getJpaController() {
        if (jpaController == null) {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            jpaController = (NavireFacade) facesContext.getApplication().getELResolver().getValue(facesContext.getELContext(), null, "navireJpa");
        }
        return jpaController;
    }

    public SelectItem[] getNavireItemsAvailableSelectMany() {
        return JsfUtil.getSelectItems(getJpaController().findAll(), false);
    }

    public SelectItem[] getNavireItemsAvailableSelectOne() {
        return JsfUtil.getSelectItems(getJpaController().findAll(), true);
    }

    public Navire getNavire() {
        if (navire == null) {
            navire = (Navire) JsfUtil.getObjectFromRequestParameter("jsfcrud.currentNavire", converter, null);
        }
        if (navire == null) {
            navire = new Navire();
        }
        return navire;
    }

    public String listSetup() {
        reset(true);
        return "navire_list";
    }

    public String createSetup() {
        reset(false);
        navire = new Navire();
        return "navire_create";
    }

    public String create() {
        try {
            utx.begin();
        } catch (Exception ex) {
        }
        try {
            Exception transactionException = null;
            getJpaController().create(navire);
            try {
                utx.commit();
            } catch (javax.transaction.RollbackException ex) {
                transactionException = ex;
            } catch (Exception ex) {
            }
            if (transactionException == null) {
                JsfUtil.addSuccessMessage("Navire was successfully created.");
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
        return scalarSetup("navire_detail");
    }

    public String editSetup() {
        return scalarSetup("navire_edit");
    }

    private String scalarSetup(String destination) {
        reset(false);
        navire = (Navire) JsfUtil.getObjectFromRequestParameter("jsfcrud.currentNavire", converter, null);
        if (navire == null) {
            String requestNavireString = JsfUtil.getRequestParameter("jsfcrud.currentNavire");
            JsfUtil.addErrorMessage("The navire with id " + requestNavireString + " no longer exists.");
            return relatedOrListOutcome();
        }
        return destination;
    }

    public String edit() {
        String navireString = converter.getAsString(FacesContext.getCurrentInstance(), null, navire);
        String currentNavireString = JsfUtil.getRequestParameter("jsfcrud.currentNavire");
        if (navireString == null || navireString.length() == 0 || !navireString.equals(currentNavireString)) {
            String outcome = editSetup();
            if ("navire_edit".equals(outcome)) {
                JsfUtil.addErrorMessage("Could not edit navire. Try again.");
            }
            return outcome;
        }
        try {
            utx.begin();
        } catch (Exception ex) {
        }
        try {
            Exception transactionException = null;
            getJpaController().edit(navire);
            try {
                utx.commit();
            } catch (javax.transaction.RollbackException ex) {
                transactionException = ex;
            } catch (Exception ex) {
            }
            if (transactionException == null) {
                JsfUtil.addSuccessMessage("Navire was successfully updated.");
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
        String idAsString = JsfUtil.getRequestParameter("jsfcrud.currentNavire");
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
                JsfUtil.addSuccessMessage("Navire was successfully deleted.");
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

    public List<Navire> getNavireItems() {
        if (navireItems == null) {
            getPagingInfo();
            navireItems = getJpaController().findRange(new int[]{pagingInfo.getFirstItem(), pagingInfo.getFirstItem() + pagingInfo.getBatchSize()});
        }
        return navireItems;
    }

    public String next() {
        reset(false);
        getPagingInfo().nextPage();
        return "navire_list";
    }

    public String prev() {
        reset(false);
        getPagingInfo().previousPage();
        return "navire_list";
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
        navire = null;
        navireItems = null;
        pagingInfo.setItemCount(-1);
        if (resetFirstItem) {
            pagingInfo.setFirstItem(0);
        }
    }

    public void validateCreate(FacesContext facesContext, UIComponent component, Object value) {
        Navire newNavire = new Navire();
        String newNavireString = converter.getAsString(FacesContext.getCurrentInstance(), null, newNavire);
        String navireString = converter.getAsString(FacesContext.getCurrentInstance(), null, navire);
        if (!newNavireString.equals(navireString)) {
            createSetup();
        }
    }

    public Converter getConverter() {
        return converter;
    }
    
}
