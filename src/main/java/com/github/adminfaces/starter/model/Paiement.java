/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.model;

import com.github.adminfaces.persistence.model.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrateur
 */
@Entity
@Table(name = "MV_PAIEMENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paiement.findAll", query = "SELECT p FROM Paiement p"),
    @NamedQuery(name = "Paiement.findByPmcleunik", query = "SELECT p FROM Paiement p WHERE p.pmcleunik = :pmcleunik"),
    @NamedQuery(name = "Paiement.findByChcleunik", query = "SELECT p FROM Paiement p WHERE p.chcleunik = :chcleunik"),
    @NamedQuery(name = "Paiement.findByNumero", query = "SELECT p FROM Paiement p WHERE p.numero = :numero"),
    @NamedQuery(name = "Paiement.findByDatePaiement", query = "SELECT p FROM Paiement p WHERE p.datePaiement = :datePaiement"),
    @NamedQuery(name = "Paiement.findByHeurePaiement", query = "SELECT p FROM Paiement p WHERE p.heurePaiement = :heurePaiement"),
    @NamedQuery(name = "Paiement.findByDetails", query = "SELECT p FROM Paiement p WHERE p.details = :details"),
    @NamedQuery(name = "Paiement.findByModeReglement", query = "SELECT p FROM Paiement p WHERE p.modeReglement = :modeReglement"),
    @NamedQuery(name = "Paiement.findByBanque", query = "SELECT p FROM Paiement p WHERE p.banque = :banque"),
    @NamedQuery(name = "Paiement.findByMntHt", query = "SELECT p FROM Paiement p WHERE p.mntHt = :mntHt"),
    @NamedQuery(name = "Paiement.findByMntTva", query = "SELECT p FROM Paiement p WHERE p.mntTva = :mntTva"),
    @NamedQuery(name = "Paiement.findByMntTtc", query = "SELECT p FROM Paiement p WHERE p.mntTtc = :mntTtc"),
    @NamedQuery(name = "Paiement.findByMntCentimesAdd", query = "SELECT p FROM Paiement p WHERE p.mntCentimesAdd = :mntCentimesAdd"),
    @NamedQuery(name = "Paiement.findByCreateur", query = "SELECT p FROM Paiement p WHERE p.createur = :createur"),
    @NamedQuery(name = "Paiement.findByDateCreation", query = "SELECT p FROM Paiement p WHERE p.dateCreation = :dateCreation"),
    @NamedQuery(name = "Paiement.findByHeureCreation", query = "SELECT p FROM Paiement p WHERE p.heureCreation = :heureCreation"),
    @NamedQuery(name = "Paiement.findByUtilisat", query = "SELECT p FROM Paiement p WHERE p.utilisat = :utilisat"),
    @NamedQuery(name = "Paiement.findByDateModif", query = "SELECT p FROM Paiement p WHERE p.dateModif = :dateModif"),
    @NamedQuery(name = "Paiement.findByHeureModif", query = "SELECT p FROM Paiement p WHERE p.heureModif = :heureModif"),
    @NamedQuery(name = "Paiement.findByTransfertCompta", query = "SELECT p FROM Paiement p WHERE p.transfertCompta = :transfertCompta")})
