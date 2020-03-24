/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 60610H
 */
@Entity
@Table(name = "GENERAL_INFO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GeneralInfo.findAll", query = "SELECT g FROM GeneralInfo g"),
    @NamedQuery(name = "GeneralInfo.findById", query = "SELECT g FROM GeneralInfo g WHERE g.id = :id"),
    @NamedQuery(name = "GeneralInfo.findByCarrierAddress", query = "SELECT g FROM GeneralInfo g WHERE g.carrierAddress = :carrierAddress"),
    @NamedQuery(name = "GeneralInfo.findByCarrierCode", query = "SELECT g FROM GeneralInfo g WHERE g.carrierCode = :carrierCode"),
    @NamedQuery(name = "GeneralInfo.findByCarrierName", query = "SELECT g FROM GeneralInfo g WHERE g.carrierName = :carrierName"),
    @NamedQuery(name = "GeneralInfo.findByCustomsOfficeCode", query = "SELECT g FROM GeneralInfo g WHERE g.customsOfficeCode = :customsOfficeCode"),
    @NamedQuery(name = "GeneralInfo.findByDateArrival", query = "SELECT g FROM GeneralInfo g WHERE g.dateArrival = :dateArrival"),
    @NamedQuery(name = "GeneralInfo.findByDateDeparture", query = "SELECT g FROM GeneralInfo g WHERE g.dateDeparture = :dateDeparture"),
    @NamedQuery(name = "GeneralInfo.findByDateLastDischarge", query = "SELECT g FROM GeneralInfo g WHERE g.dateLastDischarge = :dateLastDischarge"),
    @NamedQuery(name = "GeneralInfo.findByDateOfRegistration", query = "SELECT g FROM GeneralInfo g WHERE g.dateOfRegistration = :dateOfRegistration"),
    @NamedQuery(name = "GeneralInfo.findByIdentityTransporter", query = "SELECT g FROM GeneralInfo g WHERE g.identityTransporter = :identityTransporter"),
    @NamedQuery(name = "GeneralInfo.findByMasterInformation", query = "SELECT g FROM GeneralInfo g WHERE g.masterInformation = :masterInformation"),
    @NamedQuery(name = "GeneralInfo.findByModeTransport", query = "SELECT g FROM GeneralInfo g WHERE g.modeTransport = :modeTransport"),
    @NamedQuery(name = "GeneralInfo.findByNationalityTransporter", query = "SELECT g FROM GeneralInfo g WHERE g.nationalityTransporter = :nationalityTransporter"),
    @NamedQuery(name = "GeneralInfo.findByNumeroEscale", query = "SELECT g FROM GeneralInfo g WHERE g.numeroEscale = :numeroEscale"),
    @NamedQuery(name = "GeneralInfo.findByPlaceOfDepartureCode", query = "SELECT g FROM GeneralInfo g WHERE g.placeOfDepartureCode = :placeOfDepartureCode"),
    @NamedQuery(name = "GeneralInfo.findByPlaceOfDestinationCode", query = "SELECT g FROM GeneralInfo g WHERE g.placeOfDestinationCode = :placeOfDestinationCode"),
    @NamedQuery(name = "GeneralInfo.findByPlaceOfTransporter", query = "SELECT g FROM GeneralInfo g WHERE g.placeOfTransporter = :placeOfTransporter"),
    @NamedQuery(name = "GeneralInfo.findByRegistrationNumber", query = "SELECT g FROM GeneralInfo g WHERE g.registrationNumber = :registrationNumber"),
    @NamedQuery(name = "GeneralInfo.findByShippingAgentCode", query = "SELECT g FROM GeneralInfo g WHERE g.shippingAgentCode = :shippingAgentCode"),
    @NamedQuery(name = "GeneralInfo.findByShippingAgentName", query = "SELECT g FROM GeneralInfo g WHERE g.shippingAgentName = :shippingAgentName"),
    @NamedQuery(name = "GeneralInfo.findByTimeArrival", query = "SELECT g FROM GeneralInfo g WHERE g.timeArrival = :timeArrival"),
    @NamedQuery(name = "GeneralInfo.findByTonnageGrossWeight", query = "SELECT g FROM GeneralInfo g WHERE g.tonnageGrossWeight = :tonnageGrossWeight"),
    @NamedQuery(name = "GeneralInfo.findByTonnageNetWeight", query = "SELECT g FROM GeneralInfo g WHERE g.tonnageNetWeight = :tonnageNetWeight"),
    @NamedQuery(name = "GeneralInfo.findByTotalNumberOfBols", query = "SELECT g FROM GeneralInfo g WHERE g.totalNumberOfBols = :totalNumberOfBols"),
    @NamedQuery(name = "GeneralInfo.findByTotalGrossMass", query = "SELECT g FROM GeneralInfo g WHERE g.totalGrossMass = :totalGrossMass"),
    @NamedQuery(name = "GeneralInfo.findByTotalNumberOfContainers", query = "SELECT g FROM GeneralInfo g WHERE g.totalNumberOfContainers = :totalNumberOfContainers"),
    @NamedQuery(name = "GeneralInfo.findByTotalNumberOfPackages", query = "SELECT g FROM GeneralInfo g WHERE g.totalNumberOfPackages = :totalNumberOfPackages"),
    @NamedQuery(name = "GeneralInfo.findByVoyageNumber", query = "SELECT g FROM GeneralInfo g WHERE g.voyageNumber = :voyageNumber"),
    @NamedQuery(name = "GeneralInfo.findByDateInsertion", query = "SELECT g FROM GeneralInfo g WHERE g.dateInsertion = :dateInsertion")})
