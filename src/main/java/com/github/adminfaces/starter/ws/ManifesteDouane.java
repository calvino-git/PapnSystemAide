/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.ws;

import com.github.adminfaces.starter.service.ManifesteService;
import com.github.adminfaces.starter.util.RefManResult;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Administrateur
 */
@WebService(serviceName = "ManifesteDouane")
@Stateless()
public class ManifesteDouane {

    @EJB
    private ManifesteService ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Web Service > Add Operation"

    @WebMethod(operationName = "rechercherRefMan")
    public List<RefManResult> rechercherRefMan(@WebParam(name = "debut") Date debut, @WebParam(name = "fin") Date fin, @WebParam(name = "trafic") String trafic) {
        return ejbRef.rechercherRefMan(debut, fin, trafic);
    }

    @WebMethod(operationName = "telechargerManifesteFromDouane")
    public void telechargerManifesteFromDouane(@WebParam(name = "ref") RefManResult ref) throws IOException {
        ejbRef.telechargerManifesteFromDouane(ref);
    }

    
}
