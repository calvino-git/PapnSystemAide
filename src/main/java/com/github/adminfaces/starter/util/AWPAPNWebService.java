
package com.github.adminfaces.starter.util;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AWPAPNWebService", targetNamespace = "http://interf/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AWPAPNWebService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "genererManifeste", targetNamespace = "http://interf/", className = "com.github.adminfaces.starter.util.GenererManifeste")
    @ResponseWrapper(localName = "genererManifesteResponse", targetNamespace = "http://interf/", className = "com.github.adminfaces.starter.util.GenererManifesteResponse")
    @Action(input = "http://interf/AWPAPNWebService/genererManifesteRequest", output = "http://interf/AWPAPNWebService/genererManifesteResponse")
    public String genererManifeste(
        @WebParam(name = "arg0", targetNamespace = "")
        InputReferenceGetManifest arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.github.adminfaces.starter.util.RefManResult>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getManListRef", targetNamespace = "http://interf/", className = "com.github.adminfaces.starter.util.GetManListRef")
    @ResponseWrapper(localName = "getManListRefResponse", targetNamespace = "http://interf/", className = "com.github.adminfaces.starter.util.GetManListRefResponse")
    @Action(input = "http://interf/AWPAPNWebService/getManListRefRequest", output = "http://interf/AWPAPNWebService/getManListRefResponse")
    public List<RefManResult> getManListRef(
        @WebParam(name = "arg0", targetNamespace = "")
        InputReference arg0);

}
