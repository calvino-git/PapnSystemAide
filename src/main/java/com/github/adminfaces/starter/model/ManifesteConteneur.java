/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.model;

import java.io.Serializable;
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
 * @author Administrateur
 */
@Entity
@Table(name = "MANIFESTE_CONTENEUR", catalog = "", schema = "DSIPAPN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ManifesteConteneur.findAll", query = "SELECT m FROM ManifesteConteneur m"),
    @NamedQuery(name = "ManifesteConteneur.findById", query = "SELECT m FROM ManifesteConteneur m WHERE m.id = :id"),
    @NamedQuery(name = "ManifesteConteneur.findByCtnReference", query = "SELECT m FROM ManifesteConteneur m WHERE m.ctnReference = :ctnReference"),
    @NamedQuery(name = "ManifesteConteneur.findByEmptyFull", query = "SELECT m FROM ManifesteConteneur m WHERE m.emptyFull = :emptyFull"),
    @NamedQuery(name = "ManifesteConteneur.findByEmptyWeight", query = "SELECT m FROM ManifesteConteneur m WHERE m.emptyWeight = :emptyWeight"),
    @NamedQuery(name = "ManifesteConteneur.findByGoodsWeight", query = "SELECT m FROM ManifesteConteneur m WHERE m.goodsWeight = :goodsWeight"),
    @NamedQuery(name = "ManifesteConteneur.findByMarks1", query = "SELECT m FROM ManifesteConteneur m WHERE m.marks1 = :marks1"),
    @NamedQuery(name = "ManifesteConteneur.findByMarks2", query = "SELECT m FROM ManifesteConteneur m WHERE m.marks2 = :marks2"),
    @NamedQuery(name = "ManifesteConteneur.findByMarks3", query = "SELECT m FROM ManifesteConteneur m WHERE m.marks3 = :marks3"),
    @NamedQuery(name = "ManifesteConteneur.findByNumberOfPackages", query = "SELECT m FROM ManifesteConteneur m WHERE m.numberOfPackages = :numberOfPackages"),
    @NamedQuery(name = "ManifesteConteneur.findBySealingParty", query = "SELECT m FROM ManifesteConteneur m WHERE m.sealingParty = :sealingParty"),
    @NamedQuery(name = "ManifesteConteneur.findByTypeOfContainer", query = "SELECT m FROM ManifesteConteneur m WHERE m.typeOfContainer = :typeOfContainer")})
public class ManifesteConteneur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Size(max = 255)
    @Column(name = "CTN_REFERENCE")
    private String ctnReference;
    @Size(max = 255)
    @Column(name = "EMPTY_FULL")
    private String emptyFull;
    @Size(max = 20)
    @Column(name = "EMPTY_WEIGHT")
    private String emptyWeight;
    @Size(max = 20)
    @Column(name = "GOODS_WEIGHT")
    private String goodsWeight;
    @Size(max = 255)
    @Column(name = "MARKS1")
    private String marks1;
    @Size(max = 255)
    @Column(name = "MARKS2")
    private String marks2;
    @Size(max = 255)
    @Column(name = "MARKS3")
    private String marks3;
    @Size(max = 20)
    @Column(name = "NUMBER_OF_PACKAGES")
    private String numberOfPackages;
    @Size(max = 255)
    @Column(name = "SEALING_PARTY")
    private String sealingParty;
    @Size(max = 255)
    @Column(name = "TYPE_OF_CONTAINER")
    private String typeOfContainer;
    @JoinColumn(name = "ID_BL", referencedColumnName = "ID")
    @ManyToOne
    private ManifesteBl idBl;

    public ManifesteConteneur() {
    }

    public ManifesteConteneur(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCtnReference() {
        return ctnReference;
    }

    public void setCtnReference(String ctnReference) {
        this.ctnReference = ctnReference;
    }

    public String getEmptyFull() {
        return emptyFull;
    }

    public void setEmptyFull(String emptyFull) {
        this.emptyFull = emptyFull;
    }

    public String getEmptyWeight() {
        return emptyWeight;
    }

    public void setEmptyWeight(String emptyWeight) {
        this.emptyWeight = emptyWeight;
    }

    public String getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(String goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    public String getMarks1() {
        return marks1;
    }

    public void setMarks1(String marks1) {
        this.marks1 = marks1;
    }

    public String getMarks2() {
        return marks2;
    }

    public void setMarks2(String marks2) {
        this.marks2 = marks2;
    }

    public String getMarks3() {
        return marks3;
    }

    public void setMarks3(String marks3) {
        this.marks3 = marks3;
    }

    public String getNumberOfPackages() {
        return numberOfPackages;
    }

    public void setNumberOfPackages(String numberOfPackages) {
        this.numberOfPackages = numberOfPackages;
    }

    public String getSealingParty() {
        return sealingParty;
    }

    public void setSealingParty(String sealingParty) {
        this.sealingParty = sealingParty;
    }

    public String getTypeOfContainer() {
        return typeOfContainer;
    }

    public void setTypeOfContainer(String typeOfContainer) {
        this.typeOfContainer = typeOfContainer;
    }

    public ManifesteBl getIdBl() {
        return idBl;
    }

    public void setIdBl(ManifesteBl idBl) {
        this.idBl = idBl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ManifesteConteneur)) {
            return false;
        }
        ManifesteConteneur other = (ManifesteConteneur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.adminfaces.starter.model.ManifesteConteneur[ id=" + id + " ]";
    }
    
}
