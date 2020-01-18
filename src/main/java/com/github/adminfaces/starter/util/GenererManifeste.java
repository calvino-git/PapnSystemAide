
package com.github.adminfaces.starter.util;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour genererManifeste complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="genererManifeste">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://interf/}inputReferenceGetManifest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "genererManifeste", propOrder = {
    "arg0"
})
public class GenererManifeste {

    protected InputReferenceGetManifest arg0;

    /**
     * Obtient la valeur de la propri�t� arg0.
     * 
     * @return
     *     possible object is
     *     {@link InputReferenceGetManifest }
     *     
     */
    public InputReferenceGetManifest getArg0() {
        return arg0;
    }

    /**
     * D�finit la valeur de la propri�t� arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link InputReferenceGetManifest }
     *     
     */
    public void setArg0(InputReferenceGetManifest value) {
        this.arg0 = value;
    }

}