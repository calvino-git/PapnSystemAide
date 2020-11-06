/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.service;

import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.starter.model.TraficMarchandise;
import com.github.adminfaces.starter.model.TraficMarchandise_;
import com.github.adminfaces.starter.repos.TraficMarchRepository;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.inject.Inject;

/**
 *
 * @author Calvin ILOKI
 */
@Singleton
//@Startup
public class TraficMarchandiseService extends CrudService<TraficMarchandise, Integer> implements Serializable {
    @Inject
    protected TraficMarchRepository traficMarchRepository;
    private String debut;
    private String fin;
    
    @PostConstruct
    public void init() {
        debut = LocalDateTime.now().getYear() + "0101";
        fin = LocalDateTime.now().getYear() + "1231";
        System.out.println("[" + LocalDateTime.now() + "] Service de Trafic des marchandises est initialisé...");
    }
    
    public List<TraficMarchandise> listTraficMarchandiseParDate(String debutFin, String dateFin){
        return traficMarchRepository.listTraficMarch(debutFin, dateFin);
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

    public Double tonnageTotalAn(Integer year) {
        System.out.println("ANNEE " + year);
        List<Double> list = criteria().select(Double.class,attribute(TraficMarchandise_.poids))
                .like(TraficMarchandise_.dateDepart, year + "%")
                .getResultList();
        return list.stream().collect(Collectors.summingDouble(m->m==null?0.0:m));
    }

    public Double tonnageTotalMois(Integer mois) {
        System.out.println("MOIS " + mois);
        List<Double> list = criteria().select(Double.class,attribute(TraficMarchandise_.poids))
                .like(TraficMarchandise_.dateDepart, mois + "%")
                .getResultList();
        return list.stream().collect(Collectors.summingDouble(m->m==null?0.0:m));
    }

}
