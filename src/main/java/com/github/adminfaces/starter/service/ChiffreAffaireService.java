/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.service;

import com.github.adminfaces.starter.repos.ChiffreAffaireRepository;
import com.github.adminfaces.persistence.model.PersistenceEntity;
import com.github.adminfaces.starter.model.PrestationChiffreAffaire;
import com.github.adminfaces.starter.model.PrestationChiffreAffaire_;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import org.apache.deltaspike.data.api.criteria.Criteria;
import org.apache.deltaspike.data.impl.criteria.QueryCriteria;

/**
 *
 * @author Calvin ILOKI
 */
@Singleton
@Startup
public class ChiffreAffaireService implements Serializable {

    private List<PrestationChiffreAffaire> list;
    @Inject
    private EntityManager entityManager;
    @Inject
    protected ChiffreAffaireRepository chiffreAffaireRepo;

    public <E extends PersistenceEntity> Criteria<E, E> criteria(Class<E> entityClass) {
        return new QueryCriteria<>(entityClass, entityClass, getEntityManager());
    }
    public String getLibellePrestationParCode(String code) {
        String libelle = null;
        switch (code) {
            case "1":
                libelle = "REDEVANCE MARCHANDISE";
                break;
            case "2":
                libelle = "REDEVANCE CONCESSION";
                break;
            case "4":
                libelle = "REDEVANCE ELECTRICITE";
                break;
            case "5":
                libelle = "REDEVANCE NAVIRE";
                break;
            case "6":
                libelle = "REDEVANCE DIVERS";
                break;
            case "7":
                libelle = "REDEVANCE DOMANIALE";
                break;
            case "A":
                libelle = "AUTRES REDEVANCES";
                break;
            default: ;
        }
        return libelle;
    }

    public List<PrestationChiffreAffaire> listByAn(Integer debut, Integer fin) {
        Logger.getGlobal().log(Level.INFO, "Recherche du chiffre d''affaire par type de prestation entre {0} et {1}.", new Object[]{debut.toString(), fin.toString()});
        list = criteria(PrestationChiffreAffaire.class)
                .between(PrestationChiffreAffaire_.annee, debut, fin)
                .getResultList();
        return list;
    }

    public PrestationChiffreAffaire getPrestParAn(String code, Integer annee) {
        return criteria(PrestationChiffreAffaire.class)
                .eq(PrestationChiffreAffaire_.annee, annee)
                .eqIgnoreCase(PrestationChiffreAffaire_.code, code)
                .orderDesc(PrestationChiffreAffaire_.montant)
                .getSingleResult();
    }
    
    public Double getMontantTotalParAn(Integer annee){
        return chiffreAffaireRepo.getMontantTotalByAnnee(annee);
    }

    @PostConstruct
    public void init() {
        Logger.getGlobal().info(" PrestService est initialisé...");
        listByAn(2015, 2019);
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<PrestationChiffreAffaire> getList() {
        return list;
    }

    public void setList(List<PrestationChiffreAffaire> list) {
        this.list = list;
    }

}
