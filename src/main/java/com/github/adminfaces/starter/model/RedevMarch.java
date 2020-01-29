/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.model;

import com.github.adminfaces.persistence.model.BaseEntity;
import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name = "VUE_REDEVMARCH")
@Immutable
public class RedevMarch  extends BaseEntity implements Serializable{
    @Id
    @Column(name="id")
    private Integer id;
    @Column(name = "annee")
    private Integer annee;
    @Column(name = "condit")
    private String condit;
    @Column(name = "tarif")
    private String tarif;
    @Column(name = "tonnage")
    private Double tonnage;
    @Column(name = "montant")
    private Double montant;

    

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

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public String getCondit() {
        return condit;
    }

    public void setCondit(String condit) {
        this.condit = condit;
    }

    public String getTarif() {
        return tarif;
    }

    public void setTarif(String tarif) {
        this.tarif = tarif;
    }

    public Double getTonnage() {
        return tonnage;
    }

    public void setTonnage(Double tonnage) {
        this.tonnage = tonnage;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

}
