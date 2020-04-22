/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.service;

import com.github.adminfaces.persistence.model.Filter;
import com.github.adminfaces.persistence.model.PersistenceEntity;
import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.starter.model.ConteneurCT;
import com.github.adminfaces.starter.model.ConteneurCT_;
import com.github.adminfaces.starter.model.Escale;
import com.github.adminfaces.starter.model.Escale_;
import com.github.adminfaces.starter.repos.EscaleRepository;
import static com.github.adminfaces.template.util.Assert.has;
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
import org.apache.deltaspike.data.api.criteria.Criteria;

/**
 *
 * @author Calvin ILOKI
 */
@Singleton
//@Startup
public class EscaleService extends CrudService<Escale, Integer> implements Serializable {

    @Inject
    protected EscaleRepository escaleRepo;

    private String annee;
    private List<Escale> list;
    private Long nombreEscaleByAn;
    private Long nombrePetitEscaleByAn;
    private Long nombreGrandEscaleByAn;

    @PostConstruct
    public void init() {
        annee = String.valueOf(LocalDateTime.now().getYear());
        list = escaleRepo.listEscaleGrandNav2020();
        update();
        System.out.println("[" + LocalDateTime.now() + "] EscaleService initialisé...");
    }

    @Schedule(minute = "*/10", hour = "*", persistent = false)
    public void update() {
        System.out.println("[" + LocalDateTime.now() + "] Le nombre d'escale mis à jour ...");
        this.nombrePetitEscaleByAn = getNombrePetitEscaleByAnnee("PARTI", annee);
        this.nombreGrandEscaleByAn = getNombreGrandEscaleByAnnee("PARTI", annee);
        this.nombreEscaleByAn = this.nombrePetitEscaleByAn + this.nombreGrandEscaleByAn;
    }

    @Override
    protected Criteria<Escale, Escale> configRestrictions(Filter<Escale> filter) {
        Criteria<Escale, Escale> criteria = criteria();
//
        //create restrictions based on parameters map
        if (filter.hasParam("deb") && filter.hasParam("fin")) {
            criteria.between(Escale_.arrivee, filter.getStringParam("debut"), filter.getStringParam("fin"));
        } else if (filter.hasParam("debut")) {
            criteria.gtOrEq(Escale_.arrivee, filter.getStringParam("deb"));
        } else if (filter.hasParam("fin")) {
            criteria.ltOrEq(Escale_.arrivee, filter.getStringParam("fin"));
        }

        //create restrictions based on filter entity
//        if (has(filter.getEntity())) {
//            Escale filterEntity = filter.getEntity();
//            if (has(filterEntity.getTrafic())) {
//                criteria.likeIgnoreCase(Escale_.trafic, "%" + filterEntity.getTrafic());
//            }
//
//            if (has(filterEntity.getMois())) {
//                criteria.eq(Escale_.mois, filterEntity.getMois());
//            }
//            if (has(filterEntity.getEscale())) {
//                criteria.likeIgnoreCase(Escale_.escale, "%" + filterEntity.getEscale() + "%");
//            }
//
//            if (has(filterEntity.getNumCtn())) {
//                criteria.likeIgnoreCase(Escale_.numCtn, "%" + filterEntity.getNumCtn() + "%");
//            }
//        }
        return criteria;
    }

    public Long getNbrPetitEscaleByAn(String an) {
        return getNombrePetitEscaleByAnnee("PARTI", an);
    }

    public Long getNbrGrandEscaleByAn(String an) {
        return getNombreGrandEscaleByAnnee("PARTI", an);
    }

    public Long getNbrEscaleByAn(String an) {
        return getNombreEscaleByAnnee("PARTI", an);
    }

    public List<Escale> getList() {
        return list;
    }

    public void setList(List<Escale> list) {
        this.list = list;
    }

    public Long getNombreEscaleByAn() {
        return nombreEscaleByAn;
    }

    public void setNombreEscaleByAn(Long nombreEscaleByAn) {
        this.nombreEscaleByAn = nombreEscaleByAn;
    }

    public Long getNombrePetitEscaleByAn() {
        return nombrePetitEscaleByAn;
    }

    public void setNombrePetitEscaleByAn(Long nombrePetitEscaleByAn) {
        this.nombrePetitEscaleByAn = nombrePetitEscaleByAn;
    }

    public Long getNombreGrandEscaleByAn() {
        return nombreGrandEscaleByAn;
    }

    public void setNombreGrandEscaleByAn(Long nombreGrandEscaleByAn) {
        this.nombreGrandEscaleByAn = nombreGrandEscaleByAn;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public long getNombreEscaleByAnnee(String situat, String annee) {
        return escaleRepo.getNombreEscaleByAnnee(situat, annee);
    }

    public Long getNombrePetitEscaleByAnnee(String situat, String annee) {
        return escaleRepo.getNombrePetitEscaleByAnnee(situat, annee);
    }

    public Long getNombreGrandEscaleByAnnee(String situat, String annee) {
        return escaleRepo.getNombreGrandEscaleByAnnee(situat, annee);
    }

}
