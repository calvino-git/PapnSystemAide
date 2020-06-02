/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.model;

import java.io.Serializable;

/**
 *
 * @author 60610H
 */
public class Document implements Serializable, Comparable<Document> {
 
    private String condition;
     
    private Long tonnage;
     
    private Long montant;
     
    public Document(String condition, Long tonnage, Long montant) {
        this.condition = condition;
        this.tonnage = tonnage;
        this.montant = montant;
    }
 
    public String getCondition() {
        return condition;
    }
 
    public void setCondition(String condition) {
        this.condition = condition;
    }
 
    public Long getTonnage() {
        return tonnage;
    }
 
    public void setTonnage(Long tonnage) {
        this.tonnage = tonnage;
    }
 
    public Long getMontant() {
        return montant;
    }
 
    public void setMontant(Long montant) {
        this.montant = montant;
    }
 
    //Eclipse Generated hashCode and equals
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((condition == null) ? 0 : condition.hashCode());
        result = prime * result + ((tonnage == null) ? 0 : tonnage.hashCode());
        result = prime * result + ((montant == null) ? 0 : montant.hashCode());
        return result;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Document other = (Document) obj;
        if (condition == null) {
            if (other.condition != null)
                return false;
        } else if (!condition.equals(other.condition))
            return false;
        if (tonnage == null) {
            if (other.tonnage != null)
                return false;
        } else if (!tonnage.equals(other.tonnage))
            return false;
        if (montant == null) {
            if (other.montant != null)
                return false;
        } else if (!montant.equals(other.montant))
            return false;
        return true;
    }
 
    @Override
    public String toString() {
        return condition;
    }
 
    @Override
    public int compareTo(Document document) {
        return this.getTonnage().compareTo(document.getTonnage());
    }
}