package com.github.adminfaces.starter.bean;

import com.github.adminfaces.starter.model.PrestationChiffreAffaire;
import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import com.github.adminfaces.starter.service.ChiffreAffaireService;
import com.github.adminfaces.template.exception.BusinessException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import static net.sf.dynamicreports.report.builder.DynamicReports.report;
import net.sf.dynamicreports.report.exception.DRException;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.omnifaces.io.DefaultServletOutputStream;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

/**
 * Created by rmpestano on 12/02/17.
 */
@Named
@SessionScoped
public class PrestationChiffreAffaireBean implements Serializable {

    private Integer yearCount;
    private List<Integer> years;
    private Integer anneeDebut;
    private Integer anneeFin;
    private Map<String, String> listPrest;
    private List<String> keyList;

    private JRBeanCollectionDataSource beanCollectionDataSource;
    private Map<String, Object> parameters;
    private JasperPrint jasperPrint;
    private String pdf;

    @Inject
    private ChiffreAffaireService chiffreAffaireService;

    @PostConstruct
    public void init() {
        anneeDebut = 2015;
        anneeFin = 2019;
        yearCount = 5;
        years = new ArrayList<>(yearCount);
        years.add(2015);
        years.add(2016);
        years.add(2017);
        years.add(2018);
        years.add(2019);
        
        listPrest = new HashMap<>();
        listPrest.put("1", "REDEVANCE MARCHANDISE");
        listPrest.put("5", "REDEVANCE NAVIRE");
        listPrest.put("7", "REDEVANCE DOMANIALE");
        listPrest.put("2", "REDEVANCE CONCESSION");
        listPrest.put("4", "REDEVANCE ELECTRICITE");
        listPrest.put("6", "REDEVANCE DIVERS");
        listPrest.put("A", "REDEVANCE A");
        keyList = new ArrayList<>(listPrest.keySet().stream().sorted().collect(Collectors.toList()));
    }

    public Double montantTotalParAn(Integer annee) {
//        Double total = 0.0 ;
//        for(String code : listPrest.keySet()){
//            total += getMontantPrest(annee, code);
//        }
//        return total;
        return chiffreAffaireService.getMontantTotalParAn(annee);
    }

    public void viewPdf() {
        setPdf("/report/ChiffreAffairePrestation.pdf");
        try {
            JRBeanCollectionDataSource data = new JRBeanCollectionDataSource(chiffreAffaireService.getList());
            String reportPath = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/report/ChiffreAffairePrestation.jrxml");
            jasperPrint = JasperFillManager.fillReport(JasperCompileManager.compileReport(reportPath), new HashMap<>(), data);
            JasperExportManager.exportReportToPdfFile(jasperPrint, FacesContext.getCurrentInstance().getExternalContext().getRealPath("/") + pdf);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public OutputStream PDF(ServletOutputStream out) throws JRException, IOException {
        JRBeanCollectionDataSource data = new JRBeanCollectionDataSource(chiffreAffaireService.getList());
        String reportPath = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/report/ChiffreAffairePrestation.jrxml");
        jasperPrint = JasperFillManager.fillReport(JasperCompileManager.compileReport(reportPath), new HashMap<>(), data);

        HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
        response.reset();
        response.setContentType("application/pdf");
        response.setHeader("Content-disposition", "attachment; filename=\"report.pdf\"");
        out = response.getOutputStream();
        JasperExportManager.exportReportToPdfStream(jasperPrint, out);

        return out;
//        FacesContext.getCurrentInstance().responseComplete();

    }

    public OutputStream getPDF(OutputStream outputStream) {
        beanCollectionDataSource = new JRBeanCollectionDataSource(chiffreAffaireService.getList());
        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
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

    public Double getMontantPrest(Integer annee, String prestation) {
        PrestationChiffreAffaire cp = new PrestationChiffreAffaire();
        List<PrestationChiffreAffaire> list = chiffreAffaireService.getList().stream()
                .filter(ca -> (ca.getPrestation().equalsIgnoreCase(prestation)) && (ca.getAnnee().intValue() == annee.intValue()))
                .collect(Collectors.toList());
        if (!list.isEmpty()) {
            cp = list.get(0);
            return cp.getMontant();
        } else {
            return 0.0;
        }

    }

    public void findByYear(Integer debut, Integer fin) {
        chiffreAffaireService.listByAn(debut, fin);
        anneeDebut = debut;
        anneeFin = fin;
        yearCount = fin - debut + 1;
        years.clear();
        for (int i = debut; i < fin + 1; i++) {
            years.add(i);
        }
    }

    public String getLibellePrestationParCode(String code) {
        String libelle = null;
        switch (code) {
            case "1":
                libelle = "REDEVANCE MARCHANDISE";
                break;
            case "2":
                libelle = "REDEVANCE CONCESSION";
                break;
            case "4":
                libelle = "REDEVANCE ELECTRICITE";
                break;
            case "5":
                libelle = "REDEVANCE NAVIRE";
                break;
            case "6":
                libelle = "REDEVANCE DIVERS";
                break;
            case "7":
                libelle = "REDEVANCE DOMANIALE";
                break;
            case "A":
                libelle = "AUTRES REDEVANCES";
                break;
            default: ;
        }
        return libelle;
    }

    public Integer getYearCount() {
        return yearCount;
    }

    public void setYearCount(Integer yearCount) {
        this.yearCount = yearCount;
    }

    public List<Integer> getYears() {
        return years;
    }

    public void setYears(List<Integer> years) {
        this.years = years;
    }

    public Map<String, String> getListPrest() {
        return listPrest;
    }

    public void setListPrest(Map<String, String> listPrest) {
        this.listPrest = listPrest;
    }

    public List<String> getKeyList() {
        return keyList;
    }

    public void setKeyList(List<String> keyList) {
        this.keyList = keyList;
    }

    public Integer getAnneeDebut() {
        return anneeDebut;
    }

    public void setAnneeDebut(Integer anneeDebut) {
        this.anneeDebut = anneeDebut;
    }

    public Integer getAnneeFin() {
        return anneeFin;
    }

    public void setAnneeFin(Integer anneeFin) {
        this.anneeFin = anneeFin;
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

    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

}
