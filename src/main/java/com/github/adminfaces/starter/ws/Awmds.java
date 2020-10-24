
package com.github.adminfaces.starter.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="General_segment">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="General_segment_id">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Customs_office_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Voyage_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Date_of_departure" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Date_of_arrival" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Time_of_arrival" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *                             &lt;element name="Date_of_last_discharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Totals_segment">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Total_number_of_bols" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Total_number_of_packages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Total_number_of_containers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Total_gross_mass" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Transport_information">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Carrier">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Carrier_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Carrier_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Carrier_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Shipping_Agent" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Shipping_Agent_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Shipping_Agent_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Mode_of_transport_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Identity_of_transporter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Nationality_of_transporter_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Place_of_transporter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Registration_number_of_transport_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Date_of_registration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Master_information" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Load_unload_place">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Place_of_departure_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Place_of_destination_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Tonnage" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Tonnage_net_weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                             &lt;element name="Tonnage_gross_weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Attached_Document" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Attached_document_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Attached_document_filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Attached_document_content" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Bol_segment" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Bol_id">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Bol_reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Line_number">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Bol_nature" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Bol_type_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Master_bol_ref_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Unique_carrier_reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Load_unload_place">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Place_of_loading_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Place_of_unloading_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Traders_segment">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Exporter">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Exporter_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Exporter_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Exporter_address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Notify">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Notify_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Notify_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Notify_address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Consignee">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Consignee_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Consignee_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Consignee_address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ctn_segment" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Ctn_reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Number_of_packages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Type_of_container" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Empty_Full" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Marks1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Marks2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Marks3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Sealing_Party" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Empty_weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Goods_weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Goods_segment">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Number_of_packages" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                             &lt;element name="Package_type_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Gross_mass" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                             &lt;element name="Shipping_marks" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Goods_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Seals_segment" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Number_of_seals" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="Marks_of_seals" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Sealing_party_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Volume_in_cubic_meters" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Num_of_ctn_for_this_bol" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Information" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Split_segment" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Number_of_packages" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                             &lt;element name="Package_type_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Gross_mass" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                             &lt;element name="Shipping_marks" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Goods_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Container" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Unloaded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Value_segment">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Freight_segment" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PC_indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Freight_value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                       &lt;element name="Freight_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Customs_segment" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Customs_value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                       &lt;element name="Customs_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Insurance_segment" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Insurance_value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                       &lt;element name="Insurance_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Transport_segment" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Transport_value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                       &lt;element name="Transport_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Location" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Location_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Location_info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "generalSegment",
    "bolSegment"
})
@XmlRootElement(name = "Awmds")
public class Awmds {

    @XmlElement(name = "General_segment", required = true)
    protected Awmds.GeneralSegment generalSegment;
    @XmlElement(name = "Bol_segment", required = true)
    protected List<Awmds.BolSegment> bolSegment;

    /**
     * Obtient la valeur de la propriété generalSegment.
     * 
     * @return
     *     possible object is
     *     {@link Awmds.GeneralSegment }
     *     
     */
    public Awmds.GeneralSegment getGeneralSegment() {
        return generalSegment;
    }

    /**
     * Définit la valeur de la propriété generalSegment.
     * 
     * @param value
     *     allowed object is
     *     {@link Awmds.GeneralSegment }
     *     
     */
    public void setGeneralSegment(Awmds.GeneralSegment value) {
        this.generalSegment = value;
    }