public class Paiement extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PMCLEUNIK")
    private BigDecimal pmcleunik;
    @Column(name = "CHCLEUNIK")
    private BigInteger chcleunik;
    @Size(max = 12)
    @Column(name = "NUMERO")
    private String numero;
    @Size(max = 8)
    @Column(name = "DATE_PAIEMENT")
    private String datePaiement;
    @Size(max = 4)
    @Column(name = "HEURE_PAIEMENT")
    private String heurePaiement;
    @Size(max = 80)
    @Column(name = "DETAILS")
    private String details;
    @Size(max = 8)
    @Column(name = "MODE_REGLEMENT")
    private String modeReglement;
    @Size(max = 20)
    @Column(name = "BANQUE")
    private String banque;
    @Column(name = "MNT_HT")
    private BigDecimal mntHt;
    @Column(name = "MNT_TVA")
    private BigDecimal mntTva;
    @Column(name = "MNT_TTC")
    private BigDecimal mntTtc;
    @Column(name = "MNT_CENTIMES_ADD")
    private BigDecimal mntCentimesAdd;
    @Size(max = 10)
    @Column(name = "CREATEUR")
    private String createur;
    @Size(max = 8)
    @Column(name = "DATE_CREATION")
    private String dateCreation;
    @Size(max = 4)
    @Column(name = "HEURE_CREATION")
    private String heureCreation;
    @Size(max = 10)
    @Column(name = "UTILISAT")
    private String utilisat;
    @Size(max = 8)
    @Column(name = "DATE_MODIF")
    private String dateModif;
    @Size(max = 4)
    @Column(name = "HEURE_MODIF")
    private String heureModif;
    @Column(name = "TRANSFERT_COMPTA")
    private Short transfertCompta;

    public Paiement() {
    }

    public Paiement(BigDecimal pmcleunik) {
        this.pmcleunik = pmcleunik;
    }

    public BigDecimal getPmcleunik() {
        return pmcleunik;
    }

    public void setPmcleunik(BigDecimal pmcleunik) {
        this.pmcleunik = pmcleunik;
    }

    public BigInteger getChcleunik() {
        return chcleunik;
    }

    public void setChcleunik(BigInteger chcleunik) {
        this.chcleunik = chcleunik;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(String datePaiement) {
        this.datePaiement = datePaiement;
    }

    public String getHeurePaiement() {
        return heurePaiement;
    }

    public void setHeurePaiement(String heurePaiement) {
        this.heurePaiement = heurePaiement;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getModeReglement() {
        return modeReglement;
    }

    public void setModeReglement(String modeReglement) {
        this.modeReglement = modeReglement;
    }

    public String getBanque() {
        return banque;
    }

    public void setBanque(String banque) {
        this.banque = banque;
    }

    public BigDecimal getMntHt() {
        return mntHt;
    }

    public void setMntHt(BigDecimal mntHt) {
        this.mntHt = mntHt;
    }

    public BigDecimal getMntTva() {
        return mntTva;
    }

    public void setMntTva(BigDecimal mntTva) {
        this.mntTva = mntTva;
    }

    public BigDecimal getMntTtc() {
        return mntTtc;
    }

    public void setMntTtc(BigDecimal mntTtc) {
        this.mntTtc = mntTtc;
    }

    public BigDecimal getMntCentimesAdd() {
        return mntCentimesAdd;
    }

    public void setMntCentimesAdd(BigDecimal mntCentimesAdd) {
        this.mntCentimesAdd = mntCentimesAdd;
    }

    public String getCreateur() {
        return createur;
    }

    public void setCreateur(String createur) {
        this.createur = createur;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getHeureCreation() {
        return heureCreation;
    }

    public void setHeureCreation(String heureCreation) {
        this.heureCreation = heureCreation;
    }

    public String getUtilisat() {
        return utilisat;
    }

    public void setUtilisat(String utilisat) {
        this.utilisat = utilisat;
    }

    public String getDateModif() {
        return dateModif;
    }

    public void setDateModif(String dateModif) {
        this.dateModif = dateModif;
    }

    public String getHeureModif() {
        return heureModif;
    }

    public void setHeureModif(String heureModif) {
        this.heureModif = heureModif;
    }

    public Short getTransfertCompta() {
        return transfertCompta;
    }

    public void setTransfertCompta(Short transfertCompta) {
        this.transfertCompta = transfertCompta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pmcleunik != null ? pmcleunik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paiement)) {
            return false;
        }
        Paiement other = (Paiement) object;
        if ((this.pmcleunik == null && other.pmcleunik != null) || (this.pmcleunik != null && !this.pmcleunik.equals(other.pmcleunik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.adminfaces.starter.model.Paiement[ pmcleunik=" + pmcleunik + " ]";
    }

    @Override
    public BigDecimal getId() {
        return pmcleunik;
    }
    
}
