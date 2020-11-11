/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Administrateur
 */
@Entity
@Table(name = "MANIFESTE_SEGMENT_GENERAL", catalog = "", schema = "DSIPAPN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ManifesteSegmentGeneral.findAll", query = "SELECT m FROM ManifesteSegmentGeneral m"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findById", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.id = :id"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByCarrierAddress", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.carrierAddress = :carrierAddress"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByCarrierCode", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.carrierCode = :carrierCode"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByCarrierName", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.carrierName = :carrierName"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByCustomsOfficeCode", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.customsOfficeCode = :customsOfficeCode"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByDateArrival", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.dateArrival = :dateArrival"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByDateDeparture", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.dateDeparture = :dateDeparture"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByDateLastDischarge", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.dateLastDischarge = :dateLastDischarge"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByDateOfRegistration", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.dateOfRegistration = :dateOfRegistration"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByIdentityTransporter", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.identityTransporter = :identityTransporter"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByMasterInformation", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.masterInformation = :masterInformation"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByModeTransport", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.modeTransport = :modeTransport"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByNationalityTransporter", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.nationalityTransporter = :nationalityTransporter"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByNumeroEscale", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.numeroEscale = :numeroEscale"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByPlaceOfDepartureCode", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.placeOfDepartureCode = :placeOfDepartureCode"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByPlaceOfDestinationCode", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.placeOfDestinationCode = :placeOfDestinationCode"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByPlaceOfTransporter", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.placeOfTransporter = :placeOfTransporter"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByRegistrationNumber", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.registrationNumber = :registrationNumber"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByShippingAgentCode", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.shippingAgentCode = :shippingAgentCode"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByShippingAgentName", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.shippingAgentName = :shippingAgentName"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByTimeArrival", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.timeArrival = :timeArrival"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByTonnageGrossWeight", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.tonnageGrossWeight = :tonnageGrossWeight"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByTonnageNetWeight", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.tonnageNetWeight = :tonnageNetWeight"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByTotalNumberOfBols", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.totalNumberOfBols = :totalNumberOfBols"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByTotalGrossMass", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.totalGrossMass = :totalGrossMass"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByTotalNumberOfContainers", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.totalNumberOfContainers = :totalNumberOfContainers"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByTotalNumberOfPackages", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.totalNumberOfPackages = :totalNumberOfPackages"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByVoyageNumber", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.voyageNumber = :voyageNumber"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByEscleunik", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.escleunik = :escleunik"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByDateInsertion", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.dateInsertion = :dateInsertion"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByHeureInsertion", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.heureInsertion = :heureInsertion"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByNumeroDouane", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.numeroDouane = :numeroDouane"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByTrafic", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.trafic = :trafic"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByDateUpdate", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.dateUpdate = :dateUpdate"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByHeureUpdate", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.heureUpdate = :heureUpdate"),
    @NamedQuery(name = "ManifesteSegmentGeneral.findByRefmanId", query = "SELECT m FROM ManifesteSegmentGeneral m WHERE m.refmanId = :refmanId")})
public class ManifesteSegmentGeneral implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "CUSTOMS_OFFICE_CODE")
    private String customsOfficeCode;
    @Size(max = 20)
    @Column(name = "DATE_ARRIVAL")
    private String dateArrival;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "VOYAGE_NUMBER")
    private String voyageNumber;
    @Column(name = "ESCLEUNIK")
    private Long escleunik;
    @Size(max = 50)
    @Column(name = "DATE_INSERTION")
    private String dateInsertion;
    @Size(max = 20)
    @Column(name = "HEURE_INSERTION")
    private String heureInsertion;
    @Size(max = 20)
    @Column(name = "NUMERO_DOUANE")
    private String numeroDouane;
    @Size(max = 20)
    @Column(name = "TRAFIC")
    private String trafic;
    @Size(max = 20)
    @Column(name = "DATE_UPDATE")
    private String dateUpdate;
    @Size(max = 20)
    @Column(name = "HEURE_UPDATE")
    private String heureUpdate;
    @Column(name = "REFMAN_ID")
    private BigInteger refmanId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idGeneral")
    private List<ManifesteBl> manifesteBlList;

    public ManifesteSegmentGeneral() {
    }

    public ManifesteSegmentGeneral(Long id) {
        this.id = id;
    }

    public ManifesteSegmentGeneral(Long id, String customsOfficeCode, String dateDeparture, double tonnageGrossWeight, double tonnageNetWeight, double totalGrossMass, double totalNumberOfContainers, double totalNumberOfPackages, String voyageNumber) {
        this.id = id;
        this.customsOfficeCode = customsOfficeCode;
        this.dateDeparture = dateDeparture;
        this.tonnageGrossWeight = tonnageGrossWeight;
        this.tonnageNetWeight = tonnageNetWeight;
        this.totalGrossMass = totalGrossMass;
        this.totalNumberOfContainers = totalNumberOfContainers;
        this.totalNumberOfPackages = totalNumberOfPackages;
        this.voyageNumber = voyageNumber;
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

    public Long getEscleunik() {
        return escleunik;
    }

    public void setEscleunik(Long escleunik) {
        this.escleunik = escleunik;
    }

    public String getDateInsertion() {
        return dateInsertion;
    }

    public void setDateInsertion(String dateInsertion) {
        this.dateInsertion = dateInsertion;
    }

    public String getHeureInsertion() {
        return heureInsertion;
    }

    public void setHeureInsertion(String heureInsertion) {
        this.heureInsertion = heureInsertion;
    }

    public String getNumeroDouane() {
        return numeroDouane;
    }

    public void setNumeroDouane(String numeroDouane) {
        this.numeroDouane = numeroDouane;
    }

    public String getTrafic() {
        return trafic;
    }

    public void setTrafic(String trafic) {
        this.trafic = trafic;
    }

    public String getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(String dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public String getHeureUpdate() {
        return heureUpdate;
    }

    public void setHeureUpdate(String heureUpdate) {
        this.heureUpdate = heureUpdate;
    }

    public BigInteger getRefmanId() {
        return refmanId;
    }

    public void setRefmanId(BigInteger refmanId) {
        this.refmanId = refmanId;
    }

    @XmlTransient
    public List<ManifesteBl> getManifesteBlList() {
        return manifesteBlList;
    }

    public void setManifesteBlList(List<ManifesteBl> manifesteBlList) {
        this.manifesteBlList = manifesteBlList;
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
        if (!(object instanceof ManifesteSegmentGeneral)) {
            return false;
        }
        ManifesteSegmentGeneral other = (ManifesteSegmentGeneral) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.adminfaces.starter.model.ManifesteSegmentGeneral[ id=" + id + " ]";
    }
    
}
