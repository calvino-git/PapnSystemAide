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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Calvin ILOKI
 */
@Entity
@Table(name = "TRAFIC", catalog = "", schema = "PPNCARGO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trafic.findAll", query = "SELECT t FROM Trafic t"),
    @NamedQuery(name = "Trafic.findByTrcleunik", query = "SELECT t FROM Trafic t WHERE t.trcleunik = :trcleunik"),
    @NamedQuery(name = "Trafic.findByTrafic", query = "SELECT t FROM Trafic t WHERE t.trafic = :trafic"),
    @NamedQuery(name = "Trafic.findByDeVers", query = "SELECT t FROM Trafic t WHERE t.deVers = :deVers"),
    @NamedQuery(name = "Trafic.findByTonnage", query = "SELECT t FROM Trafic t WHERE t.tonnage = :tonnage"),
    @NamedQuery(name = "Trafic.findByModNav", query = "SELECT t FROM Trafic t WHERE t.modNav = :modNav"),
    @NamedQuery(name = "Trafic.findByTaux", query = "SELECT t FROM Trafic t WHERE t.taux = :taux"),
    @NamedQuery(name = "Trafic.findByMntTtc", query = "SELECT t FROM Trafic t WHERE t.mntTtc = :mntTtc"),
    @NamedQuery(name = "Trafic.findByStatut", query = "SELECT t FROM Trafic t WHERE t.statut = :statut"),
    @NamedQuery(name = "Trafic.findByGestion", query = "SELECT t FROM Trafic t WHERE t.gestion = :gestion"),
    @NamedQuery(name = "Trafic.findByCreateur", query = "SELECT t FROM Trafic t WHERE t.createur = :createur"),
    @NamedQuery(name = "Trafic.findByDCreat", query = "SELECT t FROM Trafic t WHERE t.dCreat = :dCreat"),
    @NamedQuery(name = "Trafic.findByHCreat", query = "SELECT t FROM Trafic t WHERE t.hCreat = :hCreat"),
    @NamedQuery(name = "Trafic.findByUtilisat", query = "SELECT t FROM Trafic t WHERE t.utilisat = :utilisat"),
    @NamedQuery(name = "Trafic.findByDModif", query = "SELECT t FROM Trafic t WHERE t.dModif = :dModif"),
    @NamedQuery(name = "Trafic.findByHModif", query = "SELECT t FROM Trafic t WHERE t.hModif = :hModif"),
    @NamedQuery(name = "Trafic.findByNbrTcs", query = "SELECT t FROM Trafic t WHERE t.nbrTcs = :nbrTcs"),
    @NamedQuery(name = "Trafic.findByGenreNav", query = "SELECT t FROM Trafic t WHERE t.genreNav = :genreNav"),
    @NamedQuery(name = "Trafic.findByDateDepotManifeste", query = "SELECT t FROM Trafic t WHERE t.dateDepotManifeste = :dateDepotManifeste"),
    @NamedQuery(name = "Trafic.findByNumManifesteAsp", query = "SELECT t FROM Trafic t WHERE t.numManifesteAsp = :numManifesteAsp"),
    @NamedQuery(name = "Trafic.findByCicleunik", query = "SELECT t FROM Trafic t WHERE t.cicleunik = :cicleunik"),
    @NamedQuery(name = "Trafic.findByNbreBl", query = "SELECT t FROM Trafic t WHERE t.nbreBl = :nbreBl")})
