/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.service;

import com.github.adminfaces.persistence.model.Filter;
import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.starter.model.Facture;
import com.github.adminfaces.starter.model.Facture_;
import com.github.adminfaces.starter.repos.FactureRepository;
import org.apache.deltaspike.data.api.criteria.Criteria;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

import static com.github.adminfaces.template.util.Assert.has;
import java.math.BigDecimal;

/**
 * @author rmpestano
 */
@Stateless
public class FactureService extends CrudService<Facture, Integer> implements Serializable {

    @Inject
    protected FactureRepository factureRepository;//you can create repositories to extract complex queries from your service

    @Override
    protected Criteria<Facture, Facture> configRestrictions(Filter<Facture> filter) {

        Criteria<Facture, Facture> criteria = criteria();
        criteria.notNull(Facture_.factDate);
        //create restrictions based on parameters map
        if (filter.hasParam("numero")) {
            criteria.like(Facture_.numero, filter.getStringParam("numero") + "%");
        }
        if (filter.hasParam("moisComptable")) {
            criteria.like(Facture_.moisComptable, filter.getStringParam("moisComptable") + "%");
        }
        if (filter.hasParam("mntHt")) {
            criteria.eq(Facture_.mntHt, filter.getParam("mntHt", BigDecimal.class));
        }
        if (filter.hasParam("minPrice") && filter.hasParam("maxPrice")) {
            criteria.between(Facture_.mntHt, filter.getParam("minPrice", BigDecimal.class), filter.getParam("maxPrice", BigDecimal.class));
        } else if (filter.hasParam("minPrice")) {
            criteria.gtOrEq(Facture_.mntHt, filter.getParam("minPrice", BigDecimal.class));
        } else if (filter.hasParam("maxPrice")) {
            criteria.ltOrEq(Facture_.mntHt, filter.getParam("maxPrice", BigDecimal.class));
        }

        //create restrictions based on filter entity
        if (has(filter.getEntity())) {
            Facture filterEntity = filter.getEntity();
            if (has(filterEntity.getNumero())) {
                criteria.likeIgnoreCase(Facture_.numero, filterEntity.getNumero() + "%");
            }

            if (has(filterEntity.getFactDate())) {
                criteria.eq(Facture_.factDate, filterEntity.getFactDate());
            }

            if (has(filterEntity.getTexte())) {
                criteria.likeIgnoreCase(Facture_.texte, "%" + filterEntity.getTexte() + "%");
            }
            if (has(filterEntity.getType())) {
                criteria.eq(Facture_.type, filterEntity.getType());
            }
            if (has(filterEntity.getTexte1())) {
                criteria.like(Facture_.texte1, filterEntity.getTexte1());
            }
        }
        return criteria;
    }

    public List<String> getClients(String query) {
        return criteria()
                .select(String.class, attribute(Facture_.texte))
                .likeIgnoreCase(Facture_.texte, "%" + query + "%")
                .distinct()
                .orderAsc(Facture_.texte)
                .getResultList();
    }
    
    public List<String> getClients() {
        return criteria()
                .select(String.class, attribute(Facture_.texte))
                .distinct()
                .getResultList();
    }

    public List<Facture> findByNumero(String toString) {
        Facture f = new Facture();
        f.setNumero(toString);
        return factureRepository.findBy(f, Facture_.numero);
    }

    public List<String> getRedevances(String query) {
        return criteria()
                .select(String.class, attribute(Facture_.texte1))
                .distinct()
                .notNull(Facture_.texte1)
                .orderDesc(Facture_.factDate)
                .getResultList();
    }
}