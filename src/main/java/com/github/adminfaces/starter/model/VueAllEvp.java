/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.model;

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
@Table(name = "VUE_ALL_EVP", catalog = "", schema = "PPNCARGO")
@Immutable
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VueAllEvp.findAll", query = "SELECT v FROM VueAllEvp v"),
    @NamedQuery(name = "VueAllEvp.findByDepartEff", query = "SELECT v FROM VueAllEvp v WHERE v.departEff = :departEff"),
    @NamedQuery(name = "VueAllEvp.findByNavire", query = "SELECT v FROM VueAllEvp v WHERE v.navire = :navire"),
    @NamedQuery(name = "VueAllEvp.findByEscale", query = "SELECT v FROM VueAllEvp v WHERE v.escale = :escale"),
    @NamedQuery(name = "VueAllEvp.findByMouvement", query = "SELECT v FROM VueAllEvp v WHERE v.mouvement = :mouvement"),
    @NamedQuery(name = "VueAllEvp.findByTrafic", query = "SELECT v FROM VueAllEvp v WHERE v.trafic = :trafic"),
    @NamedQuery(name = "VueAllEvp.findBySource", query = "SELECT v FROM VueAllEvp v WHERE v.source = :source"),
    @NamedQuery(name = "VueAllEvp.findByPlein", query = "SELECT v FROM VueAllEvp v WHERE v.plein = :plein"),
    @NamedQuery(name = "VueAllEvp.findByVide", query = "SELECT v FROM VueAllEvp v WHERE v.vide = :vide"),
    @NamedQuery(name = "VueAllEvp.findByTotalEvp", query = "SELECT v FROM VueAllEvp v WHERE v.totalEvp = :totalEvp")})
public class VueAllEvp implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name="id")
    private Integer id;
    @Size(max = 8)
    @Column(name = "DEPART_EFF")
    private String departEff;
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
    @Size(max = 20)
    @Column(name = "SOURCE")
    private String source;
    @Column(name = "PLEIN")
    private BigInteger plein;
    @Column(name = "VIDE")
    private BigInteger vide;
    @Column(name = "TOTAL_EVP")
    private BigInteger totalEvp;

    public VueAllEvp() {
    }

    public String getDepartEff() {
        return departEff;
    }

    public void setDepartEff(String departEff) {
        this.departEff = departEff;
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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public BigInteger getPlein() {
        return plein;
    }

    public void setPlein(BigInteger plein) {
        this.plein = plein;
    }

    public BigInteger getVide() {
        return vide;
    }

    public void setVide(BigInteger vide) {
        this.vide = vide;
    }

    public BigInteger getTotalEvp() {
        return totalEvp;
    }

    public void setTotalEvp(BigInteger totalEvp) {
        this.totalEvp = totalEvp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
}
