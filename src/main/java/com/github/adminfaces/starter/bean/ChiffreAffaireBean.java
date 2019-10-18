package com.github.adminfaces.starter.bean;


import com.github.adminfaces.starter.model.ChiffrePrestation;
import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import com.github.adminfaces.starter.service.ChiffreAffaireService;
import com.github.adminfaces.starter.service.PrestService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
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
    private Map<String,String> listPrest;
    private List<String> keyList;
    
    @Inject
    private PrestService prestService;
        
    @PostConstruct
    public void init(){
        anneeDebut = 2015;
        anneeFin = 2019;
        yearCount = 5;
        years =new ArrayList<>(yearCount);
        years.add(2015);
        years.add(2016);
        years.add(2017);
        years.add(2018);
        years.add(2019);
        
        listPrest = new HashMap<>();
        listPrest.put("1", "REDEVANCE MARCHANDISE");
        listPrest.put("5", "REDEVANCE NAVIRE");
        listPrest.put("7", "REDEVANCE DOMANIALE");
        listPrest.put("2", "REDEVANCE CONCESSION");
        listPrest.put("4", "REDEVANCE ELECTRICITE");
        listPrest.put("6", "REDEVANCE DIVERS");
        listPrest.put("A", "REDEVANCE A");
        keyList = new ArrayList<>(listPrest.keySet().stream().sorted().collect(Collectors.toList()));
    }
    
    public Double totalAnnee(Integer annee){
        Double total = 0.0 ;
        for(String code : listPrest.keySet()){
            total += getMontantPrest(annee, code);
        }
        return total;
    }
    
    public Double getMontantPrest(Integer annee, String code){
        List<ChiffrePrestation> list = prestService.getList().stream()
                .filter(ca -> (ca.getName().equalsIgnoreCase(code)) && (ca.getAnnee().intValue() == annee.intValue()))
                .collect(Collectors.toList());
        
            ChiffrePrestation cp = list.get(0);
            return cp.getMontant();
    }
    
    public void findByYear(Integer debut, Integer fin){
        prestService.listByAn(debut, fin);
        anneeDebut = debut;
        anneeFin = fin;
        yearCount = fin - debut + 1;
        years.clear();
        for(int i=debut;i <fin+1;i++){
            years.add(i);
        }
    }
    
    public String getPrestLibelle(String code){
        String libelle = null;
        switch(code){
                    case "1": libelle = "REDEVANCE MARCHANDISE";break;
                    case "2": libelle = "REDEVANCE CONCESSION";break;
                    case "4": libelle = "REDEVANCE ELECTRICITE";break;
                    case "5": libelle = "REDEVANCE NAVIRE";break;
                    case "6": libelle = "REDEVANCE DIVERS";break;
                    case "7": libelle = "REDEVANCE DOMANIALE";break;
                    case "A": libelle = "AUTRES REDEVANCES";break;
                    default: ;                           
                }
        System.out.println("Libelle " + libelle);
        return libelle;
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

    public Map<String, String> getListPrest() {
        return listPrest;
    }

    public void setListPrest(Map<String, String> listPrest) {
        this.listPrest = listPrest;
    }

    public List<String> getKeyList() {
        return keyList;
    }

    public void setKeyList(List<String> keyList) {
        this.keyList = keyList;
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
