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

/**
 *
 * @author Administrateur
 */
@Entity
@Table(name = "MV_REGLEMENT", catalog = "", schema = "PPNCARGO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reglement.findAll", query = "SELECT r FROM Reglement r")})
public class Reglement extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PMCLEUNIK")
    private Integer pmcleunik;
    @JoinColumn(name = "CHCLEUNIK", referencedColumnName = "CHCLEUNIK")
    @ManyToOne
    private Cheque chcleunik;
    @Size(max = 12)
    @Column(name = "INFO")
    private String info;
    @Size(max = 8)
    @Column(name = "BANQUE")
    private String banque;
    @Size(max = 4)
    @JoinColumn(name = "CLIENT",referencedColumnName = "CODE")
    @ManyToOne
    private Client client;
    @Size(max = 80)
    @Column(name = "DATE_CHEQUE")
    private String dateCheque;
    @Size(max = 8)
    @Column(name = "MONTANT_VENTILE")
    private BigDecimal montantVentile;
    @Column(name = "MODE_REGLEMENT")
    private String modeReglement;
    @Column(name = "NUMERO_FACTURE")
    private String numeroFacture;
    @Column(name = "REDEV_FACTURE")
    private String redevFacture;
    @Column(name = "DATE_FACTURE")
    private String dateFacture;
    @Size(max = 10)
    @Column(name = "MONTANT_TTC_FACTURE")
    private BigDecimal montantTTCfacture;
    @Size(max = 8)
    @Column(name = "SOLDE_FACTURE")
    private BigDecimal soldeFacture;
    @Size(max = 4)
    @Column(name = "MONTANT_TTC_PAIEMENT")
    private BigDecimal montantPaiement;
    
    public Reglement() {
    }

    public Reglement(Integer pmcleunik) {
        this.pmcleunik = pmcleunik;
    }

    public Integer getPmcleunik() {
        return pmcleunik;
    }

    public void setPmcleunik(Integer pmcleunik) {
        this.pmcleunik = pmcleunik;
    }

    public Cheque getChcleunik() {
        return chcleunik;
    }

    public void setChcleunik(Cheque chcleunik) {
        this.chcleunik = chcleunik;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getBanque() {
        return banque;
    }

    public void setBanque(String banque) {
        this.banque = banque;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getDateCheque() {
        return dateCheque;
    }

    public void setDateCheque(String dateCheque) {
        this.dateCheque = dateCheque;
    }

    public BigDecimal getMontantVentile() {
        return montantVentile;
    }

    public void setMontantVentile(BigDecimal montantVentile) {
        this.montantVentile = montantVentile;
    }

    public String getModeReglement() {
        return modeReglement;
    }

    public void setModeReglement(String modeReglement) {
        this.modeReglement = modeReglement;
    }

    public String getNumeroFacture() {
        return numeroFacture;
    }

    public void setNumeroFacture(String numeroFacture) {
        this.numeroFacture = numeroFacture;
    }

    public String getRedevFacture() {
        return redevFacture;
    }

    public void setRedevFacture(String redevFacture) {
        this.redevFacture = redevFacture;
    }

    public String getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(String dateFacture) {
        this.dateFacture = dateFacture;
    }

    public BigDecimal getMontantTTCfacture() {
        return montantTTCfacture;
    }

    public void setMontantTTCfacture(BigDecimal montantTTCfacture) {
        this.montantTTCfacture = montantTTCfacture;
    }

    public BigDecimal getSoldeFacture() {
        return soldeFacture;
    }

    public void setSoldeFacture(BigDecimal soldeFacture) {
        this.soldeFacture = soldeFacture;
    }

    public BigDecimal getMontantPaiement() {
        return montantPaiement;
    }

    public void setMontantPaiement(BigDecimal montantPaiement) {
        this.montantPaiement = montantPaiement;
    }

    @Override
    public Integer getId() {
        return pmcleunik;
    }

    
    
}
