
package com.github.adminfaces.starter.util;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour inputReference complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="inputReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="debut" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inputReference", propOrder = {
    "debut",
    "fin",
    "type"
})
public class InputReference {

    @XmlElement(required = true)
    protected String debut;
    @XmlElement(required = true)
    protected String fin;
    @XmlElement(required = true)
    protected String type;

    /**
     * Obtient la valeur de la propri�t� debut.
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
     * D�finit la valeur de la propri�t� debut.
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
     * Obtient la valeur de la propri�t� fin.
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
     * D�finit la valeur de la propri�t� fin.
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
     * Obtient la valeur de la propri�t� type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * D�finit la valeur de la propri�t� type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
