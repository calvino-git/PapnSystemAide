/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Calvin ILOKI
 */
@Entity
@Table(name = "CHEQUE", catalog = "", schema = "PPNCARGO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cheque.findAll", query = "SELECT c FROM Cheque c"),
    @NamedQuery(name = "Cheque.findByChcleunik", query = "SELECT c FROM Cheque c WHERE c.chcleunik = :chcleunik"),
    @NamedQuery(name = "Cheque.findByNumero", query = "SELECT c FROM Cheque c WHERE c.numero = :numero"),
    @NamedQuery(name = "Cheque.findByLDate", query = "SELECT c FROM Cheque c WHERE c.lDate = :lDate"),
    @NamedQuery(name = "Cheque.findByLHeure", query = "SELECT c FROM Cheque c WHERE c.lHeure = :lHeure"),
    @NamedQuery(name = "Cheque.findByMntTtc", query = "SELECT c FROM Cheque c WHERE c.mntTtc = :mntTtc"),
    @NamedQuery(name = "Cheque.findByTexte", query = "SELECT c FROM Cheque c WHERE c.texte = :texte"),
    @NamedQuery(name = "Cheque.findByControle", query = "SELECT c FROM Cheque c WHERE c.controle = :controle"),
    @NamedQuery(name = "Cheque.findByGestion", query = "SELECT c FROM Cheque c WHERE c.gestion = :gestion"),
    @NamedQuery(name = "Cheque.findByStatut", query = "SELECT c FROM Cheque c WHERE c.statut = :statut"),
    @NamedQuery(name = "Cheque.findByCreateur", query = "SELECT c FROM Cheque c WHERE c.createur = :createur"),
    @NamedQuery(name = "Cheque.findByDCreat", query = "SELECT c FROM Cheque c WHERE c.dCreat = :dCreat"),
    @NamedQuery(name = "Cheque.findByHCreat", query = "SELECT c FROM Cheque c WHERE c.hCreat = :hCreat"),
    @NamedQuery(name = "Cheque.findByUtilisat", query = "SELECT c FROM Cheque c WHERE c.utilisat = :utilisat"),
    @NamedQuery(name = "Cheque.findByDModif", query = "SELECT c FROM Cheque c WHERE c.dModif = :dModif"),
    @NamedQuery(name = "Cheque.findByHModif", query = "SELECT c FROM Cheque c WHERE c.hModif = :hModif"),
    @NamedQuery(name = "Cheque.findByCicleunik", query = "SELECT c FROM Cheque c WHERE c.cicleunik = :cicleunik"),
    @NamedQuery(name = "Cheque.findByBocleunik", query = "SELECT c FROM Cheque c WHERE c.bocleunik = :bocleunik"),
    @NamedQuery(name = "Cheque.findByBanque", query = "SELECT c FROM Cheque c WHERE c.banque = :banque"),
    @NamedQuery(name = "Cheque.findByNumeroCompte", query = "SELECT c FROM Cheque c WHERE c.numeroCompte = :numeroCompte"),
    @NamedQuery(name = "Cheque.findByModeReglement", query = "SELECT c FROM Cheque c WHERE c.modeReglement = :modeReglement"),
    @NamedQuery(name = "Cheque.findByMontantVentile", query = "SELECT c FROM Cheque c WHERE c.montantVentile = :montantVentile"),
    @NamedQuery(name = "Cheque.findByClient", query = "SELECT c FROM Cheque c WHERE c.client = :client"),
    @NamedQuery(name = "Cheque.findByDateSouscription", query = "SELECT c FROM Cheque c WHERE c.dateSouscription = :dateSouscription"),
    @NamedQuery(name = "Cheque.findByEcheanceEffet", query = "SELECT c FROM Cheque c WHERE c.echeanceEffet = :echeanceEffet"),
    @NamedQuery(name = "Cheque.findByTransfertCompta", query = "SELECT c FROM Cheque c WHERE c.transfertCompta = :transfertCompta")})
