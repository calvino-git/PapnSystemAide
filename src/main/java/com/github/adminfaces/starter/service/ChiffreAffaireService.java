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
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Schedule;
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
    
    private Double totalRecetteParAn;

    @PostConstruct
    public void init() {
        update();
        System.out.println("ChiffreAffaireService est initialisé...");
    }

    @Schedule(minute = "*/6",persistent = false)
    public void update(){
        int annee = LocalDate.now().getYear();
        this.totalRecetteParAn = getMontantTotalParAn(annee);
        this.list = listByAn(annee-5, annee);
        System.out.println("[" + LocalDateTime.now() + "] ChiffreAffaireService mis à jour ...");
    }
    
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

    
    public Double getTotalRecetteParAn() {
        return totalRecetteParAn;
    }

    public void setTotalRecetteParAn(Double totalRecetteParAn) {
        this.totalRecetteParAn = totalRecetteParAn;
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
