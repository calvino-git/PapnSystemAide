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
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author calviniloki
 */
@Entity
@Table(name = "PRESTS_DOMAINE", catalog = "", schema = "PPNCARGO")
@XmlRootElement
public class PrestsDomaine extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PDCLEUNIK", nullable = false, precision = 19, scale = 0)
    private BigDecimal pdcleunik;
    @JoinColumn(name = "DMCLEUNIK",referencedColumnName = "DMCLEUNIK")
    @ManyToOne
    private ContratDomaine contratDomaine;
    @Column(name = "QUANTITE", precision = 19, scale = 6)
    private BigDecimal quantite;
    @Column(name = "SUPERFICIE", precision = 19, scale = 6)
    private BigDecimal superficie;
    @Size(max = 8)
    @Column(name = "DEVISE", length = 8)
    private String devise;
    @Size(max = 8)
    @Column(name = "ETAT", length = 8)
    private String etat;
    @Column(name = "TVA", precision = 19, scale = 6)
    private BigDecimal tva;
    @Column(name = "CENTIMES_ADD", precision = 19, scale = 6)
    private BigDecimal centimesAdd;
    @Column(name = "LIGNE")
    private Short ligne;
    @Size(max = 8)
    @Column(name = "DATE_FACTURE", length = 8)
    private String dateFacture;
    @Column(name = "TAUX", precision = 19, scale = 6)
    private BigDecimal taux;
    @Column(name = "PERIODICITE_FACTURE")
    private Short periodiciteFacture;
    @Size(max = 8)
    @Column(name = "STATUT", length = 8)
    private String statut;
    @Column(name = "GESTION")
    private BigInteger gestion;
    @Size(max = 10)
    @Column(name = "CREATEUR", length = 10)
    private String createur;
    @Size(max = 8)
    @Column(name = "D_CREAT", length = 8)
    private String dCreat;
    @Size(max = 4)
    @Column(name = "H_CREAT", length = 4)
    private String hCreat;
    @Size(max = 10)
    @Column(name = "UTILISAT", length = 10)
    private String utilisat;
    @Size(max = 8)
    @Column(name = "D_MODIF", length = 8)
    private String dModif;
    @Size(max = 4)
    @Column(name = "H_MODIF", length = 4)
    private String hModif;
    @Size(max = 80)
    @Column(name = "TARIF", length = 80)
    private String tarif;
    @Size(max = 8)
    @Column(name = "LOT", length = 8)
    private String lot;
    @Size(max = 20)
    @Column(name = "ZONE", length = 20)
    private String zone;
    @Column(name = "MONTANT", precision = 19, scale = 6)
    private BigDecimal montant;
    @Column(name = "MONTANT_ANNUEL", precision = 19, scale = 6)
    private BigDecimal montantAnnuel;
    @Column(name = "MAJORATION_FACILITE", precision = 19, scale = 6)
    private BigDecimal majorationFacilite;
    @Column(name = "TOP_BORD_QUAI")
    private Short topBordQuai;
    @Column(name = "TOP_DESSERTE_ROUTIERE")
    private Short topDesserteRoutiere;
    @Column(name = "TOP_DESSERTE_FER")
    private Short topDesserteFer;
    @Column(name = "TOP_RESEAU_EAU")
    private Short topReseauEau;
    @Column(name = "TOP_RESEAU_ELECTRIQUE")
    private Short topReseauElectrique;
    @Column(name = "TOP_RESEAU_TELEPHONE")
    private Short topReseauTelephone;
    @Size(max = 80)
    @Column(name = "REF_COURRIER", length = 80)
    private String refCourrier;
    @OneToMany(mappedBy = "prestsDomaine", fetch = FetchType.EAGER)
    private List<Prests> listPrests;

    public PrestsDomaine() {
    }

    public PrestsDomaine(BigDecimal pdcleunik) {
        this.pdcleunik = pdcleunik;
    }

    public BigDecimal getId() {
        return pdcleunik;
    }
    public BigDecimal getPdcleunik() {
        return pdcleunik;
    }

    public void setPdcleunik(BigDecimal pdcleunik) {
        this.pdcleunik = pdcleunik;
    }

    public ContratDomaine getContratDomaine() {
        return contratDomaine;
    }

    public void setContratDomaine(ContratDomaine contratDomaine) {
        this.contratDomaine = contratDomaine;
    }

    public BigDecimal getQuantite() {
        return quantite;
    }

    public void setQuantite(BigDecimal quantite) {
        this.quantite = quantite;
    }

    public BigDecimal getSuperficie() {
        return superficie;
    }

    public void setSuperficie(BigDecimal superficie) {
        this.superficie = superficie;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public BigDecimal getTva() {
        return tva;
    }

    public void setTva(BigDecimal tva) {
        this.tva = tva;
    }

    public BigDecimal getCentimesAdd() {
        return centimesAdd;
    }

    public void setCentimesAdd(BigDecimal centimesAdd) {
        this.centimesAdd = centimesAdd;
    }

    public Short getLigne() {
        return ligne;
    }

    public void setLigne(Short ligne) {
        this.ligne = ligne;
    }

    public String getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(String dateFacture) {
        this.dateFacture = dateFacture;
    }

    public BigDecimal getTaux() {
        return taux;
    }

    public void setTaux(BigDecimal taux) {
        this.taux = taux;
    }

    public Short getPeriodiciteFacture() {
        return periodiciteFacture;
    }

    public void setPeriodiciteFacture(Short periodiciteFacture) {
        this.periodiciteFacture = periodiciteFacture;
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

    public String getTarif() {
        return tarif;
    }

    public void setTarif(String tarif) {
        this.tarif = tarif;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public BigDecimal getMontantAnnuel() {
        return montantAnnuel;
    }

    public void setMontantAnnuel(BigDecimal montantAnnuel) {
        this.montantAnnuel = montantAnnuel;
    }

    public BigDecimal getMajorationFacilite() {
        return majorationFacilite;
    }

    public void setMajorationFacilite(BigDecimal majorationFacilite) {
        this.majorationFacilite = majorationFacilite;
    }

    public Short getTopBordQuai() {
        return topBordQuai;
    }

    public void setTopBordQuai(Short topBordQuai) {
        this.topBordQuai = topBordQuai;
    }

    public Short getTopDesserteRoutiere() {
        return topDesserteRoutiere;
    }

    public void setTopDesserteRoutiere(Short topDesserteRoutiere) {
        this.topDesserteRoutiere = topDesserteRoutiere;
    }

    public Short getTopDesserteFer() {
        return topDesserteFer;
    }

    public void setTopDesserteFer(Short topDesserteFer) {
        this.topDesserteFer = topDesserteFer;
    }

    public Short getTopReseauEau() {
        return topReseauEau;
    }

    public void setTopReseauEau(Short topReseauEau) {
        this.topReseauEau = topReseauEau;
    }

    public Short getTopReseauElectrique() {
        return topReseauElectrique;
    }

    public void setTopReseauElectrique(Short topReseauElectrique) {
        this.topReseauElectrique = topReseauElectrique;
    }

    public Short getTopReseauTelephone() {
        return topReseauTelephone;
    }

    public void setTopReseauTelephone(Short topReseauTelephone) {
        this.topReseauTelephone = topReseauTelephone;
    }

    public String getRefCourrier() {
        return refCourrier;
    }

    public void setRefCourrier(String refCourrier) {
        this.refCourrier = refCourrier;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pdcleunik != null ? pdcleunik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrestsDomaine)) {
            return false;
        }
        PrestsDomaine other = (PrestsDomaine) object;
        if ((this.pdcleunik == null && other.pdcleunik != null) || (this.pdcleunik != null && !this.pdcleunik.equals(other.pdcleunik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.adminfaces.starter.model.PrestsDomaine[ pdcleunik=" + pdcleunik + " ]";
    }

    public List<Prests> getListPrests() {
        return listPrests;
    }

    public void setListPrests(List<Prests> listPrests) {
        this.listPrests = listPrests;
    }
    
}
