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
@Table(name = "COLIS", catalog = "", schema = "PPNCARGO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Colis.findAll", query = "SELECT c FROM Colis c"),
    @NamedQuery(name = "Colis.findByC2cleunik", query = "SELECT c FROM Colis c WHERE c.c2cleunik = :c2cleunik"),
    @NamedQuery(name = "Colis.findByMarques", query = "SELECT c FROM Colis c WHERE c.marques = :marques"),
    @NamedQuery(name = "Colis.findByNumero", query = "SELECT c FROM Colis c WHERE c.numero = :numero"),
    @NamedQuery(name = "Colis.findByPlombs", query = "SELECT c FROM Colis c WHERE c.plombs = :plombs"),
    @NamedQuery(name = "Colis.findByScelles", query = "SELECT c FROM Colis c WHERE c.scelles = :scelles"),
    @NamedQuery(name = "Colis.findByTailles", query = "SELECT c FROM Colis c WHERE c.tailles = :tailles"),
    @NamedQuery(name = "Colis.findByTypes", query = "SELECT c FROM Colis c WHERE c.types = :types"),
    @NamedQuery(name = "Colis.findByFclLcl", query = "SELECT c FROM Colis c WHERE c.fclLcl = :fclLcl"),
    @NamedQuery(name = "Colis.findByPlvVde", query = "SELECT c FROM Colis c WHERE c.plvVde = :plvVde"),
    @NamedQuery(name = "Colis.findByPoids", query = "SELECT c FROM Colis c WHERE c.poids = :poids"),
    @NamedQuery(name = "Colis.findByTare", query = "SELECT c FROM Colis c WHERE c.tare = :tare"),
    @NamedQuery(name = "Colis.findByColis", query = "SELECT c FROM Colis c WHERE c.colis = :colis"),
    @NamedQuery(name = "Colis.findByNombre", query = "SELECT c FROM Colis c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Colis.findByNbrBrd", query = "SELECT c FROM Colis c WHERE c.nbrBrd = :nbrBrd"),
    @NamedQuery(name = "Colis.findByNbrQua", query = "SELECT c FROM Colis c WHERE c.nbrQua = :nbrQua"),
    @NamedQuery(name = "Colis.findByNbrMag", query = "SELECT c FROM Colis c WHERE c.nbrMag = :nbrMag"),
    @NamedQuery(name = "Colis.findByNbrPrt", query = "SELECT c FROM Colis c WHERE c.nbrPrt = :nbrPrt"),
    @NamedQuery(name = "Colis.findByPdsBrd", query = "SELECT c FROM Colis c WHERE c.pdsBrd = :pdsBrd"),
    @NamedQuery(name = "Colis.findByPdsQua", query = "SELECT c FROM Colis c WHERE c.pdsQua = :pdsQua"),
    @NamedQuery(name = "Colis.findByPdsMag", query = "SELECT c FROM Colis c WHERE c.pdsMag = :pdsMag"),
    @NamedQuery(name = "Colis.findByPdsPrt", query = "SELECT c FROM Colis c WHERE c.pdsPrt = :pdsPrt"),
    @NamedQuery(name = "Colis.findBySituat", query = "SELECT c FROM Colis c WHERE c.situat = :situat"),
    @NamedQuery(name = "Colis.findByEmplac", query = "SELECT c FROM Colis c WHERE c.emplac = :emplac"),
    @NamedQuery(name = "Colis.findByMagParc", query = "SELECT c FROM Colis c WHERE c.magParc = :magParc"),
    @NamedQuery(name = "Colis.findByGroupe", query = "SELECT c FROM Colis c WHERE c.groupe = :groupe"),
    @NamedQuery(name = "Colis.findByGestion", query = "SELECT c FROM Colis c WHERE c.gestion = :gestion"),
    @NamedQuery(name = "Colis.findByStatut", query = "SELECT c FROM Colis c WHERE c.statut = :statut"),
    @NamedQuery(name = "Colis.findByCreateur", query = "SELECT c FROM Colis c WHERE c.createur = :createur"),
    @NamedQuery(name = "Colis.findByDCreat", query = "SELECT c FROM Colis c WHERE c.dCreat = :dCreat"),
    @NamedQuery(name = "Colis.findByHCreat", query = "SELECT c FROM Colis c WHERE c.hCreat = :hCreat"),
    @NamedQuery(name = "Colis.findByUtilisat", query = "SELECT c FROM Colis c WHERE c.utilisat = :utilisat"),
    @NamedQuery(name = "Colis.findByDModif", query = "SELECT c FROM Colis c WHERE c.dModif = :dModif"),
    @NamedQuery(name = "Colis.findByHModif", query = "SELECT c FROM Colis c WHERE c.hModif = :hModif"),
    @NamedQuery(name = "Colis.findByDebut", query = "SELECT c FROM Colis c WHERE c.debut = :debut"),
    @NamedQuery(name = "Colis.findByDebH", query = "SELECT c FROM Colis c WHERE c.debH = :debH"),
    @NamedQuery(name = "Colis.findByFin", query = "SELECT c FROM Colis c WHERE c.fin = :fin"),
    @NamedQuery(name = "Colis.findByFinH", query = "SELECT c FROM Colis c WHERE c.finH = :finH"),
    @NamedQuery(name = "Colis.findByDateOrigine", query = "SELECT c FROM Colis c WHERE c.dateOrigine = :dateOrigine"),
    @NamedQuery(name = "Colis.findByDateLivraison", query = "SELECT c FROM Colis c WHERE c.dateLivraison = :dateLivraison"),
    @NamedQuery(name = "Colis.findByDestination", query = "SELECT c FROM Colis c WHERE c.destination = :destination"),
    @NamedQuery(name = "Colis.findByTrieDouane", query = "SELECT c FROM Colis c WHERE c.trieDouane = :trieDouane"),
    @NamedQuery(name = "Colis.findByDepotageEmpotage", query = "SELECT c FROM Colis c WHERE c.depotageEmpotage = :depotageEmpotage"),
    @NamedQuery(name = "Colis.findByFret", query = "SELECT c FROM Colis c WHERE c.fret = :fret"),
    @NamedQuery(name = "Colis.findByFraisDossier", query = "SELECT c FROM Colis c WHERE c.fraisDossier = :fraisDossier"),
    @NamedQuery(name = "Colis.findByFraisAssurance", query = "SELECT c FROM Colis c WHERE c.fraisAssurance = :fraisAssurance"),
    @NamedQuery(name = "Colis.findByFraisThc", query = "SELECT c FROM Colis c WHERE c.fraisThc = :fraisThc"),
    @NamedQuery(name = "Colis.findByFraisCaf", query = "SELECT c FROM Colis c WHERE c.fraisCaf = :fraisCaf"),
    @NamedQuery(name = "Colis.findByFraisBaf", query = "SELECT c FROM Colis c WHERE c.fraisBaf = :fraisBaf"),
    @NamedQuery(name = "Colis.findByFraisAutre", query = "SELECT c FROM Colis c WHERE c.fraisAutre = :fraisAutre"),
    @NamedQuery(name = "Colis.findByDevise", query = "SELECT c FROM Colis c WHERE c.devise = :devise"),
    @NamedQuery(name = "Colis.findByDanger", query = "SELECT c FROM Colis c WHERE c.danger = :danger"),
    @NamedQuery(name = "Colis.findByNaturePlomb", query = "SELECT c FROM Colis c WHERE c.naturePlomb = :naturePlomb"),
    @NamedQuery(name = "Colis.findByOkCondiSecu", query = "SELECT c FROM Colis c WHERE c.okCondiSecu = :okCondiSecu"),
    @NamedQuery(name = "Colis.findByLieu", query = "SELECT c FROM Colis c WHERE c.lieu = :lieu"),
    @NamedQuery(name = "Colis.findByLot", query = "SELECT c FROM Colis c WHERE c.lot = :lot"),
    @NamedQuery(name = "Colis.findByCicleunik", query = "SELECT c FROM Colis c WHERE c.cicleunik = :cicleunik"),
    @NamedQuery(name = "Colis.findByVicleunik", query = "SELECT c FROM Colis c WHERE c.vicleunik = :vicleunik"),
    @NamedQuery(name = "Colis.findByTva", query = "SELECT c FROM Colis c WHERE c.tva = :tva"),
    @NamedQuery(name = "Colis.findByReduct", query = "SELECT c FROM Colis c WHERE c.reduct = :reduct"),
    @NamedQuery(name = "Colis.findByTccleunik", query = "SELECT c FROM Colis c WHERE c.tccleunik = :tccleunik")})
