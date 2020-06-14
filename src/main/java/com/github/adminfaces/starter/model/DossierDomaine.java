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
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author calviniloki
 */
@Table(name = "DOSSIER_DOMAINE", catalog = "", schema = "PPNCARGO")
@XmlRootElement
public class DossierDomaine extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DDCLEUNIK", nullable = false, precision = 19, scale = 0)
    private BigDecimal ddcleunik;
    @Size(max = 20)
    @Column(name = "DOSSIER", length = 20)
    private String dossier;
    @Size(max = 40)
    @Column(name = "REFERENCE", length = 40)
    private String reference;
    @Size(max = 50)
    @Column(name = "LIBELLE", length = 50)
    private String libelle;
    @Size(max = 8)
    @Column(name = "CLIENT", length = 8)
    private String client;
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
    @Size(max = 40)
    @Column(name = "SOUS_ZONE", length = 40)
    private String sousZone;
    @Column(name = "CLE_PARCELLE")
    private BigInteger cleParcelle;
    @OneToMany(mappedBy = "ddcleunik", fetch = FetchType.EAGER)
    private List<ContratDomaine> listContrat;

    public DossierDomaine() {
    }

    public DossierDomaine(BigDecimal ddcleunik) {
        this.ddcleunik = ddcleunik;
    }

    @Override
    public BigDecimal getId() {
        return ddcleunik;
    } 
    public BigDecimal getDdcleunik() {
        return ddcleunik;
    }

    public void setDdcleunik(BigDecimal ddcleunik) {
        this.ddcleunik = ddcleunik;
    }

    public String getDossier() {
        return dossier;
    }

    public void setDossier(String dossier) {
        this.dossier = dossier;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
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

    public String getSousZone() {
        return sousZone;
    }

    public void setSousZone(String sousZone) {
        this.sousZone = sousZone;
    }

    public BigInteger getCleParcelle() {
        return cleParcelle;
    }

    public void setCleParcelle(BigInteger cleParcelle) {
        this.cleParcelle = cleParcelle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ddcleunik != null ? ddcleunik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DossierDomaine)) {
            return false;
        }
        DossierDomaine other = (DossierDomaine) object;
        if ((this.ddcleunik == null && other.ddcleunik != null) || (this.ddcleunik != null && !this.ddcleunik.equals(other.ddcleunik))) {
            return false;
        }
        return true;
    }
    

    @Override
    public String toString() {
        return "com.github.adminfaces.starter.model.DossierDomaine[ ddcleunik=" + ddcleunik + " ]";
    }

    public List<ContratDomaine> getListContrat() {
        return listContrat;
    }

    public void setListContrat(List<ContratDomaine> listContrat) {
        this.listContrat = listContrat;
    }
    
}
