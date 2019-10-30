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
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
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
 * @author Calvin ILOKI
 */
@WebServlet("/pdf")
public class PdfReportServlet extends HttpServlet {

    private JRBeanCollectionDataSource beanCollectionDataSource;
    private Map<String, Object> parameters = new HashMap<>();
    @Inject
    private ChiffreAffaireService chiffreAffaireService;
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        byte[] content = (byte[]) request.getSession().getAttribute("reportBytes");
        response.setContentType("application/pdf");

        OutputStream out = response.getOutputStream();
        System.out.println(getServletContext().getRealPath("/report/"));
        Integer debut = Integer.valueOf(request.getParameter("deb"));
        Integer fin = Integer.valueOf(request.getParameter("fin"));
        System.out.println("debut " + debut );
        System.out.println("fin " + fin );
        out = getPDF(getServletContext(),out,debut, fin);
        out.close();

    }

    public OutputStream getPDF(ServletContext context, OutputStream outputStream, Integer debut, Integer fin) {
        System.out.println("debut " + debut );
        System.out.println("fin " + fin );
        beanCollectionDataSource = new JRBeanCollectionDataSource(chiffreAffaireService.listByAn(debut,fin).stream().sorted((o1, o2) -> {
            return o2.getPrestation().compareToIgnoreCase(o1.getPrestation()); //To change body of generated lambdas, choose Tools | Templates.
        }).collect(Collectors.toList()));
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
