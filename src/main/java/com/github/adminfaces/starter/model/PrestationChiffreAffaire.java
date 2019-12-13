/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.model;

import com.github.adminfaces.persistence.model.BaseEntity;
import javax.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name = "CAPRESTATION_VIEW")
@Immutable
public class PrestationChiffreAffaire extends BaseEntity {
    @Id
    @Column(name="id")
    private Integer id;
    @Column(name = "annee")
    private Integer annee;
    @Column(name = "mois")
    private Integer mois;
    @Column(name = "code")
    private String code;
    @Column(name = "prestation")
    private String prestation;
    @Column(name = "montant")
    private Double montant;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getMois() {
        return mois;
    }

    public void setMois(Integer mois) {
        this.mois = mois;
    }

    
    
    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public String getPrestation() {
        return prestation;
    }

    public void setPrestation(String prestation) {
        this.prestation = prestation;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    @Override
    public Integer getId() {
        return id;
    }
        /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

}
