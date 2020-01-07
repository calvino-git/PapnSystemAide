
package com.github.adminfaces.starter.util;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour inputReferenceGetManifest complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="inputReferenceGetManifest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numEnreg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numVoy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateDepart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inputReferenceGetManifest", propOrder = {
    "numEnreg",
    "numVoy",
    "dateDepart"
})
public class InputReferenceGetManifest {

    @XmlElement(required = true)
    protected String numEnreg;
    @XmlElement(required = true)
    protected String numVoy;
    @XmlElement(required = true)
    protected String dateDepart;

    /**
     * Obtient la valeur de la propri�t� numEnreg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumEnreg() {
        return numEnreg;
    }

    /**
     * D�finit la valeur de la propri�t� numEnreg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumEnreg(String value) {
        this.numEnreg = value;
    }

    /**
     * Obtient la valeur de la propri�t� numVoy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumVoy() {
        return numVoy;
    }

    /**
     * D�finit la valeur de la propri�t� numVoy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumVoy(String value) {
        this.numVoy = value;
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

}
