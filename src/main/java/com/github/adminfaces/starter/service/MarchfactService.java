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

    public <E extends PersistenceEntity> Criteria<E, E> criteria(Class<E> entityClass) {
        return new QueryCriteria<>(entityClass, entityClass, getEntityManager());
    }
    
    public void listMarchFactByDepart(String debut, String fin){
        list = marchFactRepo.getListMarch(debut, fin);
    }
    
    @PostConstruct
    public void init() {
        update();
        System.out.println("[" + LocalDateTime.now() + "] MarchFactService est initialisé...");
    }
    
    @Schedule(minute = "*/5",persistent = false)
    public void update(){
        System.out.println("[" + LocalDateTime.now() + "] Liste des marchandises mise à jour ...");
        listMarchFactByDepart("20190101", "20191231");
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

}