public class Trafic implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "TRCLEUNIK")
    private BigDecimal trcleunik;
    @Size(max = 8)
    @Column(name = "TRAFIC")
    private String trafic;
    @Size(max = 8)
    @Column(name = "DE_VERS")
    private String deVers;
    @Column(name = "TONNAGE")
    private BigInteger tonnage;
    @Size(max = 8)
    @Column(name = "MOD_NAV")
    private String modNav;
    @Column(name = "TAUX")
    private BigDecimal taux;
    @Column(name = "MNT_TTC")
    private BigDecimal mntTtc;
    @Size(max = 8)
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
    @Column(name = "NBR_TCS")
    private BigDecimal nbrTcs;
    @Size(max = 8)
    @Column(name = "GENRE_NAV")
    private String genreNav;
    @Size(max = 8)
    @Column(name = "DATE_DEPOT_MANIFESTE")
    private String dateDepotManifeste;
    @Size(max = 10)
    @Column(name = "NUM_MANIFESTE_ASP")
    private String numManifesteAsp;
    @Column(name = "CICLEUNIK")
    private BigInteger cicleunik;
    @Column(name = "NBRE_BL")
    private BigInteger nbreBl;
    @OneToMany(mappedBy = "trcleunik")
    private List<Port> listPort;
    @OneToMany(mappedBy = "trafic")
    private List<Prests> listPrests;
    @JoinColumn(name = "ESCLEUNIK", referencedColumnName = "ESCLEUNIK")
    @ManyToOne
    private Escale escleunik;

    public Trafic() {
    }

    public Trafic(BigDecimal trcleunik) {
        this.trcleunik = trcleunik;
    }

    public BigDecimal getTrcleunik() {
        return trcleunik;
    }

    public void setTrcleunik(BigDecimal trcleunik) {
        this.trcleunik = trcleunik;
    }

    public String getTrafic() {
        return trafic;
    }

    public void setTrafic(String trafic) {
        this.trafic = trafic;
    }

    public String getDeVers() {
        return deVers;
    }

    public void setDeVers(String deVers) {
        this.deVers = deVers;
    }

    public BigInteger getTonnage() {
        return tonnage;
    }

    public void setTonnage(BigInteger tonnage) {
        this.tonnage = tonnage;
    }

    public String getModNav() {
        return modNav;
    }

    public void setModNav(String modNav) {
        this.modNav = modNav;
    }

    public BigDecimal getTaux() {
        return taux;
    }

    public void setTaux(BigDecimal taux) {
        this.taux = taux;
    }

    public BigDecimal getMntTtc() {
        return mntTtc;
    }

    public void setMntTtc(BigDecimal mntTtc) {
        this.mntTtc = mntTtc;
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

    public BigDecimal getNbrTcs() {
        return nbrTcs;
    }

    public void setNbrTcs(BigDecimal nbrTcs) {
        this.nbrTcs = nbrTcs;
    }

    public String getGenreNav() {
        return genreNav;
    }

    public void setGenreNav(String genreNav) {
        this.genreNav = genreNav;
    }

    public String getDateDepotManifeste() {
        return dateDepotManifeste;
    }

    public void setDateDepotManifeste(String dateDepotManifeste) {
        this.dateDepotManifeste = dateDepotManifeste;
    }

    public String getNumManifesteAsp() {
        return numManifesteAsp;
    }

    public void setNumManifesteAsp(String numManifesteAsp) {
        this.numManifesteAsp = numManifesteAsp;
    }

    public BigInteger getCicleunik() {
        return cicleunik;
    }

    public void setCicleunik(BigInteger cicleunik) {
        this.cicleunik = cicleunik;
    }

    public BigInteger getNbreBl() {
        return nbreBl;
    }

    public void setNbreBl(BigInteger nbreBl) {
        this.nbreBl = nbreBl;
    }

    @XmlTransient
    public List<Port> getListPort() {
        return listPort;
    }

    public void setListPort(List<Port> listPort) {
        this.listPort = listPort;
    }

    public Escale getEscleunik() {
        return escleunik;
    }

    public void setEscleunik(Escale escleunik) {
        this.escleunik = escleunik;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trcleunik != null ? trcleunik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trafic)) {
            return false;
        }
        Trafic other = (Trafic) object;
        if ((this.trcleunik == null && other.trcleunik != null) || (this.trcleunik != null && !this.trcleunik.equals(other.trcleunik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.adminfaces.starter.model.Trafic[ trcleunik=" + trcleunik + " ]";
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

    public List<Prests> getListPrests() {
        return listPrests;
    }

    public void setListPrests(List<Prests> listPrests) {
        this.listPrests = listPrests;
    }
    
}
