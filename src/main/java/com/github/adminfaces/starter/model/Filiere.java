/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.model;

import com.github.adminfaces.persistence.model.BaseEntity;

import javax.persistence.*;

/**
 * @author rmpestano
 */
@Entity
@Table(name = "FILIERE")
public class Filiere extends BaseEntity {

    @Id
    @Column(name = "code")
    private String code;

    @Column(name = "libelle")
    private String libelle;

    public Filiere() {
    }

    public Filiere(String id) {
        this.code = id;
    }
    @Override
    public String getId() {
        return code;
    }


    public boolean hasCode() {
        return code != null && !"".equals(code.trim());
    }

    public boolean hasLibelle() {
        return libelle != null && !"".equals(libelle.trim());
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
}
