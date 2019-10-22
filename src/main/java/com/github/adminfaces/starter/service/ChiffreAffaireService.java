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
//
//    private HashMap<Integer, Double> redevNavire;
//    private HashMap<Integer, Double> redevDivers;
//    private HashMap<Integer, Double> redevDom;
//    private HashMap<Integer, Double> redevMarch;
//    private HashMap<Integer, Double> redevConcession;
//    private HashMap<Integer, Double> redevElect;
//    private HashMap<Integer, Double> redevAutre;

    private List<PrestationChiffreAffaire> list;
    @Inject
    private EntityManager entityManager;
    @Inject
    protected ChiffreAffaireRepository chiffreAffaireRepo;

    public <E extends PersistenceEntity> Criteria<E, E> criteria(Class<E> entityClass) {
        return new QueryCriteria<>(entityClass, entityClass, getEntityManager());
    }

    public void listByAn(Integer debut, Integer fin) {
        Logger.getGlobal().log(Level.INFO, "Recherche du chiffre d''affaire par type de prestation entre {0} et {1}.", new Object[]{debut.toString(), fin.toString()});
        list = criteria(PrestationChiffreAffaire.class)
                .between(PrestationChiffreAffaire_.annee, debut, fin)
                .getResultList();
    }

    public PrestationChiffreAffaire getPrestParAn(String prestation, Integer annee) {
        return criteria(PrestationChiffreAffaire.class)
                .eq(PrestationChiffreAffaire_.annee, annee)
                .eqIgnoreCase(PrestationChiffreAffaire_.prestation, prestation)
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
//        redevAutre = new HashMap<>();
//        redevConcession = new HashMap<>();
//        redevDivers = new HashMap<>();
//        redevDom = new HashMap<>();
//        redevElect = new HashMap<>();
//        redevMarch = new HashMap<>();
//        redevNavire = new HashMap<>();
//        
//        for(int i = 2015 ; i < 2020; i++){
//            List<ChiffrePrestation> list = listByAn(i);
//            list.forEach(prest -> {
////                System.out.println(prest.getAnnee() + " - " + prest.getName() + " : " + prest.getMontant());
//                switch(prest.getName()){
//                    case "1": redevMarch.put(prest.getAnnee(), prest.getMontant());break;
//                    case "2": redevConcession.put(prest.getAnnee(), prest.getMontant());break;
//                    case "4": redevElect.put(prest.getAnnee(), prest.getMontant());break;
//                    case "5": redevNavire.put(prest.getAnnee(), prest.getMontant());break;
//                    case "6": redevDivers.put(prest.getAnnee(), prest.getMontant());break;
//                    case "7": redevDom.put(prest.getAnnee(), prest.getMontant());break;
//                    case "A": redevAutre.put(prest.getAnnee(), prest.getMontant());break;
//                    default: System.out.println("RIEN");                           
//                }
//            });
//        }
    }

//    public HashMap<Integer, Double> getRedevNavire() {
//        return redevNavire;
//    }
//
//    public void setRedevNavire(HashMap<Integer, Double> redevNavire) {
//        this.redevNavire = redevNavire;
//    }
//
//    public HashMap<Integer, Double> getRedevDivers() {
//        return redevDivers;
//    }
//
//    public void setRedevDivers(HashMap<Integer, Double> redevDivers) {
//        this.redevDivers = redevDivers;
//    }
//
//    public HashMap<Integer, Double> getRedevDom() {
//        return redevDom;
//    }
//
//    public void setRedevDom(HashMap<Integer, Double> redevDom) {
//        this.redevDom = redevDom;
//    }
//
//    public HashMap<Integer, Double> getRedevMarch() {
//        return redevMarch;
//    }
//
//    public void setRedevMarch(HashMap<Integer, Double> redevMarch) {
//        this.redevMarch = redevMarch;
//    }
//
//    public HashMap<Integer, Double> getRedevConcession() {
//        return redevConcession;
//    }
//
//    public void setRedevConcession(HashMap<Integer, Double> redevConcession) {
//        this.redevConcession = redevConcession;
//    }
//
//    public HashMap<Integer, Double> getRedevElect() {
//        return redevElect;
//    }
//
//    public void setRedevElect(HashMap<Integer, Double> redevElect) {
//        this.redevElect = redevElect;
//    }
//
//    public HashMap<Integer, Double> getRedevAutre() {
//        return redevAutre;
//    }
//
//    public void setRedevAutre(HashMap<Integer, Double> redevAutre) {
//        this.redevAutre = redevAutre;
//    }
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
