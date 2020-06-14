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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Calvin ILOKI
 */
@Entity
@Table(name = "PAIEMENT", catalog = "", schema = "PPNCARGO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paiement.findAll", query = "SELECT p FROM Paiement p"),
    @NamedQuery(name = "Paiement.findByPmcleunik", query = "SELECT p FROM Paiement p WHERE p.pmcleunik = :pmcleunik"),
    @NamedQuery(name = "Paiement.findByNumero", query = "SELECT p FROM Paiement p WHERE p.numero = :numero"),
    @NamedQuery(name = "Paiement.findByLDate", query = "SELECT p FROM Paiement p WHERE p.lDate = :lDate"),
    @NamedQuery(name = "Paiement.findByLHeure", query = "SELECT p FROM Paiement p WHERE p.lHeure = :lHeure"),
    @NamedQuery(name = "Paiement.findByMntTtc", query = "SELECT p FROM Paiement p WHERE p.mntTtc = :mntTtc"),
    @NamedQuery(name = "Paiement.findByTexte", query = "SELECT p FROM Paiement p WHERE p.texte = :texte"),
    @NamedQuery(name = "Paiement.findByControle", query = "SELECT p FROM Paiement p WHERE p.controle = :controle"),
    @NamedQuery(name = "Paiement.findByGestion", query = "SELECT p FROM Paiement p WHERE p.gestion = :gestion"),
    @NamedQuery(name = "Paiement.findByStatut", query = "SELECT p FROM Paiement p WHERE p.statut = :statut"),
    @NamedQuery(name = "Paiement.findByCreateur", query = "SELECT p FROM Paiement p WHERE p.createur = :createur"),
    @NamedQuery(name = "Paiement.findByDCreat", query = "SELECT p FROM Paiement p WHERE p.dCreat = :dCreat"),
    @NamedQuery(name = "Paiement.findByHCreat", query = "SELECT p FROM Paiement p WHERE p.hCreat = :hCreat"),
    @NamedQuery(name = "Paiement.findByUtilisat", query = "SELECT p FROM Paiement p WHERE p.utilisat = :utilisat"),
    @NamedQuery(name = "Paiement.findByDModif", query = "SELECT p FROM Paiement p WHERE p.dModif = :dModif"),
    @NamedQuery(name = "Paiement.findByHModif", query = "SELECT p FROM Paiement p WHERE p.hModif = :hModif"),
    @NamedQuery(name = "Paiement.findByCicleunik", query = "SELECT p FROM Paiement p WHERE p.cicleunik = :cicleunik"),
    @NamedQuery(name = "Paiement.findByBanque", query = "SELECT p FROM Paiement p WHERE p.banque = :banque"),
    @NamedQuery(name = "Paiement.findByNumeroCompte", query = "SELECT p FROM Paiement p WHERE p.numeroCompte = :numeroCompte"),
    @NamedQuery(name = "Paiement.findByModeReglement", query = "SELECT p FROM Paiement p WHERE p.modeReglement = :modeReglement"),
    @NamedQuery(name = "Paiement.findByChcleunik", query = "SELECT p FROM Paiement p WHERE p.chcleunik = :chcleunik"),
    @NamedQuery(name = "Paiement.findByDateSouscription", query = "SELECT p FROM Paiement p WHERE p.dateSouscription = :dateSouscription"),
    @NamedQuery(name = "Paiement.findByEcheanceEffet", query = "SELECT p FROM Paiement p WHERE p.echeanceEffet = :echeanceEffet"),
    @NamedQuery(name = "Paiement.findByTransfertCompta", query = "SELECT p FROM Paiement p WHERE p.transfertCompta = :transfertCompta"),
    @NamedQuery(name = "Paiement.findByMntHt", query = "SELECT p FROM Paiement p WHERE p.mntHt = :mntHt"),
    @NamedQuery(name = "Paiement.findByMntTva", query = "SELECT p FROM Paiement p WHERE p.mntTva = :mntTva"),
    @NamedQuery(name = "Paiement.findByMntCentimesAdd", query = "SELECT p FROM Paiement p WHERE p.mntCentimesAdd = :mntCentimesAdd")})
public class Paiement extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PMCLEUNIK")
    private BigDecimal pmcleunik;
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
    @JoinColumn(name = "CICLEUNIK", referencedColumnName = "CICLEUNIK")
    @OneToOne
    private Facture facture;
    @Size(max = 20)
    @Column(name = "BANQUE")
    private String banque;
    @Size(max = 20)
    @Column(name = "NUMERO_COMPTE")
    private String numeroCompte;
    @Size(max = 8)
    @Column(name = "MODE_REGLEMENT")
    private String modeReglement;
    @JoinColumn(name = "CHCLEUNIK", referencedColumnName = "CHCLEUNIK")
    @ManyToOne
    private Cheque cheque;
    @Size(max = 8)
    @Column(name = "DATE_SOUSCRIPTION")
    private String dateSouscription;
    @Size(max = 8)
    @Column(name = "ECHEANCE_EFFET")
    private String echeanceEffet;
    @Column(name = "TRANSFERT_COMPTA")
    private Short transfertCompta;
    @Column(name = "MNT_HT")
    private BigDecimal mntHt;
    @Column(name = "MNT_TVA")
    private BigDecimal mntTva;
    @Column(name = "MNT_CENTIMES_ADD")
    private BigDecimal mntCentimesAdd;

    public Paiement() {
    }

    public Paiement(BigDecimal pmcleunik) {
        this.pmcleunik = pmcleunik;
    }

    public BigDecimal getId() {
        return pmcleunik;
    }

    public BigDecimal getPmcleunik() {
        return pmcleunik;
    }

    public void setPmcleunik(BigDecimal pmcleunik) {
        this.pmcleunik = pmcleunik;
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

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
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

    public Cheque getCheque() {
        return cheque;
    }

    public void setCheque(Cheque cheque) {
        this.cheque = cheque;
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

    public BigDecimal getMntCentimesAdd() {
        return mntCentimesAdd;
    }

    public void setMntCentimesAdd(BigDecimal mntCentimesAdd) {
        this.mntCentimesAdd = mntCentimesAdd;
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

}
