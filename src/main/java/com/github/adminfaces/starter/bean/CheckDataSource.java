/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.bean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;
import javax.annotation.PostConstruct;
import java.io.Serializable;



/**
 *
 * @author Calvin ILOKI
 */
@Named(value = "checkDataSource")
@SessionScoped
public class CheckDataSource implements Serializable {

    @PersistenceContext
    EntityManager entityManager;
    public CheckDataSource() {
    }
    
    public void run() {
        System.err.println(Locale.getDefault().toString());
        Locale.setDefault(Locale.FRENCH);
        Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
        System.out.println(locale.getLanguage() + "_" + locale.getCountry());
        FacesContext.getCurrentInstance().getViewRoot().setLocale(Locale.FRANCE);
        Locale locale1 = FacesContext.getCurrentInstance().getViewRoot().getLocale();
        System.out.println(locale1.getLanguage() + "_" + locale1.getCountry());
//        try {
//            Context ctx = new InitialContext();
//            DataSource ds = (DataSource) ctx.lookup("java:global/cargo");
//            Connection cnx = ds.getConnection();
//            
//            System.out.println("Context Time Out: " + ds.getLoginTimeout()
//                    + "\nSchema : " + cnx.getSchema()
//                    + "\nDriver Name : " + cnx.getMetaData().getDriverName()
//                    + "\nURL : " + cnx.getMetaData().getURL()
//                    + "\nUsername : " + cnx.getMetaData().getUserName());
//            Statement stmt = cnx.createStatement();
//            ResultSet rslt = stmt.executeQuery("select * from congo_terminal where mois='201907' and rownum <10");
//            while (rslt.next()) {
//                System.out.println("Escale : " + rslt.getString("escale"));
//            }
//        } catch (NamingException | SQLException ex) {
//            Logger.getLogger(CheckDataSource.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}
