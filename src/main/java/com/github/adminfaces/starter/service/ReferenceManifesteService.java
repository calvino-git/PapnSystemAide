/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.service;

import com.github.adminfaces.persistence.model.Filter;
import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.starter.model.ReferenceManifeste;
import com.github.adminfaces.starter.model.ReferenceManifeste_;
import com.github.adminfaces.starter.repos.ReferenceManifesteRepository;
import com.github.adminfaces.starter.ws.RefManResult;
import com.github.adminfaces.template.exception.BusinessException;
import org.apache.deltaspike.data.api.criteria.Criteria;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

import static com.github.adminfaces.template.util.Assert.has;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author rmpestano
 */
@Stateless
public class ReferenceManifesteService extends CrudService<ReferenceManifeste, Integer> implements Serializable {

    @Inject
    protected ReferenceManifesteRepository referenceManifesteRepository;//you can create repositories to extract complex queries from your service

    @Override
    protected Criteria<ReferenceManifeste, ReferenceManifeste> configRestrictions(Filter<ReferenceManifeste> filter) {

        Criteria<ReferenceManifeste, ReferenceManifeste> criteria = criteria();

        //create restrictions based on parameters map
        if (filter.hasParam("id")) {
            criteria.eq(ReferenceManifeste_.id, filter.getIntParam("id"));
        }
        if (filter.hasParam("nomTransporteur")) {
            criteria.likeIgnoreCase(ReferenceManifeste_.nomTransporteur, "%" + filter.getStringParam("nomTransporteur") + "%");
        }
        if (filter.hasParam("navire")) {
            criteria.likeIgnoreCase(ReferenceManifeste_.navire, "%" + filter.getStringParam("navire") + "%");
        }
        if (filter.hasParam("numeroEnregistrement")) {
            criteria.like(ReferenceManifeste_.numeroEnregistrement,filter.getStringParam("numeroEnregistrement") + "%");
        }
        if (filter.hasParam("numeroVoyage")) {
            criteria.like(ReferenceManifeste_.numeroVoyage,filter.getStringParam("numeroVoyage") + "%");
        }

        if (filter.hasParam("debutDepart") && filter.hasParam("finDepart")) {
            criteria.between(ReferenceManifeste_.dateDepart, filter.getStringParam("debutDepart"), filter.getStringParam("finDepart"));
        } else if (filter.hasParam("debutDepart")) {
            criteria.gtOrEq(ReferenceManifeste_.dateDepart, filter.getStringParam("debutDepart"));
        } else if (filter.hasParam("finDepart")) {
            criteria.ltOrEq(ReferenceManifeste_.dateDepart, filter.getStringParam("finDepart"));
        }

        //create restrictions based on filter entity
        if (has(filter.getEntity())) {
            ReferenceManifeste filterEntity = filter.getEntity();
            if (has(filterEntity.getNavire())) {
                criteria.likeIgnoreCase(ReferenceManifeste_.navire, "%" + filterEntity.getNavire() + "%");
            }

            if (has(filterEntity.getNomTransporteur())) {
                criteria.likeIgnoreCase(ReferenceManifeste_.nomTransporteur, "%" + filterEntity.getNomTransporteur() + "%");
            }

            if (has(filterEntity.getTrafic())) {
                criteria.likeIgnoreCase(ReferenceManifeste_.trafic, filterEntity.getTrafic());
            }
        }
        return criteria;
    }

    @Override
    public void beforeUpdate(ReferenceManifeste refman) {
        validate(refman);
    }

    public void validate(ReferenceManifeste refman) {
        BusinessException be = new BusinessException();
        if (!refman.hasInstanceId()) {
            be.addException(new BusinessException("ReferenceManifeste InstanceId cannot be empty"));
        }

        if (count(criteria()
                .eqIgnoreCase(ReferenceManifeste_.instanceId, refman.getInstanceId())
                .notEq(ReferenceManifeste_.id, refman.getId())) > 0) {

            be.addException(new BusinessException("ReferenceManifeste name must be unique"));
        }

        if (has(be.getExceptionList())) {
            throw be;
        }
    }

    public ReferenceManifeste findByNumero(String numero) {
        return criteria()
                .likeIgnoreCase(ReferenceManifeste_.numeroEnregistrement, numero)
                .getSingleResult();
    }

    public List<ReferenceManifeste> listByNavire(String navire) {
        return criteria()
                .likeIgnoreCase(ReferenceManifeste_.navire, navire)
                .getResultList();
    }

    public List<String> getConsignataires(String query) {
        return criteria()
                .select(String.class, attribute(ReferenceManifeste_.nomTransporteur))
                .likeIgnoreCase(ReferenceManifeste_.nomTransporteur, "%" + query + "%")
                .distinct()
                .getResultList();
    }

    public RefManResult refmanToRef(ReferenceManifeste refman) {
        SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat fmt2 = new SimpleDateFormat("yyyyMMdd");
        RefManResult ref = new RefManResult();
        try {
            ref.setAnneeEnregistrement(refman.getAnneeEnregistrement());
            ref.setBureauDouane(refman.getBureauDouane());
            ref.setCodeTransporteur(refman.getCodeTransporteur());
            ref.setDateArrivee(fmt1.format(fmt2.parse(refman.getDateArrivee())));
            ref.setDateDepart(fmt1.format(fmt2.parse(refman.getDateDepart())));
            ref.setDateEnregistrement(fmt1.format(fmt2.parse(refman.getDateEnregistrement())));
            ref.setInstanceId(refman.getInstanceId());
            ref.setLieuChargement(refman.getLieuChargement());
            ref.setNavire(refman.getNavire());
            ref.setNomTransporteur(refman.getNomTransporteur());
            ref.setNumeroEnregistrement(refman.getNumeroEnregistrement().substring(5));
            ref.setNumeroVoyage(refman.getNumeroVoyage());
        } catch (ParseException ex) {
            Logger.getLogger(ReferenceManifesteService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ref;
    }
    
    public ReferenceManifeste RefToRefman(RefManResult ref) {
        SimpleDateFormat fmt2 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat fmt1 = new SimpleDateFormat("yyyyMMdd");
        ReferenceManifeste refman = new ReferenceManifeste();
        try {
            refman.setAnneeEnregistrement(ref.getAnneeEnregistrement());
            refman.setBureauDouane(ref.getBureauDouane());
            refman.setCodeTransporteur(ref.getCodeTransporteur());
            refman.setDateArrivee(fmt1.format(fmt2.parse(ref.getDateArrivee())));
            refman.setDateDepart(fmt1.format(fmt2.parse(ref.getDateDepart())));
            refman.setDateEnregistrement(fmt1.format(fmt2.parse(ref.getDateEnregistrement())));
            refman.setInstanceId(ref.getInstanceId());
            refman.setLieuChargement(ref.getLieuChargement());
            refman.setNavire(ref.getNavire());
            refman.setNomTransporteur(ref.getNomTransporteur());
            refman.setNumeroEnregistrement(ref.getAnneeEnregistrement() + "-" + ref.getNumeroEnregistrement());
            refman.setNumeroVoyage(ref.getNumeroVoyage());

        } catch (ParseException ex) {
            Logger.getLogger(ReferenceManifesteService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return refman;
    }
}
