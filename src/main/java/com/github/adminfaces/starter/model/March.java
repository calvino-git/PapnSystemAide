/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.model;

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
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Calvin ILOKI
 */
@Entity
@Table(name = "MARCH", catalog = "", schema = "PPNCARGO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "March.findAll", query = "SELECT m FROM March m"),
    @NamedQuery(name = "March.findByMacleunik", query = "SELECT m FROM March m WHERE m.macleunik = :macleunik"),
    @NamedQuery(name = "March.findByMarch", query = "SELECT m FROM March m WHERE m.march = :march"),
    @NamedQuery(name = "March.findByColis", query = "SELECT m FROM March m WHERE m.colis = :colis"),
    @NamedQuery(name = "March.findByPoids", query = "SELECT m FROM March m WHERE m.poids = :poids"),
    @NamedQuery(name = "March.findByNombre", query = "SELECT m FROM March m WHERE m.nombre = :nombre"),
    @NamedQuery(name = "March.findByNbrGrp", query = "SELECT m FROM March m WHERE m.nbrGrp = :nbrGrp"),
    @NamedQuery(name = "March.findByPdsGrp", query = "SELECT m FROM March m WHERE m.pdsGrp = :pdsGrp"),
    @NamedQuery(name = "March.findByGestion", query = "SELECT m FROM March m WHERE m.gestion = :gestion"),
    @NamedQuery(name = "March.findByStatut", query = "SELECT m FROM March m WHERE m.statut = :statut"),
    @NamedQuery(name = "March.findByCreateur", query = "SELECT m FROM March m WHERE m.createur = :createur"),
    @NamedQuery(name = "March.findByDCreat", query = "SELECT m FROM March m WHERE m.dCreat = :dCreat"),
    @NamedQuery(name = "March.findByHCreat", query = "SELECT m FROM March m WHERE m.hCreat = :hCreat"),
    @NamedQuery(name = "March.findByUtilisat", query = "SELECT m FROM March m WHERE m.utilisat = :utilisat"),
    @NamedQuery(name = "March.findByDModif", query = "SELECT m FROM March m WHERE m.dModif = :dModif"),
    @NamedQuery(name = "March.findByHModif", query = "SELECT m FROM March m WHERE m.hModif = :hModif"),
    @NamedQuery(name = "March.findByMarques", query = "SELECT m FROM March m WHERE m.marques = :marques"),
    @NamedQuery(name = "March.findByNumero", query = "SELECT m FROM March m WHERE m.numero = :numero"),
    @NamedQuery(name = "March.findByTexte1", query = "SELECT m FROM March m WHERE m.texte1 = :texte1"),
    @NamedQuery(name = "March.findByLibelle", query = "SELECT m FROM March m WHERE m.libelle = :libelle"),
    @NamedQuery(name = "March.findByVolume", query = "SELECT m FROM March m WHERE m.volume = :volume"),
    @NamedQuery(name = "March.findByUp", query = "SELECT m FROM March m WHERE m.up = :up"),
    @NamedQuery(name = "March.findByDangeureux", query = "SELECT m FROM March m WHERE m.dangeureux = :dangeureux"),
    @NamedQuery(name = "March.findByClassed", query = "SELECT m FROM March m WHERE m.classed = :classed"),
    @NamedQuery(name = "March.findByC2cleunik", query = "SELECT m FROM March m WHERE m.c2cleunik = :c2cleunik"),
    @NamedQuery(name = "March.findByFret", query = "SELECT m FROM March m WHERE m.fret = :fret"),
    @NamedQuery(name = "March.findByRemarque", query = "SELECT m FROM March m WHERE m.remarque = :remarque"),
    @NamedQuery(name = "March.findByCodeOnu", query = "SELECT m FROM March m WHERE m.codeOnu = :codeOnu"),
    @NamedQuery(name = "March.findByDateEnlevRecep", query = "SELECT m FROM March m WHERE m.dateEnlevRecep = :dateEnlevRecep"),
    @NamedQuery(name = "March.findByDelais", query = "SELECT m FROM March m WHERE m.delais = :delais"),
    @NamedQuery(name = "March.findByTonnageIlot", query = "SELECT m FROM March m WHERE m.tonnageIlot = :tonnageIlot"),
    @NamedQuery(name = "March.findByGardiens", query = "SELECT m FROM March m WHERE m.gardiens = :gardiens"),
    @NamedQuery(name = "March.findByCodeSecurite", query = "SELECT m FROM March m WHERE m.codeSecurite = :codeSecurite"),
    @NamedQuery(name = "March.findByNec", query = "SELECT m FROM March m WHERE m.nec = :nec"),
    @NamedQuery(name = "March.findByNumeroTc", query = "SELECT m FROM March m WHERE m.numeroTc = :numeroTc"),
    @NamedQuery(name = "March.findByValeurMarchandise", query = "SELECT m FROM March m WHERE m.valeurMarchandise = :valeurMarchandise"),
    @NamedQuery(name = "March.findByDevise", query = "SELECT m FROM March m WHERE m.devise = :devise"),
    @NamedQuery(name = "March.findByPoidsDangereux", query = "SELECT m FROM March m WHERE m.poidsDangereux = :poidsDangereux"),
    @NamedQuery(name = "March.findByPoidsManifeste", query = "SELECT m FROM March m WHERE m.poidsManifeste = :poidsManifeste"),
    @NamedQuery(name = "March.findByCodeDouane", query = "SELECT m FROM March m WHERE m.codeDouane = :codeDouane"),
    @NamedQuery(name = "March.findByCicleunik", query = "SELECT m FROM March m WHERE m.cicleunik = :cicleunik"),
    @NamedQuery(name = "March.findByVicleunik", query = "SELECT m FROM March m WHERE m.vicleunik = :vicleunik"),
    @NamedQuery(name = "March.findByLocalisationBord", query = "SELECT m FROM March m WHERE m.localisationBord = :localisationBord"),
    @NamedQuery(name = "March.findByTva", query = "SELECT m FROM March m WHERE m.tva = :tva"),
    @NamedQuery(name = "March.findByReduct", query = "SELECT m FROM March m WHERE m.reduct = :reduct")})
