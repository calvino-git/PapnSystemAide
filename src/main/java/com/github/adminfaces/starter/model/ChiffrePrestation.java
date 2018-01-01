/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.model;

import com.github.adminfaces.persistence.model.BaseEntity;
import javax.persistence.*;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

@Entity
@Immutable
@Subselect("select rownum id, annee, prestation, montht from (SELECT substr(facture.mois_comptable,0,4) ANNEE,substr(facture.numero,6,1) PRESTATION, SUM(NVL(prests.mnt_ht,0)) MONTHT \n"
        + "FROM FACTURE,prests WHERE FACTURE.cicleunik=prests.cicleunik AND FACTURE.type in (1,8,9) \n"
        + "and rtrim(prests.tarif)<>'DIVDIV CAUT' and substr(facture.numero,6,1)<>'9' \n"
        + "and facture.numero is not null and substr(facture.numero,6,1)<>'8' \n"
        + "and substr(facture.numero,6,1)<>'3'and substr(facture.numero,5,1)<>'3'\n"
        + "GROUP BY substr(facture.mois_comptable,0,4),substr(facture.numero,6,1)  ORDER BY 1 asc ) CHIFFREPRESTATION")
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
    @Column(name = "montht")
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
