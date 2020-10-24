
package com.github.adminfaces.starter.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the papn.clientdouane package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetManifesteXML_QNAME = new QName("http://ws.douane.papn/", "getManifesteXML");
    private final static QName _RetrieveManifesteFromDouane_QNAME = new QName("http://ws.douane.papn/", "retrieveManifesteFromDouane");
    private final static QName _RetrieveManifesteFromDouaneResponse_QNAME = new QName("http://ws.douane.papn/", "retrieveManifesteFromDouaneResponse");
    private final static QName _FindManifesteResponse_QNAME = new QName("http://ws.douane.papn/", "findManifesteResponse");
    private final static QName _FindManifeste_QNAME = new QName("http://ws.douane.papn/", "findManifeste");
    private final static QName _GenererManifeste_QNAME = new QName("http://ws.douane.papn/", "genererManifeste");
    private final static QName _GenererManifesteResponse_QNAME = new QName("http://ws.douane.papn/", "genererManifesteResponse");
    private final static QName _GetManifesteXMLResponse_QNAME = new QName("http://ws.douane.papn/", "getManifesteXMLResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: papn.clientdouane
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Awmds }
     * 
     */
    public Awmds createAwmds() {
        return new Awmds();
    }

    /**
     * Create an instance of {@link Awmds.BolSegment }
     * 
     */
    public Awmds.BolSegment createAwmdsBolSegment() {
        return new Awmds.BolSegment();
    }

    /**
     * Create an instance of {@link Awmds.BolSegment.ValueSegment }
     * 
     */
    public Awmds.BolSegment.ValueSegment createAwmdsBolSegmentValueSegment() {
        return new Awmds.BolSegment.ValueSegment();
    }

    /**
     * Create an instance of {@link Awmds.BolSegment.SplitSegment }
     * 
     */
    public Awmds.BolSegment.SplitSegment createAwmdsBolSegmentSplitSegment() {
        return new Awmds.BolSegment.SplitSegment();
    }

    /**
     * Create an instance of {@link Awmds.BolSegment.GoodsSegment }
     * 
     */
    public Awmds.BolSegment.GoodsSegment createAwmdsBolSegmentGoodsSegment() {
        return new Awmds.BolSegment.GoodsSegment();
    }

    /**
     * Create an instance of {@link Awmds.BolSegment.TradersSegment }
     * 
     */
    public Awmds.BolSegment.TradersSegment createAwmdsBolSegmentTradersSegment() {
        return new Awmds.BolSegment.TradersSegment();
    }

    /**
     * Create an instance of {@link Awmds.GeneralSegment }
     * 
     */
    public Awmds.GeneralSegment createAwmdsGeneralSegment() {
        return new Awmds.GeneralSegment();
    }

    /**
     * Create an instance of {@link Awmds.GeneralSegment.TransportInformation }
     * 
     */
    public Awmds.GeneralSegment.TransportInformation createAwmdsGeneralSegmentTransportInformation() {
        return new Awmds.GeneralSegment.TransportInformation();
    }

    /**
     * Create an instance of {@link GenererManifesteResponse }
     * 
     */
    public GenererManifesteResponse createGenererManifesteResponse() {
        return new GenererManifesteResponse();
    }

    /**
     * Create an instance of {@link GetManifesteXMLResponse }
     * 
     */
    public GetManifesteXMLResponse createGetManifesteXMLResponse() {
        return new GetManifesteXMLResponse();
    }

    /**
     * Create an instance of {@link GenererManifeste }
     * 
     */
    public GenererManifeste createGenererManifeste() {
        return new GenererManifeste();
    }

    /**
     * Create an instance of {@link FindManifeste }
     * 
     */
    public FindManifeste createFindManifeste() {
        return new FindManifeste();
    }

    /**
     * Create an instance of {@link RetrieveManifesteFromDouaneResponse }
     * 
     */
    public RetrieveManifesteFromDouaneResponse createRetrieveManifesteFromDouaneResponse() {
        return new RetrieveManifesteFromDouaneResponse();
    }

    /**
     * Create an instance of {@link GetManifesteXML }
     * 
     */
    public GetManifesteXML createGetManifesteXML() {
        return new GetManifesteXML();
    }

    /**
     * Create an instance of {@link RetrieveManifesteFromDouane }
     * 
     */
    public RetrieveManifesteFromDouane createRetrieveManifesteFromDouane() {
        return new RetrieveManifesteFromDouane();
    }

    /**
     * Create an instance of {@link FindManifesteResponse }
     * 
     */
    public FindManifesteResponse createFindManifesteResponse() {
        return new FindManifesteResponse();
    }

    /**
     * Create an instance of {@link RefManResult }
     * 
     */
    public RefManResult createRefManResult() {
        return new RefManResult();
    }

    /**
     * Create an instance of {@link WebServiceResult }
     * 
     */
    public WebServiceResult createWebServiceResult() {
        return new WebServiceResult();
    }

    /**
     * Create an instance of {@link Awmds.BolSegment.BolId }
     * 
     */
    public Awmds.BolSegment.BolId createAwmdsBolSegmentBolId() {
        return new Awmds.BolSegment.BolId();
    }

    /**
     * Create an instance of {@link Awmds.BolSegment.LoadUnloadPlace }
     * 
     */
    public Awmds.BolSegment.LoadUnloadPlace createAwmdsBolSegmentLoadUnloadPlace() {
        return new Awmds.BolSegment.LoadUnloadPlace();
    }

    /**
     * Create an instance of {@link Awmds.BolSegment.CtnSegment }
     * 
     */
    public Awmds.BolSegment.CtnSegment createAwmdsBolSegmentCtnSegment() {
        return new Awmds.BolSegment.CtnSegment();
    }

    /**
     * Create an instance of {@link Awmds.BolSegment.Location }
     * 
     */
    public Awmds.BolSegment.Location createAwmdsBolSegmentLocation() {
        return new Awmds.BolSegment.Location();
    }

    /**
     * Create an instance of {@link Awmds.BolSegment.ValueSegment.FreightSegment }
     * 
     */
    public Awmds.BolSegment.ValueSegment.FreightSegment createAwmdsBolSegmentValueSegmentFreightSegment() {
        return new Awmds.BolSegment.ValueSegment.FreightSegment();
    }

    /**
     * Create an instance of {@link Awmds.BolSegment.ValueSegment.CustomsSegment }
     * 
     */
    public Awmds.BolSegment.ValueSegment.CustomsSegment createAwmdsBolSegmentValueSegmentCustomsSegment() {
        return new Awmds.BolSegment.ValueSegment.CustomsSegment();
    }

    /**
     * Create an instance of {@link Awmds.BolSegment.ValueSegment.InsuranceSegment }
     * 
     */
    public Awmds.BolSegment.ValueSegment.InsuranceSegment createAwmdsBolSegmentValueSegmentInsuranceSegment() {
        return new Awmds.BolSegment.ValueSegment.InsuranceSegment();
    }

    /**
     * Create an instance of {@link Awmds.BolSegment.ValueSegment.TransportSegment }
     * 
     */
    public Awmds.BolSegment.ValueSegment.TransportSegment createAwmdsBolSegmentValueSegmentTransportSegment() {
        return new Awmds.BolSegment.ValueSegment.TransportSegment();
    }

    /**
     * Create an instance of {@link Awmds.BolSegment.SplitSegment.Container }
     * 
     */
    public Awmds.BolSegment.SplitSegment.Container createAwmdsBolSegmentSplitSegmentContainer() {
        return new Awmds.BolSegment.SplitSegment.Container();
    }

    /**
     * Create an instance of {@link Awmds.BolSegment.GoodsSegment.SealsSegment }
     * 
     */
    public Awmds.BolSegment.GoodsSegment.SealsSegment createAwmdsBolSegmentGoodsSegmentSealsSegment() {
        return new Awmds.BolSegment.GoodsSegment.SealsSegment();
    }

    /**
     * Create an instance of {@link Awmds.BolSegment.TradersSegment.Exporter }
     * 
     */
    public Awmds.BolSegment.TradersSegment.Exporter createAwmdsBolSegmentTradersSegmentExporter() {
        return new Awmds.BolSegment.TradersSegment.Exporter();
    }

    /**
     * Create an instance of {@link Awmds.BolSegment.TradersSegment.Notify }
     * 
     */
    public Awmds.BolSegment.TradersSegment.Notify createAwmdsBolSegmentTradersSegmentNotify() {
        return new Awmds.BolSegment.TradersSegment.Notify();
    }

    /**
     * Create an instance of {@link Awmds.BolSegment.TradersSegment.Consignee }
     * 
     */
    public Awmds.BolSegment.TradersSegment.Consignee createAwmdsBolSegmentTradersSegmentConsignee() {
        return new Awmds.BolSegment.TradersSegment.Consignee();
    }

    /**
     * Create an instance of {@link Awmds.GeneralSegment.GeneralSegmentId }
     * 
     */
    public Awmds.GeneralSegment.GeneralSegmentId createAwmdsGeneralSegmentGeneralSegmentId() {
        return new Awmds.GeneralSegment.GeneralSegmentId();
    }

    /**
     * Create an instance of {@link Awmds.GeneralSegment.TotalsSegment }
     * 
     */
    public Awmds.GeneralSegment.TotalsSegment createAwmdsGeneralSegmentTotalsSegment() {
        return new Awmds.GeneralSegment.TotalsSegment();
    }

    /**
     * Create an instance of {@link Awmds.GeneralSegment.LoadUnloadPlace }
     * 
     */
    public Awmds.GeneralSegment.LoadUnloadPlace createAwmdsGeneralSegmentLoadUnloadPlace() {
        return new Awmds.GeneralSegment.LoadUnloadPlace();
    }

    /**
     * Create an instance of {@link Awmds.GeneralSegment.Tonnage }
     * 
     */
    public Awmds.GeneralSegment.Tonnage createAwmdsGeneralSegmentTonnage() {
        return new Awmds.GeneralSegment.Tonnage();
    }

    /**
     * Create an instance of {@link Awmds.GeneralSegment.AttachedDocument }
     * 
     */
    public Awmds.GeneralSegment.AttachedDocument createAwmdsGeneralSegmentAttachedDocument() {
        return new Awmds.GeneralSegment.AttachedDocument();
    }

    /**
     * Create an instance of {@link Awmds.GeneralSegment.TransportInformation.Carrier }
     * 
     */
    public Awmds.GeneralSegment.TransportInformation.Carrier createAwmdsGeneralSegmentTransportInformationCarrier() {
        return new Awmds.GeneralSegment.TransportInformation.Carrier();
    }

    /**
     * Create an instance of {@link Awmds.GeneralSegment.TransportInformation.ShippingAgent }
     * 
     */
    public Awmds.GeneralSegment.TransportInformation.ShippingAgent createAwmdsGeneralSegmentTransportInformationShippingAgent() {
        return new Awmds.GeneralSegment.TransportInformation.ShippingAgent();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetManifesteXML }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.douane.papn/", name = "getManifesteXML1")
    public JAXBElement<GetManifesteXML> createGetManifesteXML(GetManifesteXML value) {
        return new JAXBElement<GetManifesteXML>(_GetManifesteXML_QNAME, GetManifesteXML.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveManifesteFromDouane }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.douane.papn/", name = "retrieveManifesteFromDouane1")
    public JAXBElement<RetrieveManifesteFromDouane> createRetrieveManifesteFromDouane(RetrieveManifesteFromDouane value) {
        return new JAXBElement<RetrieveManifesteFromDouane>(_RetrieveManifesteFromDouane_QNAME, RetrieveManifesteFromDouane.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveManifesteFromDouaneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.douane.papn/", name = "retrieveManifesteFromDouaneResponse1")
    public JAXBElement<RetrieveManifesteFromDouaneResponse> createRetrieveManifesteFromDouaneResponse(RetrieveManifesteFromDouaneResponse value) {
        return new JAXBElement<RetrieveManifesteFromDouaneResponse>(_RetrieveManifesteFromDouaneResponse_QNAME, RetrieveManifesteFromDouaneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindManifesteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.douane.papn/", name = "findManifesteResponse1")
    public JAXBElement<FindManifesteResponse> createFindManifesteResponse(FindManifesteResponse value) {
        return new JAXBElement<FindManifesteResponse>(_FindManifesteResponse_QNAME, FindManifesteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindManifeste }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.douane.papn/", name = "findManifeste1")
    public JAXBElement<FindManifeste> createFindManifeste(FindManifeste value) {
        return new JAXBElement<FindManifeste>(_FindManifeste_QNAME, FindManifeste.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenererManifeste }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.douane.papn/", name = "genererManifeste1")
    public JAXBElement<GenererManifeste> createGenererManifeste(GenererManifeste value) {
        return new JAXBElement<GenererManifeste>(_GenererManifeste_QNAME, GenererManifeste.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenererManifesteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.douane.papn/", name = "genererManifesteRespons1e")
    public JAXBElement<GenererManifesteResponse> createGenererManifesteResponse(GenererManifesteResponse value) {
        return new JAXBElement<GenererManifesteResponse>(_GenererManifesteResponse_QNAME, GenererManifesteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetManifesteXMLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.douane.papn/", name = "getManifesteXMLResponse1")
    public JAXBElement<GetManifesteXMLResponse> createGetManifesteXMLResponse(GetManifesteXMLResponse value) {
        return new JAXBElement<GetManifesteXMLResponse>(_GetManifesteXMLResponse_QNAME, GetManifesteXMLResponse.class, null, value);
    }

}
