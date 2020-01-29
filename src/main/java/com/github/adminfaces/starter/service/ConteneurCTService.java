/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.service;

import com.github.adminfaces.persistence.model.Filter;
import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.starter.model.ConteneurCT;
import com.github.adminfaces.starter.model.ConteneurCT_;
import com.github.adminfaces.starter.repos.ConteneurCTRepository;
import com.github.adminfaces.template.exception.BusinessException;
import org.apache.deltaspike.data.api.criteria.Criteria;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

import static com.github.adminfaces.template.util.Assert.has;

/**
 * @author rmpestano
 */
@Stateless
public class ConteneurCTService extends CrudService<ConteneurCT, Integer> implements Serializable {

    @Inject
    protected ConteneurCTRepository conteneurCTRepository;//you can create repositories to extract complex queries from your service


    @Override
    protected Criteria<ConteneurCT, ConteneurCT> configRestrictions(Filter<ConteneurCT> filter) {

        Criteria<ConteneurCT, ConteneurCT> criteria = criteria();

        //create restrictions based on parameters map
        if (filter.hasParam("id")) {
            criteria.eq(ConteneurCT_.id, filter.getIntParam("id"));
        }

        if (filter.hasParam("deb") && filter.hasParam("fin")) {
            criteria.between(ConteneurCT_.date, filter.getStringParam("deb"), filter.getStringParam("fin"));
        } else if (filter.hasParam("deb")) {
            criteria.gtOrEq(ConteneurCT_.date, filter.getStringParam("deb"));
        } else if (filter.hasParam("fin")) {
            criteria.ltOrEq(ConteneurCT_.date, filter.getStringParam("fin"));
        }

        //create restrictions based on filter entity
        if (has(filter.getEntity())) {
            ConteneurCT filterEntity = filter.getEntity();
            if (has(filterEntity.getTrafic())) {
                criteria.likeIgnoreCase(ConteneurCT_.trafic, "%" + filterEntity.getTrafic());
            }

            if (has(filterEntity.getDate())) {
                criteria.eq(ConteneurCT_.date, filterEntity.getDate());
            }

            if (has(filterEntity.getNumCtn())) {
                criteria.likeIgnoreCase(ConteneurCT_.numCtn, "%" + filterEntity.getNumCtn() + "%");
            }
        }
        return criteria;
    }

    @Override
    public void beforeInsert(ConteneurCT cct) {
        validate(cct);
    }

    @Override
    public void beforeUpdate(ConteneurCT cct) {
        validate(cct);
    }

    public void validate(ConteneurCT cct) {
        BusinessException be = new BusinessException();
        if (!cct.hasTrafic()) {
            be.addException(new BusinessException("Car model cannot be empty"));
        }
        if (!cct.hasEscale()) {
            be.addException(new BusinessException("Car name cannot be empty"));
        }

        if (!has(cct.getDate())) {
            be.addException(new BusinessException("Car price cannot be empty"));
        }

//        if (count(criteria()
//                .eqIgnoreCase(ConteneurCT_.id, cct.getEscale())
//                .notEq(ConteneurCT_.id, cct.getId())) > 0) {
//
//            be.addException(new BusinessException("Car name must be unique"));
//        }

        if (has(be.getExceptionList())) {
            throw be;
        }
    }


    public List<ConteneurCT> listByTrafic(String trafic) {
        return criteria()
                .likeIgnoreCase(ConteneurCT_.trafic, trafic)
                .getResultList();
    }

    public List<String> getTrafics(String query) {
        return criteria()
                .select(String.class, attribute(ConteneurCT_.trafic))
                .likeIgnoreCase(ConteneurCT_.trafic, "%" + query + "%")
                .getResultList();
    }


}
