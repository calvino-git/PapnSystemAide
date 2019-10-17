/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.model;

import com.github.adminfaces.persistence.model.BaseEntity;
import javax.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name = "CAPARPRESTATION")
@Immutable
public class ChiffrePrestation extends BaseEntity {

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
    @Id
    private Integer id;
    @Column(name = "annee")
    private Integer annee;
    @Column(name = "prestation")
    private String name;
    @Column(name = "montant")
    private Double montant;

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

}
