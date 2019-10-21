/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.controller;

import com.github.adminfaces.starter.bean.PrestationChiffreAffaireBean;
import com.github.adminfaces.starter.service.ChiffreAffaireService;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static net.sf.dynamicreports.report.builder.DynamicReports.report;
import net.sf.dynamicreports.report.exception.DRException;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 * 
 * @author Belal
 *
 */
//@WebServlet(name = "pdf",urlPatterns = "*.pdf")
public class DynamicReportServlet extends HttpServlet {
 private static final long serialVersionUID = 1L;
  private JRBeanCollectionDataSource beanCollectionDataSource;
  private Map<String, Object> parameters;
  @Inject
    private ChiffreAffaireService chiffreAffaireService;

 
 @Override
 protected void doGet(HttpServletRequest req, HttpServletResponse resp)
   throws ServletException, IOException {
  resp.setContentType("application/pdf");
  OutputStream out = resp.getOutputStream();
  out = getPDF(getServletContext(),out);
     System.out.println("OK");
  out.close();
 }
 
 @Override
 protected void doPost(HttpServletRequest req, HttpServletResponse resp)
   throws ServletException, IOException {
  super.doPost(req, resp);
  this.doGet(req, resp);
 }
 
 public OutputStream getPDF(ServletContext context, OutputStream outputStream) {
        beanCollectionDataSource = new JRBeanCollectionDataSource(chiffreAffaireService.getList());
        parameters.put("debut", context.getRealPath("/report/"));

        InputStream is = context.getResourceAsStream("/report/ChiffreAffairePrestation.jrxml");

        try {
            report().setTemplateDesign(is)
                    .setDataSource(beanCollectionDataSource)
                    .setParameters(parameters).toPdf(outputStream);
        } catch (DRException e) {
            e.printStackTrace();
        }

        return outputStream;
    }

    public JRBeanCollectionDataSource getBeanCollectionDataSource() {
        return beanCollectionDataSource;
    }

    public void setBeanCollectionDataSource(JRBeanCollectionDataSource beanCollectionDataSource) {
        this.beanCollectionDataSource = beanCollectionDataSource;
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }
 
 
}