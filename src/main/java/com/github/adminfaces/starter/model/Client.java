/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.model;

import com.github.adminfaces.persistence.model.BaseEntity;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrateur
 */
@Entity
@Table(name = "CLIENT", schema = "PPNCARGO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Client.findAll", query = "SELECT c FROM Client c"),
    @NamedQuery(name = "Client.findByCode", query = "SELECT c FROM Client c WHERE c.code = :code"),
    @NamedQuery(name = "Client.findByLibelle", query = "SELECT c FROM Client c WHERE c.libelle = :libelle"),
    @NamedQuery(name = "Client.findBySociete", query = "SELECT c FROM Client c WHERE c.societe = :societe"),
    @NamedQuery(name = "Client.findByAdresse1", query = "SELECT c FROM Client c WHERE c.adresse1 = :adresse1"),
    @NamedQuery(name = "Client.findByAdresse2", query = "SELECT c FROM Client c WHERE c.adresse2 = :adresse2"),
    @NamedQuery(name = "Client.findByVille", query = "SELECT c FROM Client c WHERE c.ville = :ville"),
    @NamedQuery(name = "Client.findByLepays", query = "SELECT c FROM Client c WHERE c.lepays = :lepays")})
public class Client extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "CODE")
    private String code;
    @Size(max = 50)
    @Column(name = "LIBELLE")
    private String libelle;
    @Size(max = 35)
    @Column(name = "SOCIETE")
    private String societe;
    @Size(max = 35)
    @Column(name = "ADRESSE1")
    private String adresse1;
    @Size(max = 35)
    @Column(name = "ADRESSE2")
    private String adresse2;
    @Size(max = 30)
    @Column(name = "VILLE")
    private String ville;
    @Size(max = 17)
    @Column(name = "LEPAYS")
    private String lepays;
    @OneToMany(mappedBy = "client")
    private List<Reglement> reglements;

    public Client() {
    }

    public Client(String code) {
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

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return libelle;
    }

    public List<Reglement> getReglements() {
        return reglements;
    }

    public void setReglements(List<Reglement> reglements) {
        this.reglements = reglements;
    }

    @Override
    public String getId() {
        return code;
    }
    
}
