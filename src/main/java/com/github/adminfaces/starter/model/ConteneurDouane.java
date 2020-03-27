/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.model;

import com.github.adminfaces.persistence.model.BaseEntity;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

/**
 *
 * @author 60610H
 */
@Entity
@Table(name = "VUE_CONTENEUR_DOUANE")
@Immutable
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConteneurDouane.findAll", query = "SELECT v FROM ConteneurDouane v"),
    @NamedQuery(name = "ConteneurDouane.findById", query = "SELECT v FROM ConteneurDouane v WHERE v.id = :id"),
    @NamedQuery(name = "ConteneurDouane.findByDate", query = "SELECT v FROM ConteneurDouane v WHERE v.date = :date"),
    @NamedQuery(name = "ConteneurDouane.findByMois", query = "SELECT v FROM ConteneurDouane v WHERE v.mois = :mois"),
    @NamedQuery(name = "ConteneurDouane.findByNumero", query = "SELECT v FROM ConteneurDouane v WHERE v.numero = :numero"),
    @NamedQuery(name = "ConteneurDouane.findByType", query = "SELECT v FROM ConteneurDouane v WHERE v.type = :type"),
    @NamedQuery(name = "ConteneurDouane.findByPoids", query = "SELECT v FROM ConteneurDouane v WHERE v.poids = :poids"),
    @NamedQuery(name = "ConteneurDouane.findByPv", query = "SELECT v FROM ConteneurDouane v WHERE v.pv = :pv"),
    @NamedQuery(name = "ConteneurDouane.findByTrafic", query = "SELECT v FROM ConteneurDouane v WHERE v.trafic = :trafic"),
    @NamedQuery(name = "ConteneurDouane.findByNavire", query = "SELECT v FROM ConteneurDouane v WHERE v.navire = :navire"),
    @NamedQuery(name = "ConteneurDouane.findByVoyage", query = "SELECT v FROM ConteneurDouane v WHERE v.voyage = :voyage"),
    @NamedQuery(name = "ConteneurDouane.findByPol", query = "SELECT v FROM ConteneurDouane v WHERE v.pol = :pol"),
    @NamedQuery(name = "ConteneurDouane.findByPod", query = "SELECT v FROM ConteneurDouane v WHERE v.pod = :pod")})
public class ConteneurDouane extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "ID")
    @Id
    private Integer id;
    @Size(max = 10)
    @Column(name = "DAT")
    private Date date;
    @Size(max = 6)
    @Column(name = "MOIS")
    private String mois;
    @Size(max = 255)
    @Column(name = "NUMERO")
    private String numero;
    @Size(max = 255)
    @Column(name = "TYPE")
    private String type;
    @Size(max = 20)
    @Column(name = "POIDS")
    private String poids;
    @Size(max = 5)
    @Column(name = "PV")
    private String pv;
    @Size(max = 255)
    @Column(name = "TRAFIC")
    private String trafic;
    @Size(max = 40)
    @Column(name = "NAVIRE")
    private String navire;
    @Size(max = 12)
    @Column(name = "VOYAGE")
    private String voyage;
    @Size(max = 255)
    @Column(name = "POL")
    private String pol;
    @Size(max = 255)
    @Column(name = "POD")
    private String pod;

    public ConteneurDouane() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMois() {
        return mois;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPoids() {
        return poids;
    }

    public void setPoids(String poids) {
        this.poids = poids;
    }

    public String getPv() {
        return pv;
    }

    public void setPv(String pv) {
        this.pv = pv;
    }

    public String getTrafic() {
        return trafic;
    }

    public void setTrafic(String trafic) {
        this.trafic = trafic;
    }

    public String getNavire() {
        return navire;
    }

    public void setNavire(String navire) {
        this.navire = navire;
    }

    public String getVoyage() {
        return voyage;
    }

    public void setVoyage(String voyage) {
        this.voyage = voyage;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public String getPod() {
        return pod;
    }

    public void setPod(String pod) {
        this.pod = pod;
    }
    
    public boolean hasNavire() {
        return navire != null && !"".equals(navire.trim());    }

    public boolean hasTrafic() {
       return trafic != null && !"".equals(trafic.trim());    }
    public boolean hasDate() {
       return date != null ;    }
    
    
}
