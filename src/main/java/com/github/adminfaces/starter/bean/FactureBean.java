package com.github.adminfaces.starter.bean;

import static com.github.adminfaces.template.util.Assert.has;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import com.github.adminfaces.persistence.bean.CrudMB;
import com.github.adminfaces.starter.model.Facture;
import com.github.adminfaces.starter.service.FactureService;
import com.github.adminfaces.template.exception.BusinessException;
import javax.enterprise.inject.Produces;

/**
 * Created by rmpestano on 12/02/17.
 */
@Named
@ViewScoped
public class FactureBean extends CrudMB<Facture> implements Serializable {

    @Inject
    FactureService factureService;

    @Inject
    public void initService() {
        setCrudService(factureService);
    }

    public List<String> completeModel(String query) {
        List<String> result = factureService.getClients(query);
        return result;
    }
    public List<String> completeRedevenace(String query) {
        List<String> result = factureService.getRedevances(query);
        return result;
    }
    
    @Produces
    @Named("clients")
    public List<String> getClient() {
        List<String> result = factureService.getClients();
        return result;
    }

    public void findFactureByNumero(String numero) {
        if (numero == null) {
            throw new BusinessException("Provide Car ID to load");
        }
        List<Facture> factureFound = factureService.findByNumero(numero);
        if (factureFound == null) {
            throw new BusinessException(String.format("No car found with id %s", id));
        }
        selectionList.addAll(factureFound);
        getFilter().addParam("numero", numero);
    }

    public String getSearchCriteria() {
        StringBuilder sb = new StringBuilder(21);

        String clientParam = null;
        Facture factureFilter = filter.getEntity();

        String numeroParam = null;
        if (filter.hasParam("numero")) {
            numeroParam = filter.getStringParam("numero");
        }

        if (has(numeroParam)) {
            sb.append("<b>numero</b>: ").append(numeroParam).append(", ");
        }

        if (filter.hasParam("client")) {
            clientParam = filter.getStringParam("client");
        } else if (has(factureFilter) && factureFilter.getTexte() != null) {
            clientParam = factureFilter.getTexte();
        }

        if (has(clientParam)) {
            sb.append("<b>client</b>: ").append(clientParam).append(", ");
        }

        String typeParam = null;
        if (filter.hasParam("type")) {
            typeParam = filter.getStringParam("type");
        } else if (has(factureFilter) && factureFilter.getType() != null) {
            typeParam = factureFilter.getType();
        }

        if (has(typeParam)) {
            sb.append("<b>type</b>: ").append(typeParam).append(", ");
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
