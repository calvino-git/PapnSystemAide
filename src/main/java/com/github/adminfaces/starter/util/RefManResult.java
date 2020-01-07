
package com.github.adminfaces.starter.util;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour refManResult complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="refManResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://interf/}webServiceResult">
 *       &lt;sequence>
 *         &lt;element name="instance_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bureau_douane" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numero_voyage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date_depart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="annee_enregistrement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numero_enregistrement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date_enregistrement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date_arrivee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="code_transporteur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nom_transporteur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="navire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lieu_chargement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refManResult", propOrder = {
    "instanceId",
    "bureauDouane",
    "numeroVoyage",
    "dateDepart",
    "anneeEnregistrement",
    "numeroEnregistrement",
    "dateEnregistrement",
    "dateArrivee",
    "codeTransporteur",
    "nomTransporteur",
    "navire",
    "lieuChargement"
})
public class RefManResult
    extends WebServiceResult
{

    @XmlElement(name = "instance_id")
    protected String instanceId;
    @XmlElement(name = "bureau_douane")
    protected String bureauDouane;
    @XmlElement(name = "numero_voyage")
    protected String numeroVoyage;
    @XmlElement(name = "date_depart")
    protected String dateDepart;
    @XmlElement(name = "annee_enregistrement")
    protected String anneeEnregistrement;
    @XmlElement(name = "numero_enregistrement")
    protected String numeroEnregistrement;
    @XmlElement(name = "date_enregistrement")
    protected String dateEnregistrement;
    @XmlElement(name = "date_arrivee")
    protected String dateArrivee;
    @XmlElement(name = "code_transporteur")
    protected String codeTransporteur;
    @XmlElement(name = "nom_transporteur")
    protected String nomTransporteur;
    protected String navire;
    @XmlElement(name = "lieu_chargement")
    protected String lieuChargement;

    /**
     * Obtient la valeur de la propri�t� instanceId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * D�finit la valeur de la propri�t� instanceId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceId(String value) {
        this.instanceId = value;
    }

    /**
     * Obtient la valeur de la propri�t� bureauDouane.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBureauDouane() {
        return bureauDouane;
    }

    /**
     * D�finit la valeur de la propri�t� bureauDouane.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBureauDouane(String value) {
        this.bureauDouane = value;
    }

    /**
     * Obtient la valeur de la propri�t� numeroVoyage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroVoyage() {
        return numeroVoyage;
    }

    /**
     * D�finit la valeur de la propri�t� numeroVoyage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroVoyage(String value) {
        this.numeroVoyage = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateDepart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateDepart() {
        return dateDepart;
    }

    /**
     * D�finit la valeur de la propri�t� dateDepart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateDepart(String value) {
        this.dateDepart = value;
    }

    /**
     * Obtient la valeur de la propri�t� anneeEnregistrement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnneeEnregistrement() {
        return anneeEnregistrement;
    }

    /**
     * D�finit la valeur de la propri�t� anneeEnregistrement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnneeEnregistrement(String value) {
        this.anneeEnregistrement = value;
    }

    /**
     * Obtient la valeur de la propri�t� numeroEnregistrement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroEnregistrement() {
        return numeroEnregistrement;
    }

    /**
     * D�finit la valeur de la propri�t� numeroEnregistrement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroEnregistrement(String value) {
        this.numeroEnregistrement = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateEnregistrement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateEnregistrement() {
        return dateEnregistrement;
    }

    /**
     * D�finit la valeur de la propri�t� dateEnregistrement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateEnregistrement(String value) {
        this.dateEnregistrement = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateArrivee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateArrivee() {
        return dateArrivee;
    }

    /**
     * D�finit la valeur de la propri�t� dateArrivee.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateArrivee(String value) {
        this.dateArrivee = value;
    }

    /**
     * Obtient la valeur de la propri�t� codeTransporteur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeTransporteur() {
        return codeTransporteur;
    }

    /**
     * D�finit la valeur de la propri�t� codeTransporteur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeTransporteur(String value) {
        this.codeTransporteur = value;
    }

    /**
     * Obtient la valeur de la propri�t� nomTransporteur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomTransporteur() {
        return nomTransporteur;
    }

    /**
     * D�finit la valeur de la propri�t� nomTransporteur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomTransporteur(String value) {
        this.nomTransporteur = value;
    }

    /**
     * Obtient la valeur de la propri�t� navire.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNavire() {
        return navire;
    }

    /**
     * D�finit la valeur de la propri�t� navire.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNavire(String value) {
        this.navire = value;
    }

    /**
     * Obtient la valeur de la propri�t� lieuChargement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLieuChargement() {
        return lieuChargement;
    }

    /**
     * D�finit la valeur de la propri�t� lieuChargement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLieuChargement(String value) {
        this.lieuChargement = value;
    }

}
