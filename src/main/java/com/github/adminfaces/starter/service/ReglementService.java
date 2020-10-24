/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.service;

import com.github.adminfaces.persistence.model.Filter;
import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.starter.model.Cheque;
import com.github.adminfaces.starter.model.Client;
import com.github.adminfaces.starter.model.Client_;
import com.github.adminfaces.starter.model.Reglement;
import com.github.adminfaces.starter.model.Reglement_;
import com.github.adminfaces.starter.repos.ChequeRepository;
import com.github.adminfaces.template.exception.BusinessException;
import org.apache.deltaspike.data.api.criteria.Criteria;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

import static com.github.adminfaces.template.util.Assert.has;
import com.github.adminfaces.starter.repos.ReglementRepository;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.deltaspike.data.impl.criteria.QueryCriteria;

/**
 * @author rmpestano
 *@Stateless
 **/
public class ReglementService extends CrudService<Reglement, Integer> implements Serializable {

    @Inject
    protected ReglementRepository reglementRepository;//you can create repositories to extract complex queries from your service@Inject
    @Inject
    protected ChequeRepository chequeRepository;
    


    @Override
    protected Criteria<Reglement, Reglement> configRestrictions(Filter<Reglement> filter) {

        Criteria<Reglement, Reglement> criteria = criteria();

        //create restrictions based on parameters map
        if (filter.hasParam("facture")) {
            criteria.eq(Reglement_.numeroFacture, filter.getStringParam("facture"));
        }
        SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
         if (filter.hasParam("debut") && filter.hasParam("fin")) {
            criteria.between(Reglement_.dateCheque, fmt.format(filter.getParam("debut",Date.class)),fmt.format(filter.getParam("fin",Date.class)));
        }

        //create restrictions based on filter entity
        if (has(filter.getEntity())) {
            Reglement filterEntity = filter.getEntity();
            if (has(filterEntity.getCheque())) {
                criteria.eq(Reglement_.cheque,filterEntity.getCheque());
            }
            if (has(filterEntity.getClient())) {
                criteria.eq(Reglement_.client,filterEntity.getClient());
            }
        }
        return criteria;
    }

    public List<Reglement> listByClient(String client) {
        return reglementRepository.list(client);
    }

    public List<Client> getClients(String query) {
        Criteria cr = new QueryCriteria(Client.class, Client.class, entityManager);
        return cr.likeIgnoreCase(Client_.libelle, "%" + query + "%")
                .distinct()
                .orderAsc(Client_.libelle)
                .getResultList();
    }

    public Reglement findByCheque(BigInteger chcleunik) {
        return reglementRepository.getReglement(chequeRepository.getCheque(chcleunik));
    }

}
