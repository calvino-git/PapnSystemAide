package com.github.adminfaces.starter.bean;

import com.github.adminfaces.starter.model.PrestationChiffreAffaire;
import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.github.adminfaces.starter.service.ChiffreAffaireService;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import static net.sf.dynamicreports.report.builder.DynamicReports.report;
import net.sf.dynamicreports.report.exception.DRException;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleXlsxReportConfiguration;
import org.omnifaces.util.Faces;
import org.primefaces.event.ItemSelectEvent;
import org.primefaces.model.charts.ChartData;
import org.primefaces.model.charts.axes.cartesian.CartesianScales;
import org.primefaces.model.charts.axes.cartesian.linear.CartesianLinearAxes;
import org.primefaces.model.charts.axes.cartesian.linear.CartesianLinearTicks;
import org.primefaces.model.charts.bar.BarChartDataSet;
import org.primefaces.model.charts.bar.BarChartModel;
import org.primefaces.model.charts.bar.BarChartOptions;
import org.primefaces.model.charts.optionconfig.title.Title;

/**
 * Created by rmpestano on 12/02/17.
 */
@Named
@SessionScoped
public class PrestationChiffreAffaireBean implements Serializable {

    private Integer yearCount;
    private List<Integer> years;
    private String labels;
    private String listMnt;
    private Integer anneeDebut;
    private Integer anneeFin;
    private Map<String, String> listPrest;
    private List<String> keyList;
    private String pdf;

    private JRBeanCollectionDataSource beanCollectionDataSource;
    private Map<String, Object> parameters;
    private JasperPrint jasperPrint;
    private BarChartModel barModel2;

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

        JsonArrayBuilder totals = Json.createArrayBuilder();
        JsonArrayBuilder totalCosts = Json.createArrayBuilder();
        for (Integer year : years) {
            totals.add(year);
            Double mnt = Math.ceil(montantTotalParAn(year));
            totalCosts.add(mnt);
        }
        labels = totals.build().toString();
        listMnt = totalCosts.build().toString();

