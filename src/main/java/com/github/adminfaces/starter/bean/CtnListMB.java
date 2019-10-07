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
import com.github.adminfaces.starter.model.Ctn;
import com.github.adminfaces.starter.service.CtnService;
import com.github.adminfaces.template.exception.BusinessException;
import java.util.Locale;
import javax.faces.context.FacesContext;

/**
 * Created by rmpestano on 12/02/17.
 */
@Named
@ViewScoped
public class CtnListMB extends CrudMB<Ctn> implements Serializable {
    
        private String mois;

    /**
     * Get the value of mois
     *
     * @return the value of mois
     */
    public String getMois() {
        return mois;
    }

    /**
     * Set the value of mois
     *
     * @param mois new value of mois
     */
    public void setMois(String mois) {
        this.mois = mois;
    }


    @Inject
    CtnService ctnService;

    @Inject
    @Service
    CrudService<Ctn, Integer> ctnCrudService; //generic injection example

    @Inject
    public void initService() {
        setCrudService(ctnService);
    }

    public List<String> completeMois(String query) {
        List<String> result = ctnService.getMois(query);
        return result;
    }
    
    public void findCtnByMois(String mois){
        FacesContext.getCurrentInstance().getViewRoot().setLocale(Locale.FRANCE);
        System.out.println("Saisie : " + mois);
        if (mois == null||mois.isEmpty()) {
            throw new BusinessException("Provide Conteneur Mois to load");
        }
        List<Ctn> ctnsFound = ctnService.findByMois(mois);
        if (ctnsFound == null||ctnsFound.isEmpty()) {
            throw new BusinessException(String.format("No ctn found with id %s", mois));
        }
        filteredValue.clear();
        filteredValue.addAll(ctnsFound);
        getFilter().addParam("mois", mois);
    }

    public void findCtnById(Integer id) {
        FacesContext.getCurrentInstance().getViewRoot().setLocale(Locale.FRANCE);

        if (id == null) {
            throw new BusinessException("Provide Conteneur ID to load");
        }
        Ctn ctnFound = ctnCrudService.findById(id);
        if (ctnFound == null) {
            throw new BusinessException(String.format("No ctn found with id %s", id));
        }
        selectionList.add(ctnFound);
        getFilter().addParam("id", id);
    }

    public void delete() {
        int numCtns = 0;
        for (Ctn selectedCtn : selectionList) {
            numCtns++;
            ctnService.remove(selectedCtn);
        }
        selectionList.clear();
        addDetailMessage(numCtns + " ctns deleted successfully!");
        clear();
    }

    public String getSearchCriteria() {
        StringBuilder sb = new StringBuilder(21);

        String traficParam = null;
        Ctn ctnFilter = filter.getEntity();

        Integer idParam = null;
        if (filter.hasParam("id")) {
            idParam = filter.getIntParam("id");
        }

        if (has(idParam)) {
            sb.append("<b>id</b>: ").append(idParam).append(", ");
        }

        if (filter.hasParam("trafic")) {
            traficParam = filter.getStringParam("trafic");
        } else if (has(ctnFilter) && ctnFilter.getTrafic() != null) {
            traficParam = ctnFilter.getTrafic();
        }

        if (has(traficParam)) {
            sb.append("<b>trafic</b>: ").append(traficParam).append(", ");
        }

        String escaleParam = null;
        if (filter.hasParam("escale")) {
            escaleParam = filter.getStringParam("escale");
        } else if (has(ctnFilter) && ctnFilter.getEscale() != null) {
            escaleParam = ctnFilter.getEscale();
        }

        if (has(escaleParam)) {
            sb.append("<b>escale</b>: ").append(escaleParam).append(", ");
        }

        BigInteger moisParam = null;
        if (filter.hasParam("mois")) {
            moisParam = BigInteger.valueOf(filter.getIntParam("mois"));
        } else if (has(ctnFilter) && ctnFilter.getMois() != null) {
            moisParam = ctnFilter.getMois();
        }

        if (has(moisParam)) {
            sb.append("<b>mois</b>: ").append(moisParam).append(", ");
        }
        
        String dateParam = null;
        if (filter.hasParam("date")) {
            dateParam = filter.getStringParam("date");
        } else if (has(ctnFilter) && ctnFilter.getEscale() != null) {
            dateParam = ctnFilter.getDate();
        }

        if (has(dateParam)) {
            sb.append("<b>date</b>: ").append(dateParam).append(", ");
        }

        if (filter.hasParam("debutDate")) {
            sb.append("<b>").append(getMessage("label.debutDate")).append("</b>: ").append(filter.getParam("debutDate")).append(", ");
        }

        if (filter.hasParam("finDate")) {
            sb.append("<b>").append(getMessage("label.finDate")).append("</b>: ").append(filter.getParam("finDate")).append(", ");
        }

        int commaIndex = sb.lastIndexOf(",");

        if (commaIndex != -1) {
            sb.deleteCharAt(commaIndex);
        }

        if (sb.toString().trim().isEmpty()) {
            return "No search criteria";
        }

        return sb.toString();
    }

}
