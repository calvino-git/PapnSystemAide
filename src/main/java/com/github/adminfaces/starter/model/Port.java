/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
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
@Table(name = "PORT", catalog = "", schema = "PPNCARGO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Port.findAll", query = "SELECT p FROM Port p"),
    @NamedQuery(name = "Port.findByPocleunik", query = "SELECT p FROM Port p WHERE p.pocleunik = :pocleunik"),
    @NamedQuery(name = "Port.findByCode", query = "SELECT p FROM Port p WHERE p.code = :code"),
    @NamedQuery(name = "Port.findByGestion", query = "SELECT p FROM Port p WHERE p.gestion = :gestion"),
    @NamedQuery(name = "Port.findByStatut", query = "SELECT p FROM Port p WHERE p.statut = :statut"),
    @NamedQuery(name = "Port.findByCreateur", query = "SELECT p FROM Port p WHERE p.createur = :createur"),
    @NamedQuery(name = "Port.findByDCreat", query = "SELECT p FROM Port p WHERE p.dCreat = :dCreat"),
    @NamedQuery(name = "Port.findByHCreat", query = "SELECT p FROM Port p WHERE p.hCreat = :hCreat"),
    @NamedQuery(name = "Port.findByUtilisat", query = "SELECT p FROM Port p WHERE p.utilisat = :utilisat"),
    @NamedQuery(name = "Port.findByDModif", query = "SELECT p FROM Port p WHERE p.dModif = :dModif"),
    @NamedQuery(name = "Port.findByHModif", query = "SELECT p FROM Port p WHERE p.hModif = :hModif"),
    @NamedQuery(name = "Port.findByConditions", query = "SELECT p FROM Port p WHERE p.conditions = :conditions"),
    @NamedQuery(name = "Port.findByDateEscale", query = "SELECT p FROM Port p WHERE p.dateEscale = :dateEscale"),
    @NamedQuery(name = "Port.findByPoids", query = "SELECT p FROM Port p WHERE p.poids = :poids"),
    @NamedQuery(name = "Port.findByNbreBl", query = "SELECT p FROM Port p WHERE p.nbreBl = :nbreBl")})
public class Port implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "POCLEUNIK")
    private BigDecimal pocleunik;
    @Size(max = 8)
    @Column(name = "CODE")
    private String code;
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
    @Size(max = 80)
    @Column(name = "CONDITIONS")
    private String conditions;
    @Size(max = 8)
    @Column(name = "DATE_ESCALE")
    private String dateEscale;
    @Column(name = "POIDS")
    private BigDecimal poids;
    @Column(name = "NBRE_BL")
    private BigInteger nbreBl;
    @JoinColumn(name = "TRCLEUNIK", referencedColumnName = "TRCLEUNIK")
    @ManyToOne
    private Trafic trcleunik;
    @OneToMany(mappedBy = "pocleunik")
    private Collection<Bl> blCollection;

    public Port() {
    }

    public Port(BigDecimal pocleunik) {
        this.pocleunik = pocleunik;
    }

    public BigDecimal getPocleunik() {
        return pocleunik;
    }

    public void setPocleunik(BigDecimal pocleunik) {
        this.pocleunik = pocleunik;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getDateEscale() {
        return dateEscale;
    }

    public void setDateEscale(String dateEscale) {
        this.dateEscale = dateEscale;
    }

    public BigDecimal getPoids() {
        return poids;
    }

    public void setPoids(BigDecimal poids) {
        this.poids = poids;
    }

    public BigInteger getNbreBl() {
        return nbreBl;
    }

    public void setNbreBl(BigInteger nbreBl) {
        this.nbreBl = nbreBl;
    }

    public Trafic getTrcleunik() {
        return trcleunik;
    }

    public void setTrcleunik(Trafic trcleunik) {
        this.trcleunik = trcleunik;
    }

    @XmlTransient
    public Collection<Bl> getBlCollection() {
        return blCollection;
    }

    public void setBlCollection(Collection<Bl> blCollection) {
        this.blCollection = blCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pocleunik != null ? pocleunik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Port)) {
            return false;
        }
        Port other = (Port) object;
        if ((this.pocleunik == null && other.pocleunik != null) || (this.pocleunik != null && !this.pocleunik.equals(other.pocleunik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.adminfaces.starter.model.Port[ pocleunik=" + pocleunik + " ]";
    }
    
}
