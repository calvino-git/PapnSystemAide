package com.github.adminfaces.starter.bean;

import static com.github.adminfaces.template.util.Assert.has;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import com.github.adminfaces.persistence.bean.CrudMB;
import com.github.adminfaces.starter.model.Cheque;
import com.github.adminfaces.starter.model.Client;
import com.github.adminfaces.starter.service.ChequeService;
import com.github.adminfaces.template.exception.BusinessException;
import java.util.Date;

/**
 * Created by rmpestano on 12/02/17.
 */
@Named
@ViewScoped
public class ChequeBean extends CrudMB<Cheque> implements Serializable {

    @Inject
    ChequeService chequeService;
    
    private List<Date> range;


    @Inject
    public void initService() {
        setCrudService(chequeService);
    }

    public List<Client> completeClient(String query) {
        List<Client> result = chequeService.getClients(query);
        return result;
    }

    public void findChequeByNumero(Integer chcleunik) {
        if (chcleunik == null) {
            throw new BusinessException("Provide N° Cheque to load");
        }
        Cheque chequeFound = chequeService.findById(chcleunik);
        if (chequeFound == null) {
            throw new BusinessException(String.format("No cheque found with id %s", id));
        }
        selectionList.add(chequeFound);
        getFilter().addParam("id", id);
    }

    public String getSearchCriteria() {
        StringBuilder sb = new StringBuilder(21);

        Client clientParam = null;
        Cheque chequeFilter = filter.getEntity();

        Integer idParam = null;
        if (filter.hasParam("id")) {
            idParam = filter.getIntParam("id");
        }

        if (has(idParam)) {
            sb.append("<b>id</b>: ").append(idParam).append(", ");
        }

        if (filter.hasParam("client")) {
            clientParam = filter.getParam("client",Client.class);
        } else if (has(chequeFilter) && chequeFilter.getClient() != null) {
            clientParam = chequeFilter.getClient();
        }

        if (has(clientParam)) {
            sb.append("<b>client</b>: ").append(clientParam).append(", ");
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

    public List<Date> getRange() {
        return range;
    }

    public void setRange(List<Date> range) {
        this.range = range;
    }

}
