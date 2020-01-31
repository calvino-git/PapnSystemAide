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
public class DocumentEVP implements Serializable, Comparable<DocumentEVP> {
 
    private String departEff;
    private String navire;
    private String escale;
    private String trafic;
    private String source;
    private String plein;
    private String vide;
    private String totalEvp;

    public DocumentEVP() {
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DocumentEVP other = (DocumentEVP) obj;
        if (departEff == null) {
            if (other.departEff != null)
                return false;
        } else if (!departEff.equals(other.departEff))
            return false;
        if (navire == null) {
            if (other.navire != null)
                return false;
        } else if (!navire.equals(other.navire))
            return false;
        if (trafic == null) {
            if (other.trafic != null)
                return false;
        } else if (!trafic.equals(other.trafic))
            return false;
        if (source == null) {
            if (other.source != null)
                return false;
        } else if (!source.equals(other.source))
            return false;
        return true;
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

    public String getPlein() {
        return plein;
    }

    public void setPlein(String plein) {
        this.plein = plein;
    }

    public String getVide() {
        return vide;
    }

    public void setVide(String vide) {
        this.vide = vide;
    }

    public String getTotalEvp() {
        return totalEvp;
    }

    public void setTotalEvp(String totalEvp) {
        this.totalEvp = totalEvp;
    }

    public DocumentEVP(String departEff, String navire, String escale, String trafic, String source, String plein, String vide, String totalEvp) {
        this.departEff = departEff;
        this.navire = navire;
        this.escale = escale;
        this.trafic = trafic;
        this.source = source;
        this.plein = plein;
        this.vide = vide;
        this.totalEvp = totalEvp;
    }

    @Override
    public int compareTo(DocumentEVP o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}