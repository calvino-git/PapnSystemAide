
package com.github.adminfaces.starter.util;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the douanes.papn package. 
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

    private final static QName _GenererManifeste_QNAME = new QName("http://interf/", "genererManifeste");
    private final static QName _GetManListRef_QNAME = new QName("http://interf/", "getManListRef");
    private final static QName _GenererManifesteResponse_QNAME = new QName("http://interf/", "genererManifesteResponse");
    private final static QName _InputReferenceGetManifest_QNAME = new QName("http://interf/", "InputReferenceGetManifest");
    private final static QName _InputReference_QNAME = new QName("http://interf/", "InputReference");
    private final static QName _GetManListRefResponse_QNAME = new QName("http://interf/", "getManListRefResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: douanes.papn
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GenererManifesteResponse }
     * 
     */
    public GenererManifesteResponse createGenererManifesteResponse() {
        return new GenererManifesteResponse();
    }

    /**
     * Create an instance of {@link InputReferenceGetManifest }
     * 
     */
    public InputReferenceGetManifest createInputReferenceGetManifest() {
        return new InputReferenceGetManifest();
    }

    /**
     * Create an instance of {@link GenererManifeste }
     * 
     */
    public GenererManifeste createGenererManifeste() {
        return new GenererManifeste();
    }

    /**
     * Create an instance of {@link GetManListRef }
     * 
     */
    public GetManListRef createGetManListRef() {
        return new GetManListRef();
    }

    /**
     * Create an instance of {@link GetManListRefResponse }
     * 
     */
    public GetManListRefResponse createGetManListRefResponse() {
        return new GetManListRefResponse();
    }

    /**
     * Create an instance of {@link InputReference }
     * 
     */
    public InputReference createInputReference() {
        return new InputReference();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GenererManifeste }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interf/", name = "genererManifeste")
    public JAXBElement<GenererManifeste> createGenererManifeste(GenererManifeste value) {
        return new JAXBElement<GenererManifeste>(_GenererManifeste_QNAME, GenererManifeste.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetManListRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interf/", name = "getManListRef")
    public JAXBElement<GetManListRef> createGetManListRef(GetManListRef value) {
        return new JAXBElement<GetManListRef>(_GetManListRef_QNAME, GetManListRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenererManifesteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interf/", name = "genererManifesteResponse")
    public JAXBElement<GenererManifesteResponse> createGenererManifesteResponse(GenererManifesteResponse value) {
        return new JAXBElement<GenererManifesteResponse>(_GenererManifesteResponse_QNAME, GenererManifesteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputReferenceGetManifest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interf/", name = "InputReferenceGetManifest")
    public JAXBElement<InputReferenceGetManifest> createInputReferenceGetManifest(InputReferenceGetManifest value) {
        return new JAXBElement<InputReferenceGetManifest>(_InputReferenceGetManifest_QNAME, InputReferenceGetManifest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interf/", name = "InputReference")
    public JAXBElement<InputReference> createInputReference(InputReference value) {
        return new JAXBElement<InputReference>(_InputReference_QNAME, InputReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetManListRefResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interf/", name = "getManListRefResponse")
    public JAXBElement<GetManListRefResponse> createGetManListRefResponse(GetManListRefResponse value) {
        return new JAXBElement<GetManListRefResponse>(_GetManListRefResponse_QNAME, GetManListRefResponse.class, null, value);
    }

}
