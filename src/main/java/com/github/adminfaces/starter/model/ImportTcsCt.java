/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.model;

import com.github.adminfaces.persistence.model.BaseEntity;
import java.math.BigInteger;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * @author rmpestano
 */
@Entity
@Table(name = "IMP_TCS_CT")
public class ImportTcsCt extends BaseEntity {

    @Id
    @Column(name = "TCCLEUNIK")
    private Integer tccleunik;
    @Column(name = "LIBELLE")
    private String libelle;
    @Column(name = "GROUPE")
    private String groupe;
    @Column(name = "DATE_DEBUT_PERIODE")
    private String dateDebutPeriode;
    @Column(name = "DATE_FIN_PERIODE")
    private String dateFinPeriode;
    @Column(name = "STATUT")
    private String statut;
    @Column(name = "GESTION")
    private BigInteger gestion;
    @Size(max = 10)
    @Column(name = "CREATEUR")
    private String createur;
    @Size(max = 8)
    @Column(name = "D_CREAT")
    private String dCreat;
    @Size(max = 4)
    @Column(name = "H_CREAT")
    private String hCreat;
    @Size(max = 10)
    @Column(name = "UTILISAT")
    private String utilisat;
    @Size(max = 8)
    @Column(name = "D_MODIF")
    private String dModif;
    @Size(max = 4)
    @Column(name = "H_MODIF")
    private String hModif;
    @OneToOne(mappedBy = "TCCLEUNIK",optional = true)
    private Facture facture;

    public ImportTcsCt() {
    }

    public ImportTcsCt(Integer id) {
        this.tccleunik = id;
    }
    @Override
    public Integer getId() {
        return tccleunik;
    }


    public boolean hasTccleunik() {
        return tccleunik != null;
    }

    public boolean hasLibelle() {
        return libelle != null && !"".equals(libelle.trim());
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Integer getTccleunik() {
        return tccleunik;
    }

    public void setTccleunik(Integer tccleunik) {
        this.tccleunik = tccleunik;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public String getDateDebutPeriode() {
        return dateDebutPeriode;
    }

    public void setDateDebutPeriode(String dateDebutPeriode) {
        this.dateDebutPeriode = dateDebutPeriode;
    }

    public String getDateFinPeriode() {
        return dateFinPeriode;
    }

    public void setDateFinPeriode(String dateFinPeriode) {
        this.dateFinPeriode = dateFinPeriode;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public BigInteger getGestion() {
        return gestion;
    }

    public void setGestion(BigInteger gestion) {
        this.gestion = gestion;
    }

    public String getCreateur() {
        return createur;
    }

    public void setCreateur(String createur) {
        this.createur = createur;
    }

    public String getdCreat() {
        return dCreat;
    }

    public void setdCreat(String dCreat) {
        this.dCreat = dCreat;
    }

    public String gethCreat() {
        return hCreat;
    }

    public void sethCreat(String hCreat) {
        this.hCreat = hCreat;
    }

    public String getUtilisat() {
        return utilisat;
    }

    public void setUtilisat(String utilisat) {
        this.utilisat = utilisat;
    }

    public String getdModif() {
        return dModif;
    }

    public void setdModif(String dModif) {
        this.dModif = dModif;
    }

    public String gethModif() {
        return hModif;
    }

    public void sethModif(String hModif) {
        this.hModif = hModif;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }
}