    /**
     * Gets the value of the bolSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bolSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBolSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Awmds.BolSegment }
     * 
     * 
     */
    public List<Awmds.BolSegment> getBolSegment() {
        if (bolSegment == null) {
            bolSegment = new ArrayList<Awmds.BolSegment>();
        }
        return this.bolSegment;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Bol_id">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Bol_reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Line_number">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Bol_nature" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Bol_type_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Master_bol_ref_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Unique_carrier_reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Load_unload_place">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Place_of_loading_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Place_of_unloading_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Traders_segment">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Exporter">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Exporter_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Exporter_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Exporter_address" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Notify">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Notify_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Notify_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Notify_address" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Consignee">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Consignee_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Consignee_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Consignee_address" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ctn_segment" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Ctn_reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Number_of_packages" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="Type_of_container" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Empty_Full" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Marks1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Marks2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Marks3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Sealing_Party" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Empty_weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Goods_weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Goods_segment">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Number_of_packages" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                   &lt;element name="Package_type_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Gross_mass" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                   &lt;element name="Shipping_marks" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Goods_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Seals_segment" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Number_of_seals" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="Marks_of_seals" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Sealing_party_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Volume_in_cubic_meters" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="Num_of_ctn_for_this_bol" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="Information" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Split_segment" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Number_of_packages" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                   &lt;element name="Package_type_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Gross_mass" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                   &lt;element name="Shipping_marks" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Goods_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Container" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Unloaded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Value_segment">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Freight_segment" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PC_indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Freight_value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                             &lt;element name="Freight_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Customs_segment" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Customs_value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                             &lt;element name="Customs_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Insurance_segment" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Insurance_value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                             &lt;element name="Insurance_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Transport_segment" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Transport_value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                             &lt;element name="Transport_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Location" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Location_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Location_info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bolId",
        "loadUnloadPlace",
        "tradersSegment",
        "ctnSegment",
        "goodsSegment",
        "splitSegment",
        "valueSegment",
        "location"
    })
    public static class BolSegment {

        @XmlElement(name = "Bol_id", required = true)
        protected Awmds.BolSegment.BolId bolId;
        @XmlElement(name = "Load_unload_place", required = true)
        protected Awmds.BolSegment.LoadUnloadPlace loadUnloadPlace;
        @XmlElement(name = "Traders_segment", required = true)
        protected Awmds.BolSegment.TradersSegment tradersSegment;
        @XmlElement(name = "ctn_segment")
        protected List<Awmds.BolSegment.CtnSegment> ctnSegment;
        @XmlElement(name = "Goods_segment", required = true)
        protected Awmds.BolSegment.GoodsSegment goodsSegment;
        @XmlElement(name = "Split_segment")
        protected List<Awmds.BolSegment.SplitSegment> splitSegment;
        @XmlElement(name = "Value_segment", required = true)
        protected Awmds.BolSegment.ValueSegment valueSegment;
        @XmlElement(name = "Location")
        protected Awmds.BolSegment.Location location;

        /**
         * Obtient la valeur de la propriété bolId.
         * 
         * @return
         *     possible object is
         *     {@link Awmds.BolSegment.BolId }
         *     
         */
        public Awmds.BolSegment.BolId getBolId() {
            return bolId;
        }

        /**
         * Définit la valeur de la propriété bolId.
         * 
         * @param value
         *     allowed object is
         *     {@link Awmds.BolSegment.BolId }
         *     
         */
        public void setBolId(Awmds.BolSegment.BolId value) {
            this.bolId = value;
        }

        /**
         * Obtient la valeur de la propriété loadUnloadPlace.
         * 
         * @return
         *     possible object is
         *     {@link Awmds.BolSegment.LoadUnloadPlace }
         *     
         */
        public Awmds.BolSegment.LoadUnloadPlace getLoadUnloadPlace() {
            return loadUnloadPlace;
        }

        /**
         * Définit la valeur de la propriété loadUnloadPlace.
         * 
         * @param value
         *     allowed object is
         *     {@link Awmds.BolSegment.LoadUnloadPlace }
         *     
         */
        public void setLoadUnloadPlace(Awmds.BolSegment.LoadUnloadPlace value) {
            this.loadUnloadPlace = value;
        }

        /**
         * Obtient la valeur de la propriété tradersSegment.
         * 
         * @return
         *     possible object is
         *     {@link Awmds.BolSegment.TradersSegment }
         *     
         */
        public Awmds.BolSegment.TradersSegment getTradersSegment() {
            return tradersSegment;
        }

        /**
         * Définit la valeur de la propriété tradersSegment.
         * 
         * @param value
         *     allowed object is
         *     {@link Awmds.BolSegment.TradersSegment }
         *     
         */
        public void setTradersSegment(Awmds.BolSegment.TradersSegment value) {
            this.tradersSegment = value;
        }

        /**
         * Gets the value of the ctnSegment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ctnSegment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCtnSegment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Awmds.BolSegment.CtnSegment }
         * 
         * 
         */
        public List<Awmds.BolSegment.CtnSegment> getCtnSegment() {
            if (ctnSegment == null) {
                ctnSegment = new ArrayList<Awmds.BolSegment.CtnSegment>();
            }
            return this.ctnSegment;
        }

        /**
         * Obtient la valeur de la propriété goodsSegment.
         * 
         * @return
         *     possible object is
         *     {@link Awmds.BolSegment.GoodsSegment }
         *     
         */
        public Awmds.BolSegment.GoodsSegment getGoodsSegment() {
            return goodsSegment;
        }

        /**
         * Définit la valeur de la propriété goodsSegment.
         * 
         * @param value
         *     allowed object is
         *     {@link Awmds.BolSegment.GoodsSegment }
         *     
         */
        public void setGoodsSegment(Awmds.BolSegment.GoodsSegment value) {
            this.goodsSegment = value;
        }

        /**
         * Gets the value of the splitSegment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the splitSegment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSplitSegment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Awmds.BolSegment.SplitSegment }
         * 
         * 
         */
        public List<Awmds.BolSegment.SplitSegment> getSplitSegment() {
            if (splitSegment == null) {
                splitSegment = new ArrayList<Awmds.BolSegment.SplitSegment>();
            }
            return this.splitSegment;
        }

        /**
         * Obtient la valeur de la propriété valueSegment.
         * 
         * @return
         *     possible object is
         *     {@link Awmds.BolSegment.ValueSegment }
         *     
         */
        public Awmds.BolSegment.ValueSegment getValueSegment() {
            return valueSegment;
        }

        /**
         * Définit la valeur de la propriété valueSegment.
         * 
         * @param value
         *     allowed object is
         *     {@link Awmds.BolSegment.ValueSegment }
         *     
         */
        public void setValueSegment(Awmds.BolSegment.ValueSegment value) {
            this.valueSegment = value;
        }

        /**
         * Obtient la valeur de la propriété location.
         * 
         * @return
         *     possible object is
         *     {@link Awmds.BolSegment.Location }
         *     
         */
        public Awmds.BolSegment.Location getLocation() {
            return location;
        }

        /**
         * Définit la valeur de la propriété location.
         * 
         * @param value
         *     allowed object is
         *     {@link Awmds.BolSegment.Location }
         *     
         */
        public void setLocation(Awmds.BolSegment.Location value) {
            this.location = value;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Bol_reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Line_number">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Bol_nature" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Bol_type_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Master_bol_ref_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Unique_carrier_reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "bolReference",
            "lineNumber",
            "bolNature",
            "bolTypeCode",
            "masterBolRefNumber",
            "uniqueCarrierReference"
        })
        public static class BolId {

            @XmlElement(name = "Bol_reference", required = true)
            protected String bolReference;
            @XmlElement(name = "Line_number")
            protected int lineNumber;
            @XmlElement(name = "Bol_nature", required = true)
            protected String bolNature;
            @XmlElement(name = "Bol_type_code", required = true)
            protected String bolTypeCode;
            @XmlElement(name = "Master_bol_ref_number")
            protected String masterBolRefNumber;
            @XmlElement(name = "Unique_carrier_reference")
            protected String uniqueCarrierReference;

            /**
             * Obtient la valeur de la propriété bolReference.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBolReference() {
                return bolReference;
            }

            /**
             * Définit la valeur de la propriété bolReference.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBolReference(String value) {
                this.bolReference = value;
            }

            /**
             * Obtient la valeur de la propriété lineNumber.
             * 
             */
            public int getLineNumber() {
                return lineNumber;
            }

            /**
             * Définit la valeur de la propriété lineNumber.
             * 
             */
            public void setLineNumber(int value) {
                this.lineNumber = value;
            }

            /**
             * Obtient la valeur de la propriété bolNature.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBolNature() {
                return bolNature;
            }

            /**
             * Définit la valeur de la propriété bolNature.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBolNature(String value) {
                this.bolNature = value;
            }

            /**
             * Obtient la valeur de la propriété bolTypeCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBolTypeCode() {
                return bolTypeCode;
            }

            /**
             * Définit la valeur de la propriété bolTypeCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBolTypeCode(String value) {
                this.bolTypeCode = value;
            }

            /**
             * Obtient la valeur de la propriété masterBolRefNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMasterBolRefNumber() {
                return masterBolRefNumber;
            }

            /**
             * Définit la valeur de la propriété masterBolRefNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMasterBolRefNumber(String value) {
                this.masterBolRefNumber = value;
            }

            /**
             * Obtient la valeur de la propriété uniqueCarrierReference.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUniqueCarrierReference() {
                return uniqueCarrierReference;
            }

            /**
             * Définit la valeur de la propriété uniqueCarrierReference.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUniqueCarrierReference(String value) {
                this.uniqueCarrierReference = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Ctn_reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Number_of_packages" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="Type_of_container" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Empty_Full" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Marks1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Marks2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Marks3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Sealing_Party" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Empty_weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Goods_weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "ctnReference",
            "numberOfPackages",
            "typeOfContainer",
            "emptyFull",
            "marks1",
            "marks2",
            "marks3",
            "sealingParty",
            "emptyWeight",
            "goodsWeight"
        })
        public static class CtnSegment {

            @XmlElement(name = "Ctn_reference", required = true)
            protected String ctnReference;
            @XmlElement(name = "Number_of_packages")
            protected int numberOfPackages;
            @XmlElement(name = "Type_of_container", required = true)
            protected String typeOfContainer;
            @XmlElement(name = "Empty_Full", required = true)
            protected String emptyFull;
            @XmlElement(name = "Marks1")
            protected String marks1;
            @XmlElement(name = "Marks2")
            protected String marks2;
            @XmlElement(name = "Marks3")
            protected String marks3;
            @XmlElement(name = "Sealing_Party")
            protected String sealingParty;
            @XmlElement(name = "Empty_weight")
            protected Double emptyWeight;
            @XmlElement(name = "Goods_weight")
            protected Double goodsWeight;

            /**
             * Obtient la valeur de la propriété ctnReference.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCtnReference() {
                return ctnReference;
            }

            /**
             * Définit la valeur de la propriété ctnReference.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCtnReference(String value) {
                this.ctnReference = value;
            }

            /**
             * Obtient la valeur de la propriété numberOfPackages.
             * 
             */
            public int getNumberOfPackages() {
                return numberOfPackages;
            }

            /**
             * Définit la valeur de la propriété numberOfPackages.
             * 
             */
            public void setNumberOfPackages(int value) {
                this.numberOfPackages = value;
            }

            /**
             * Obtient la valeur de la propriété typeOfContainer.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTypeOfContainer() {
                return typeOfContainer;
            }

            /**
             * Définit la valeur de la propriété typeOfContainer.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTypeOfContainer(String value) {
                this.typeOfContainer = value;
            }

            /**
             * Obtient la valeur de la propriété emptyFull.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmptyFull() {
                return emptyFull;
            }

            /**
             * Définit la valeur de la propriété emptyFull.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmptyFull(String value) {
                this.emptyFull = value;
            }

            /**
             * Obtient la valeur de la propriété marks1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMarks1() {
                return marks1;
            }

            /**
             * Définit la valeur de la propriété marks1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMarks1(String value) {
                this.marks1 = value;
            }

            /**
             * Obtient la valeur de la propriété marks2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMarks2() {
                return marks2;
            }

            /**
             * Définit la valeur de la propriété marks2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMarks2(String value) {
                this.marks2 = value;
            }

            /**
             * Obtient la valeur de la propriété marks3.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMarks3() {
                return marks3;
            }

            /**
             * Définit la valeur de la propriété marks3.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMarks3(String value) {
                this.marks3 = value;
            }

            /**
             * Obtient la valeur de la propriété sealingParty.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSealingParty() {
                return sealingParty;
            }

            /**
             * Définit la valeur de la propriété sealingParty.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSealingParty(String value) {
                this.sealingParty = value;
            }

            /**
             * Obtient la valeur de la propriété emptyWeight.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getEmptyWeight() {
                return emptyWeight;
            }

            /**
             * Définit la valeur de la propriété emptyWeight.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setEmptyWeight(Double value) {
                this.emptyWeight = value;
            }

            /**
             * Obtient la valeur de la propriété goodsWeight.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getGoodsWeight() {
                return goodsWeight;
            }

            /**
             * Définit la valeur de la propriété goodsWeight.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setGoodsWeight(Double value) {
                this.goodsWeight = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Number_of_packages" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *         &lt;element name="Package_type_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Gross_mass" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *         &lt;element name="Shipping_marks" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Goods_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Seals_segment" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Number_of_seals" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="Marks_of_seals" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Sealing_party_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Volume_in_cubic_meters" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="Num_of_ctn_for_this_bol" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="Information" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "numberOfPackages",
            "packageTypeCode",
            "grossMass",
            "shippingMarks",
            "goodsDescription",
            "sealsSegment",
            "volumeInCubicMeters",
            "numOfCtnForThisBol",
            "information"
        })
        public static class GoodsSegment {

            @XmlElement(name = "Number_of_packages")
            protected double numberOfPackages;
            @XmlElement(name = "Package_type_code", required = true)
            protected String packageTypeCode;
            @XmlElement(name = "Gross_mass")
            protected double grossMass;
            @XmlElement(name = "Shipping_marks", required = true)
            protected String shippingMarks;
            @XmlElement(name = "Goods_description", required = true)
            protected String goodsDescription;
            @XmlElement(name = "Seals_segment")
            protected Awmds.BolSegment.GoodsSegment.SealsSegment sealsSegment;
            @XmlElement(name = "Volume_in_cubic_meters")
            protected Double volumeInCubicMeters;
            @XmlElement(name = "Num_of_ctn_for_this_bol")
            protected int numOfCtnForThisBol;
            @XmlElement(name = "Information")
            protected String information;

            /**
             * Obtient la valeur de la propriété numberOfPackages.
             * 
             */
            public double getNumberOfPackages() {
                return numberOfPackages;
            }

            /**
             * Définit la valeur de la propriété numberOfPackages.
             * 
             */
            public void setNumberOfPackages(double value) {
                this.numberOfPackages = value;
            }

            /**
             * Obtient la valeur de la propriété packageTypeCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPackageTypeCode() {
                return packageTypeCode;
            }

            /**
             * Définit la valeur de la propriété packageTypeCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPackageTypeCode(String value) {
                this.packageTypeCode = value;
            }

            /**
             * Obtient la valeur de la propriété grossMass.
             * 
             */
            public double getGrossMass() {
                return grossMass;
            }

            /**
             * Définit la valeur de la propriété grossMass.
             * 
             */
            public void setGrossMass(double value) {
                this.grossMass = value;
            }

            /**
             * Obtient la valeur de la propriété shippingMarks.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShippingMarks() {
                return shippingMarks;
            }

            /**
             * Définit la valeur de la propriété shippingMarks.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShippingMarks(String value) {
                this.shippingMarks = value;
            }

            /**
             * Obtient la valeur de la propriété goodsDescription.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGoodsDescription() {
                return goodsDescription;
            }

            /**
             * Définit la valeur de la propriété goodsDescription.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGoodsDescription(String value) {
                this.goodsDescription = value;
            }

            /**
             * Obtient la valeur de la propriété sealsSegment.
             * 
             * @return
             *     possible object is
             *     {@link Awmds.BolSegment.GoodsSegment.SealsSegment }
             *     
             */
            public Awmds.BolSegment.GoodsSegment.SealsSegment getSealsSegment() {
                return sealsSegment;
            }

            /**
             * Définit la valeur de la propriété sealsSegment.
             * 
             * @param value
             *     allowed object is
             *     {@link Awmds.BolSegment.GoodsSegment.SealsSegment }
             *     
             */
            public void setSealsSegment(Awmds.BolSegment.GoodsSegment.SealsSegment value) {
                this.sealsSegment = value;
            }

            /**
             * Obtient la valeur de la propriété volumeInCubicMeters.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getVolumeInCubicMeters() {
                return volumeInCubicMeters;
            }

            /**
             * Définit la valeur de la propriété volumeInCubicMeters.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setVolumeInCubicMeters(Double value) {
                this.volumeInCubicMeters = value;
            }

            /**
             * Obtient la valeur de la propriété numOfCtnForThisBol.
             * 
             */
            public int getNumOfCtnForThisBol() {
                return numOfCtnForThisBol;
            }

            /**
             * Définit la valeur de la propriété numOfCtnForThisBol.
             * 
             */
            public void setNumOfCtnForThisBol(int value) {
                this.numOfCtnForThisBol = value;
            }

            /**
             * Obtient la valeur de la propriété information.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInformation() {
                return information;
            }

            /**
             * Définit la valeur de la propriété information.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInformation(String value) {
                this.information = value;
            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Number_of_seals" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="Marks_of_seals" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Sealing_party_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "numberOfSeals",
                "marksOfSeals",
                "sealingPartyCode"
            })
            public static class SealsSegment {

                @XmlElement(name = "Number_of_seals")
                protected int numberOfSeals;
                @XmlElement(name = "Marks_of_seals", required = true)
                protected String marksOfSeals;
                @XmlElement(name = "Sealing_party_code")
                protected String sealingPartyCode;

                /**
                 * Obtient la valeur de la propriété numberOfSeals.
                 * 
                 */
                public int getNumberOfSeals() {
                    return numberOfSeals;
                }

                /**
                 * Définit la valeur de la propriété numberOfSeals.
                 * 
                 */
                public void setNumberOfSeals(int value) {
                    this.numberOfSeals = value;
                }

                /**
                 * Obtient la valeur de la propriété marksOfSeals.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMarksOfSeals() {
                    return marksOfSeals;
                }

                /**
                 * Définit la valeur de la propriété marksOfSeals.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMarksOfSeals(String value) {
                    this.marksOfSeals = value;
                }

                /**
                 * Obtient la valeur de la propriété sealingPartyCode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSealingPartyCode() {
                    return sealingPartyCode;
                }

                /**
                 * Définit la valeur de la propriété sealingPartyCode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSealingPartyCode(String value) {
                    this.sealingPartyCode = value;
                }

            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Place_of_loading_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Place_of_unloading_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "placeOfLoadingCode",
            "placeOfUnloadingCode"
        })
        public static class LoadUnloadPlace {

            @XmlElement(name = "Place_of_loading_code", required = true)
            protected String placeOfLoadingCode;
            @XmlElement(name = "Place_of_unloading_code", required = true)
            protected String placeOfUnloadingCode;

            /**
             * Obtient la valeur de la propriété placeOfLoadingCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceOfLoadingCode() {
                return placeOfLoadingCode;
            }

            /**
             * Définit la valeur de la propriété placeOfLoadingCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceOfLoadingCode(String value) {
                this.placeOfLoadingCode = value;
            }

            /**
             * Obtient la valeur de la propriété placeOfUnloadingCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceOfUnloadingCode() {
                return placeOfUnloadingCode;
            }

            /**
             * Définit la valeur de la propriété placeOfUnloadingCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceOfUnloadingCode(String value) {
                this.placeOfUnloadingCode = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Location_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Location_info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "locationCode",
            "locationInfo"
        })
        public static class Location {

            @XmlElement(name = "Location_code")
            protected String locationCode;
            @XmlElement(name = "Location_info")
            protected String locationInfo;

            /**
             * Obtient la valeur de la propriété locationCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationCode() {
                return locationCode;
            }

            /**
             * Définit la valeur de la propriété locationCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationCode(String value) {
                this.locationCode = value;
            }

            /**
             * Obtient la valeur de la propriété locationInfo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationInfo() {
                return locationInfo;
            }

            /**
             * Définit la valeur de la propriété locationInfo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationInfo(String value) {
                this.locationInfo = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Number_of_packages" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *         &lt;element name="Package_type_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Gross_mass" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *         &lt;element name="Shipping_marks" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Goods_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Container" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Unloaded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "numberOfPackages",
            "packageTypeCode",
            "grossMass",
            "shippingMarks",
            "goodsDescription",
            "container"
        })
        public static class SplitSegment {

            @XmlElement(name = "Number_of_packages")
            protected double numberOfPackages;
            @XmlElement(name = "Package_type_code", required = true)
            protected String packageTypeCode;
            @XmlElement(name = "Gross_mass")
            protected double grossMass;
            @XmlElement(name = "Shipping_marks", required = true)
            protected String shippingMarks;
            @XmlElement(name = "Goods_description", required = true)
            protected String goodsDescription;
            @XmlElement(name = "Container")
            protected Awmds.BolSegment.SplitSegment.Container container;

            /**
             * Obtient la valeur de la propriété numberOfPackages.
             * 
             */
            public double getNumberOfPackages() {
                return numberOfPackages;
            }

            /**
             * Définit la valeur de la propriété numberOfPackages.
             * 
             */
            public void setNumberOfPackages(double value) {
                this.numberOfPackages = value;
            }

            /**
             * Obtient la valeur de la propriété packageTypeCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPackageTypeCode() {
                return packageTypeCode;
            }

            /**
             * Définit la valeur de la propriété packageTypeCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPackageTypeCode(String value) {
                this.packageTypeCode = value;
            }

            /**
             * Obtient la valeur de la propriété grossMass.
             * 
             */
            public double getGrossMass() {
                return grossMass;
            }

            /**
             * Définit la valeur de la propriété grossMass.
             * 
             */
            public void setGrossMass(double value) {
                this.grossMass = value;
            }

            /**
             * Obtient la valeur de la propriété shippingMarks.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShippingMarks() {
                return shippingMarks;
            }

            /**
             * Définit la valeur de la propriété shippingMarks.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShippingMarks(String value) {
                this.shippingMarks = value;
            }

            /**
             * Obtient la valeur de la propriété goodsDescription.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGoodsDescription() {
                return goodsDescription;
            }

            /**
             * Définit la valeur de la propriété goodsDescription.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGoodsDescription(String value) {
                this.goodsDescription = value;
            }

            /**
             * Obtient la valeur de la propriété container.
             * 
             * @return
             *     possible object is
             *     {@link Awmds.BolSegment.SplitSegment.Container }
             *     
             */
            public Awmds.BolSegment.SplitSegment.Container getContainer() {
                return container;
            }

            /**
             * Définit la valeur de la propriété container.
             * 
             * @param value
             *     allowed object is
             *     {@link Awmds.BolSegment.SplitSegment.Container }
             *     
             */
            public void setContainer(Awmds.BolSegment.SplitSegment.Container value) {
                this.container = value;
            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Unloaded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "reference",
                "unloaded"
            })
            public static class Container {

                @XmlElement(name = "Reference", required = true)
                protected String reference;
                @XmlElement(name = "Unloaded")
                protected boolean unloaded;

                /**
                 * Obtient la valeur de la propriété reference.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReference() {
                    return reference;
                }

                /**
                 * Définit la valeur de la propriété reference.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReference(String value) {
                    this.reference = value;
                }

                /**
                 * Obtient la valeur de la propriété unloaded.
                 * 
                 */
                public boolean isUnloaded() {
                    return unloaded;
                }

                /**
                 * Définit la valeur de la propriété unloaded.
                 * 
                 */
                public void setUnloaded(boolean value) {
                    this.unloaded = value;
                }

            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Exporter">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Exporter_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Exporter_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Exporter_address" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Notify">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Notify_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Notify_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Notify_address" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Consignee">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Consignee_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Consignee_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Consignee_address" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "exporter",
            "notify",
            "consignee"
        })
        public static class TradersSegment {

            @XmlElement(name = "Exporter", required = true)
            protected Awmds.BolSegment.TradersSegment.Exporter exporter;
            @XmlElement(name = "Notify", required = true)
            protected Awmds.BolSegment.TradersSegment.Notify notify;
            @XmlElement(name = "Consignee", required = true)
            protected Awmds.BolSegment.TradersSegment.Consignee consignee;

            /**
             * Obtient la valeur de la propriété exporter.
             * 
             * @return
             *     possible object is
             *     {@link Awmds.BolSegment.TradersSegment.Exporter }
             *     
             */
            public Awmds.BolSegment.TradersSegment.Exporter getExporter() {
                return exporter;
            }

            /**
             * Définit la valeur de la propriété exporter.
             * 
             * @param value
             *     allowed object is
             *     {@link Awmds.BolSegment.TradersSegment.Exporter }
             *     
             */
            public void setExporter(Awmds.BolSegment.TradersSegment.Exporter value) {
                this.exporter = value;
            }

            /**
             * Obtient la valeur de la propriété notify.
             * 
             * @return
             *     possible object is
             *     {@link Awmds.BolSegment.TradersSegment.Notify }
             *     
             */
            public Awmds.BolSegment.TradersSegment.Notify getNotify() {
                return notify;
            }

            /**
             * Définit la valeur de la propriété notify.
             * 
             * @param value
             *     allowed object is
             *     {@link Awmds.BolSegment.TradersSegment.Notify }
             *     
             */
            public void setNotify(Awmds.BolSegment.TradersSegment.Notify value) {
                this.notify = value;
            }

            /**
             * Obtient la valeur de la propriété consignee.
             * 
             * @return
             *     possible object is
             *     {@link Awmds.BolSegment.TradersSegment.Consignee }
             *     
             */
            public Awmds.BolSegment.TradersSegment.Consignee getConsignee() {
                return consignee;
            }

            /**
             * Définit la valeur de la propriété consignee.
             * 
             * @param value
             *     allowed object is
             *     {@link Awmds.BolSegment.TradersSegment.Consignee }
             *     
             */
            public void setConsignee(Awmds.BolSegment.TradersSegment.Consignee value) {
                this.consignee = value;
            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Consignee_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Consignee_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Consignee_address" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "consigneeCode",
                "consigneeName",
                "consigneeAddress"
            })
            public static class Consignee {

                @XmlElement(name = "Consignee_code")
                protected String consigneeCode;
                @XmlElement(name = "Consignee_name", required = true)
                protected String consigneeName;
                @XmlElement(name = "Consignee_address", required = true)
                protected String consigneeAddress;

                /**
                 * Obtient la valeur de la propriété consigneeCode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getConsigneeCode() {
                    return consigneeCode;
                }

                /**
                 * Définit la valeur de la propriété consigneeCode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setConsigneeCode(String value) {
                    this.consigneeCode = value;
                }

                /**
                 * Obtient la valeur de la propriété consigneeName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getConsigneeName() {
                    return consigneeName;
                }

                /**
                 * Définit la valeur de la propriété consigneeName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setConsigneeName(String value) {
                    this.consigneeName = value;
                }

                /**
                 * Obtient la valeur de la propriété consigneeAddress.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getConsigneeAddress() {
                    return consigneeAddress;
                }

                /**
                 * Définit la valeur de la propriété consigneeAddress.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setConsigneeAddress(String value) {
                    this.consigneeAddress = value;
                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Exporter_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Exporter_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Exporter_address" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "exporterCode",
                "exporterName",
                "exporterAddress"
            })
            public static class Exporter {

                @XmlElement(name = "Exporter_code")
                protected String exporterCode;
                @XmlElement(name = "Exporter_name", required = true)
                protected String exporterName;
                @XmlElement(name = "Exporter_address", required = true)
                protected String exporterAddress;

                /**
                 * Obtient la valeur de la propriété exporterCode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getExporterCode() {
                    return exporterCode;
                }

                /**
                 * Définit la valeur de la propriété exporterCode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setExporterCode(String value) {
                    this.exporterCode = value;
                }

                /**
                 * Obtient la valeur de la propriété exporterName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getExporterName() {
                    return exporterName;
                }

                /**
                 * Définit la valeur de la propriété exporterName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setExporterName(String value) {
                    this.exporterName = value;
                }

                /**
                 * Obtient la valeur de la propriété exporterAddress.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getExporterAddress() {
                    return exporterAddress;
                }

                /**
                 * Définit la valeur de la propriété exporterAddress.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setExporterAddress(String value) {
                    this.exporterAddress = value;
                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Notify_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Notify_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Notify_address" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "notifyCode",
                "notifyName",
                "notifyAddress"
            })
            public static class Notify {

                @XmlElement(name = "Notify_code")
                protected String notifyCode;
                @XmlElement(name = "Notify_name", required = true)
                protected String notifyName;
                @XmlElement(name = "Notify_address", required = true)
                protected String notifyAddress;

                /**
                 * Obtient la valeur de la propriété notifyCode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNotifyCode() {
                    return notifyCode;
                }

                /**
                 * Définit la valeur de la propriété notifyCode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNotifyCode(String value) {
                    this.notifyCode = value;
                }

                /**
                 * Obtient la valeur de la propriété notifyName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNotifyName() {
                    return notifyName;
                }

                /**
                 * Définit la valeur de la propriété notifyName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNotifyName(String value) {
                    this.notifyName = value;
                }

                /**
                 * Obtient la valeur de la propriété notifyAddress.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNotifyAddress() {
                    return notifyAddress;
                }

                /**
                 * Définit la valeur de la propriété notifyAddress.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNotifyAddress(String value) {
                    this.notifyAddress = value;
                }

            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Freight_segment" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PC_indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Freight_value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                   &lt;element name="Freight_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Customs_segment" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Customs_value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                   &lt;element name="Customs_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Insurance_segment" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Insurance_value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                   &lt;element name="Insurance_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Transport_segment" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Transport_value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                   &lt;element name="Transport_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "freightSegment",
            "customsSegment",
            "insuranceSegment",
            "transportSegment"
        })
        public static class ValueSegment {

            @XmlElement(name = "Freight_segment")
            protected Awmds.BolSegment.ValueSegment.FreightSegment freightSegment;
            @XmlElement(name = "Customs_segment")
            protected Awmds.BolSegment.ValueSegment.CustomsSegment customsSegment;
            @XmlElement(name = "Insurance_segment")
            protected Awmds.BolSegment.ValueSegment.InsuranceSegment insuranceSegment;
            @XmlElement(name = "Transport_segment")
            protected Awmds.BolSegment.ValueSegment.TransportSegment transportSegment;

            /**
             * Obtient la valeur de la propriété freightSegment.
             * 
             * @return
             *     possible object is
             *     {@link Awmds.BolSegment.ValueSegment.FreightSegment }
             *     
             */
            public Awmds.BolSegment.ValueSegment.FreightSegment getFreightSegment() {
                return freightSegment;
            }

            /**
             * Définit la valeur de la propriété freightSegment.
             * 
             * @param value
             *     allowed object is
             *     {@link Awmds.BolSegment.ValueSegment.FreightSegment }
             *     
             */
            public void setFreightSegment(Awmds.BolSegment.ValueSegment.FreightSegment value) {
                this.freightSegment = value;
            }

            /**
             * Obtient la valeur de la propriété customsSegment.
             * 
             * @return
             *     possible object is
             *     {@link Awmds.BolSegment.ValueSegment.CustomsSegment }
             *     
             */
            public Awmds.BolSegment.ValueSegment.CustomsSegment getCustomsSegment() {
                return customsSegment;
            }

            /**
             * Définit la valeur de la propriété customsSegment.
             * 
             * @param value
             *     allowed object is
             *     {@link Awmds.BolSegment.ValueSegment.CustomsSegment }
             *     
             */
            public void setCustomsSegment(Awmds.BolSegment.ValueSegment.CustomsSegment value) {
                this.customsSegment = value;
            }

            /**
             * Obtient la valeur de la propriété insuranceSegment.
             * 
             * @return
             *     possible object is
             *     {@link Awmds.BolSegment.ValueSegment.InsuranceSegment }
             *     
             */
            public Awmds.BolSegment.ValueSegment.InsuranceSegment getInsuranceSegment() {
                return insuranceSegment;
            }

            /**
             * Définit la valeur de la propriété insuranceSegment.
             * 
             * @param value
             *     allowed object is
             *     {@link Awmds.BolSegment.ValueSegment.InsuranceSegment }
             *     
             */
            public void setInsuranceSegment(Awmds.BolSegment.ValueSegment.InsuranceSegment value) {
                this.insuranceSegment = value;
            }

            /**
             * Obtient la valeur de la propriété transportSegment.
             * 
             * @return
             *     possible object is
             *     {@link Awmds.BolSegment.ValueSegment.TransportSegment }
             *     
             */
            public Awmds.BolSegment.ValueSegment.TransportSegment getTransportSegment() {
                return transportSegment;
            }

            /**
             * Définit la valeur de la propriété transportSegment.
             * 
             * @param value
             *     allowed object is
             *     {@link Awmds.BolSegment.ValueSegment.TransportSegment }
             *     
             */
            public void setTransportSegment(Awmds.BolSegment.ValueSegment.TransportSegment value) {
                this.transportSegment = value;
            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Customs_value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *         &lt;element name="Customs_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "customsValue",
                "customsCurrency"
            })
            public static class CustomsSegment {

                @XmlElement(name = "Customs_value")
                protected Double customsValue;
                @XmlElement(name = "Customs_currency")
                protected String customsCurrency;

                /**
                 * Obtient la valeur de la propriété customsValue.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public Double getCustomsValue() {
                    return customsValue;
                }

                /**
                 * Définit la valeur de la propriété customsValue.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setCustomsValue(Double value) {
                    this.customsValue = value;
                }

                /**
                 * Obtient la valeur de la propriété customsCurrency.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustomsCurrency() {
                    return customsCurrency;
                }

                /**
                 * Définit la valeur de la propriété customsCurrency.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustomsCurrency(String value) {
                    this.customsCurrency = value;
                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="PC_indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Freight_value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *         &lt;element name="Freight_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "pcIndicator",
                "freightValue",
                "freightCurrency"
            })
            public static class FreightSegment {

                @XmlElement(name = "PC_indicator")
                protected String pcIndicator;
                @XmlElement(name = "Freight_value")
                protected Double freightValue;
                @XmlElement(name = "Freight_currency")
                protected String freightCurrency;

                /**
                 * Obtient la valeur de la propriété pcIndicator.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPCIndicator() {
                    return pcIndicator;
                }

                /**
                 * Définit la valeur de la propriété pcIndicator.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPCIndicator(String value) {
                    this.pcIndicator = value;
                }

                /**
                 * Obtient la valeur de la propriété freightValue.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public Double getFreightValue() {
                    return freightValue;
                }

                /**
                 * Définit la valeur de la propriété freightValue.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setFreightValue(Double value) {
                    this.freightValue = value;
                }

                /**
                 * Obtient la valeur de la propriété freightCurrency.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFreightCurrency() {
                    return freightCurrency;
                }

                /**
                 * Définit la valeur de la propriété freightCurrency.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFreightCurrency(String value) {
                    this.freightCurrency = value;
                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Insurance_value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *         &lt;element name="Insurance_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "insuranceValue",
                "insuranceCurrency"
            })
            public static class InsuranceSegment {

                @XmlElement(name = "Insurance_value")
                protected Double insuranceValue;
                @XmlElement(name = "Insurance_currency")
                protected String insuranceCurrency;

                /**
                 * Obtient la valeur de la propriété insuranceValue.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public Double getInsuranceValue() {
                    return insuranceValue;
                }

                /**
                 * Définit la valeur de la propriété insuranceValue.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setInsuranceValue(Double value) {
                    this.insuranceValue = value;
                }

                /**
                 * Obtient la valeur de la propriété insuranceCurrency.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInsuranceCurrency() {
                    return insuranceCurrency;
                }

                /**
                 * Définit la valeur de la propriété insuranceCurrency.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInsuranceCurrency(String value) {
                    this.insuranceCurrency = value;
                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Transport_value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *         &lt;element name="Transport_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "transportValue",
                "transportCurrency"
            })
            public static class TransportSegment {

                @XmlElement(name = "Transport_value")
                protected Double transportValue;
                @XmlElement(name = "Transport_currency")
                protected String transportCurrency;

                /**
                 * Obtient la valeur de la propriété transportValue.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                public Double getTransportValue() {
                    return transportValue;
                }

                /**
                 * Définit la valeur de la propriété transportValue.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                public void setTransportValue(Double value) {
                    this.transportValue = value;
                }

                /**
                 * Obtient la valeur de la propriété transportCurrency.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTransportCurrency() {
                    return transportCurrency;
                }

                /**
                 * Définit la valeur de la propriété transportCurrency.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTransportCurrency(String value) {
                    this.transportCurrency = value;
                }

            }

        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="General_segment_id">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Customs_office_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Voyage_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Date_of_departure" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Date_of_arrival" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Time_of_arrival" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
     *                   &lt;element name="Date_of_last_discharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Totals_segment">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Total_number_of_bols" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="Total_number_of_packages" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="Total_number_of_containers" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="Total_gross_mass" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Transport_information">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Carrier">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Carrier_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Carrier_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Carrier_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Shipping_Agent" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Shipping_Agent_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Shipping_Agent_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Mode_of_transport_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Identity_of_transporter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Nationality_of_transporter_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Place_of_transporter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Registration_number_of_transport_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Date_of_registration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Master_information" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Load_unload_place">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Place_of_departure_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Place_of_destination_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Tonnage" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Tonnage_net_weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                   &lt;element name="Tonnage_gross_weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Attached_Document" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Attached_document_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Attached_document_filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Attached_document_content" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "generalSegmentId",
        "totalsSegment",
        "transportInformation",
        "loadUnloadPlace",
        "tonnage",
        "attachedDocument"
    })
    public static class GeneralSegment {

        @XmlElement(name = "General_segment_id", required = true)
        protected Awmds.GeneralSegment.GeneralSegmentId generalSegmentId;
        @XmlElement(name = "Totals_segment", required = true)
        protected Awmds.GeneralSegment.TotalsSegment totalsSegment;
        @XmlElement(name = "Transport_information", required = true)
        protected Awmds.GeneralSegment.TransportInformation transportInformation;
        @XmlElement(name = "Load_unload_place", required = true)
        protected Awmds.GeneralSegment.LoadUnloadPlace loadUnloadPlace;
        @XmlElement(name = "Tonnage")
        protected Awmds.GeneralSegment.Tonnage tonnage;
        @XmlElement(name = "Attached_Document")
        protected List<Awmds.GeneralSegment.AttachedDocument> attachedDocument;

        /**
         * Obtient la valeur de la propriété generalSegmentId.
         * 
         * @return
         *     possible object is
         *     {@link Awmds.GeneralSegment.GeneralSegmentId }
         *     
         */
        public Awmds.GeneralSegment.GeneralSegmentId getGeneralSegmentId() {
            return generalSegmentId;
        }

        /**
         * Définit la valeur de la propriété generalSegmentId.
         * 
         * @param value
         *     allowed object is
         *     {@link Awmds.GeneralSegment.GeneralSegmentId }
         *     
         */
        public void setGeneralSegmentId(Awmds.GeneralSegment.GeneralSegmentId value) {
            this.generalSegmentId = value;
        }

        /**
         * Obtient la valeur de la propriété totalsSegment.
         * 
         * @return
         *     possible object is
         *     {@link Awmds.GeneralSegment.TotalsSegment }
         *     
         */
        public Awmds.GeneralSegment.TotalsSegment getTotalsSegment() {
            return totalsSegment;
        }

        /**
         * Définit la valeur de la propriété totalsSegment.
         * 
         * @param value
         *     allowed object is
         *     {@link Awmds.GeneralSegment.TotalsSegment }
         *     
         */
        public void setTotalsSegment(Awmds.GeneralSegment.TotalsSegment value) {
            this.totalsSegment = value;
        }

        /**
         * Obtient la valeur de la propriété transportInformation.
         * 
         * @return
         *     possible object is
         *     {@link Awmds.GeneralSegment.TransportInformation }
         *     
         */
        public Awmds.GeneralSegment.TransportInformation getTransportInformation() {
            return transportInformation;
        }

        /**
         * Définit la valeur de la propriété transportInformation.
         * 
         * @param value
         *     allowed object is
         *     {@link Awmds.GeneralSegment.TransportInformation }
         *     
         */
        public void setTransportInformation(Awmds.GeneralSegment.TransportInformation value) {
            this.transportInformation = value;
        }

        /**
         * Obtient la valeur de la propriété loadUnloadPlace.
         * 
         * @return
         *     possible object is
         *     {@link Awmds.GeneralSegment.LoadUnloadPlace }
         *     
         */
        public Awmds.GeneralSegment.LoadUnloadPlace getLoadUnloadPlace() {
            return loadUnloadPlace;
        }

        /**
         * Définit la valeur de la propriété loadUnloadPlace.
         * 
         * @param value
         *     allowed object is
         *     {@link Awmds.GeneralSegment.LoadUnloadPlace }
         *     
         */
        public void setLoadUnloadPlace(Awmds.GeneralSegment.LoadUnloadPlace value) {
            this.loadUnloadPlace = value;
        }

        /**
         * Obtient la valeur de la propriété tonnage.
         * 
         * @return
         *     possible object is
         *     {@link Awmds.GeneralSegment.Tonnage }
         *     
         */
        public Awmds.GeneralSegment.Tonnage getTonnage() {
            return tonnage;
        }

        /**
         * Définit la valeur de la propriété tonnage.
         * 
         * @param value
         *     allowed object is
         *     {@link Awmds.GeneralSegment.Tonnage }
         *     
         */
        public void setTonnage(Awmds.GeneralSegment.Tonnage value) {
            this.tonnage = value;
        }

        /**
         * Gets the value of the attachedDocument property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attachedDocument property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttachedDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Awmds.GeneralSegment.AttachedDocument }
         * 
         * 
         */
        public List<Awmds.GeneralSegment.AttachedDocument> getAttachedDocument() {
            if (attachedDocument == null) {
                attachedDocument = new ArrayList<Awmds.GeneralSegment.AttachedDocument>();
            }
            return this.attachedDocument;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Attached_document_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Attached_document_filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Attached_document_content" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "attachedDocumentCode",
            "attachedDocumentFilename",
            "attachedDocumentContent"
        })
        public static class AttachedDocument {

            @XmlElement(name = "Attached_document_code", required = true)
            protected String attachedDocumentCode;
            @XmlElement(name = "Attached_document_filename", required = true)
            protected String attachedDocumentFilename;
            @XmlElement(name = "Attached_document_content", required = true)
            protected byte[] attachedDocumentContent;

            /**
             * Obtient la valeur de la propriété attachedDocumentCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttachedDocumentCode() {
                return attachedDocumentCode;
            }

            /**
             * Définit la valeur de la propriété attachedDocumentCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttachedDocumentCode(String value) {
                this.attachedDocumentCode = value;
            }

            /**
             * Obtient la valeur de la propriété attachedDocumentFilename.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttachedDocumentFilename() {
                return attachedDocumentFilename;
            }

            /**
             * Définit la valeur de la propriété attachedDocumentFilename.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttachedDocumentFilename(String value) {
                this.attachedDocumentFilename = value;
            }

            /**
             * Obtient la valeur de la propriété attachedDocumentContent.
             * 
             * @return
             *     possible object is
             *     byte[]
             */
            public byte[] getAttachedDocumentContent() {
                return attachedDocumentContent;
            }

            /**
             * Définit la valeur de la propriété attachedDocumentContent.
             * 
             * @param value
             *     allowed object is
             *     byte[]
             */
            public void setAttachedDocumentContent(byte[] value) {
                this.attachedDocumentContent = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Customs_office_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Voyage_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Date_of_departure" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Date_of_arrival" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Time_of_arrival" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
         *         &lt;element name="Date_of_last_discharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "customsOfficeCode",
            "voyageNumber",
            "dateOfDeparture",
            "dateOfArrival",
            "timeOfArrival",
            "dateOfLastDischarge"
        })
        public static class GeneralSegmentId {

            @XmlElement(name = "Customs_office_code", required = true)
            protected String customsOfficeCode;
            @XmlElement(name = "Voyage_number", required = true)
            protected String voyageNumber;
            @XmlElement(name = "Date_of_departure", required = true)
            protected String dateOfDeparture;
            @XmlElement(name = "Date_of_arrival")
            protected String dateOfArrival;
            @XmlElement(name = "Time_of_arrival")
            @XmlSchemaType(name = "time")
            protected XMLGregorianCalendar timeOfArrival;
            @XmlElement(name = "Date_of_last_discharge")
            protected String dateOfLastDischarge;

            /**
             * Obtient la valeur de la propriété customsOfficeCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomsOfficeCode() {
                return customsOfficeCode;
            }

            /**
             * Définit la valeur de la propriété customsOfficeCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomsOfficeCode(String value) {
                this.customsOfficeCode = value;
            }

            /**
             * Obtient la valeur de la propriété voyageNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVoyageNumber() {
                return voyageNumber;
            }

            /**
             * Définit la valeur de la propriété voyageNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVoyageNumber(String value) {
                this.voyageNumber = value;
            }

            /**
             * Obtient la valeur de la propriété dateOfDeparture.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateOfDeparture() {
                return dateOfDeparture;
            }

            /**
             * Définit la valeur de la propriété dateOfDeparture.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateOfDeparture(String value) {
                this.dateOfDeparture = value;
            }

            /**
             * Obtient la valeur de la propriété dateOfArrival.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateOfArrival() {
                return dateOfArrival;
            }

            /**
             * Définit la valeur de la propriété dateOfArrival.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateOfArrival(String value) {
                this.dateOfArrival = value;
            }

            /**
             * Obtient la valeur de la propriété timeOfArrival.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getTimeOfArrival() {
                return timeOfArrival;
            }

            /**
             * Définit la valeur de la propriété timeOfArrival.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setTimeOfArrival(XMLGregorianCalendar value) {
                this.timeOfArrival = value;
            }

            /**
             * Obtient la valeur de la propriété dateOfLastDischarge.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateOfLastDischarge() {
                return dateOfLastDischarge;
            }

            /**
             * Définit la valeur de la propriété dateOfLastDischarge.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateOfLastDischarge(String value) {
                this.dateOfLastDischarge = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Place_of_departure_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Place_of_destination_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "placeOfDepartureCode",
            "placeOfDestinationCode"
        })
        public static class LoadUnloadPlace {

            @XmlElement(name = "Place_of_departure_code", required = true)
            protected String placeOfDepartureCode;
            @XmlElement(name = "Place_of_destination_code", required = true)
            protected String placeOfDestinationCode;

            /**
             * Obtient la valeur de la propriété placeOfDepartureCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceOfDepartureCode() {
                return placeOfDepartureCode;
            }

            /**
             * Définit la valeur de la propriété placeOfDepartureCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceOfDepartureCode(String value) {
                this.placeOfDepartureCode = value;
            }

            /**
             * Obtient la valeur de la propriété placeOfDestinationCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceOfDestinationCode() {
                return placeOfDestinationCode;
            }

            /**
             * Définit la valeur de la propriété placeOfDestinationCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceOfDestinationCode(String value) {
                this.placeOfDestinationCode = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Tonnage_net_weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *         &lt;element name="Tonnage_gross_weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tonnageNetWeight",
            "tonnageGrossWeight"
        })
        public static class Tonnage {

            @XmlElement(name = "Tonnage_net_weight")
            protected double tonnageNetWeight;
            @XmlElement(name = "Tonnage_gross_weight")
            protected double tonnageGrossWeight;

            /**
             * Obtient la valeur de la propriété tonnageNetWeight.
             * 
             */
            public double getTonnageNetWeight() {
                return tonnageNetWeight;
            }

            /**
             * Définit la valeur de la propriété tonnageNetWeight.
             * 
             */
            public void setTonnageNetWeight(double value) {
                this.tonnageNetWeight = value;
            }

            /**
             * Obtient la valeur de la propriété tonnageGrossWeight.
             * 
             */
            public double getTonnageGrossWeight() {
                return tonnageGrossWeight;
            }

            /**
             * Définit la valeur de la propriété tonnageGrossWeight.
             * 
             */
            public void setTonnageGrossWeight(double value) {
                this.tonnageGrossWeight = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Total_number_of_bols" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="Total_number_of_packages" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="Total_number_of_containers" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="Total_gross_mass" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "totalNumberOfBols",
            "totalNumberOfPackages",
            "totalNumberOfContainers",
            "totalGrossMass"
        })
        public static class TotalsSegment {

            @XmlElement(name = "Total_number_of_bols")
            protected int totalNumberOfBols;
            @XmlElement(name = "Total_number_of_packages")
            protected int totalNumberOfPackages;
            @XmlElement(name = "Total_number_of_containers")
            protected int totalNumberOfContainers;
            @XmlElement(name = "Total_gross_mass")
            protected double totalGrossMass;

            /**
             * Obtient la valeur de la propriété totalNumberOfBols.
             * 
             */
            public int getTotalNumberOfBols() {
                return totalNumberOfBols;
            }

            /**
             * Définit la valeur de la propriété totalNumberOfBols.
             * 
             */
            public void setTotalNumberOfBols(int value) {
                this.totalNumberOfBols = value;
            }

            /**
             * Obtient la valeur de la propriété totalNumberOfPackages.
             * 
             */
            public int getTotalNumberOfPackages() {
                return totalNumberOfPackages;
            }

            /**
             * Définit la valeur de la propriété totalNumberOfPackages.
             * 
             */
            public void setTotalNumberOfPackages(int value) {
                this.totalNumberOfPackages = value;
            }

            /**
             * Obtient la valeur de la propriété totalNumberOfContainers.
             * 
             */
            public int getTotalNumberOfContainers() {
                return totalNumberOfContainers;
            }

            /**
             * Définit la valeur de la propriété totalNumberOfContainers.
             * 
             */
            public void setTotalNumberOfContainers(int value) {
                this.totalNumberOfContainers = value;
            }

            /**
             * Obtient la valeur de la propriété totalGrossMass.
             * 
             */
            public double getTotalGrossMass() {
                return totalGrossMass;
            }

            /**
             * Définit la valeur de la propriété totalGrossMass.
             * 
             */
            public void setTotalGrossMass(double value) {
                this.totalGrossMass = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Carrier">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Carrier_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Carrier_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Carrier_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Shipping_Agent" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Shipping_Agent_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Shipping_Agent_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Mode_of_transport_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Identity_of_transporter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Nationality_of_transporter_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Place_of_transporter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Registration_number_of_transport_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Date_of_registration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Master_information" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "carrier",
            "shippingAgent",
            "modeOfTransportCode",
            "identityOfTransporter",
            "nationalityOfTransporterCode",
            "placeOfTransporter",
            "registrationNumberOfTransportCode",
            "dateOfRegistration",
            "masterInformation"
        })
        public static class TransportInformation {

            @XmlElement(name = "Carrier", required = true)
            protected Awmds.GeneralSegment.TransportInformation.Carrier carrier;
            @XmlElement(name = "Shipping_Agent")
            protected Awmds.GeneralSegment.TransportInformation.ShippingAgent shippingAgent;
            @XmlElement(name = "Mode_of_transport_code", required = true)
            protected String modeOfTransportCode;
            @XmlElement(name = "Identity_of_transporter")
            protected String identityOfTransporter;
            @XmlElement(name = "Nationality_of_transporter_code", required = true)
            protected String nationalityOfTransporterCode;
            @XmlElement(name = "Place_of_transporter")
            protected String placeOfTransporter;
            @XmlElement(name = "Registration_number_of_transport_code")
            protected String registrationNumberOfTransportCode;
            @XmlElement(name = "Date_of_registration")
            protected String dateOfRegistration;
            @XmlElement(name = "Master_information")
            protected String masterInformation;

            /**
             * Obtient la valeur de la propriété carrier.
             * 
             * @return
             *     possible object is
             *     {@link Awmds.GeneralSegment.TransportInformation.Carrier }
             *     
             */
            public Awmds.GeneralSegment.TransportInformation.Carrier getCarrier() {
                return carrier;
            }

            /**
             * Définit la valeur de la propriété carrier.
             * 
             * @param value
             *     allowed object is
             *     {@link Awmds.GeneralSegment.TransportInformation.Carrier }
             *     
             */
            public void setCarrier(Awmds.GeneralSegment.TransportInformation.Carrier value) {
                this.carrier = value;
            }

            /**
             * Obtient la valeur de la propriété shippingAgent.
             * 
             * @return
             *     possible object is
             *     {@link Awmds.GeneralSegment.TransportInformation.ShippingAgent }
             *     
             */
            public Awmds.GeneralSegment.TransportInformation.ShippingAgent getShippingAgent() {
                return shippingAgent;
            }

            /**
             * Définit la valeur de la propriété shippingAgent.
             * 
             * @param value
             *     allowed object is
             *     {@link Awmds.GeneralSegment.TransportInformation.ShippingAgent }
             *     
             */
            public void setShippingAgent(Awmds.GeneralSegment.TransportInformation.ShippingAgent value) {
                this.shippingAgent = value;
            }

            /**
             * Obtient la valeur de la propriété modeOfTransportCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getModeOfTransportCode() {
                return modeOfTransportCode;
            }

            /**
             * Définit la valeur de la propriété modeOfTransportCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setModeOfTransportCode(String value) {
                this.modeOfTransportCode = value;
            }

            /**
             * Obtient la valeur de la propriété identityOfTransporter.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdentityOfTransporter() {
                return identityOfTransporter;
            }

            /**
             * Définit la valeur de la propriété identityOfTransporter.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIdentityOfTransporter(String value) {
                this.identityOfTransporter = value;
            }

            /**
             * Obtient la valeur de la propriété nationalityOfTransporterCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNationalityOfTransporterCode() {
                return nationalityOfTransporterCode;
            }

            /**
             * Définit la valeur de la propriété nationalityOfTransporterCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNationalityOfTransporterCode(String value) {
                this.nationalityOfTransporterCode = value;
            }

            /**
             * Obtient la valeur de la propriété placeOfTransporter.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceOfTransporter() {
                return placeOfTransporter;
            }

            /**
             * Définit la valeur de la propriété placeOfTransporter.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceOfTransporter(String value) {
                this.placeOfTransporter = value;
            }

            /**
             * Obtient la valeur de la propriété registrationNumberOfTransportCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegistrationNumberOfTransportCode() {
                return registrationNumberOfTransportCode;
            }

            /**
             * Définit la valeur de la propriété registrationNumberOfTransportCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegistrationNumberOfTransportCode(String value) {
                this.registrationNumberOfTransportCode = value;
            }

            /**
             * Obtient la valeur de la propriété dateOfRegistration.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateOfRegistration() {
                return dateOfRegistration;
            }

            /**
             * Définit la valeur de la propriété dateOfRegistration.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateOfRegistration(String value) {
                this.dateOfRegistration = value;
            }

            /**
             * Obtient la valeur de la propriété masterInformation.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMasterInformation() {
                return masterInformation;
            }

            /**
             * Définit la valeur de la propriété masterInformation.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMasterInformation(String value) {
                this.masterInformation = value;
            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Carrier_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Carrier_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Carrier_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "carrierCode",
                "carrierName",
                "carrierAddress"
            })
            public static class Carrier {

                @XmlElement(name = "Carrier_code", required = true)
                protected String carrierCode;
                @XmlElement(name = "Carrier_name")
                protected String carrierName;
                @XmlElement(name = "Carrier_address")
                protected String carrierAddress;

                /**
                 * Obtient la valeur de la propriété carrierCode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCarrierCode() {
                    return carrierCode;
                }

                /**
                 * Définit la valeur de la propriété carrierCode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCarrierCode(String value) {
                    this.carrierCode = value;
                }

                /**
                 * Obtient la valeur de la propriété carrierName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCarrierName() {
                    return carrierName;
                }

                /**
                 * Définit la valeur de la propriété carrierName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCarrierName(String value) {
                    this.carrierName = value;
                }

                /**
                 * Obtient la valeur de la propriété carrierAddress.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCarrierAddress() {
                    return carrierAddress;
                }

                /**
                 * Définit la valeur de la propriété carrierAddress.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCarrierAddress(String value) {
                    this.carrierAddress = value;
                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Shipping_Agent_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Shipping_Agent_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "shippingAgentCode",
                "shippingAgentName"
            })
            public static class ShippingAgent {

                @XmlElement(name = "Shipping_Agent_code", required = true)
                protected String shippingAgentCode;
                @XmlElement(name = "Shipping_Agent_name")
                protected String shippingAgentName;

                /**
                 * Obtient la valeur de la propriété shippingAgentCode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getShippingAgentCode() {
                    return shippingAgentCode;
                }

                /**
                 * Définit la valeur de la propriété shippingAgentCode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setShippingAgentCode(String value) {
                    this.shippingAgentCode = value;
                }

                /**
                 * Obtient la valeur de la propriété shippingAgentName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getShippingAgentName() {
                    return shippingAgentName;
                }

                /**
                 * Définit la valeur de la propriété shippingAgentName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setShippingAgentName(String value) {
                    this.shippingAgentName = value;
                }

            }

        }

    }

}
