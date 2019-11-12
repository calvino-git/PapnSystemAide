/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.Immutable;

/**
 *
 * @author Calvin ILOKI
 */
@Entity
@Table(name = "MARCHFACT", catalog = "", schema = "PPNCARGO")
@Immutable
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Marchfact.findAll", query = "SELECT m FROM Marchfact m"),
    @NamedQuery(name = "Marchfact.findById", query = "SELECT m FROM Marchfact m WHERE m.id = :id"),
    @NamedQuery(name = "Marchfact.findByDepartEffectif", query = "SELECT m FROM Marchfact m WHERE m.departEffectif = :departEffectif"),
    @NamedQuery(name = "Marchfact.findByType", query = "SELECT m FROM Marchfact m WHERE m.type = :type"),
    @NamedQuery(name = "Marchfact.findByNavire", query = "SELECT m FROM Marchfact m WHERE m.navire = :navire"),
    @NamedQuery(name = "Marchfact.findByNumeroescale", query = "SELECT m FROM Marchfact m WHERE m.numeroescale = :numeroescale"),
    @NamedQuery(name = "Marchfact.findByEta", query = "SELECT m FROM Marchfact m WHERE m.eta = :eta"),
    @NamedQuery(name = "Marchfact.findByTrafic", query = "SELECT m FROM Marchfact m WHERE m.trafic = :trafic"),
    @NamedQuery(name = "Marchfact.findByPort", query = "SELECT m FROM Marchfact m WHERE m.port = :port"),
    @NamedQuery(name = "Marchfact.findByNumerobl", query = "SELECT m FROM Marchfact m WHERE m.numerobl = :numerobl"),
    @NamedQuery(name = "Marchfact.findByDatecreation", query = "SELECT m FROM Marchfact m WHERE m.datecreation = :datecreation"),
    @NamedQuery(name = "Marchfact.findByClient", query = "SELECT m FROM Marchfact m WHERE m.client = :client"),
    @NamedQuery(name = "Marchfact.findByMarchandise", query = "SELECT m FROM Marchfact m WHERE m.marchandise = :marchandise"),
    @NamedQuery(name = "Marchfact.findByConditionnement", query = "SELECT m FROM Marchfact m WHERE m.conditionnement = :conditionnement"),
    @NamedQuery(name = "Marchfact.findByTarification", query = "SELECT m FROM Marchfact m WHERE m.tarification = :tarification"),
    @NamedQuery(name = "Marchfact.findByPoids", query = "SELECT m FROM Marchfact m WHERE m.poids = :poids"),
    @NamedQuery(name = "Marchfact.findByTaux", query = "SELECT m FROM Marchfact m WHERE m.taux = :taux"),
    @NamedQuery(name = "Marchfact.findByTva", query = "SELECT m FROM Marchfact m WHERE m.tva = :tva"),
    @NamedQuery(name = "Marchfact.findByMontantEstime", query = "SELECT m FROM Marchfact m WHERE m.montantEstime = :montantEstime"),
    @NamedQuery(name = "Marchfact.findByFDateetablie", query = "SELECT m FROM Marchfact m WHERE m.fdate = :fdate"),
    @NamedQuery(name = "Marchfact.findByMoiscomptable", query = "SELECT m FROM Marchfact m WHERE m.moiscomptable = :moiscomptable"),
    @NamedQuery(name = "Marchfact.findByNumerofacture", query = "SELECT m FROM Marchfact m WHERE m.numerofacture = :numerofacture"),
    @NamedQuery(name = "Marchfact.findByMontantht", query = "SELECT m FROM Marchfact m WHERE m.montantht = :montantht"),
    @NamedQuery(name = "Marchfact.findByMontanttva", query = "SELECT m FROM Marchfact m WHERE m.montanttva = :montanttva"),
    @NamedQuery(name = "Marchfact.findByMontantttc", query = "SELECT m FROM Marchfact m WHERE m.montantttc = :montantttc"),
    @NamedQuery(name = "Marchfact.findByTexte", query = "SELECT m FROM Marchfact m WHERE m.texte = :texte"),
    @NamedQuery(name = "Marchfact.findByDatepaiement", query = "SELECT m FROM Marchfact m WHERE m.datepaiement = :datepaiement"),
    @NamedQuery(name = "Marchfact.findByMontantpaye", query = "SELECT m FROM Marchfact m WHERE m.montantpaye = :montantpaye"),
    @NamedQuery(name = "Marchfact.findBySolde", query = "SELECT m FROM Marchfact m WHERE m.solde = :solde"),
    @NamedQuery(name = "Marchfact.findByCreateur", query = "SELECT m FROM Marchfact m WHERE m.createur = :createur")})
