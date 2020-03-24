/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.service;

import com.github.adminfaces.persistence.model.Filter;
import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.starter.model.ConteneurDouane;
import com.github.adminfaces.starter.model.ConteneurDouane_;
import com.github.adminfaces.starter.repos.ConteneurDouaneRepository;
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
public class ConteneurDouaneService extends CrudService<ConteneurDouane, Integer> implements Serializable {

    @Inject
    protected ConteneurDouaneRepository conteneurDouaneRepo;//you can create repositories to extract complex queries from your service


    @Override
    protected Criteria<ConteneurDouane, ConteneurDouane> configRestrictions(Filter<ConteneurDouane> filter) {

        Criteria<ConteneurDouane, ConteneurDouane> criteria = criteria();
//
//        //create restrictions based on parameters map
//        if (filter.hasParam("id")) {
//            criteria.eq(ConteneurDouane_.id, filter.getIntParam("id"));
//        }
//
//        if (filter.hasParam("deb") && filter.hasParam("fin")) {
//            criteria.between(ConteneurDouane_.date, filter.getStringParam("deb"), filter.getStringParam("fin"));
//        } else if (filter.hasParam("deb")) {
//            criteria.gtOrEq(ConteneurDouane_.date, filter.getStringParam("deb"));
//        } else if (filter.hasParam("fin")) {
//            criteria.ltOrEq(ConteneurDouane_.date, filter.getStringParam("fin"));
//        }

        //create restrictions based on filter entity
        if (has(filter.getEntity())) {
            ConteneurDouane filterEntity = filter.getEntity();
            if (has(filterEntity.getTrafic())) {
                criteria.likeIgnoreCase(ConteneurDouane_.trafic, "%" + filterEntity.getTrafic());
            }

            if (has(filterEntity.getDate())) {
                criteria.eq(ConteneurDouane_.date, filterEntity.getDate());
            }

            if (has(filterEntity.getNumero())) {
                criteria.likeIgnoreCase(ConteneurDouane_.numero, "%" + filterEntity.getNumero()+ "%");
            }
        }
        return criteria;
    }

    @Override
    public void beforeInsert(ConteneurDouane cct) {
        validate(cct);
    }

    @Override
    public void beforeUpdate(ConteneurDouane cct) {
        validate(cct);
    }

    public void validate(ConteneurDouane cct) {
        BusinessException be = new BusinessException();
        if (!cct.hasTrafic()) {
            be.addException(new BusinessException("Car model cannot be empty"));
        }
        if (!cct.hasNavire()) {
            be.addException(new BusinessException("Car name cannot be empty"));
        }

        if (!has(cct.getDate())) {
            be.addException(new BusinessException("Car price cannot be empty"));
        }

//        if (count(criteria()
//                .eqIgnoreCase(ConteneurDouane_.id, cct.getEscale())
//                .notEq(ConteneurDouane_.id, cct.getId())) > 0) {
//
//            be.addException(new BusinessException("Car name must be unique"));
//        }

        if (has(be.getExceptionList())) {
            throw be;
        }
    }

    public List<ConteneurDouane> findByNumero(String num){
        ConteneurDouane sample = new ConteneurDouane();
        sample.setNumero(num);
        List<ConteneurDouane> liste = conteneurDouaneRepo.findByLike(sample, ConteneurDouane_.numero);
        return liste;
    }

    public List<ConteneurDouane> listByTrafic(String trafic) {
        return criteria()
                .likeIgnoreCase(ConteneurDouane_.trafic, trafic)
                .getResultList();
    }

    public List<String> getTrafics(String query) {
        return criteria()
                .select(String.class, attribute(ConteneurDouane_.trafic))
                .likeIgnoreCase(ConteneurDouane_.trafic, "%" + query + "%")
                .getResultList();
    }


}
