/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.service;

import com.github.adminfaces.persistence.model.Filter;
import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.starter.model.Cheque;
import com.github.adminfaces.starter.model.Cheque_;
import com.github.adminfaces.starter.model.Client;
import com.github.adminfaces.starter.model.Client_;
import com.github.adminfaces.starter.repos.ChequeRepository;
import com.github.adminfaces.template.exception.BusinessException;
import org.apache.deltaspike.data.api.criteria.Criteria;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

import static com.github.adminfaces.template.util.Assert.has;
import org.apache.deltaspike.data.impl.criteria.QueryCriteria;

/**
 * @author rmpestano
 *@Stateless
 **/
public class ChequeService extends CrudService<Cheque, Integer> implements Serializable {

    @Inject
    protected ChequeRepository chequeRepository;//you can create repositories to extract complex queries from your service


    @Override
    protected Criteria<Cheque, Cheque> configRestrictions(Filter<Cheque> filter) {

        Criteria<Cheque, Cheque> criteria = criteria();

        //create restrictions based on parameters map
        if (filter.hasParam("client")) {
            criteria.eq(Cheque_.client, filter.getParam("client",Client.class));
        }

        //create restrictions based on filter entity
        if (has(filter.getEntity())) {
            Cheque filterEntity = filter.getEntity();
            if (has(filterEntity.getClient())) {
                criteria.eq(Cheque_.client, filterEntity.getClient());
            }
        }
        return criteria;
    }

    public List<Cheque> listByClient(String client) {
        return chequeRepository.list(client);
    }

    public List<Client> getClients(String query) {
        Criteria cr = new QueryCriteria(Client.class, Client.class, entityManager);
        cr.likeIgnoreCase(Client_.libelle, "%" + query + "%");
        
        return criteria()
                .select(Client.class, attribute(Cheque_.client))
                .join(Cheque_.client, cr)
                .distinct()
                .orderAsc(Cheque_.client)
                .getResultList();
    }

}
