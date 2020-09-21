package com.github.adminfaces.starter.bean;

import static com.github.adminfaces.template.util.Assert.has;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import com.github.adminfaces.persistence.bean.CrudMB;
import com.github.adminfaces.starter.model.Client;
import com.github.adminfaces.starter.model.Reglement;
import com.github.adminfaces.starter.service.ReglementService;
import com.github.adminfaces.template.exception.BusinessException;
import java.math.BigInteger;
import java.util.Date;

/**
 * Created by rmpestano on 12/02/17.
 */
@Named
@ViewScoped
public class ReglementBean extends CrudMB<Reglement> implements Serializable {

    @Inject
    ReglementService reglementService;
    
    private List<Date> periode;


    @Inject
    public void initService() {
        setCrudService(reglementService);
    }

    public List<Client> completeClient(String query) {
        List<Client> result = reglementService.getClients(query);
        return result;
    }

    public void findReglementByCheque(BigInteger chcleunik) {
        if (chcleunik == null) {
            throw new BusinessException("Merci de renseigenr le numero du cheque");
        }
        Reglement reglementFound = reglementService.findByCheque(chcleunik);
        if (reglementFound == null) {
            throw new BusinessException(String.format("Pas de cheque avec ce numero %s", chcleunik));
        }
        selection = reglementFound;
        getFilter().addParam("cheque", chcleunik);
    }

    public String getSearchCriteria() {
        StringBuilder sb = new StringBuilder(21);

        String factureParam = null;
        String chequeParam = null;
        
        Reglement chequeFilter = filter.getEntity();
        if (filter.hasParam("cheque")) {
            chequeParam = filter.getStringParam("cheque");
        }

        if (has(chequeParam)) {
            sb.append("<b>cheque</b>: ").append(chequeParam).append(", ");
        }

        if (filter.hasParam("facture")) {
            factureParam = filter.getStringParam("facture");
        } else if (has(chequeFilter) && chequeFilter.getClient() != null) {
            factureParam = chequeFilter.getNumeroFacture();
        }

        if (has(factureParam)) {
            sb.append("<b>facture</b>: ").append(factureParam).append(", ");
        }

        int commaIndex = sb.lastIndexOf(",");

        if (commaIndex != -1) {
            sb.deleteCharAt(commaIndex);
        }

        if (sb.toString().trim().isEmpty()) {
            return "Pas de critère";
        }

        return sb.toString();
    }

    public List<Date> getPeriode() {
        return periode;
    }

    public void setPeriode(List<Date> periode) {
        this.periode = periode;
    }

}
