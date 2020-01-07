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
@Table(name = "AGENT", catalog = "", schema = "PPNCARGO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Agent.findAll", query = "SELECT a FROM Agent a"),
    @NamedQuery(name = "Agent.findByCode", query = "SELECT a FROM Agent a WHERE a.code = :code"),
    @NamedQuery(name = "Agent.findByLibelle", query = "SELECT a FROM Agent a WHERE a.libelle = :libelle"),
    @NamedQuery(name = "Agent.findByGroupe", query = "SELECT a FROM Agent a WHERE a.groupe = :groupe"),
    @NamedQuery(name = "Agent.findByTarif", query = "SELECT a FROM Agent a WHERE a.tarif = :tarif"),
    @NamedQuery(name = "Agent.findByRegle", query = "SELECT a FROM Agent a WHERE a.regle = :regle"),
    @NamedQuery(name = "Agent.findByStatut", query = "SELECT a FROM Agent a WHERE a.statut = :statut"),
    @NamedQuery(name = "Agent.findByCapacite", query = "SELECT a FROM Agent a WHERE a.capacite = :capacite"),
    @NamedQuery(name = "Agent.findByCompte", query = "SELECT a FROM Agent a WHERE a.compte = :compte"),
    @NamedQuery(name = "Agent.findByAdresse1", query = "SELECT a FROM Agent a WHERE a.adresse1 = :adresse1"),
    @NamedQuery(name = "Agent.findByAdresse2", query = "SELECT a FROM Agent a WHERE a.adresse2 = :adresse2"),
    @NamedQuery(name = "Agent.findByPostal", query = "SELECT a FROM Agent a WHERE a.postal = :postal"),
    @NamedQuery(name = "Agent.findByVille", query = "SELECT a FROM Agent a WHERE a.ville = :ville"),
    @NamedQuery(name = "Agent.findByLepays", query = "SELECT a FROM Agent a WHERE a.lepays = :lepays"),
    @NamedQuery(name = "Agent.findByPho", query = "SELECT a FROM Agent a WHERE a.pho = :pho"),
    @NamedQuery(name = "Agent.findByFax", query = "SELECT a FROM Agent a WHERE a.fax = :fax"),
    @NamedQuery(name = "Agent.findByTlx", query = "SELECT a FROM Agent a WHERE a.tlx = :tlx"),
    @NamedQuery(name = "Agent.findByBanque", query = "SELECT a FROM Agent a WHERE a.banque = :banque"),
    @NamedQuery(name = "Agent.findByCBanque", query = "SELECT a FROM Agent a WHERE a.cBanque = :cBanque"),
    @NamedQuery(name = "Agent.findByGuichet", query = "SELECT a FROM Agent a WHERE a.guichet = :guichet"),
    @NamedQuery(name = "Agent.findByActivite", query = "SELECT a FROM Agent a WHERE a.activite = :activite"),
    @NamedQuery(name = "Agent.findByRespons", query = "SELECT a FROM Agent a WHERE a.respons = :respons"),
    @NamedQuery(name = "Agent.findByContact", query = "SELECT a FROM Agent a WHERE a.contact = :contact"),
    @NamedQuery(name = "Agent.findByDelGrl", query = "SELECT a FROM Agent a WHERE a.delGrl = :delGrl"),
    @NamedQuery(name = "Agent.findByRelance", query = "SELECT a FROM Agent a WHERE a.relance = :relance"),
    @NamedQuery(name = "Agent.findByContent", query = "SELECT a FROM Agent a WHERE a.content = :content"),
    @NamedQuery(name = "Agent.findByCA", query = "SELECT a FROM Agent a WHERE a.cA = :cA"),
    @NamedQuery(name = "Agent.findByGestion", query = "SELECT a FROM Agent a WHERE a.gestion = :gestion"),
    @NamedQuery(name = "Agent.findByCreateur", query = "SELECT a FROM Agent a WHERE a.createur = :createur"),
    @NamedQuery(name = "Agent.findByDCreat", query = "SELECT a FROM Agent a WHERE a.dCreat = :dCreat"),
    @NamedQuery(name = "Agent.findByHCreat", query = "SELECT a FROM Agent a WHERE a.hCreat = :hCreat"),
    @NamedQuery(name = "Agent.findByUtilisat", query = "SELECT a FROM Agent a WHERE a.utilisat = :utilisat"),
    @NamedQuery(name = "Agent.findByDModif", query = "SELECT a FROM Agent a WHERE a.dModif = :dModif"),
    @NamedQuery(name = "Agent.findByHModif", query = "SELECT a FROM Agent a WHERE a.hModif = :hModif"),
    @NamedQuery(name = "Agent.findByPhoRespons", query = "SELECT a FROM Agent a WHERE a.phoRespons = :phoRespons"),
    @NamedQuery(name = "Agent.findByGroupeTarifaire1", query = "SELECT a FROM Agent a WHERE a.groupeTarifaire1 = :groupeTarifaire1"),
    @NamedQuery(name = "Agent.findByGroupeTarifaire2", query = "SELECT a FROM Agent a WHERE a.groupeTarifaire2 = :groupeTarifaire2"),
    @NamedQuery(name = "Agent.findByGroupeTarifaire3", query = "SELECT a FROM Agent a WHERE a.groupeTarifaire3 = :groupeTarifaire3"),
    @NamedQuery(name = "Agent.findByGroupeTarifaire4", query = "SELECT a FROM Agent a WHERE a.groupeTarifaire4 = :groupeTarifaire4"),
    @NamedQuery(name = "Agent.findByGroupeTarifaire5", query = "SELECT a FROM Agent a WHERE a.groupeTarifaire5 = :groupeTarifaire5"),
    @NamedQuery(name = "Agent.findByGroupeTarifaire6", query = "SELECT a FROM Agent a WHERE a.groupeTarifaire6 = :groupeTarifaire6"),
    @NamedQuery(name = "Agent.findByGroupeTarifaire7", query = "SELECT a FROM Agent a WHERE a.groupeTarifaire7 = :groupeTarifaire7"),
    @NamedQuery(name = "Agent.findByGroupeTarifaire8", query = "SELECT a FROM Agent a WHERE a.groupeTarifaire8 = :groupeTarifaire8"),
    @NamedQuery(name = "Agent.findByOccursTarifaireASuivre1", query = "SELECT a FROM Agent a WHERE a.occursTarifaireASuivre1 = :occursTarifaireASuivre1"),
    @NamedQuery(name = "Agent.findByOccursTarifaireASuivre2", query = "SELECT a FROM Agent a WHERE a.occursTarifaireASuivre2 = :occursTarifaireASuivre2"),
    @NamedQuery(name = "Agent.findByOccursTarifaireASuivre3", query = "SELECT a FROM Agent a WHERE a.occursTarifaireASuivre3 = :occursTarifaireASuivre3"),
    @NamedQuery(name = "Agent.findByOccursTarifaireASuivre4", query = "SELECT a FROM Agent a WHERE a.occursTarifaireASuivre4 = :occursTarifaireASuivre4"),
    @NamedQuery(name = "Agent.findByOccursTarifaireASuivre5", query = "SELECT a FROM Agent a WHERE a.occursTarifaireASuivre5 = :occursTarifaireASuivre5"),
    @NamedQuery(name = "Agent.findByOccursTarifaireASuivre6", query = "SELECT a FROM Agent a WHERE a.occursTarifaireASuivre6 = :occursTarifaireASuivre6"),
    @NamedQuery(name = "Agent.findByOccursTarifaireASuivre7", query = "SELECT a FROM Agent a WHERE a.occursTarifaireASuivre7 = :occursTarifaireASuivre7"),
    @NamedQuery(name = "Agent.findByOccursTarifaireASuivre8", query = "SELECT a FROM Agent a WHERE a.occursTarifaireASuivre8 = :occursTarifaireASuivre8"),
    @NamedQuery(name = "Agent.findByEMail", query = "SELECT a FROM Agent a WHERE a.eMail = :eMail")})
