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
@Table(name = "MV_TRAFIC_MARCH", catalog = "", schema = "DSIPAPN")
public class TraficMarchandise extends BaseEntity {

    /**
     * @return the id
     */
    @Override
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the dateDepart
     */
    public String getDateDepart() {
        return dateDepart;
    }

    /**
     * @param dateDepart the dateDepart to set
     */
    public void setDateDepart(String dateDepart) {
        this.dateDepart = dateDepart;
    }

    /**
     * @return the dateArrivee
     */
    public String getDateArrivee() {
        return dateArrivee;
    }

    /**
     * @param dateArrivee the dateArrivee to set
     */
    public void setDateArrivee(String dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    /**
     * @return the colis
     */
    public String getColis() {
        return colis;
    }

    /**
     * @param colis the colis to set
     */
    public void setColis(String colis) {
        this.colis = colis;
    }

    /**
     * @return the secteur
     */
    public String getSecteur() {
        return secteur;
    }

    /**
     * @param secteur the secteur to set
     */
    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    /**
     * @return the poids
     */
    public Double getPoids() {
        return poids;
    }

    /**
     * @param poids the poids to set
     */
    public void setPoids(Double poids) {
        this.poids = poids;
    }

    /**
     * @return the trafic
     */
    public String getTrafic() {
        return trafic;
    }

    /**
     * @param trafic the trafic to set
     */
    public void setTrafic(String trafic) {
        this.trafic = trafic;
    }

    /**
     * @return the condiGroupe
     */
    public String getCondiGroupe() {
        return condiGroupe;
    }

    /**
     * @param condiGroupe the condiGroupe to set
     */
    public void setCondiGroupe(String condiGroupe) {
        this.condiGroupe = condiGroupe;
    }

    /**
     * @return the condi
     */
    public String getCondi() {
        return condi;
    }

    /**
     * @param condi the condi to set
     */
    public void setCondi(String condi) {
        this.condi = condi;
    }

    /**
     * @return the codeMarch
     */
    public String getCodeMarch() {
        return codeMarch;
    }

    /**
     * @param codeMarch the codeMarch to set
     */
    public void setCodeMarch(String codeMarch) {
        this.codeMarch = codeMarch;
    }

    /**
     * @return the libelleMarch
     */
    public String getLibelleMarch() {
        return libelleMarch;
    }

    /**
     * @param libelleMarch the libelleMarch to set
     */
    public void setLibelleMarch(String libelleMarch) {
        this.libelleMarch = libelleMarch;
    }

    /**
     * @return the codeFamille
     */
    public String getCodeFamille() {
        return codeFamille;
    }

    /**
     * @param codeFamille the codeFamille to set
     */
    public void setCodeFamille(String codeFamille) {
        this.codeFamille = codeFamille;
    }

    /**
     * @return the libelleFamille
     */
    public String getLibelleFamille() {
        return libelleFamille;
    }

    /**
     * @param libelleFamille the libelleFamille to set
     */
    public void setLibelleFamille(String libelleFamille) {
        this.libelleFamille = libelleFamille;
    }

    /**
     * @return the groupement
     */
    public String getGroupement() {
        return groupement;
    }

    /**
     * @param groupement the groupement to set
     */
    public void setGroupement(String groupement) {
        this.groupement = groupement;
    }

    /**
     * @return the quGroupe
     */
    public String getQuGroupe() {
        return quGroupe;
    }

    /**
     * @param quGroupe the quGroupe to set
     */
    public void setQuGroupe(String quGroupe) {
        this.quGroupe = quGroupe;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the cdGroupe
     */
    public String getCdGroupe() {
        return cdGroupe;
    }

    /**
     * @param cdGroupe the cdGroupe to set
     */
    public void setCdGroupe(String cdGroupe) {
        this.cdGroupe = cdGroupe;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "DEPART_EFFECTIF")
    private String dateDepart;
    @Column(name = "DATE_PASSE_ENTREE")
    private String dateArrivee;
    @Column(name = "COLIS")
    private String colis;
    @Column(name = "SECTEUR")
    private String secteur;
    @Column(name = "POIDS")
    private Double poids;
    @Column(name = "TRAFIC")
    private String trafic;
    @Column(name = "CONDI_GROUPE")
    private String condiGroupe;
    @Column(name = "CONDI")
    private String condi;
    @Column(name = "CODE_MARCH")
    private String codeMarch;
    @Column(name = "LIBELLE_MARCH")
    private String libelleMarch;
    @Column(name = "CODE_FAMILLE")
    private String codeFamille;
    @Column(name = "LIBELLE_FAMILLE")
    private String libelleFamille;
    @Column(name = "GROUPEMENT")
    private String groupement;
    @Column(name = "QU_GROUPE")
    private String quGroupe;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "CD_GROUPE")
    private String cdGroupe;

    public TraficMarchandise() {
    }

    public TraficMarchandise(Integer id) {
        this.id = id;
    }
    
    

}
