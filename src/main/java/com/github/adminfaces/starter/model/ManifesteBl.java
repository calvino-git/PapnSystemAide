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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "MANIFESTE_BL", catalog = "", schema = "DSIPAPN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ManifesteBl.findAll", query = "SELECT m FROM ManifesteBl m"),
    @NamedQuery(name = "ManifesteBl.findById", query = "SELECT m FROM ManifesteBl m WHERE m.id = :id"),
    @NamedQuery(name = "ManifesteBl.findByPcIndicator", query = "SELECT m FROM ManifesteBl m WHERE m.pcIndicator = :pcIndicator"),
    @NamedQuery(name = "ManifesteBl.findByBolNature", query = "SELECT m FROM ManifesteBl m WHERE m.bolNature = :bolNature"),
    @NamedQuery(name = "ManifesteBl.findByBolReference", query = "SELECT m FROM ManifesteBl m WHERE m.bolReference = :bolReference"),
    @NamedQuery(name = "ManifesteBl.findByBolTypeCode", query = "SELECT m FROM ManifesteBl m WHERE m.bolTypeCode = :bolTypeCode"),
    @NamedQuery(name = "ManifesteBl.findByConsigneeAddress", query = "SELECT m FROM ManifesteBl m WHERE m.consigneeAddress = :consigneeAddress"),
    @NamedQuery(name = "ManifesteBl.findByConsigneeCode", query = "SELECT m FROM ManifesteBl m WHERE m.consigneeCode = :consigneeCode"),
    @NamedQuery(name = "ManifesteBl.findByConsigneeName", query = "SELECT m FROM ManifesteBl m WHERE m.consigneeName = :consigneeName"),
    @NamedQuery(name = "ManifesteBl.findByCustomsCurrency", query = "SELECT m FROM ManifesteBl m WHERE m.customsCurrency = :customsCurrency"),
    @NamedQuery(name = "ManifesteBl.findByCustomsValue", query = "SELECT m FROM ManifesteBl m WHERE m.customsValue = :customsValue"),
    @NamedQuery(name = "ManifesteBl.findByExporterAddress", query = "SELECT m FROM ManifesteBl m WHERE m.exporterAddress = :exporterAddress"),
    @NamedQuery(name = "ManifesteBl.findByExporterCode", query = "SELECT m FROM ManifesteBl m WHERE m.exporterCode = :exporterCode"),
    @NamedQuery(name = "ManifesteBl.findByExporterName", query = "SELECT m FROM ManifesteBl m WHERE m.exporterName = :exporterName"),
    @NamedQuery(name = "ManifesteBl.findByFreightCurrency", query = "SELECT m FROM ManifesteBl m WHERE m.freightCurrency = :freightCurrency"),
    @NamedQuery(name = "ManifesteBl.findByFreightValue", query = "SELECT m FROM ManifesteBl m WHERE m.freightValue = :freightValue"),
    @NamedQuery(name = "ManifesteBl.findByGoodsDescription", query = "SELECT m FROM ManifesteBl m WHERE m.goodsDescription = :goodsDescription"),
    @NamedQuery(name = "ManifesteBl.findByGrossMass", query = "SELECT m FROM ManifesteBl m WHERE m.grossMass = :grossMass"),
    @NamedQuery(name = "ManifesteBl.findByInformation", query = "SELECT m FROM ManifesteBl m WHERE m.information = :information"),
    @NamedQuery(name = "ManifesteBl.findByInsuranceCurrency", query = "SELECT m FROM ManifesteBl m WHERE m.insuranceCurrency = :insuranceCurrency"),
    @NamedQuery(name = "ManifesteBl.findByInsuranceValue", query = "SELECT m FROM ManifesteBl m WHERE m.insuranceValue = :insuranceValue"),
    @NamedQuery(name = "ManifesteBl.findByLineNumber", query = "SELECT m FROM ManifesteBl m WHERE m.lineNumber = :lineNumber"),
    @NamedQuery(name = "ManifesteBl.findByLocationCode", query = "SELECT m FROM ManifesteBl m WHERE m.locationCode = :locationCode"),
    @NamedQuery(name = "ManifesteBl.findByLocationInfo", query = "SELECT m FROM ManifesteBl m WHERE m.locationInfo = :locationInfo"),
    @NamedQuery(name = "ManifesteBl.findByMasterBolRefNumber", query = "SELECT m FROM ManifesteBl m WHERE m.masterBolRefNumber = :masterBolRefNumber"),
    @NamedQuery(name = "ManifesteBl.findByNotifyAddress", query = "SELECT m FROM ManifesteBl m WHERE m.notifyAddress = :notifyAddress"),
    @NamedQuery(name = "ManifesteBl.findByNotifyCode", query = "SELECT m FROM ManifesteBl m WHERE m.notifyCode = :notifyCode"),
    @NamedQuery(name = "ManifesteBl.findByNotifyName", query = "SELECT m FROM ManifesteBl m WHERE m.notifyName = :notifyName"),
    @NamedQuery(name = "ManifesteBl.findByNumOfCtnForThisBol", query = "SELECT m FROM ManifesteBl m WHERE m.numOfCtnForThisBol = :numOfCtnForThisBol"),
    @NamedQuery(name = "ManifesteBl.findByNumberOfPackages", query = "SELECT m FROM ManifesteBl m WHERE m.numberOfPackages = :numberOfPackages"),
    @NamedQuery(name = "ManifesteBl.findByPackageTypeCode", query = "SELECT m FROM ManifesteBl m WHERE m.packageTypeCode = :packageTypeCode"),
    @NamedQuery(name = "ManifesteBl.findByPlaceOfLoadingCode", query = "SELECT m FROM ManifesteBl m WHERE m.placeOfLoadingCode = :placeOfLoadingCode"),
    @NamedQuery(name = "ManifesteBl.findByPlaceOfUnloadingCode", query = "SELECT m FROM ManifesteBl m WHERE m.placeOfUnloadingCode = :placeOfUnloadingCode"),
    @NamedQuery(name = "ManifesteBl.findByShippingMarks", query = "SELECT m FROM ManifesteBl m WHERE m.shippingMarks = :shippingMarks"),
    @NamedQuery(name = "ManifesteBl.findByTransportCurrency", query = "SELECT m FROM ManifesteBl m WHERE m.transportCurrency = :transportCurrency"),
    @NamedQuery(name = "ManifesteBl.findByTransportValue", query = "SELECT m FROM ManifesteBl m WHERE m.transportValue = :transportValue"),
    @NamedQuery(name = "ManifesteBl.findByUniqueCarrierReference", query = "SELECT m FROM ManifesteBl m WHERE m.uniqueCarrierReference = :uniqueCarrierReference"),
    @NamedQuery(name = "ManifesteBl.findByVolumeInCubicMeters", query = "SELECT m FROM ManifesteBl m WHERE m.volumeInCubicMeters = :volumeInCubicMeters")})
