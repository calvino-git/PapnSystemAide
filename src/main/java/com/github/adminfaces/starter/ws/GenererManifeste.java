
package com.github.adminfaces.starter.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour genererManifeste complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="genererManifeste">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numEnreg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numVoy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateDepart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "genererManifeste1", propOrder = {
    "numEnreg",
    "numVoy",
    "dateDepart"
})
public class GenererManifeste {

    protected String numEnreg;
    protected String numVoy;
    protected String dateDepart;

    /**
     * Obtient la valeur de la propriété numEnreg.
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
     * Définit la valeur de la propriété numEnreg.
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
     * Obtient la valeur de la propriété numVoy.
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
     * Définit la valeur de la propriété numVoy.
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
     * Obtient la valeur de la propriété dateDepart.
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
     * Définit la valeur de la propriété dateDepart.
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
