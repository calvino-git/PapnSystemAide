/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.service;

import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.starter.model.ChiffrePrestation;
import com.github.adminfaces.starter.model.ChiffrePrestation_;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

/**
 *
 * @author Calvin ILOKI
 */
@Stateless
public class PrestService extends CrudService<ChiffrePrestation, Integer> implements Serializable {

    private HashMap<Integer, Double> redevNavire = new HashMap<>();
    private HashMap<Integer, Double> redevDivers = new HashMap<>();
    private HashMap<Integer, Double> redevDom = new HashMap<>();
    private HashMap<Integer, Double> redevMarch = new HashMap<>();
    private HashMap<Integer, Double> redevConcession = new HashMap<>();
    private HashMap<Integer, Double> redevElect = new HashMap<>();
    private HashMap<Integer, Double> redevAutre = new HashMap<>();
    
    public List<ChiffrePrestation> listByAn(Integer annee) {
        System.out.println("Annee : " + annee);
        return criteria()
                .eq(ChiffrePrestation_.annee, annee)
                .orderDesc(ChiffrePrestation_.montant)
                .getResultList();
    }
    
    @PostConstruct
    public void init(){
        for(int i = 2015 ; 1 < 2020; i++){
            List<ChiffrePrestation> list = listByAn(i);
            list.forEach(prest -> {
                switch(prest.getName()){
                    case "1": redevMarch.put(prest.getAnnee(), prest.getMontant());
                    case "2": redevConcession.put(prest.getAnnee(), prest.getMontant());
                    case "4": redevElect.put(prest.getAnnee(), prest.getMontant());
                    case "5": redevNavire.put(prest.getAnnee(), prest.getMontant());
                    case "6": redevDivers.put(prest.getAnnee(), prest.getMontant());
                    case "7": redevDom.put(prest.getAnnee(), prest.getMontant());
                    case "A": redevAutre.put(prest.getAnnee(), prest.getMontant());
                    default: System.out.println("RIEN");                           
                }
            });
        }
    }
    
    @Produces
    @Named("redevances")
    public List<ChiffreAffaireService> getRedevances(){
        List<ChiffreAffaireService> list = new ArrayList<>();
        list.add(new ChiffreAffaireService("1", "REDEVANCE MARCHANDISE"));
        list.add(new ChiffreAffaireService("5", "REDEVANCE NAVIRE"));
        list.add(new ChiffreAffaireService("7", "REDEVANCE DOMANIALE"));
        list.add(new ChiffreAffaireService("2", "REDEVANCE CONCESSION"));
        list.add(new ChiffreAffaireService("4", "REDEVANCE ELECTRICITE"));
        list.add(new ChiffreAffaireService("6", "REDEVANCE DIVERS"));
        list.add(new ChiffreAffaireService("A", "REDEVANCE A"));        
        
        return list;
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
    
    

}
