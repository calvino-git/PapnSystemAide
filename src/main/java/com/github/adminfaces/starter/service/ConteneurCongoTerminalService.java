/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.service;

import com.github.adminfaces.persistence.model.Filter;
import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.starter.model.ConteneurCongoTerminal_;
import com.github.adminfaces.starter.model.ConteneurCongoTerminal;
import com.github.adminfaces.template.exception.BusinessException;
import static com.github.adminfaces.template.util.Assert.has;
import java.io.Serializable;
import java.util.List;
import java.math.BigInteger;

import javax.ejb.Stateless;
import org.apache.deltaspike.data.api.criteria.Criteria;

/**
 *
 * @author Calvin ILOKI
 */
@Stateless
public class ConteneurCongoTerminalService extends CrudService<ConteneurCongoTerminal, Integer> implements Serializable {

    @Override
    protected Criteria<ConteneurCongoTerminal, ConteneurCongoTerminal> configRestrictions(Filter<ConteneurCongoTerminal> filter) {

        Criteria<ConteneurCongoTerminal, ConteneurCongoTerminal> criteria = criteria();

        //create restrictions based on parameters map
        if (filter.hasParam("id")) {
            criteria.eq(ConteneurCongoTerminal_.id, filter.getIntParam("id"));
        }

        if (filter.hasParam("debutDate") && filter.hasParam("finDate")) {
            criteria.between(ConteneurCongoTerminal_.date, filter.getStringParam("debutDate"), filter.getStringParam("finDate"));
        } else if (filter.hasParam("debutDate")) {
            criteria.gtOrEq(ConteneurCongoTerminal_.date, filter.getStringParam("debutDate"));
        } else if (filter.hasParam("finDate")) {
            criteria.ltOrEq(ConteneurCongoTerminal_.date, filter.getStringParam("finDate"));
        }

        //create restrictions based on filter entity
        if (has(filter.getEntity())) {
            System.out.println(" NUMERO : " + filter.getEntity());
            ConteneurCongoTerminal filterEntity = filter.getEntity();
            if (has(filterEntity.getMois())) {
                criteria.eq(ConteneurCongoTerminal_.mois,filterEntity.getMois());
            }

            if (has(filterEntity.getDate())) {
                criteria.eq(ConteneurCongoTerminal_.date, filterEntity.getDate());
            }

            if (has(filterEntity.getTrafic())) {
                criteria.likeIgnoreCase(ConteneurCongoTerminal_.trafic,filterEntity.getTrafic());
            }
        }
        return criteria;
    }

    public void validate(ConteneurCongoTerminal cct) {
        BusinessException be = new BusinessException();
        if (!cct.hasEscale()) {
            be.addException(new BusinessException("Ctn escale cannot be empty"));
        }
        if (!cct.hasTrafic()) {
            be.addException(new BusinessException("Ctn trafic cannot be empty"));
        }

        if (!has(cct.getDate())) {
            be.addException(new BusinessException("Ctn date cannot be empty"));
        }

        if (count(criteria()
                .eqIgnoreCase(ConteneurCongoTerminal_.trafic, cct.getTrafic())
                .notEq(ConteneurCongoTerminal_.id, cct.getId())) > 0) {

            be.addException(new BusinessException("Ctn trafic must be unique"));
        }

        if (has(be.getExceptionList())) {
            throw be;
        }
    }

    public List<ConteneurCongoTerminal> findByNumero(String numero) {
        return criteria()
                .likeIgnoreCase(ConteneurCongoTerminal_.numCtn, "%" + numero + "%")
                .orderDesc(ConteneurCongoTerminal_.date)
                .getResultList();
    }
    
    public List<String> getMois(String query) {
        if (!query.isEmpty()) {
            BigInteger queryBigInt = BigInteger.valueOf(Long.valueOf(query));
            return criteria()
                    .select(String.class, attribute(ConteneurCongoTerminal_.mois))
                    .distinct()
                    .eq(ConteneurCongoTerminal_.mois, queryBigInt)
                    .orderDesc(ConteneurCongoTerminal_.mois)
                    .getResultList();
        } else {
            return criteria()
                    .select(String.class, attribute(ConteneurCongoTerminal_.mois))
                    .distinct()
                    .orderDesc(ConteneurCongoTerminal_.mois)
                    .getResultList();
        }

    }
}