public class GeneralInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Size(max = 255)
    @Column(name = "CARRIER_ADDRESS")
    private String carrierAddress;
    @Size(max = 255)
    @Column(name = "CARRIER_CODE")
    private String carrierCode;
    @Size(max = 255)
    @Column(name = "CARRIER_NAME")
    private String carrierName;
    @Size(max = 255)
    @Column(name = "CUSTOMS_OFFICE_CODE")
    private String customsOfficeCode;
    @Size(max = 20)
    @Column(name = "DATE_ARRIVAL")
    private String dateArrival;
    @Size(max = 20)
    @Column(name = "DATE_DEPARTURE")
    private String dateDeparture;
    @Size(max = 20)
    @Column(name = "DATE_LAST_DISCHARGE")
    private String dateLastDischarge;
    @Size(max = 20)
    @Column(name = "DATE_OF_REGISTRATION")
    private String dateOfRegistration;
    @Size(max = 255)
    @Column(name = "IDENTITY_TRANSPORTER")
    private String identityTransporter;
    @Size(max = 255)
    @Column(name = "MASTER_INFORMATION")
    private String masterInformation;
    @Size(max = 255)
    @Column(name = "MODE_TRANSPORT")
    private String modeTransport;
    @Size(max = 255)
    @Column(name = "NATIONALITY_TRANSPORTER")
    private String nationalityTransporter;
    @Size(max = 10)
    @Column(name = "NUMERO_ESCALE")
    private String numeroEscale;
    @Size(max = 255)
    @Column(name = "PLACE_OF_DEPARTURE_CODE")
    private String placeOfDepartureCode;
    @Size(max = 255)
    @Column(name = "PLACE_OF_DESTINATION_CODE")
    private String placeOfDestinationCode;
    @Size(max = 255)
    @Column(name = "PLACE_OF_TRANSPORTER")
    private String placeOfTransporter;
    @Size(max = 255)
    @Column(name = "REGISTRATION_NUMBER")
    private String registrationNumber;
    @Size(max = 255)
    @Column(name = "SHIPPING_AGENT_CODE")
    private String shippingAgentCode;
    @Size(max = 255)
    @Column(name = "SHIPPING_AGENT_NAME")
    private String shippingAgentName;
    @Size(max = 255)
    @Column(name = "TIME_ARRIVAL")
    private String timeArrival;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TONNAGE_GROSS_WEIGHT")
    private double tonnageGrossWeight;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TONNAGE_NET_WEIGHT")
    private double tonnageNetWeight;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL_NUMBER_OF_BOLS")
    private Double totalNumberOfBols;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TOTAL_GROSS_MASS")
    private double totalGrossMass;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TOTAL_NUMBER_OF_CONTAINERS")
    private double totalNumberOfContainers;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TOTAL_NUMBER_OF_PACKAGES")
    private double totalNumberOfPackages;
    @Size(max = 20)
    @Column(name = "VOYAGE_NUMBER")
    private String voyageNumber;
    @Size(max = 50)
    @Column(name = "DATE_INSERTION")
    private String dateInsertion;
    @JoinColumn(name = "ID_ESCALE", referencedColumnName = "ESCLEUNIK")
    @ManyToOne(fetch = FetchType.EAGER)
    private Escale idEscale;

    public GeneralInfo() {
    }

    public GeneralInfo(Long id) {
        this.id = id;
    }

    public GeneralInfo(Long id, double tonnageGrossWeight, double tonnageNetWeight, double totalGrossMass, double totalNumberOfContainers, double totalNumberOfPackages) {
        this.id = id;
        this.tonnageGrossWeight = tonnageGrossWeight;
        this.tonnageNetWeight = tonnageNetWeight;
        this.totalGrossMass = totalGrossMass;
        this.totalNumberOfContainers = totalNumberOfContainers;
        this.totalNumberOfPackages = totalNumberOfPackages;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarrierAddress() {
        return carrierAddress;
    }

    public void setCarrierAddress(String carrierAddress) {
        this.carrierAddress = carrierAddress;
    }

    public String getCarrierCode() {
        return carrierCode;
    }

    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public String getCustomsOfficeCode() {
        return customsOfficeCode;
    }

    public void setCustomsOfficeCode(String customsOfficeCode) {
        this.customsOfficeCode = customsOfficeCode;
    }

    public String getDateArrival() {
        return dateArrival;
    }

    public void setDateArrival(String dateArrival) {
        this.dateArrival = dateArrival;
    }

    public String getDateDeparture() {
        return dateDeparture;
    }

    public void setDateDeparture(String dateDeparture) {
        this.dateDeparture = dateDeparture;
    }

    public String getDateLastDischarge() {
        return dateLastDischarge;
    }

    public void setDateLastDischarge(String dateLastDischarge) {
        this.dateLastDischarge = dateLastDischarge;
    }

    public String getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(String dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public String getIdentityTransporter() {
        return identityTransporter;
    }

    public void setIdentityTransporter(String identityTransporter) {
        this.identityTransporter = identityTransporter;
    }

    public String getMasterInformation() {
        return masterInformation;
    }

    public void setMasterInformation(String masterInformation) {
        this.masterInformation = masterInformation;
    }

    public String getModeTransport() {
        return modeTransport;
    }

    public void setModeTransport(String modeTransport) {
        this.modeTransport = modeTransport;
    }

    public String getNationalityTransporter() {
        return nationalityTransporter;
    }

    public void setNationalityTransporter(String nationalityTransporter) {
        this.nationalityTransporter = nationalityTransporter;
    }

    public String getNumeroEscale() {
        return numeroEscale;
    }

    public void setNumeroEscale(String numeroEscale) {
        this.numeroEscale = numeroEscale;
    }

    public String getPlaceOfDepartureCode() {
        return placeOfDepartureCode;
    }

    public void setPlaceOfDepartureCode(String placeOfDepartureCode) {
        this.placeOfDepartureCode = placeOfDepartureCode;
    }

    public String getPlaceOfDestinationCode() {
        return placeOfDestinationCode;
    }

    public void setPlaceOfDestinationCode(String placeOfDestinationCode) {
        this.placeOfDestinationCode = placeOfDestinationCode;
    }

    public String getPlaceOfTransporter() {
        return placeOfTransporter;
    }

    public void setPlaceOfTransporter(String placeOfTransporter) {
        this.placeOfTransporter = placeOfTransporter;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getShippingAgentCode() {
        return shippingAgentCode;
    }

    public void setShippingAgentCode(String shippingAgentCode) {
        this.shippingAgentCode = shippingAgentCode;
    }

    public String getShippingAgentName() {
        return shippingAgentName;
    }

    public void setShippingAgentName(String shippingAgentName) {
        this.shippingAgentName = shippingAgentName;
    }

    public String getTimeArrival() {
        return timeArrival;
    }

    public void setTimeArrival(String timeArrival) {
        this.timeArrival = timeArrival;
    }

    public double getTonnageGrossWeight() {
        return tonnageGrossWeight;
    }

    public void setTonnageGrossWeight(double tonnageGrossWeight) {
        this.tonnageGrossWeight = tonnageGrossWeight;
    }

    public double getTonnageNetWeight() {
        return tonnageNetWeight;
    }

    public void setTonnageNetWeight(double tonnageNetWeight) {
        this.tonnageNetWeight = tonnageNetWeight;
    }

    public Double getTotalNumberOfBols() {
        return totalNumberOfBols;
    }

    public void setTotalNumberOfBols(Double totalNumberOfBols) {
        this.totalNumberOfBols = totalNumberOfBols;
    }

    public double getTotalGrossMass() {
        return totalGrossMass;
    }

    public void setTotalGrossMass(double totalGrossMass) {
        this.totalGrossMass = totalGrossMass;
    }

    public double getTotalNumberOfContainers() {
        return totalNumberOfContainers;
    }

    public void setTotalNumberOfContainers(double totalNumberOfContainers) {
        this.totalNumberOfContainers = totalNumberOfContainers;
    }

    public double getTotalNumberOfPackages() {
        return totalNumberOfPackages;
    }

    public void setTotalNumberOfPackages(double totalNumberOfPackages) {
        this.totalNumberOfPackages = totalNumberOfPackages;
    }

    public String getVoyageNumber() {
        return voyageNumber;
    }

    public void setVoyageNumber(String voyageNumber) {
        this.voyageNumber = voyageNumber;
    }

    public String getDateInsertion() {
        return dateInsertion;
    }

    public void setDateInsertion(String dateInsertion) {
        this.dateInsertion = dateInsertion;
    }

    public Escale getIdEscale() {
        return idEscale;
    }

    public void setIdEscale(Escale idEscale) {
        this.idEscale = idEscale;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GeneralInfo)) {
            return false;
        }
        GeneralInfo other = (GeneralInfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.adminfaces.starter.model.GeneralInfo[ id=" + id + " ]";
    }
    
}
