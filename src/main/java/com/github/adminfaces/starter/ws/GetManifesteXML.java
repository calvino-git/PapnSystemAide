
package com.github.adminfaces.starter.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getManifesteXML complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getManifesteXML">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="debut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trafic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getManifesteXML1", propOrder = {
    "debut",
    "fin",
    "trafic"
})
public class GetManifesteXML {

    protected String debut;
    protected String fin;
    protected String trafic;

    /**
     * Obtient la valeur de la propriété debut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebut() {
        return debut;
    }

    /**
     * Définit la valeur de la propriété debut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebut(String value) {
        this.debut = value;
    }

    /**
     * Obtient la valeur de la propriété fin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFin() {
        return fin;
    }

    /**
     * Définit la valeur de la propriété fin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFin(String value) {
        this.fin = value;
    }

    /**
     * Obtient la valeur de la propriété trafic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrafic() {
        return trafic;
    }

    /**
     * Définit la valeur de la propriété trafic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrafic(String value) {
        this.trafic = value;
    }

}
