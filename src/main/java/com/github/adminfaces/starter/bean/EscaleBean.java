package com.github.adminfaces.starter.bean;

import com.github.adminfaces.persistence.bean.BeanService;
import static com.github.adminfaces.persistence.util.Messages.addDetailMessage;
import static com.github.adminfaces.persistence.util.Messages.getMessage;
import static com.github.adminfaces.template.util.Assert.has;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import com.github.adminfaces.persistence.bean.CrudMB;
import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.persistence.service.Service;
import com.github.adminfaces.starter.model.Escale;
import com.github.adminfaces.starter.model.TypeNavire;
import com.github.adminfaces.starter.service.EscaleService;
import com.github.adminfaces.starter.service.ConteneurCTService;
import com.github.adminfaces.template.exception.BusinessException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.PostConstruct;

/**
 * Created by rmpestano on 12/02/17.
 */
@Named
@ViewScoped
@BeanService(EscaleService.class)
public class EscaleBean extends CrudMB<Escale> implements Serializable {

    @Inject
    private EscaleService escaleService;

    private String numeroEscale;
    private List<Date> range;
    private SimpleDateFormat dateFormat;
    private TypeNavire typeNav;
    private boolean catNavire;

    @PostConstruct
    public void initBean() {
        dateFormat = new SimpleDateFormat("yyyyMMdd");
    }

    public List<String> completeNavire(String query) {
        List<String> result = escaleService.listNavires(query);
        return result;
    }

    public List<TypeNavire> completeTypeNavire(String query) {

        return escaleService.listeTypeNavireParCode("%" + query + "%");
    }

    public void configTypeNavire() {
        escaleService.setTypeNavireFiltre(typeNav);
    }

    public void findEscaleByNumero(String numeroEscale) {
        if (numeroEscale == null) {
            throw new BusinessException("Merci de saisir le numero d'escale à 10 chiffres");
        }
        Escale escaleFound = escaleService.findEscaleParNumero(numeroEscale);
        if (escaleFound == null) {
            throw new BusinessException(String.format("Aucune escale correspondant au numero %s", numeroEscale));
        }
        selection = escaleFound;
        clear();
        getFilter().addParam("numero", numeroEscale);
    }

    public String getSearchCriteria() {
        StringBuilder sb = new StringBuilder(21);

        String navireParam = null;
        Escale escaleFilter = filter.getEntity();

        Integer numeroParam = null;
        if (filter.hasParam("numero")) {
            numeroParam = filter.getIntParam("numero");
        }

        if (has(numeroParam)) {
            sb.append("<b>numero</b>: ").append(numeroParam).append(", ");
        }

        if (filter.hasParam("navire")) {
            navireParam = filter.getStringParam("navire");
        } else if (has(escaleFilter) && escaleFilter.getNavire() != null) {
            navireParam = escaleFilter.getNavire();
        }

        if (has(navireParam)) {
            sb.append("<b>navire</b>: ").append(navireParam).append(", ");
        }

        String situationParam = null;
        if (filter.hasParam("situation")) {
            situationParam = filter.getStringParam("price");
        } else if (has(escaleFilter) && escaleFilter.getSituat() != null) {
            situationParam = escaleFilter.getSituat();
        }

        if (has(situationParam)) {
            sb.append("<b>situation</b>: ").append(situationParam).append(", ");
        }

        if (filter.hasParam("debutETA")) {
            sb.append("<b>").append(getMessage("label.debutETA")).append("</b>: ").append(filter.getParam("debutETA")).append(", ");
        }

        if (filter.hasParam("finETA")) {
            sb.append("<b>").append(getMessage("label.finETA")).append("</b>: ").append(filter.getParam("finETA")).append(", ");
        }

        int commaIndex = sb.lastIndexOf(",");

        if (commaIndex != -1) {
            sb.deleteCharAt(commaIndex);
        }

        if (sb.toString().trim().isEmpty()) {
            return "pas de critère";
        }

        return sb.toString();
    }

    public String getNumeroEscale() {
        return numeroEscale;
    }

    public void setNumeroEscale(String numeroEscale) {
        this.numeroEscale = numeroEscale;
    }

    public List<Date> getRange() {
        return range;
    }

    public void changeCategorieNavire() {
        escaleService.setCatNavire(catNavire);
    }

    public void setRange(List<Date> range) {
        if (has(range)) {
            getFilter().addParam("debutETA", dateFormat.format(range.get(0)));
            getFilter().addParam("finETA", dateFormat.format(range.get(range.size() - 1)));
        }
        this.range = range;
    }

    public EscaleService getEscaleService() {
        return escaleService;
    }

    public void setEscaleService(EscaleService escaleService) {
        this.escaleService = escaleService;
    }

    public SimpleDateFormat getDateFormat() {
        return dateFormat;
    }

    public TypeNavire getTypeNav() {
        return typeNav;
    }

    public void setTypeNav(TypeNavire typeNav) {
        escaleService.setTypeNavireFiltre(typeNav);
        this.typeNav = typeNav;
    }

    public boolean isCatNavire() {
        return catNavire;
    }

    public void setCatNavire(boolean catNavire) {
        this.catNavire = catNavire;
    }

}
