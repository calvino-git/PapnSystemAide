/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.service;

import com.github.adminfaces.starter.model.Escale;
import com.github.adminfaces.starter.repos.EscaleRepository;
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

/**
 *
 * @author Calvin ILOKI
 */
@Singleton
@Startup
public class EscaleService implements Serializable {

    @Inject
    protected EscaleRepository escaleRepo;

    private List<Escale> list;
    private Long nombreEscaleByAn;
    private Long nombrePetitEscaleByAn;
    private Long nombreGrandEscaleByAn;

    public long getNombreEscaleByAnnee(String situat, String annee) {
        return escaleRepo.getNombreEscaleByAnnee(situat, annee);
    }

    public Long getNombrePetitEscaleByAnnee(String situat, String annee) {
        return escaleRepo.getNombrePetitEscaleByAnnee(situat, annee);
    }

    public Long getNombreGrandEscaleByAnnee(String situat, String annee) {
        return escaleRepo.getNombreGrandEscaleByAnnee(situat, annee);
    }

    @PostConstruct
    public void init() {
        update();
        System.out.println("EscaleService initialisé...");
    }
    @Schedule(minute = "*/7",persistent = false)
    public void update(){
        this.nombrePetitEscaleByAn = getNombrePetitEscaleByAnnee("PARTI", String.valueOf(LocalDate.now().getYear()));
        this.nombreGrandEscaleByAn = getNombreGrandEscaleByAnnee("PARTI", String.valueOf(LocalDate.now().getYear()));
        this.nombreEscaleByAn = this.nombrePetitEscaleByAn + this.nombreGrandEscaleByAn;
        System.out.println("[" + LocalDateTime.now() + "] Le nombre d'escale mis à jour ...");
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

}
