package com.github.adminfaces.starter.bean;


import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import com.github.adminfaces.starter.service.ChiffreAffaireService;
import com.github.adminfaces.starter.service.PrestService;
import java.util.ArrayList;
import javax.annotation.PostConstruct;

/**
 * Created by rmpestano on 12/02/17.
 */
@Named
@ViewScoped
public class ChiffreAffaireBean implements Serializable {

    private Integer yearCount ;
    private List<Integer> years;
    private Integer anneeDebut;
    private Integer anneeFin;
    private List<ChiffreAffaireService> list;
        
    @PostConstruct
    public void init(){
        this.yearCount = 5;
        years =new ArrayList<>(yearCount);
        years.add(2015);
        years.add(2016);
        years.add(2017);
        years.add(2018);
        years.add(2019);
        list = new ArrayList<>();
        list.add(new ChiffreAffaireService("1", "REDEVANCE MARCHANDISE"));
        list.add(new ChiffreAffaireService("5", "REDEVANCE NAVIRE"));
        list.add(new ChiffreAffaireService("7", "REDEVANCE DOMANIALE"));
        list.add(new ChiffreAffaireService("2", "REDEVANCE CONCESSION"));
        list.add(new ChiffreAffaireService("4", "REDEVANCE ELECTRICITE"));
        list.add(new ChiffreAffaireService("6", "REDEVANCE DIVERS"));
        list.add(new ChiffreAffaireService("A", "REDEVANCE A"));
        
    }
    
    public Double totalAnnee(Integer annee){
        Double total = 0.0 ;
        for(ChiffreAffaireService ca : list){
            total += ca.getChiffre(annee);
        }
        return total;
    }
    
    public void findByYear(){
        System.out.println("De " + anneeDebut + " à " + anneeFin);
    }
    public Integer getYearCount() {
        return yearCount;
    }

    public void setYearCount(Integer yearCount) {
        this.yearCount = yearCount;
    }

    public List<Integer> getYears() {
        return years;
    }

    public void setYears(List<Integer> years) {
        this.years = years;
    }

    public List<ChiffreAffaireService> getList() {
        return list;
    }

    public void setList(List<ChiffreAffaireService> list) {
        this.list = list;
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
    
    
    
    
}