public class Colis implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "C2CLEUNIK")
    private BigDecimal c2cleunik;
    @Size(max = 20)
    @Column(name = "MARQUES")
    private String marques;
    @Size(max = 12)
    @Column(name = "NUMERO")
    private String numero;
    @Size(max = 20)
    @Column(name = "PLOMBS")
    private String plombs;
    @Size(max = 20)
    @Column(name = "SCELLES")
    private String scelles;
    @Size(max = 8)
    @Column(name = "TAILLES")
    private String tailles;
    @Size(max = 8)
    @Column(name = "TYPES")
    private String types;
    @Size(max = 8)
    @Column(name = "FCL_LCL")
    private String fclLcl;
    @Size(max = 8)
    @Column(name = "PLV_VDE")
    private String plvVde;
    @Column(name = "POIDS")
    private BigDecimal poids;
    @Column(name = "TARE")
    private BigDecimal tare;
    @Size(max = 30)
    @Column(name = "COLIS")
    private String colis;
    @Column(name = "NOMBRE")
    private Integer nombre;
    @Column(name = "NBR_BRD")
    private BigDecimal nbrBrd;
    @Column(name = "NBR_QUA")
    private BigDecimal nbrQua;
    @Column(name = "NBR_MAG")
    private BigDecimal nbrMag;
    @Column(name = "NBR_PRT")
    private BigDecimal nbrPrt;
    @Column(name = "PDS_BRD")
    private BigDecimal pdsBrd;
    @Column(name = "PDS_QUA")
    private BigDecimal pdsQua;
    @Column(name = "PDS_MAG")
    private BigDecimal pdsMag;
    @Column(name = "PDS_PRT")
    private BigDecimal pdsPrt;
    @Size(max = 8)
    @Column(name = "SITUAT")
    private String situat;
    @Size(max = 8)
    @Column(name = "EMPLAC")
    private String emplac;
    @Size(max = 8)
    @Column(name = "MAG_PARC")
    private String magParc;
    @Size(max = 8)
    @Column(name = "GROUPE")
    private String groupe;
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
    @Size(max = 8)
    @Column(name = "DEBUT")
    private String debut;
    @Size(max = 4)
    @Column(name = "DEB_H")
    private String debH;
    @Size(max = 8)
    @Column(name = "FIN_")
    private String fin;
    @Size(max = 4)
    @Column(name = "FIN_H")
    private String finH;
    @Size(max = 8)
    @Column(name = "DATE_ORIGINE")
    private String dateOrigine;
    @Size(max = 8)
    @Column(name = "DATE_LIVRAISON")
    private String dateLivraison;
    @Size(max = 20)
    @Column(name = "DESTINATION")
    private String destination;
    @Size(max = 30)
    @Column(name = "TRIE_DOUANE")
    private String trieDouane;
    @Size(max = 8)
    @Column(name = "DEPOTAGE_EMPOTAGE")
    private String depotageEmpotage;
    @Column(name = "FRET")
    private BigDecimal fret;
    @Column(name = "FRAIS_DOSSIER")
    private BigDecimal fraisDossier;
    @Column(name = "FRAIS_ASSURANCE")
    private BigDecimal fraisAssurance;
    @Column(name = "FRAIS_THC")
    private BigDecimal fraisThc;
    @Column(name = "FRAIS_CAF")
    private BigDecimal fraisCaf;
    @Column(name = "FRAIS_BAF")
    private BigDecimal fraisBaf;
    @Column(name = "FRAIS_AUTRE")
    private BigDecimal fraisAutre;
    @Size(max = 1)
    @Column(name = "DEVISE")
    private String devise;
    @Size(max = 8)
    @Column(name = "DANGER")
    private String danger;
    @Size(max = 8)
    @Column(name = "NATURE_PLOMB")
    private String naturePlomb;
    @Column(name = "OK_CONDI_SECU")
    private Short okCondiSecu;
    @Size(max = 8)
    @Column(name = "LIEU")
    private String lieu;
    @Size(max = 20)
    @Column(name = "LOT")
    private String lot;
    @Column(name = "CICLEUNIK")
    private BigInteger cicleunik;
    @Column(name = "VICLEUNIK")
    private BigInteger vicleunik;
    @Column(name = "TVA")
    private BigDecimal tva;
    @Column(name = "REDUCT")
    private BigDecimal reduct;
    @Column(name = "TCCLEUNIK")
    private BigInteger tccleunik;
    @JoinColumn(name = "BLCLEUNIK", referencedColumnName = "BLCLEUNIK")
    @ManyToOne
    private Bl blcleunik;

    public Colis() {
    }

    public Colis(BigDecimal c2cleunik) {
        this.c2cleunik = c2cleunik;
    }

    public BigDecimal getC2cleunik() {
        return c2cleunik;
    }

    public void setC2cleunik(BigDecimal c2cleunik) {
        this.c2cleunik = c2cleunik;
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

    public String getPlombs() {
        return plombs;
    }

    public void setPlombs(String plombs) {
        this.plombs = plombs;
    }

    public String getScelles() {
        return scelles;
    }

    public void setScelles(String scelles) {
        this.scelles = scelles;
    }

    public String getTailles() {
        return tailles;
    }

    public void setTailles(String tailles) {
        this.tailles = tailles;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getFclLcl() {
        return fclLcl;
    }

    public void setFclLcl(String fclLcl) {
        this.fclLcl = fclLcl;
    }

    public String getPlvVde() {
        return plvVde;
    }

    public void setPlvVde(String plvVde) {
        this.plvVde = plvVde;
    }

    public BigDecimal getPoids() {
        return poids;
    }

    public void setPoids(BigDecimal poids) {
        this.poids = poids;
    }

    public BigDecimal getTare() {
        return tare;
    }

    public void setTare(BigDecimal tare) {
        this.tare = tare;
    }

    public String getColis() {
        return colis;
    }

    public void setColis(String colis) {
        this.colis = colis;
    }

    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getNbrBrd() {
        return nbrBrd;
    }

    public void setNbrBrd(BigDecimal nbrBrd) {
        this.nbrBrd = nbrBrd;
    }

    public BigDecimal getNbrQua() {
        return nbrQua;
    }

    public void setNbrQua(BigDecimal nbrQua) {
        this.nbrQua = nbrQua;
    }

    public BigDecimal getNbrMag() {
        return nbrMag;
    }

    public void setNbrMag(BigDecimal nbrMag) {
        this.nbrMag = nbrMag;
    }

    public BigDecimal getNbrPrt() {
        return nbrPrt;
    }

    public void setNbrPrt(BigDecimal nbrPrt) {
        this.nbrPrt = nbrPrt;
    }

    public BigDecimal getPdsBrd() {
        return pdsBrd;
    }

    public void setPdsBrd(BigDecimal pdsBrd) {
        this.pdsBrd = pdsBrd;
    }

    public BigDecimal getPdsQua() {
        return pdsQua;
    }

    public void setPdsQua(BigDecimal pdsQua) {
        this.pdsQua = pdsQua;
    }

    public BigDecimal getPdsMag() {
        return pdsMag;
    }

    public void setPdsMag(BigDecimal pdsMag) {
        this.pdsMag = pdsMag;
    }

    public BigDecimal getPdsPrt() {
        return pdsPrt;
    }

    public void setPdsPrt(BigDecimal pdsPrt) {
        this.pdsPrt = pdsPrt;
    }

    public String getSituat() {
        return situat;
    }

    public void setSituat(String situat) {
        this.situat = situat;
    }

    public String getEmplac() {
        return emplac;
    }

    public void setEmplac(String emplac) {
        this.emplac = emplac;
    }

    public String getMagParc() {
        return magParc;
    }

    public void setMagParc(String magParc) {
        this.magParc = magParc;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
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

    public String getDebut() {
        return debut;
    }

    public void setDebut(String debut) {
        this.debut = debut;
    }

    public String getDebH() {
        return debH;
    }

    public void setDebH(String debH) {
        this.debH = debH;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getFinH() {
        return finH;
    }

    public void setFinH(String finH) {
        this.finH = finH;
    }

    public String getDateOrigine() {
        return dateOrigine;
    }

    public void setDateOrigine(String dateOrigine) {
        this.dateOrigine = dateOrigine;
    }

    public String getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(String dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTrieDouane() {
        return trieDouane;
    }

    public void setTrieDouane(String trieDouane) {
        this.trieDouane = trieDouane;
    }

    public String getDepotageEmpotage() {
        return depotageEmpotage;
    }

    public void setDepotageEmpotage(String depotageEmpotage) {
        this.depotageEmpotage = depotageEmpotage;
    }

    public BigDecimal getFret() {
        return fret;
    }

    public void setFret(BigDecimal fret) {
        this.fret = fret;
    }

    public BigDecimal getFraisDossier() {
        return fraisDossier;
    }

    public void setFraisDossier(BigDecimal fraisDossier) {
        this.fraisDossier = fraisDossier;
    }

    public BigDecimal getFraisAssurance() {
        return fraisAssurance;
    }

    public void setFraisAssurance(BigDecimal fraisAssurance) {
        this.fraisAssurance = fraisAssurance;
    }

    public BigDecimal getFraisThc() {
        return fraisThc;
    }

    public void setFraisThc(BigDecimal fraisThc) {
        this.fraisThc = fraisThc;
    }

    public BigDecimal getFraisCaf() {
        return fraisCaf;
    }

    public void setFraisCaf(BigDecimal fraisCaf) {
        this.fraisCaf = fraisCaf;
    }

    public BigDecimal getFraisBaf() {
        return fraisBaf;
    }

    public void setFraisBaf(BigDecimal fraisBaf) {
        this.fraisBaf = fraisBaf;
    }

    public BigDecimal getFraisAutre() {
        return fraisAutre;
    }

    public void setFraisAutre(BigDecimal fraisAutre) {
        this.fraisAutre = fraisAutre;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public String getDanger() {
        return danger;
    }

    public void setDanger(String danger) {
        this.danger = danger;
    }

    public String getNaturePlomb() {
        return naturePlomb;
    }

    public void setNaturePlomb(String naturePlomb) {
        this.naturePlomb = naturePlomb;
    }

    public Short getOkCondiSecu() {
        return okCondiSecu;
    }

    public void setOkCondiSecu(Short okCondiSecu) {
        this.okCondiSecu = okCondiSecu;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
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

    public BigInteger getTccleunik() {
        return tccleunik;
    }

    public void setTccleunik(BigInteger tccleunik) {
        this.tccleunik = tccleunik;
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
        hash += (c2cleunik != null ? c2cleunik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Colis)) {
            return false;
        }
        Colis other = (Colis) object;
        if ((this.c2cleunik == null && other.c2cleunik != null) || (this.c2cleunik != null && !this.c2cleunik.equals(other.c2cleunik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.adminfaces.starter.model.Colis[ c2cleunik=" + c2cleunik + " ]";
    }
    
}
