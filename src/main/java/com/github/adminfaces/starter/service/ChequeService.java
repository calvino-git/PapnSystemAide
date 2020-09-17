/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.service;

import com.github.adminfaces.persistence.model.Filter;
import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.starter.model.Cheque;
import com.github.adminfaces.starter.model.Cheque_;
import com.github.adminfaces.starter.repos.ChequeRepository;
import com.github.adminfaces.template.exception.BusinessException;
import org.apache.deltaspike.data.api.criteria.Criteria;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

import static com.github.adminfaces.template.util.Assert.has;

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
            criteria.eq(Cheque_.client, filter.getStringParam("client"));
        }

        //create restrictions based on filter entity
        if (has(filter.getEntity())) {
            Cheque filterEntity = filter.getEntity();
            if (has(filterEntity.getClient())) {
                criteria.likeIgnoreCase(Cheque_.client, "%" + filterEntity.getClient() + "%");
            }
        }
        return criteria;
    }

    public List<Cheque> listByClient(String client) {
        return chequeRepository.list(client);
    }

    public List<String> getClients(String query) {
        return criteria()
                .select(String.class, attribute(Cheque_.client))
                .likeIgnoreCase(Cheque_.client, "%" + query + "%")
                .getResultList();
    }

}
