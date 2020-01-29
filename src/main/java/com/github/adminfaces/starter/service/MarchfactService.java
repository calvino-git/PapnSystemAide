/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.service;

import com.github.adminfaces.persistence.model.PersistenceEntity;
import com.github.adminfaces.starter.model.Marchfact;
import com.github.adminfaces.starter.repos.MarchFactRepository;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.logging.Logger;
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
public class MarchfactService implements Serializable {

    private List<Marchfact> list;
    @Inject
    private EntityManager entityManager;
    @Inject
    protected MarchFactRepository marchFactRepo;
    private String debut;
    private String fin;

    public <E extends PersistenceEntity> Criteria<E, E> criteria(Class<E> entityClass) {
        return new QueryCriteria<>(entityClass, entityClass, getEntityManager());
    }
    
    public void listMarchFactByDepart(String debut, String fin){
        list = marchFactRepo.getListMarch(debut, fin);
    }
    
    @PostConstruct
    public void init() {
        debut = LocalDateTime.now().getYear()-1 + "0101";
        fin = LocalDateTime.now().getYear()-1 + "1231";
        update();
        System.out.println("[" + LocalDateTime.now() + "] MarchFactService est initialisé...");
    }
    
    @Schedule(minute = "*/10",hour = "*",persistent = false)
    public void update(){
        System.out.println("[" + LocalDateTime.now() + "] Liste des marchandises mise à jour ...");
        listMarchFactByDepart(debut, fin);
    }
    
    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    

    public List<Marchfact> getList() {
        return list;
    }

    public void setList(List<Marchfact> list) {
        this.list = list;
    }

    public String getDebut() {
        return debut;
    }

    public void setDebut(String debut) {
        this.debut = debut;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

}
