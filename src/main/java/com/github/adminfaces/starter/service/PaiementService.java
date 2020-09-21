/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.service;

import com.github.adminfaces.persistence.model.Filter;
import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.starter.model.Paiement;
import com.github.adminfaces.starter.model.Paiement_;
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
public class PaiementService extends CrudService<Paiement, Integer> implements Serializable {


    @Override
    protected Criteria<Paiement, Paiement> configRestrictions(Filter<Paiement> filter) {

        Criteria<Paiement, Paiement> criteria = criteria();

        //create restrictions based on parameters map
        if (filter.hasParam("client")) {
            criteria.eq(Paiement_.banque, filter.getStringParam("banque"));
        }

        //create restrictions based on filter entity
        if (has(filter.getEntity())) {
            Paiement filterEntity = filter.getEntity();
            if (has(filterEntity.getBanque())) {
                criteria.likeIgnoreCase(Paiement_.banque, "%" + filterEntity.getBanque() + "%");
            }
        }
        return criteria;
    }

    public List<String> getClients(String query) {
        return criteria()
                .select(String.class, attribute(Paiement_.numero))
                .likeIgnoreCase(Paiement_.numero, "%" + query + "%")
                .distinct()
                .orderAsc(Paiement_.numero)
                .getResultList();
    }

}