        listPrest = new HashMap<>();
        listPrest.put("5", "REDEVANCE NAVIRE");
        listPrest.put("1", "REDEVANCE MARCHANDISE");
        listPrest.put("7", "REDEVANCE DOMANIALE");
        listPrest.put("4", "REDEVANCE ELECTRICITE");
        listPrest.put("6", "REDEVANCE DIVERS");
        listPrest.put("2", "REDEVANCE CONCESSION");
        listPrest.put("A", "AUTRES REDEVANCES");
        keyList = new ArrayList<>(listPrest.values().stream().sorted((o1, o2) -> {
            return o2.compareToIgnoreCase(o1); //To change body of generated lambdas, choose Tools | Templates.
        }).collect(Collectors.toList()));
        createBarModel2();
    }

    public Double montantTotalParAn(Integer annee) {
        return chiffreAffaireService.getMontantTotalParAn(annee);
    }

    public void itemSelect(ItemSelectEvent event) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected",
                "Item Index: " + event.getItemIndex() + ", DataSet Index:" + event.getDataSetIndex());

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void createBarModel2() {
        barModel2 = new BarChartModel();
        ChartData data = new ChartData();

        BarChartDataSet barDataSet = new BarChartDataSet();
        barDataSet.setLabel("NAVIRE");
        barDataSet.setBackgroundColor("rgba(255, 51, 51, 0.2)");
        barDataSet.setBorderColor("rgb(255, 51, 51)");
        barDataSet.setBorderWidth(1);

        BarChartDataSet barDataSet2 = new BarChartDataSet();
        barDataSet2.setLabel("MARCHANDISE");
        barDataSet2.setBackgroundColor("rgba(0, 128, 255, 0.2)");
        barDataSet2.setBorderColor("rgb(0, 128, 255)");
        barDataSet2.setBorderWidth(1);

        BarChartDataSet barDataSet3 = new BarChartDataSet();
        barDataSet3.setLabel("ELECTRICITE");
        barDataSet3.setBackgroundColor("rgba(0, 204, 0, 0.2)");
        barDataSet3.setBorderColor("rgb(0, 204, 0)");
        barDataSet3.setBorderWidth(1);

        BarChartDataSet barDataSet4 = new BarChartDataSet();
        barDataSet4.setLabel("DOMAINE");
        barDataSet4.setBackgroundColor("rgba(255, 128, 0, 0.2)");
        barDataSet4.setBorderColor("rgb(255, 128, 0)");
        barDataSet4.setBorderWidth(1);

        BarChartDataSet barDataSet5 = new BarChartDataSet();
        barDataSet5.setLabel("CONCESSION");
        barDataSet5.setBackgroundColor("rgba(128, 128, 128, 0.2)");
        barDataSet5.setBorderColor("rgb(128, 128, 128)");
        barDataSet5.setBorderWidth(1);

        BarChartDataSet barDataSet6 = new BarChartDataSet();
        barDataSet6.setLabel("DIVERS");
        barDataSet6.setBackgroundColor("rgba(127, 0, 255, 0.2)");
        barDataSet6.setBorderColor("rgb(127, 0, 255)");
        barDataSet6.setBorderWidth(1);

        BarChartDataSet barDataSet7 = new BarChartDataSet();
        barDataSet7.setLabel("AUTRES");
        barDataSet7.setBackgroundColor("rgba(51, 51, 255, 0.2)");
        barDataSet7.setBorderColor("rgb(51, 51, 255)");
        barDataSet7.setBorderWidth(1);

        List<Number> values = new ArrayList<>();
        List<Number> values2 = new ArrayList<>();
        List<Number> values3 = new ArrayList<>();
        List<Number> values4 = new ArrayList<>();
        List<Number> values5 = new ArrayList<>();
        List<Number> values6 = new ArrayList<>();
        List<Number> values7 = new ArrayList<>();

        List<String> labels = new ArrayList<>();
        years.forEach(annee -> {
            labels.add(annee.toString());
            values.add(montantPrestationParAn(annee, listPrest.get("5")));
            values2.add(montantPrestationParAn(annee, listPrest.get("1")));
            values3.add(montantPrestationParAn(annee, listPrest.get("4")));
            values4.add(montantPrestationParAn(annee, listPrest.get("7")));
            values5.add(montantPrestationParAn(annee, listPrest.get("6")));
            values6.add(montantPrestationParAn(annee, listPrest.get("2")));
            values7.add(montantPrestationParAn(annee, listPrest.get("A")));
        });
        barDataSet.setData(values);
        barDataSet2.setData(values2);
        barDataSet3.setData(values3);
        barDataSet4.setData(values4);
        barDataSet5.setData(values5);
        barDataSet6.setData(values6);
        barDataSet7.setData(values7);

        data.addChartDataSet(barDataSet);
        data.addChartDataSet(barDataSet2);
        data.addChartDataSet(barDataSet3);
        data.addChartDataSet(barDataSet4);
        data.addChartDataSet(barDataSet5);
        data.addChartDataSet(barDataSet6);
        data.addChartDataSet(barDataSet7);

        data.setLabels(labels);
        barModel2.setData(data);

        //Options
        BarChartOptions options = new BarChartOptions();
        CartesianScales cScales = new CartesianScales();
        CartesianLinearAxes linearAxes = new CartesianLinearAxes();
        CartesianLinearTicks ticks = new CartesianLinearTicks();
        ticks.setBeginAtZero(true);
        linearAxes.setTicks(ticks);
        cScales.addYAxesData(linearAxes);
        options.setScales(cScales);

        Title title = new Title();
        title.setDisplay(true);
        title.setText("CHIFFRE D'AFFAIRE");
        options.setTitle(title);

        barModel2.setOptions(options);
    }

    public void viewPdf() {
//        setPdf("/report/ChiffreAffairePrestation.pdf");
//        try {
//            JRBeanCollectionDataSource data = new JRBeanCollectionDataSource(chiffreAffaireService.getList());
//            String reportPath = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/report/ChiffreAffairePrestation.jrxml");
//            jasperPrint = JasperFillManager.fillReport(JasperCompileManager.compileReport(reportPath), new HashMap<>(), data);
//            JasperExportManager.exportReportToPdfFile(jasperPrint, FacesContext.getCurrentInstance().getExternalContext().getRealPath("") + pdf);
//            Faces.redirect("viewPdf.xhtml");
//        } catch (JRException e) {
//            e.printStackTrace();
//        }
        Faces.redirect("viewPdf.xhtml");

    }

    public void exportExcel() throws JRException, IOException {
        JRBeanCollectionDataSource data = new JRBeanCollectionDataSource(chiffreAffaireService.getList());
        String reportPath = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/report/ChiffreAffairePrestation.jrxml");
        jasperPrint = JasperFillManager.fillReport(JasperCompileManager.compileReport(reportPath), new HashMap<>(), data);

        HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
        SimpleXlsxReportConfiguration configuration = new SimpleXlsxReportConfiguration();
        configuration.setOnePagePerSheet(true);
        configuration.setIgnoreGraphics(false);
        JRXlsxExporter exporter = new JRXlsxExporter();
        exporter.setExporterInput(new SimpleExporterInput(jasperPrint));

        response.reset();
        response.setContentType("application/xlsx");
        response.setHeader("Content-disposition", "attachment; filename=\"report.xlsx\"");
        ServletOutputStream out = response.getOutputStream();
        exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(out));
        exporter.setConfiguration(configuration);
        exporter.exportReport();
        FacesContext.getCurrentInstance().responseComplete();

    }

    public OutputStream getPDF(ServletContext context, OutputStream outputStream) {
        beanCollectionDataSource = new JRBeanCollectionDataSource(chiffreAffaireService.listByAn(anneeDebut, anneeFin));
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

    public Double montantPrestationParAn(Integer annee, String prestation) {
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
        createBarModel2();
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

    public BarChartModel getBarModel2() {
        return barModel2;
    }

    public void setBarModel2(BarChartModel barModel2) {
        this.barModel2 = barModel2;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public String getListMnt() {
        return listMnt;
    }

    public void setListMnt(String listMnt) {
        this.listMnt = listMnt;
    }

}
