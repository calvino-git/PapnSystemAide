/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.service;

import com.github.adminfaces.persistence.model.PersistenceEntity;
import com.github.adminfaces.starter.model.ChiffrePrestation;
import com.github.adminfaces.starter.model.ChiffrePrestation_;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import org.apache.deltaspike.data.api.criteria.Criteria;
import org.apache.deltaspike.data.impl.criteria.QueryCriteria;

/**
 *
 * @author Calvin ILOKI
 */

@Stateless
public class PrestService implements Serializable{

    private HashMap<Integer, Double> redevNavire;
    private HashMap<Integer, Double> redevDivers;
    private HashMap<Integer, Double> redevDom;
    private HashMap<Integer, Double> redevMarch;
    private HashMap<Integer, Double> redevConcession;
    private HashMap<Integer, Double> redevElect;
    private HashMap<Integer, Double> redevAutre;

    public PrestService() {
        
    }
    
    @Inject
    private EntityManager entityManager;
    
    public <E extends PersistenceEntity> Criteria<E, E> criteria(Class<E> entityClass) {
        return new QueryCriteria<>(entityClass, entityClass, getEntityManager());
    }
    public List<ChiffrePrestation> listByAn(Integer annee) {
        return criteria(ChiffrePrestation.class)
                .eq(ChiffrePrestation_.annee, annee)
                .orderDesc(ChiffrePrestation_.montant)
                .getResultList();
    }
    
    @PostConstruct
    public void init(){
        redevAutre = new HashMap<>();
        redevConcession = new HashMap<>();
        redevDivers = new HashMap<>();
        redevDom = new HashMap<>();
        redevElect = new HashMap<>();
        redevMarch = new HashMap<>();
        redevNavire = new HashMap<>();
        
        for(int i = 2015 ; i < 2020; i++){
            List<ChiffrePrestation> list = listByAn(i);
            list.forEach(prest -> {
//                System.out.println(prest.getAnnee() + " - " + prest.getName() + " : " + prest.getMontant());
                switch(prest.getName()){
                    case "1": redevMarch.put(prest.getAnnee(), prest.getMontant());break;
                    case "2": redevConcession.put(prest.getAnnee(), prest.getMontant());break;
                    case "4": redevElect.put(prest.getAnnee(), prest.getMontant());break;
                    case "5": redevNavire.put(prest.getAnnee(), prest.getMontant());break;
                    case "6": redevDivers.put(prest.getAnnee(), prest.getMontant());break;
                    case "7": redevDom.put(prest.getAnnee(), prest.getMontant());break;
                    case "A": redevAutre.put(prest.getAnnee(), prest.getMontant());break;
                    default: System.out.println("RIEN");                           
                }
            });
        }
    }

    public HashMap<Integer, Double> getRedevNavire() {
        return redevNavire;
    }

    public void setRedevNavire(HashMap<Integer, Double> redevNavire) {
        this.redevNavire = redevNavire;
    }

    public HashMap<Integer, Double> getRedevDivers() {
        return redevDivers;
    }

    public void setRedevDivers(HashMap<Integer, Double> redevDivers) {
        this.redevDivers = redevDivers;
    }

    public HashMap<Integer, Double> getRedevDom() {
        return redevDom;
    }

    public void setRedevDom(HashMap<Integer, Double> redevDom) {
        this.redevDom = redevDom;
    }

    public HashMap<Integer, Double> getRedevMarch() {
        return redevMarch;
    }

    public void setRedevMarch(HashMap<Integer, Double> redevMarch) {
        this.redevMarch = redevMarch;
    }

    public HashMap<Integer, Double> getRedevConcession() {
        return redevConcession;
    }

    public void setRedevConcession(HashMap<Integer, Double> redevConcession) {
        this.redevConcession = redevConcession;
    }

    public HashMap<Integer, Double> getRedevElect() {
        return redevElect;
    }

    public void setRedevElect(HashMap<Integer, Double> redevElect) {
        this.redevElect = redevElect;
    }

    public HashMap<Integer, Double> getRedevAutre() {
        return redevAutre;
    }

    public void setRedevAutre(HashMap<Integer, Double> redevAutre) {
        this.redevAutre = redevAutre;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    

}