public class ManifesteBl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Size(max = 255)
    @Column(name = "PC_INDICATOR")
    private String pcIndicator;
    @Size(max = 255)
    @Column(name = "BOL_NATURE")
    private String bolNature;
    @Size(max = 255)
    @Column(name = "BOL_REFERENCE")
    private String bolReference;
    @Size(max = 255)
    @Column(name = "BOL_TYPE_CODE")
    private String bolTypeCode;
    @Size(max = 255)
    @Column(name = "CONSIGNEE_ADDRESS")
    private String consigneeAddress;
    @Size(max = 255)
    @Column(name = "CONSIGNEE_CODE")
    private String consigneeCode;
    @Size(max = 255)
    @Column(name = "CONSIGNEE_NAME")
    private String consigneeName;
    @Size(max = 255)
    @Column(name = "CUSTOMS_CURRENCY")
    private String customsCurrency;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CUSTOMS_VALUE")
    private Double customsValue;
    @Size(max = 255)
    @Column(name = "EXPORTER_ADDRESS")
    private String exporterAddress;
    @Size(max = 255)
    @Column(name = "EXPORTER_CODE")
    private String exporterCode;
    @Size(max = 255)
    @Column(name = "EXPORTER_NAME")
    private String exporterName;
    @Size(max = 255)
    @Column(name = "FREIGHT_CURRENCY")
    private String freightCurrency;
    @Column(name = "FREIGHT_VALUE")
    private Double freightValue;
    @Size(max = 2000)
    @Column(name = "GOODS_DESCRIPTION")
    private String goodsDescription;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GROSS_MASS")
    private double grossMass;
    @Size(max = 255)
    @Column(name = "INFORMATION")
    private String information;
    @Size(max = 255)
    @Column(name = "INSURANCE_CURRENCY")
    private String insuranceCurrency;
    @Column(name = "INSURANCE_VALUE")
    private Double insuranceValue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LINE_NUMBER")
    private BigInteger lineNumber;
    @Size(max = 255)
    @Column(name = "LOCATION_CODE")
    private String locationCode;
    @Size(max = 255)
    @Column(name = "LOCATION_INFO")
    private String locationInfo;
    @Size(max = 255)
    @Column(name = "MASTER_BOL_REF_NUMBER")
    private String masterBolRefNumber;
    @Size(max = 255)
    @Column(name = "NOTIFY_ADDRESS")
    private String notifyAddress;
    @Size(max = 255)
    @Column(name = "NOTIFY_CODE")
    private String notifyCode;
    @Size(max = 255)
    @Column(name = "NOTIFY_NAME")
    private String notifyName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_OF_CTN_FOR_THIS_BOL")
    private double numOfCtnForThisBol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMBER_OF_PACKAGES")
    private double numberOfPackages;
    @Size(max = 255)
    @Column(name = "PACKAGE_TYPE_CODE")
    private String packageTypeCode;
    @Size(max = 255)
    @Column(name = "PLACE_OF_LOADING_CODE")
    private String placeOfLoadingCode;
    @Size(max = 255)
    @Column(name = "PLACE_OF_UNLOADING_CODE")
    private String placeOfUnloadingCode;
    @Size(max = 1000)
    @Column(name = "SHIPPING_MARKS")
    private String shippingMarks;
    @Size(max = 255)
    @Column(name = "TRANSPORT_CURRENCY")
    private String transportCurrency;
    @Column(name = "TRANSPORT_VALUE")
    private Double transportValue;
    @Size(max = 255)
    @Column(name = "UNIQUE_CARRIER_REFERENCE")
    private String uniqueCarrierReference;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VOLUME_IN_CUBIC_METERS")
    private double volumeInCubicMeters;
    @JoinColumn(name = "ID_GENERAL", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private ManifesteSegmentGeneral idGeneral;
    @OneToMany(mappedBy = "idBl")
    private List<ManifesteConteneur> manifesteConteneurList;

    public ManifesteBl() {
    }

    public ManifesteBl(Long id) {
        this.id = id;
    }

    public ManifesteBl(Long id, double grossMass, BigInteger lineNumber, double numOfCtnForThisBol, double numberOfPackages, double volumeInCubicMeters) {
        this.id = id;
        this.grossMass = grossMass;
        this.lineNumber = lineNumber;
        this.numOfCtnForThisBol = numOfCtnForThisBol;
        this.numberOfPackages = numberOfPackages;
        this.volumeInCubicMeters = volumeInCubicMeters;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPcIndicator() {
        return pcIndicator;
    }

    public void setPcIndicator(String pcIndicator) {
        this.pcIndicator = pcIndicator;
    }

    public String getBolNature() {
        return bolNature;
    }

    public void setBolNature(String bolNature) {
        this.bolNature = bolNature;
    }

    public String getBolReference() {
        return bolReference;
    }

    public void setBolReference(String bolReference) {
        this.bolReference = bolReference;
    }

    public String getBolTypeCode() {
        return bolTypeCode;
    }

    public void setBolTypeCode(String bolTypeCode) {
        this.bolTypeCode = bolTypeCode;
    }

    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
    }

    public String getConsigneeCode() {
        return consigneeCode;
    }

    public void setConsigneeCode(String consigneeCode) {
        this.consigneeCode = consigneeCode;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public String getCustomsCurrency() {
        return customsCurrency;
    }

    public void setCustomsCurrency(String customsCurrency) {
        this.customsCurrency = customsCurrency;
    }

    public Double getCustomsValue() {
        return customsValue;
    }

    public void setCustomsValue(Double customsValue) {
        this.customsValue = customsValue;
    }

    public String getExporterAddress() {
        return exporterAddress;
    }

    public void setExporterAddress(String exporterAddress) {
        this.exporterAddress = exporterAddress;
    }

    public String getExporterCode() {
        return exporterCode;
    }

    public void setExporterCode(String exporterCode) {
        this.exporterCode = exporterCode;
    }

    public String getExporterName() {
        return exporterName;
    }

    public void setExporterName(String exporterName) {
        this.exporterName = exporterName;
    }

    public String getFreightCurrency() {
        return freightCurrency;
    }

    public void setFreightCurrency(String freightCurrency) {
        this.freightCurrency = freightCurrency;
    }

    public Double getFreightValue() {
        return freightValue;
    }

    public void setFreightValue(Double freightValue) {
        this.freightValue = freightValue;
    }

    public String getGoodsDescription() {
        return goodsDescription;
    }

    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    public double getGrossMass() {
        return grossMass;
    }

    public void setGrossMass(double grossMass) {
        this.grossMass = grossMass;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getInsuranceCurrency() {
        return insuranceCurrency;
    }

    public void setInsuranceCurrency(String insuranceCurrency) {
        this.insuranceCurrency = insuranceCurrency;
    }

    public Double getInsuranceValue() {
        return insuranceValue;
    }

    public void setInsuranceValue(Double insuranceValue) {
        this.insuranceValue = insuranceValue;
    }

    public BigInteger getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(BigInteger lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public String getLocationInfo() {
        return locationInfo;
    }

    public void setLocationInfo(String locationInfo) {
        this.locationInfo = locationInfo;
    }

    public String getMasterBolRefNumber() {
        return masterBolRefNumber;
    }

    public void setMasterBolRefNumber(String masterBolRefNumber) {
        this.masterBolRefNumber = masterBolRefNumber;
    }

    public String getNotifyAddress() {
        return notifyAddress;
    }

    public void setNotifyAddress(String notifyAddress) {
        this.notifyAddress = notifyAddress;
    }

    public String getNotifyCode() {
        return notifyCode;
    }

    public void setNotifyCode(String notifyCode) {
        this.notifyCode = notifyCode;
    }

    public String getNotifyName() {
        return notifyName;
    }

    public void setNotifyName(String notifyName) {
        this.notifyName = notifyName;
    }

    public double getNumOfCtnForThisBol() {
        return numOfCtnForThisBol;
    }

    public void setNumOfCtnForThisBol(double numOfCtnForThisBol) {
        this.numOfCtnForThisBol = numOfCtnForThisBol;
    }

    public double getNumberOfPackages() {
        return numberOfPackages;
    }

    public void setNumberOfPackages(double numberOfPackages) {
        this.numberOfPackages = numberOfPackages;
    }

    public String getPackageTypeCode() {
        return packageTypeCode;
    }

    public void setPackageTypeCode(String packageTypeCode) {
        this.packageTypeCode = packageTypeCode;
    }

    public String getPlaceOfLoadingCode() {
        return placeOfLoadingCode;
    }

    public void setPlaceOfLoadingCode(String placeOfLoadingCode) {
        this.placeOfLoadingCode = placeOfLoadingCode;
    }

    public String getPlaceOfUnloadingCode() {
        return placeOfUnloadingCode;
    }

    public void setPlaceOfUnloadingCode(String placeOfUnloadingCode) {
        this.placeOfUnloadingCode = placeOfUnloadingCode;
    }

    public String getShippingMarks() {
        return shippingMarks;
    }

    public void setShippingMarks(String shippingMarks) {
        this.shippingMarks = shippingMarks;
    }

    public String getTransportCurrency() {
        return transportCurrency;
    }

    public void setTransportCurrency(String transportCurrency) {
        this.transportCurrency = transportCurrency;
    }

    public Double getTransportValue() {
        return transportValue;
    }

    public void setTransportValue(Double transportValue) {
        this.transportValue = transportValue;
    }

    public String getUniqueCarrierReference() {
        return uniqueCarrierReference;
    }

    public void setUniqueCarrierReference(String uniqueCarrierReference) {
        this.uniqueCarrierReference = uniqueCarrierReference;
    }

    public double getVolumeInCubicMeters() {
        return volumeInCubicMeters;
    }

    public void setVolumeInCubicMeters(double volumeInCubicMeters) {
        this.volumeInCubicMeters = volumeInCubicMeters;
    }

    public ManifesteSegmentGeneral getIdGeneral() {
        return idGeneral;
    }

    public void setIdGeneral(ManifesteSegmentGeneral idGeneral) {
        this.idGeneral = idGeneral;
    }

    @XmlTransient
    public List<ManifesteConteneur> getManifesteConteneurList() {
        return manifesteConteneurList;
    }

    public void setManifesteConteneurList(List<ManifesteConteneur> manifesteConteneurList) {
        this.manifesteConteneurList = manifesteConteneurList;
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
        if (!(object instanceof ManifesteBl)) {
            return false;
        }
        ManifesteBl other = (ManifesteBl) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.adminfaces.starter.model.ManifesteBl[ id=" + id + " ]";
    }
    
}
