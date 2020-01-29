package com.github.adminfaces.starter.bean;

import com.github.adminfaces.starter.model.Document;
import com.github.adminfaces.starter.model.PrestationChiffreAffaire;
import com.github.adminfaces.starter.service.ChiffreAffaireService;
import com.github.adminfaces.starter.service.ConteneurCongoTerminalService;
import com.github.adminfaces.starter.service.DocumentService;
import com.github.adminfaces.starter.service.EscaleService;
import java.beans.EventHandler;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import javax.ejb.Schedule;
import javax.faces.context.FacesContext;
import org.primefaces.model.TreeNode;
import org.primefaces.model.charts.ChartData;
import org.primefaces.model.charts.axes.cartesian.CartesianScales;
import org.primefaces.model.charts.axes.cartesian.linear.CartesianLinearAxes;
import org.primefaces.model.charts.axes.cartesian.linear.CartesianLinearTicks;
import org.primefaces.model.charts.bar.BarChartDataSet;
import org.primefaces.model.charts.bar.BarChartModel;
import org.primefaces.model.charts.bar.BarChartOptions;
import org.primefaces.model.charts.optionconfig.title.Title;

@Named
@ApplicationScoped
public class TotalBean implements Serializable {

    @Inject
    private EscaleService escaleService;
    @Inject
    private ChiffreAffaireService chiffreAffaireService;
    @Inject
    private ConteneurCongoTerminalService cctService;
    private TreeNode root;

    private Document selectedDocument;

    private Integer anneeEnCours;

    @Inject
    private DocumentService documentService;
    private List<Integer> years;
    private Double totalParAn;

