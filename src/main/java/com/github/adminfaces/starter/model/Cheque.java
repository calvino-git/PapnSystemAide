/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.model;

import com.github.adminfaces.persistence.model.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.Immutable;

/**
 *
 * @author Administrateur
 */
@Entity
@Table(name = "MV_CHEQUE", catalog = "", schema = "DSIPAPN")
@Immutable
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cheque.findAll", query = "SELECT m FROM Cheque m"),
    @NamedQuery(name = "Cheque.findById", query = "SELECT m FROM Cheque m WHERE m.id = :id"),
    @NamedQuery(name = "Cheque.findByNumero", query = "SELECT m FROM Cheque m WHERE m.numero = :numero"),
    @NamedQuery(name = "Cheque.findByDateCheque", query = "SELECT m FROM Cheque m WHERE m.dateCheque = :dateCheque"),
    @NamedQuery(name = "Cheque.findByMontantTtc", query = "SELECT m FROM Cheque m WHERE m.montantTtc = :montantTtc"),
    @NamedQuery(name = "Cheque.findByMontantVentile", query = "SELECT m FROM Cheque m WHERE m.montantVentile = :montantVentile"),
    @NamedQuery(name = "Cheque.findByDetails", query = "SELECT m FROM Cheque m WHERE m.details = :details"),
    @NamedQuery(name = "Cheque.findByStatut", query = "SELECT m FROM Cheque m WHERE m.statut = :statut"),
    @NamedQuery(name = "Cheque.findByBanque", query = "SELECT m FROM Cheque m WHERE m.banque = :banque"),
    @NamedQuery(name = "Cheque.findByModeReglement", query = "SELECT m FROM Cheque m WHERE m.modeReglement = :modeReglement"),
    @NamedQuery(name = "Cheque.findByClient", query = "SELECT m FROM Cheque m WHERE m.client = :client"),
    @NamedQuery(name = "Cheque.findByDateSouscription", query = "SELECT m FROM Cheque m WHERE m.dateSouscription = :dateSouscription"),
    @NamedQuery(name = "Cheque.findByEcheanceEffet", query = "SELECT m FROM Cheque m WHERE m.echeanceEffet = :echeanceEffet"),
    @NamedQuery(name = "Cheque.findByTransfertCompta", query = "SELECT m FROM Cheque m WHERE m.transfertCompta = :transfertCompta"),
    @NamedQuery(name = "Cheque.findByCreateur", query = "SELECT m FROM Cheque m WHERE m.createur = :createur"),
    @NamedQuery(name = "Cheque.findByDateCreation", query = "SELECT m FROM Cheque m WHERE m.dateCreation = :dateCreation"),
    @NamedQuery(name = "Cheque.findByHeureCreation", query = "SELECT m FROM Cheque m WHERE m.heureCreation = :heureCreation"),
    @NamedQuery(name = "Cheque.findByUtilsateur", query = "SELECT m FROM Cheque m WHERE m.utilsateur = :utilsateur"),
    @NamedQuery(name = "Cheque.findByDateModif", query = "SELECT m FROM Cheque m WHERE m.dateModif = :dateModif"),
    @NamedQuery(name = "Cheque.findByHeureModif", query = "SELECT m FROM Cheque m WHERE m.heureModif = :heureModif")})
public class Cheque extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CHCLEUNIK")
    private Integer id;
    @Size(max = 12)
    @Column(name = "NUMERO")
    private String numero;
    @Size(max = 8)
    @Column(name = "DATE_CHEQUE")
    private String dateCheque;
    @Column(name = "MONTANT_TTC")
    private BigDecimal montantTtc;
    @Column(name = "MONTANT_VENTILE")
    private BigDecimal montantVentile;
    @Size(max = 80)
    @Column(name = "DETAILS")
    private String details;
    @Size(max = 8)
    @Column(name = "STATUT")
    private String statut;
    @Size(max = 20)
    @Column(name = "BANQUE")
    private String banque;
    @Size(max = 14)
    @Column(name = "MODE_REGLEMENT")
    private String modeReglement;
    @Size(max = 20)
    @JoinColumn(name = "CLIENT",referencedColumnName = "code")
    @ManyToOne
    private Client client;
    @Size(max = 8)
    @Column(name = "DATE_SOUSCRIPTION")
    private String dateSouscription;
    @Size(max = 8)
    @Column(name = "ECHEANCE_EFFET")
    private String echeanceEffet;
    @Column(name = "TRANSFERT_COMPTA")
    private Short transfertCompta;
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
    @Column(name = "UTILSATEUR")
    private String utilsateur;
    @Size(max = 8)
    @Column(name = "DATE_MODIF")
    private String dateModif;
    @Size(max = 4)
    @Column(name = "HEURE_MODIF")
    private String heureModif;

    public Cheque() {
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDateCheque() {
        return dateCheque;
    }

    public void setDateCheque(String dateCheque) {
        this.dateCheque = dateCheque;
    }

    public BigDecimal getMontantTtc() {
        return montantTtc;
    }

    public void setMontantTtc(BigDecimal montantTtc) {
        this.montantTtc = montantTtc;
    }

    public BigDecimal getMontantVentile() {
        return montantVentile;
    }

    public void setMontantVentile(BigDecimal montantVentile) {
        this.montantVentile = montantVentile;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getBanque() {
        return banque;
    }

    public void setBanque(String banque) {
        this.banque = banque;
    }

    public String getModeReglement() {
        return modeReglement;
    }

    public void setModeReglement(String modeReglement) {
        this.modeReglement = modeReglement;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
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

    public String getUtilsateur() {
        return utilsateur;
    }

    public void setUtilsateur(String utilsateur) {
        this.utilsateur = utilsateur;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cheque)) {
            return false;
        }
        Cheque other = (Cheque) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id.toString();
    }
    
}
