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
 * @author 60610H
 */
@Entity
@Table(name = "CONTAINER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Container.findAll", query = "SELECT c FROM Container c"),
    @NamedQuery(name = "Container.findByIdCtn", query = "SELECT c FROM Container c WHERE c.idCtn = :idCtn"),
    @NamedQuery(name = "Container.findByCtnReference", query = "SELECT c FROM Container c WHERE c.ctnReference = :ctnReference"),
    @NamedQuery(name = "Container.findByEmptyFull", query = "SELECT c FROM Container c WHERE c.emptyFull = :emptyFull"),
    @NamedQuery(name = "Container.findByEmptyWeight", query = "SELECT c FROM Container c WHERE c.emptyWeight = :emptyWeight"),
    @NamedQuery(name = "Container.findByGoodsWeight", query = "SELECT c FROM Container c WHERE c.goodsWeight = :goodsWeight"),
    @NamedQuery(name = "Container.findByIdBol", query = "SELECT c FROM Container c WHERE c.idBol = :idBol"),
    @NamedQuery(name = "Container.findByMarks1", query = "SELECT c FROM Container c WHERE c.marks1 = :marks1"),
    @NamedQuery(name = "Container.findByMarks2", query = "SELECT c FROM Container c WHERE c.marks2 = :marks2"),
    @NamedQuery(name = "Container.findByMarks3", query = "SELECT c FROM Container c WHERE c.marks3 = :marks3"),
    @NamedQuery(name = "Container.findByNumberOfPackages", query = "SELECT c FROM Container c WHERE c.numberOfPackages = :numberOfPackages"),
    @NamedQuery(name = "Container.findBySealingParty", query = "SELECT c FROM Container c WHERE c.sealingParty = :sealingParty"),
    @NamedQuery(name = "Container.findByTypeOfContainer", query = "SELECT c FROM Container c WHERE c.typeOfContainer = :typeOfContainer")})
public class Container implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CTN")
    private Long idCtn;
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
    
    @JoinColumn(name = "ID_GENERAL", referencedColumnName = "ID")
    @ManyToOne
    private BillOfLanding idBol;

    public Container() {
    }

    public Container(Long idCtn) {
        this.idCtn = idCtn;
    }

    public Long getIdCtn() {
        return idCtn;
    }

    public void setIdCtn(Long idCtn) {
        this.idCtn = idCtn;
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

    public BillOfLanding getIdBol() {
        return idBol;
    }

    public void setIdBol(BillOfLanding idBol) {
        this.idBol = idBol;
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
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCtn != null ? idCtn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Container)) {
            return false;
        }
        Container other = (Container) object;
        if ((this.idCtn == null && other.idCtn != null) || (this.idCtn != null && !this.idCtn.equals(other.idCtn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.adminfaces.starter.model.Container[ idCtn=" + idCtn + " ]";
    }
    
}