    @PostConstruct
    public void init() {
        anneeEnCours = LocalDate.now().getYear()-1;
        years = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            years.add(anneeEnCours - i);
        }
        updateRoot();
        FacesContext.getCurrentInstance().getViewRoot().setLocale(Locale.FRANCE);
        System.out.println("TotalBean est initialisé...");
    }

    public void updateRoot() {
        root = documentService.createDocuments();
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setDocumentService(DocumentService documentService) {
        this.documentService = documentService;
    }

    public Document getSelectedDocument() {
        return selectedDocument;
    }

    public void setSelectedDocument(Document selectedDocument) {
        this.selectedDocument = selectedDocument;
    }

    public BarChartModel createChiffreAffaireBarChart() {
        BarChartModel chiffreAffaireBar = new BarChartModel();
        ChartData data = new ChartData();

        BarChartDataSet barDataSet = new BarChartDataSet();
        barDataSet.setLabel("Montant HT");
        barDataSet.setBackgroundColor("rgba(51, 51, 255, 0.2)");
        barDataSet.setBorderColor("rgb(51, 51, 255)");
        barDataSet.setBorderWidth(0.5);

        List<Number> values = new ArrayList<>();

        List<String> labels = new ArrayList<>();

        years.forEach(annee -> {
            labels.add(annee.toString());
            totalParAn = 0.0;

            List<PrestationChiffreAffaire> list = chiffreAffaireService.getListStatic().stream().filter(ca -> ca.getAnnee().equals(annee)).collect(Collectors.toList());
            list.forEach(p -> {
                totalParAn += p.getMontant();
            });
            values.add(totalParAn);
        });
        barDataSet.setData(values);
        data.addChartDataSet(barDataSet);
        data.setLabels(labels);
        chiffreAffaireBar.setData(data);

        //Options
        BarChartOptions options = new BarChartOptions();
        CartesianScales cScales = new CartesianScales();
        CartesianLinearAxes linearAxes = new CartesianLinearAxes();
        CartesianLinearTicks ticks = new CartesianLinearTicks();
        ticks.setBeginAtZero(true);
        linearAxes.setTicks(ticks);
        linearAxes.setOffset(true);
        cScales.addYAxesData(linearAxes);
        options.setScales(cScales);

        Title title = new Title();
        title.setDisplay(true);
        title.setText("CHIFFRE D'AFFAIRE");
        options.setTitle(title);

        chiffreAffaireBar.setOptions(options);
        return chiffreAffaireBar;
    }

    @Produces
    @Named("nombreEscaleByAnnee")
    public Long nombreEscaleByAnnee() {
        return escaleService.getNombreEscaleByAn();
    }

    @Produces
    @Named("nombrePetitEscaleByAnnee")
    public Long nombrePetitEscaleByAnnee() {
        return escaleService.getNombrePetitEscaleByAn();
    }

    @Produces
    @Named("nombreGrandEscaleByAnnee")
    public Long nombreGrandEscaleByAnnee() {
        return escaleService.getNombreGrandEscaleByAn();
    }

    @Produces
    @Named("montantTotalParAn")
    public Double montantTotalParAn() {
        return chiffreAffaireService.getTotalRecetteParAn();
    }

    @Produces
    @Named("tonnageConteneurParAn")
    public BigInteger tonnageConteneurParAn() {
        return BigInteger.valueOf(Math.round((cctService.getTotalTonnageParAn().doubleValue() / 1000)));
    }

    @Produces
    @Named("totalEVPParAn")
    public BigInteger totalEVPParAn() {
        return cctService.getTotalEVPParAn();
    }

    @Produces
    @Named("totalImpEVPParAn")
    public BigInteger totalImpEVPParAn() {
        return cctService.getTotalImpEVPParAn();
    }

    @Produces
    @Named("totalExpEVPParAn")
    public BigInteger totalExpEVPParAn() {
        return cctService.getTotalExpEVPParAn();
    }

    @Produces
    @Named("totalTrbEVPParAn")
    public BigInteger totalTrbEVPParAn() {
        return cctService.getTotalTrbEVPParAn();
    }

    @Produces
    @Named("totalTstEVPParAn")
    public BigInteger totalTstEVPParAn() {
        return cctService.getTotalTstEVPParAn();
    }

    @Produces
    @Named("totalImpTonnageParAn")
    public BigInteger totalImpTonnageParAn() {
        return BigInteger.valueOf(Math.round((cctService.getTotalImpTonnageParAn().doubleValue() / 1000)));
    }

    @Produces
    @Named("totalExpTonnageParAn")
    public BigInteger totalExpTonnageParAn() {
        return BigInteger.valueOf(Math.round((cctService.getTotalExpTonnageParAn().doubleValue() / 1000)));
    }

    @Produces
    @Named("totalTrbTonnageParAn")
    public BigInteger totalTrbTonnageParAn() {
        return BigInteger.valueOf(Math.round((cctService.getTotalTrbTonnageParAn().doubleValue() / 1000)));
    }

    @Produces
    @Named("totalTstTonnageParAn")
    public BigInteger totalTstTonnageParAn() {
        return BigInteger.valueOf(Math.round((cctService.getTotalTstTonnageParAn().doubleValue() / 1000)));
    }

    @Produces
    @Named("chiffreAffaireBar")
    public BarChartModel chiffreAffaireBar() {
        return createChiffreAffaireBarChart();
    }

    @Produces
    @Named("root")
    public TreeNode produceRoot() {
        return root;
    }

    @Produces
    @Named("selectedDocument")
    public Document produceSelectedDocument() {
        return selectedDocument;
    }

    public List<Integer> getYears() {
        return years;
    }

    public void setYears(List<Integer> years) {
        this.years = years;
    }

    public Double getTotalParAn() {
        return totalParAn;
    }

    public void setTotalParAn(Double totalParAn) {
        this.totalParAn = totalParAn;
    }

    public Integer getAnneeEnCours() {
        return anneeEnCours;
    }

    public void setAnneeEnCours(Integer anneeEnCours) {
        this.anneeEnCours = anneeEnCours;
    }

}