public class Agent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "CODE")
    private String code;
    @Size(max = 40)
    @Column(name = "LIBELLE")
    private String libelle;
    @Size(max = 8)
    @Column(name = "GROUPE")
    private String groupe;
    @Size(max = 8)
    @Column(name = "TARIF")
    private String tarif;
    @Size(max = 8)
    @Column(name = "REGLE")
    private String regle;
    @Size(max = 8)
    @Column(name = "STATUT")
    private String statut;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CAPACITE")
    private Double capacite;
    @Size(max = 17)
    @Column(name = "COMPTE")
    private String compte;
    @Size(max = 80)
    @Column(name = "ADRESSE1")
    private String adresse1;
    @Size(max = 80)
    @Column(name = "ADRESSE2")
    private String adresse2;
    @Size(max = 5)
    @Column(name = "POSTAL")
    private String postal;
    @Size(max = 17)
    @Column(name = "VILLE")
    private String ville;
    @Size(max = 17)
    @Column(name = "LEPAYS")
    private String lepays;
    @Size(max = 20)
    @Column(name = "PHO")
    private String pho;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 17)
    @Column(name = "FAX")
    private String fax;
    @Size(max = 17)
    @Column(name = "TLX")
    private String tlx;
    @Size(max = 20)
    @Column(name = "BANQUE")
    private String banque;
    @Column(name = "C_BANQUE")
    private BigInteger cBanque;
    @Column(name = "GUICHET")
    private BigInteger guichet;
    @Size(max = 8)
    @Column(name = "ACTIVITE")
    private String activite;
    @Size(max = 20)
    @Column(name = "RESPONS")
    private String respons;
    @Size(max = 8)
    @Column(name = "CONTACT")
    private String contact;
    @Column(name = "DEL_GRL")
    private BigInteger delGrl;
    @Size(max = 8)
    @Column(name = "RELANCE")
    private String relance;
    @Column(name = "CONTENT")
    private BigDecimal content;
    @Column(name = "C_A")
    private BigDecimal cA;
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
    @Size(max = 20)
    @Column(name = "PHO_RESPONS")
    private String phoRespons;
    @Size(max = 8)
    @Column(name = "GROUPE_TARIFAIRE1")
    private String groupeTarifaire1;
    @Size(max = 8)
    @Column(name = "GROUPE_TARIFAIRE2")
    private String groupeTarifaire2;
    @Size(max = 8)
    @Column(name = "GROUPE_TARIFAIRE3")
    private String groupeTarifaire3;
    @Size(max = 8)
    @Column(name = "GROUPE_TARIFAIRE4")
    private String groupeTarifaire4;
    @Size(max = 8)
    @Column(name = "GROUPE_TARIFAIRE5")
    private String groupeTarifaire5;
    @Size(max = 8)
    @Column(name = "GROUPE_TARIFAIRE6")
    private String groupeTarifaire6;
    @Size(max = 8)
    @Column(name = "GROUPE_TARIFAIRE7")
    private String groupeTarifaire7;
    @Size(max = 8)
    @Column(name = "GROUPE_TARIFAIRE8")
    private String groupeTarifaire8;
    @Column(name = "OCCURS_TARIFAIRE_A_SUIVRE1")
    private Short occursTarifaireASuivre1;
    @Column(name = "OCCURS_TARIFAIRE_A_SUIVRE2")
    private Short occursTarifaireASuivre2;
    @Column(name = "OCCURS_TARIFAIRE_A_SUIVRE3")
    private Short occursTarifaireASuivre3;
    @Column(name = "OCCURS_TARIFAIRE_A_SUIVRE4")
    private Short occursTarifaireASuivre4;
    @Column(name = "OCCURS_TARIFAIRE_A_SUIVRE5")
    private Short occursTarifaireASuivre5;
    @Column(name = "OCCURS_TARIFAIRE_A_SUIVRE6")
    private Short occursTarifaireASuivre6;
    @Column(name = "OCCURS_TARIFAIRE_A_SUIVRE7")
    private Short occursTarifaireASuivre7;
    @Column(name = "OCCURS_TARIFAIRE_A_SUIVRE8")
    private Short occursTarifaireASuivre8;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "E_MAIL")
    private String eMail;

    public Agent() {
    }

    public Agent(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public String getTarif() {
        return tarif;
    }

    public void setTarif(String tarif) {
        this.tarif = tarif;
    }

    public String getRegle() {
        return regle;
    }

    public void setRegle(String regle) {
        this.regle = regle;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Double getCapacite() {
        return capacite;
    }

    public void setCapacite(Double capacite) {
        this.capacite = capacite;
    }

    public String getCompte() {
        return compte;
    }

    public void setCompte(String compte) {
        this.compte = compte;
    }

    public String getAdresse1() {
        return adresse1;
    }

    public void setAdresse1(String adresse1) {
        this.adresse1 = adresse1;
    }

    public String getAdresse2() {
        return adresse2;
    }

    public void setAdresse2(String adresse2) {
        this.adresse2 = adresse2;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getLepays() {
        return lepays;
    }

    public void setLepays(String lepays) {
        this.lepays = lepays;
    }

    public String getPho() {
        return pho;
    }

    public void setPho(String pho) {
        this.pho = pho;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getTlx() {
        return tlx;
    }

    public void setTlx(String tlx) {
        this.tlx = tlx;
    }

    public String getBanque() {
        return banque;
    }

    public void setBanque(String banque) {
        this.banque = banque;
    }

    public BigInteger getCBanque() {
        return cBanque;
    }

    public void setCBanque(BigInteger cBanque) {
        this.cBanque = cBanque;
    }

    public BigInteger getGuichet() {
        return guichet;
    }

    public void setGuichet(BigInteger guichet) {
        this.guichet = guichet;
    }

    public String getActivite() {
        return activite;
    }

    public void setActivite(String activite) {
        this.activite = activite;
    }

    public String getRespons() {
        return respons;
    }

    public void setRespons(String respons) {
        this.respons = respons;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public BigInteger getDelGrl() {
        return delGrl;
    }

    public void setDelGrl(BigInteger delGrl) {
        this.delGrl = delGrl;
    }

    public String getRelance() {
        return relance;
    }

    public void setRelance(String relance) {
        this.relance = relance;
    }

    public BigDecimal getContent() {
        return content;
    }

    public void setContent(BigDecimal content) {
        this.content = content;
    }

    public BigDecimal getCA() {
        return cA;
    }

    public void setCA(BigDecimal cA) {
        this.cA = cA;
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

    public String getPhoRespons() {
        return phoRespons;
    }

    public void setPhoRespons(String phoRespons) {
        this.phoRespons = phoRespons;
    }

    public String getGroupeTarifaire1() {
        return groupeTarifaire1;
    }

    public void setGroupeTarifaire1(String groupeTarifaire1) {
        this.groupeTarifaire1 = groupeTarifaire1;
    }

    public String getGroupeTarifaire2() {
        return groupeTarifaire2;
    }

    public void setGroupeTarifaire2(String groupeTarifaire2) {
        this.groupeTarifaire2 = groupeTarifaire2;
    }

    public String getGroupeTarifaire3() {
        return groupeTarifaire3;
    }

    public void setGroupeTarifaire3(String groupeTarifaire3) {
        this.groupeTarifaire3 = groupeTarifaire3;
    }

    public String getGroupeTarifaire4() {
        return groupeTarifaire4;
    }

    public void setGroupeTarifaire4(String groupeTarifaire4) {
        this.groupeTarifaire4 = groupeTarifaire4;
    }

    public String getGroupeTarifaire5() {
        return groupeTarifaire5;
    }

    public void setGroupeTarifaire5(String groupeTarifaire5) {
        this.groupeTarifaire5 = groupeTarifaire5;
    }

    public String getGroupeTarifaire6() {
        return groupeTarifaire6;
    }

    public void setGroupeTarifaire6(String groupeTarifaire6) {
        this.groupeTarifaire6 = groupeTarifaire6;
    }

    public String getGroupeTarifaire7() {
        return groupeTarifaire7;
    }

    public void setGroupeTarifaire7(String groupeTarifaire7) {
        this.groupeTarifaire7 = groupeTarifaire7;
    }

    public String getGroupeTarifaire8() {
        return groupeTarifaire8;
    }

    public void setGroupeTarifaire8(String groupeTarifaire8) {
        this.groupeTarifaire8 = groupeTarifaire8;
    }

    public Short getOccursTarifaireASuivre1() {
        return occursTarifaireASuivre1;
    }

    public void setOccursTarifaireASuivre1(Short occursTarifaireASuivre1) {
        this.occursTarifaireASuivre1 = occursTarifaireASuivre1;
    }

    public Short getOccursTarifaireASuivre2() {
        return occursTarifaireASuivre2;
    }

    public void setOccursTarifaireASuivre2(Short occursTarifaireASuivre2) {
        this.occursTarifaireASuivre2 = occursTarifaireASuivre2;
    }

    public Short getOccursTarifaireASuivre3() {
        return occursTarifaireASuivre3;
    }

    public void setOccursTarifaireASuivre3(Short occursTarifaireASuivre3) {
        this.occursTarifaireASuivre3 = occursTarifaireASuivre3;
    }

    public Short getOccursTarifaireASuivre4() {
        return occursTarifaireASuivre4;
    }

    public void setOccursTarifaireASuivre4(Short occursTarifaireASuivre4) {
        this.occursTarifaireASuivre4 = occursTarifaireASuivre4;
    }

    public Short getOccursTarifaireASuivre5() {
        return occursTarifaireASuivre5;
    }

    public void setOccursTarifaireASuivre5(Short occursTarifaireASuivre5) {
        this.occursTarifaireASuivre5 = occursTarifaireASuivre5;
    }

    public Short getOccursTarifaireASuivre6() {
        return occursTarifaireASuivre6;
    }

    public void setOccursTarifaireASuivre6(Short occursTarifaireASuivre6) {
        this.occursTarifaireASuivre6 = occursTarifaireASuivre6;
    }

    public Short getOccursTarifaireASuivre7() {
        return occursTarifaireASuivre7;
    }

    public void setOccursTarifaireASuivre7(Short occursTarifaireASuivre7) {
        this.occursTarifaireASuivre7 = occursTarifaireASuivre7;
    }

    public Short getOccursTarifaireASuivre8() {
        return occursTarifaireASuivre8;
    }

    public void setOccursTarifaireASuivre8(Short occursTarifaireASuivre8) {
        this.occursTarifaireASuivre8 = occursTarifaireASuivre8;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agent)) {
            return false;
        }
        Agent other = (Agent) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.adminfaces.starter.model.Agent[ code=" + code + " ]";
    }
    
}
