/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.model;

import com.github.adminfaces.persistence.model.BaseEntity;
import java.io.Serializable;
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
 * @author 60610H
 */
@Entity
@Table(name = "VUE_SOURCE_EVP", catalog = "", schema = "PPNCARGO")
@Immutable
@XmlRootElement
public class VueSourceEvp extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name="id")
    private Integer id;
    @Size(max = 8)
    @Column(name = "MOIS")
    private String mois;
    @Size(max = 40)
    @Column(name = "NAVIRE")
    private String navire;
    @Size(max = 12)
    @Column(name = "ESCALE")
    private String escale;
    @Size(max = 4)
    @Column(name = "MOUVEMENT")
    private String mouvement;
    @Size(max = 255)
    @Column(name = "TRAFIC")
    private String trafic;
    @Column(name = "MANIFESTE_PLEIN")
    private BigInteger manifestePlein;
    @Column(name = "MANIFESTE_VIDE")
    private BigInteger manifesteVide;
    @Column(name = "MANIFESTE_TOTAL")
    private BigInteger manifesteTotal;
    @Column(name = "DOUANE_PLEIN")
    private BigInteger douanePlein;
    @Column(name = "DOUANE_VIDE")
    private BigInteger douaneVide;
    @Column(name = "DOUANE_TOTAL")
    private BigInteger douaneTotal;
    @Column(name = "CONGOTERMINAL_PLEIN")
    private BigInteger congoTerminalPlein;
    @Column(name = "CONGOTERMINAL_VIDE")
    private BigInteger congoTerminalVide;
    @Column(name = "CONGOTERMINAL_TOTAL")
    private BigInteger congoTerminalTotal;

    public VueSourceEvp() {
    }

    public String getNavire() {
        return navire;
    }

    public void setNavire(String navire) {
        this.navire = navire;
    }

    public String getEscale() {
        return escale;
    }

    public void setEscale(String escale) {
        this.escale = escale;
    }

    public String getMouvement() {
        return mouvement;
    }

    public void setMouvement(String mouvement) {
        this.mouvement = mouvement;
    }

    public String getTrafic() {
        return trafic;
    }

    public void setTrafic(String trafic) {
        this.trafic = trafic;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMois() {
        return mois;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }

    public BigInteger getManifestePlein() {
        return manifestePlein;
    }

    public void setManifestePlein(BigInteger manifestePlein) {
        this.manifestePlein = manifestePlein;
    }

    public BigInteger getManifesteVide() {
        return manifesteVide;
    }

    public void setManifesteVide(BigInteger manifesteVide) {
        this.manifesteVide = manifesteVide;
    }

    public BigInteger getManifesteTotal() {
        return manifesteTotal;
    }

    public void setManifesteTotal(BigInteger manifesteTotal) {
        this.manifesteTotal = manifesteTotal;
    }

    public BigInteger getDouanePlein() {
        return douanePlein;
    }

    public void setDouanePlein(BigInteger douanePlein) {
        this.douanePlein = douanePlein;
    }

    public BigInteger getDouaneVide() {
        return douaneVide;
    }

    public void setDouaneVide(BigInteger douaneVide) {
        this.douaneVide = douaneVide;
    }

    public BigInteger getDouaneTotal() {
        return douaneTotal;
    }

    public void setDouaneTotal(BigInteger douaneTotal) {
        this.douaneTotal = douaneTotal;
    }

    public BigInteger getCongoTerminalPlein() {
        return congoTerminalPlein;
    }

    public void setCongoTerminalPlein(BigInteger congoTerminalPlein) {
        this.congoTerminalPlein = congoTerminalPlein;
    }

    public BigInteger getCongoTerminalVide() {
        return congoTerminalVide;
    }

    public void setCongoTerminalVide(BigInteger congoTerminalVide) {
        this.congoTerminalVide = congoTerminalVide;
    }

    public BigInteger getCongoTerminalTotal() {
        return congoTerminalTotal;
    }

    public void setCongoTerminalTotal(BigInteger congoTerminalTotal) {
        this.congoTerminalTotal = congoTerminalTotal;
    }
    
}