public class Cheque implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CHCLEUNIK")
    private BigDecimal chcleunik;
    @Size(max = 12)
    @Column(name = "NUMERO")
    private String numero;
    @Size(max = 8)
    @Column(name = "L_DATE")
    private String lDate;
    @Size(max = 4)
    @Column(name = "L_HEURE")
    private String lHeure;
    @Column(name = "MNT_TTC")
    private BigDecimal mntTtc;
    @Size(max = 80)
    @Column(name = "TEXTE")
    private String texte;
    @Column(name = "CONTROLE")
    private Short controle;
    @Column(name = "GESTION")
    private BigInteger gestion;
    @Size(max = 8)
    @Column(name = "STATUT")
    private String statut;
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
    @Column(name = "CICLEUNIK")
    private BigInteger cicleunik;
    @Column(name = "BOCLEUNIK")
    private BigInteger bocleunik;
    @Size(max = 20)
    @Column(name = "BANQUE")
    private String banque;
    @Size(max = 20)
    @Column(name = "NUMERO_COMPTE")
    private String numeroCompte;
    @Size(max = 8)
    @Column(name = "MODE_REGLEMENT")
    private String modeReglement;
    @Column(name = "MONTANT_VENTILE")
    private BigDecimal montantVentile;
    @Size(max = 20)
    @Column(name = "CLIENT")
    private String client;
    @Size(max = 8)
    @Column(name = "DATE_SOUSCRIPTION")
    private String dateSouscription;
    @Size(max = 8)
    @Column(name = "ECHEANCE_EFFET")
    private String echeanceEffet;
    @Column(name = "TRANSFERT_COMPTA")
    private Short transfertCompta;
    
    @OneToMany(mappedBy = "cheque")
    private List<Paiement> listPaiement;

    public Cheque() {
    }

    public Cheque(BigDecimal chcleunik) {
        this.chcleunik = chcleunik;
    }

    public BigDecimal getChcleunik() {
        return chcleunik;
    }

    public void setChcleunik(BigDecimal chcleunik) {
        this.chcleunik = chcleunik;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLDate() {
        return lDate;
    }

    public void setLDate(String lDate) {
        this.lDate = lDate;
    }

    public String getLHeure() {
        return lHeure;
    }

    public void setLHeure(String lHeure) {
        this.lHeure = lHeure;
    }

    public BigDecimal getMntTtc() {
        return mntTtc;
    }

    public void setMntTtc(BigDecimal mntTtc) {
        this.mntTtc = mntTtc;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public Short getControle() {
        return controle;
    }

    public void setControle(Short controle) {
        this.controle = controle;
    }

    public BigInteger getGestion() {
        return gestion;
    }

    public void setGestion(BigInteger gestion) {
        this.gestion = gestion;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getCreateur() {
        return createur;
    }

    public void setCreateur(String createur) {
        this.createur = createur;
    }

    public String getDCreat() {
        return dCreat;
    }

    public void setDCreat(String dCreat) {
        this.dCreat = dCreat;
    }

    public String getHCreat() {
        return hCreat;
    }

    public void setHCreat(String hCreat) {
        this.hCreat = hCreat;
    }

    public String getUtilisat() {
        return utilisat;
    }

    public void setUtilisat(String utilisat) {
        this.utilisat = utilisat;
    }

    public String getDModif() {
        return dModif;
    }

    public void setDModif(String dModif) {
        this.dModif = dModif;
    }

    public String getHModif() {
        return hModif;
    }

    public void setHModif(String hModif) {
        this.hModif = hModif;
    }

    public BigInteger getCicleunik() {
        return cicleunik;
    }

    public void setCicleunik(BigInteger cicleunik) {
        this.cicleunik = cicleunik;
    }

    public BigInteger getBocleunik() {
        return bocleunik;
    }

    public void setBocleunik(BigInteger bocleunik) {
        this.bocleunik = bocleunik;
    }

    public String getBanque() {
        return banque;
    }

    public void setBanque(String banque) {
        this.banque = banque;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public String getModeReglement() {
        return modeReglement;
    }

    public void setModeReglement(String modeReglement) {
        this.modeReglement = modeReglement;
    }

    public BigDecimal getMontantVentile() {
        return montantVentile;
    }

    public void setMontantVentile(BigDecimal montantVentile) {
        this.montantVentile = montantVentile;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getDateSouscription() {
        return dateSouscription;
    }

    public void setDateSouscription(String dateSouscription) {
        this.dateSouscription = dateSouscription;
    }

    public String getEcheanceEffet() {
        return echeanceEffet;
    }

    public void setEcheanceEffet(String echeanceEffet) {
        this.echeanceEffet = echeanceEffet;
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
        hash += (chcleunik != null ? chcleunik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cheque)) {
            return false;
        }
        Cheque other = (Cheque) object;
        if ((this.chcleunik == null && other.chcleunik != null) || (this.chcleunik != null && !this.chcleunik.equals(other.chcleunik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.adminfaces.starter.model.Cheque[ chcleunik=" + chcleunik + " ]";
    }

    public String getlDate() {
        return lDate;
    }

    public void setlDate(String lDate) {
        this.lDate = lDate;
    }

    public String getlHeure() {
        return lHeure;
    }

    public void setlHeure(String lHeure) {
        this.lHeure = lHeure;
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

    public List<Paiement> getListPaiement() {
        return listPaiement;
    }

    public void setListPaiement(List<Paiement> listPaiement) {
        this.listPaiement = listPaiement;
    }
    
}