public class Marchfact implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "ID")
    @Id
    private BigInteger id;
    @Size(max = 8)
    @Column(name = "DEPART_EFFECTIF")
    private String departEffectif;
    @Size(max = 8)
    @Column(name = "TYPE")
    private String type;
    @Size(max = 40)
    @Column(name = "NAVIRE")
    private String navire;
    @Size(max = 12)
    @Column(name = "NUMEROESCALE")
    private String numeroescale;
    @Size(max = 8)
    @Column(name = "ETA")
    private String eta;
    @Size(max = 8)
    @Column(name = "TRAFIC")
    private String trafic;
    @Size(max = 40)
    @Column(name = "PORT")
    private String port;
    @Size(max = 24)
    @Column(name = "NUMEROBL")
    private String numerobl;
    @Size(max = 8)
    @Column(name = "DATECREATION")
    private String datecreation;
    @Size(max = 40)
    @Column(name = "CLIENT")
    private String client;
    @Size(max = 100)
    @Column(name = "MARCHANDISE")
    private String marchandise;
    @Size(max = 40)
    @Column(name = "CONDITIONNEMENT")
    private String conditionnement;
    @Size(max = 100)
    @Column(name = "TARIFICATION")
    private String tarification;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "POIDS")
    private BigDecimal poids;
    @Column(name = "TAUX")
    private BigDecimal taux;
    @Column(name = "TVA")
    private BigDecimal tva;
    @Column(name = "MONTANT_ESTIME")
    private BigInteger montantEstime;
    @Size(max = 8)
    @Column(name = "F_DATEETABLIE")
    private String fdate;
    @Size(max = 6)
    @Column(name = "F_MOISCOMPTABLE")
    private String moiscomptable;
    @Size(max = 12)
    @Column(name = "F_NUMEROFACTURE")
    private String numerofacture;
    @Column(name = "F_MONTANTHT")
    private BigDecimal montantht;
    @Column(name = "F_MONTANTTVA")
    private BigDecimal montanttva;
    @Column(name = "F_MONTANTTTC")
    private BigDecimal montantttc;
    @Size(max = 80)
    @Column(name = "TEXTE")
    private String texte;
    @Size(max = 8)
    @Column(name = "DATEPAIEMENT")
    private String datepaiement;
    @Column(name = "MONTANTPAYE")
    private BigDecimal montantpaye;
    @Column(name = "SOLDE")
    private BigDecimal solde;
    @Size(max = 10)
    @Column(name = "CREATEUR")
    private String createur;

    public Marchfact() {
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getDepartEffectif() {
        return departEffectif;
    }

    public void setDepartEffectif(String departEffectif) {
        this.departEffectif = departEffectif;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNavire() {
        return navire;
    }

    public void setNavire(String navire) {
        this.navire = navire;
    }

    public String getNumeroescale() {
        return numeroescale;
    }

    public void setNumeroescale(String numeroescale) {
        this.numeroescale = numeroescale;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public String getTrafic() {
        return trafic;
    }

    public void setTrafic(String trafic) {
        this.trafic = trafic;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getNumerobl() {
        return numerobl;
    }

    public void setNumerobl(String numerobl) {
        this.numerobl = numerobl;
    }

    public String getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(String datecreation) {
        this.datecreation = datecreation;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getMarchandise() {
        return marchandise;
    }

    public void setMarchandise(String marchandise) {
        this.marchandise = marchandise;
    }

    public String getConditionnement() {
        return conditionnement;
    }

    public void setConditionnement(String conditionnement) {
        this.conditionnement = conditionnement;
    }

    public String getTarification() {
        return tarification;
    }

    public void setTarification(String tarification) {
        this.tarification = tarification;
    }

    public BigDecimal getPoids() {
        return poids;
    }

    public void setPoids(BigDecimal poids) {
        this.poids = poids;
    }

    public BigDecimal getTaux() {
        return taux;
    }

    public void setTaux(BigDecimal taux) {
        this.taux = taux;
    }

    public BigDecimal getTva() {
        return tva;
    }

    public void setTva(BigDecimal tva) {
        this.tva = tva;
    }

    public BigInteger getMontantEstime() {
        return montantEstime;
    }

    public void setMontantEstime(BigInteger montantEstime) {
        this.montantEstime = montantEstime;
    }

    public String getFdate() {
        return fdate;
    }

    public void setFdate(String fdate) {
        this.fdate = fdate;
    }

    public String getMoiscomptable() {
        return moiscomptable;
    }

    public void setMoiscomptable(String moiscomptable) {
        this.moiscomptable = moiscomptable;
    }

    public String getNumerofacture() {
        return numerofacture;
    }

    public void setNumerofacture(String numerofacture) {
        this.numerofacture = numerofacture;
    }

    public BigDecimal getMontantht() {
        return montantht;
    }

    public void setMontantht(BigDecimal montantht) {
        this.montantht = montantht;
    }

    public BigDecimal getMontanttva() {
        return montanttva;
    }

    public void setMontanttva(BigDecimal montanttva) {
        this.montanttva = montanttva;
    }

    public BigDecimal getMontantttc() {
        return montantttc;
    }

    public void setMontantttc(BigDecimal montantttc) {
        this.montantttc = montantttc;
    }


    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public String getDatepaiement() {
        return datepaiement;
    }

    public void setDatepaiement(String datepaiement) {
        this.datepaiement = datepaiement;
    }

    public BigDecimal getMontantpaye() {
        return montantpaye;
    }

    public void setMontantpaye(BigDecimal montantpaye) {
        this.montantpaye = montantpaye;
    }

    public BigDecimal getSolde() {
        return solde;
    }

    public void setSolde(BigDecimal solde) {
        this.solde = solde;
    }

    public String getCreateur() {
        return createur;
    }

    public void setCreateur(String createur) {
        this.createur = createur;
    }
    
}