public class March implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MACLEUNIK")
    private BigDecimal macleunik;
    @Size(max = 15)
    @Column(name = "MARCH")
    private String march;
    @Size(max = 30)
    @Column(name = "COLIS")
    private String colis;
    @Column(name = "POIDS")
    private BigDecimal poids;
    @Column(name = "NOMBRE")
    private BigDecimal nombre;
    @Column(name = "NBR_GRP")
    private BigDecimal nbrGrp;
    @Column(name = "PDS_GRP")
    private BigDecimal pdsGrp;
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
    @Size(max = 20)
    @Column(name = "MARQUES")
    private String marques;
    @Size(max = 17)
    @Column(name = "NUMERO")
    private String numero;
    @Size(max = 300)
    @Column(name = "TEXTE1")
    private String texte1;
    @Size(max = 128)
    @Column(name = "LIBELLE")
    private String libelle;
    @Column(name = "VOLUME")
    private BigDecimal volume;
    @Column(name = "UP")
    private BigDecimal up;
    @Column(name = "DANGEUREUX")
    private Short dangeureux;
    @Size(max = 16)
    @Column(name = "CLASSED")
    private String classed;
    @Column(name = "C2CLEUNIK")
    private BigInteger c2cleunik;
    @Column(name = "FRET")
    private BigDecimal fret;
    @Size(max = 40)
    @Column(name = "REMARQUE")
    private String remarque;
    @Size(max = 8)
    @Column(name = "CODE_ONU")
    private String codeOnu;
    @Size(max = 8)
    @Column(name = "DATE_ENLEV_RECEP")
    private String dateEnlevRecep;
    @Column(name = "DELAIS")
    private BigDecimal delais;
    @Column(name = "TONNAGE_ILOT")
    private BigDecimal tonnageIlot;
    @Column(name = "GARDIENS")
    private BigDecimal gardiens;
    @Size(max = 8)
    @Column(name = "CODE_SECURITE")
    private String codeSecurite;
    @Column(name = "NEC")
    private BigDecimal nec;
    @Size(max = 12)
    @Column(name = "NUMERO_TC")
    private String numeroTc;
    @Column(name = "VALEUR_MARCHANDISE")
    private BigDecimal valeurMarchandise;
    @Size(max = 1)
    @Column(name = "DEVISE")
    private String devise;
    @Column(name = "POIDS_DANGEREUX")
    private BigDecimal poidsDangereux;
    @Column(name = "POIDS_MANIFESTE")
    private BigDecimal poidsManifeste;
    @Size(max = 14)
    @Column(name = "CODE_DOUANE")
    private String codeDouane;
    @Column(name = "CICLEUNIK")
    private BigInteger cicleunik;
    @Column(name = "VICLEUNIK")
    private BigInteger vicleunik;
    @Size(max = 20)
    @Column(name = "LOCALISATION_BORD")
    private String localisationBord;
    @Column(name = "TVA")
    private BigDecimal tva;
    @Column(name = "REDUCT")
    private BigDecimal reduct;
    @JoinColumn(name = "BLCLEUNIK", referencedColumnName = "BLCLEUNIK")
    @ManyToOne
    private Bl blcleunik;

    public March() {
    }

    public March(BigDecimal macleunik) {
        this.macleunik = macleunik;
    }

    public BigDecimal getMacleunik() {
        return macleunik;
    }

    public void setMacleunik(BigDecimal macleunik) {
        this.macleunik = macleunik;
    }

    public String getMarch() {
        return march;
    }

    public void setMarch(String march) {
        this.march = march;
    }

    public String getColis() {
        return colis;
    }

    public void setColis(String colis) {
        this.colis = colis;
    }

    public BigDecimal getPoids() {
        return poids;
    }

    public void setPoids(BigDecimal poids) {
        this.poids = poids;
    }

    public BigDecimal getNombre() {
        return nombre;
    }

    public void setNombre(BigDecimal nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getNbrGrp() {
        return nbrGrp;
    }

    public void setNbrGrp(BigDecimal nbrGrp) {
        this.nbrGrp = nbrGrp;
    }

    public BigDecimal getPdsGrp() {
        return pdsGrp;
    }

    public void setPdsGrp(BigDecimal pdsGrp) {
        this.pdsGrp = pdsGrp;
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

    public String getMarques() {
        return marques;
    }

    public void setMarques(String marques) {
        this.marques = marques;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTexte1() {
        return texte1;
    }

    public void setTexte1(String texte1) {
        this.texte1 = texte1;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public BigDecimal getUp() {
        return up;
    }

    public void setUp(BigDecimal up) {
        this.up = up;
    }

    public Short getDangeureux() {
        return dangeureux;
    }

    public void setDangeureux(Short dangeureux) {
        this.dangeureux = dangeureux;
    }

    public String getClassed() {
        return classed;
    }

    public void setClassed(String classed) {
        this.classed = classed;
    }

    public BigInteger getC2cleunik() {
        return c2cleunik;
    }

    public void setC2cleunik(BigInteger c2cleunik) {
        this.c2cleunik = c2cleunik;
    }

    public BigDecimal getFret() {
        return fret;
    }

    public void setFret(BigDecimal fret) {
        this.fret = fret;
    }

    public String getRemarque() {
        return remarque;
    }

    public void setRemarque(String remarque) {
        this.remarque = remarque;
    }

    public String getCodeOnu() {
        return codeOnu;
    }

    public void setCodeOnu(String codeOnu) {
        this.codeOnu = codeOnu;
    }

    public String getDateEnlevRecep() {
        return dateEnlevRecep;
    }

    public void setDateEnlevRecep(String dateEnlevRecep) {
        this.dateEnlevRecep = dateEnlevRecep;
    }

    public BigDecimal getDelais() {
        return delais;
    }

    public void setDelais(BigDecimal delais) {
        this.delais = delais;
    }

    public BigDecimal getTonnageIlot() {
        return tonnageIlot;
    }

    public void setTonnageIlot(BigDecimal tonnageIlot) {
        this.tonnageIlot = tonnageIlot;
    }

    public BigDecimal getGardiens() {
        return gardiens;
    }

    public void setGardiens(BigDecimal gardiens) {
        this.gardiens = gardiens;
    }

    public String getCodeSecurite() {
        return codeSecurite;
    }

    public void setCodeSecurite(String codeSecurite) {
        this.codeSecurite = codeSecurite;
    }

    public BigDecimal getNec() {
        return nec;
    }

    public void setNec(BigDecimal nec) {
        this.nec = nec;
    }

    public String getNumeroTc() {
        return numeroTc;
    }

    public void setNumeroTc(String numeroTc) {
        this.numeroTc = numeroTc;
    }

    public BigDecimal getValeurMarchandise() {
        return valeurMarchandise;
    }

    public void setValeurMarchandise(BigDecimal valeurMarchandise) {
        this.valeurMarchandise = valeurMarchandise;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public BigDecimal getPoidsDangereux() {
        return poidsDangereux;
    }

    public void setPoidsDangereux(BigDecimal poidsDangereux) {
        this.poidsDangereux = poidsDangereux;
    }

    public BigDecimal getPoidsManifeste() {
        return poidsManifeste;
    }

    public void setPoidsManifeste(BigDecimal poidsManifeste) {
        this.poidsManifeste = poidsManifeste;
    }

    public String getCodeDouane() {
        return codeDouane;
    }

    public void setCodeDouane(String codeDouane) {
        this.codeDouane = codeDouane;
    }

    public BigInteger getCicleunik() {
        return cicleunik;
    }

    public void setCicleunik(BigInteger cicleunik) {
        this.cicleunik = cicleunik;
    }

    public BigInteger getVicleunik() {
        return vicleunik;
    }

    public void setVicleunik(BigInteger vicleunik) {
        this.vicleunik = vicleunik;
    }

    public String getLocalisationBord() {
        return localisationBord;
    }

    public void setLocalisationBord(String localisationBord) {
        this.localisationBord = localisationBord;
    }

    public BigDecimal getTva() {
        return tva;
    }

    public void setTva(BigDecimal tva) {
        this.tva = tva;
    }

    public BigDecimal getReduct() {
        return reduct;
    }

    public void setReduct(BigDecimal reduct) {
        this.reduct = reduct;
    }

    public Bl getBlcleunik() {
        return blcleunik;
    }

    public void setBlcleunik(Bl blcleunik) {
        this.blcleunik = blcleunik;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (macleunik != null ? macleunik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof March)) {
            return false;
        }
        March other = (March) object;
        if ((this.macleunik == null && other.macleunik != null) || (this.macleunik != null && !this.macleunik.equals(other.macleunik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.adminfaces.starter.model.March[ macleunik=" + macleunik + " ]";
    }
    
}
