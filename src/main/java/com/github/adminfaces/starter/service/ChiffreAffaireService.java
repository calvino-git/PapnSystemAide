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
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
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
//@Startup
public class ChiffreAffaireService implements Serializable {

    private List<PrestationChiffreAffaire> list;
    private List<PrestationChiffreAffaire> listStatic;
    private Integer anneeDebut;
    private Integer anneeFin;
    @Inject
    private EntityManager entityManager;
    @Inject
    protected ChiffreAffaireRepository chiffreAffaireRepo;

    private Double totalRecetteParAn;
    Double montantParAn = 0.0;
    private double montantParMois;

    @PostConstruct
    public void init() {
//        anneeFin = LocalDateTime.now().getYear();
//        anneeDebut = anneeFin-1;
//        update();
//        listStatic = list;
        System.out.println("[" + LocalDateTime.now() + "] ChiffreAffaireService est initialisé...");
    }

//    @Schedule(minute = "*/10", hour = "*",persistent = false)
    public void update() {
        System.out.println("[" + LocalDateTime.now() + "] ChiffreAffaireService actualisé ...");
//        this.list = listByAn(anneeDebut, anneeFin);
//        this.totalRecetteParAn = getMontantTotalParAn(anneeFin);
    }

    public <E extends PersistenceEntity> Criteria<E, E> criteria(Class<E> entityClass) {
        return new QueryCriteria<>(entityClass, entityClass, getEntityManager());
    }

    public List<PrestationChiffreAffaire> listByAn(Integer annee) {
        list = criteria(PrestationChiffreAffaire.class)
                .eq(PrestationChiffreAffaire_.annee, annee)
                .getResultList();
        return list;
    }
    
    public List<PrestationChiffreAffaire> listByAn(Integer debut, Integer fin) {
        list = criteria(PrestationChiffreAffaire.class)
                .between(PrestationChiffreAffaire_.annee, debut,fin)
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
    
    public PrestationChiffreAffaire getPrestParMois(String code, Integer mois) {
        return criteria(PrestationChiffreAffaire.class)
                .eq(PrestationChiffreAffaire_.mois, mois)
                .eqIgnoreCase(PrestationChiffreAffaire_.code, code)
                .orderDesc(PrestationChiffreAffaire_.montant)
                .getSingleResult();
    }

    public Double getMontantTotalParAn(Integer annee) {
        montantParAn = 0.0;
        list.stream().filter(p -> p.getAnnee().intValue() == annee.intValue()).collect(Collectors.toList())
                .forEach(p -> montantParAn += p.getMontant());
        return montantParAn;
    }
    public Double getMontantTotalParMois(Integer mois) {
        montantParMois = 0.0;
        list.stream().filter(p -> p.getMois().intValue() == mois.intValue()).collect(Collectors.toList())
                .forEach(p -> montantParMois += p.getMontant());
        return montantParMois;
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

    public Integer getAnneeDebut() {
        return anneeDebut;
    }

    public void setAnneeDebut(Integer anneeDebut) {
        this.anneeDebut = anneeDebut;
    }

    public Integer getAnneeFin() {
        return anneeFin;
    }

    public void setAnneeFin(Integer anneeFin) {
        this.anneeFin = anneeFin;
    }

    public List<PrestationChiffreAffaire> getListStatic() {
        return listStatic;
    }

    public void setListStatic(List<PrestationChiffreAffaire> listStatic) {
        this.listStatic = listStatic;
    }

    public Double getMontantParAn() {
        return montantParAn;
    }

    public void setMontantParAn(Double montantParAn) {
        this.montantParAn = montantParAn;
    }

    public double getMontantParMois() {
        return montantParMois;
    }

    public void setMontantParMois(double montantParMois) {
        this.montantParMois = montantParMois;
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
