/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.service;

import com.github.adminfaces.starter.repos.ChiffreAffaireRepository;
import com.github.adminfaces.persistence.model.PersistenceEntity;
import com.github.adminfaces.starter.model.Escale;
import com.github.adminfaces.starter.model.PrestationChiffreAffaire;
import com.github.adminfaces.starter.model.PrestationChiffreAffaire_;
import com.github.adminfaces.starter.repos.EscaleRepository;
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
public class EscaleService implements Serializable {

    private List<Escale> list;
    @Inject
    protected EscaleRepository escaleRepo;


    public Long getNombreEscaleByAnnee(String situat, String annee){
        return escaleRepo.getNombreEscaleByAnnee(situat,annee);
    }
    
    @PostConstruct
    public void init() {
    }
    
    public List<Escale> getList() {
        return list;
    }

    public void setList(List<Escale> list) {
        this.list = list;
    }

}
