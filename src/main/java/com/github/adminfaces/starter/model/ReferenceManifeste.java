/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.model;

import com.github.adminfaces.persistence.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author 60610H
 */
@Entity
@Table(name = "REFERENCE_MANIFESTE", catalog = "", schema = "DSIPAPN")
public class ReferenceManifeste extends BaseEntity implements Serializable{
    @Column(name = "INSTANCEID")
    private String instanceId;
    @Column(name = "BUREAU_DOUANE")
    private String bureauDouane;
    @Column(name = "NUMERO_VOYAGE")
    private String numeroVoyage;
    @Column(name = "DATE_DEPART")
    private String dateDepart;
    @Column(name = "ANNEE_ENREGISTREMENT")
    private String anneeEnregistrement;
    @Column(name = "NUMERO_ENREGISTREMENT")
    private String numeroEnregistrement;
    @Column(name = "DATE_ENREGISTREMENT")
    private String dateEnregistrement;
    @Column(name = "DATE_ARRIVEE")
    private String dateArrivee;
    @Column(name = "CODE_TRANSPORTEUR")
    private String codeTransporteur;
    @Column(name = "NOM_TRANSPORTEUR")
    private String nomTransporteur;
    @Column(name = "NAVIRE")
    private String navire;
    @Column(name = "LIEU_CHARGEMENT")
    private String lieuChargement;
    @Column(name = "TRAFIC")
    private String trafic;
    @Column(name = "MANIFESTE")
    private boolean manifeste;
    @Column(name = "DATE_INSERTION")
    private String dateInsertion;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public ReferenceManifeste() {
    }
    
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getBureauDouane() {
        return bureauDouane;
    }

    public void setBureauDouane(String bureauDouane) {
        this.bureauDouane = bureauDouane;
    }

    public String getNumeroVoyage() {
        return numeroVoyage;
    }

    public void setNumeroVoyage(String numeroVoyage) {
        this.numeroVoyage = numeroVoyage;
    }

    public String getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(String dateDepart) {
        this.dateDepart = dateDepart;
    }

    public String getAnneeEnregistrement() {
        return anneeEnregistrement;
    }

    public void setAnneeEnregistrement(String anneeEnregistrement) {
        this.anneeEnregistrement = anneeEnregistrement;
    }

    public String getNumeroEnregistrement() {
        return numeroEnregistrement;
    }

    public void setNumeroEnregistrement(String numeroEnregistrement) {
        this.numeroEnregistrement = numeroEnregistrement;
    }

    public String getDateEnregistrement() {
        return dateEnregistrement;
    }

    public void setDateEnregistrement(String dateEnregistrement) {
        this.dateEnregistrement = dateEnregistrement;
    }

    public String getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(String dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public String getCodeTransporteur() {
        return codeTransporteur;
    }

    public void setCodeTransporteur(String codeTransporteur) {
        this.codeTransporteur = codeTransporteur;
    }

    public String getNomTransporteur() {
        return nomTransporteur;
    }

    public void setNomTransporteur(String nomTransporteur) {
        this.nomTransporteur = nomTransporteur;
    }

    public String getNavire() {
        return navire;
    }

    public void setNavire(String navire) {
        this.navire = navire;
    }

    public String getLieuChargement() {
        return lieuChargement;
    }

    public void setLieuChargement(String lieuChargement) {
        this.lieuChargement = lieuChargement;
    }

    public String getTrafic() {
        return trafic;
    }

    public void setTrafic(String trafic) {
        this.trafic = trafic;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean hasInstanceId() {
        return instanceId != null && !"".equals(instanceId.trim());
    }

    public boolean isManifeste() {
        return manifeste;
    }

    public void setManifeste(boolean manifeste) {
        this.manifeste = manifeste;
    }

    public String getDateInsertion() {
        return dateInsertion;
    }

    public void setDateInsertion(String dateInsertion) {
        this.dateInsertion = dateInsertion;
    }
}
