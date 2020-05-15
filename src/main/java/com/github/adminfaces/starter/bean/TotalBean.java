package com.github.adminfaces.starter.bean;

import com.github.adminfaces.starter.model.Document;
import com.github.adminfaces.starter.model.DocumentEVP;
import com.github.adminfaces.starter.model.PrestationChiffreAffaire;
import com.github.adminfaces.starter.service.ChiffreAffaireService;
import com.github.adminfaces.starter.service.ConteneurCongoTerminalService;
import com.github.adminfaces.starter.service.DocumentEVPService;
import com.github.adminfaces.starter.service.DocumentService;
import com.github.adminfaces.starter.service.EscaleService;
import java.beans.EventHandler;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import javax.ejb.Schedule;
import javax.enterprise.context.SessionScoped;
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
@SessionScoped
public class TotalBean implements Serializable {

    @Inject
    private EscaleService escaleService;
    @Inject
    private ChiffreAffaireService chiffreAffaireService;
    @Inject
    private ConteneurCongoTerminalService cctService;
    @Inject
    private DocumentService documentService;
    @Inject
    private DocumentEVPService documentEVPService;

    private TreeNode root;
    private TreeNode rootEVP;
    private TreeNode rootEVPparAn;

    private Document selectedDocument;
    private DocumentEVP selectedDocumentEVP;

    private Integer anneeEnCours;

    private List<String> columnHeaders;
    private static List<String> VALID_COLUMN_KEYS;
    private List<TotalBean.ColumnModel> columns;
    private String columnTemplate = "id departEffectif type";

    private List<Integer> years;
    private Double totalParAn;
    
    private Date debut;
    private Date fin;

    @PostConstruct
    public void init() {
        anneeEnCours = LocalDate.now().getYear();
        years = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            years.add(anneeEnCours - i);
        }
        updateRoot();
        rootEVP = documentEVPService.createDocuments();
        rootEVPparAn = documentEVPService.createMainDocument();
        FacesContext.getCurrentInstance().getViewRoot().setLocale(Locale.FRANCE);
        
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//        try {
//            debut = format.parse(documentEVPService.getDebut());
//            fin = format.parse(documentEVPService.getFin());
//        } catch (ParseException ex) {
//            Logger.getLogger(MarchFactBean.class.getName()).log(Level.SEVERE, null, ex);
//        }

        columnHeaders = new ArrayList<>();
        DocumentEVP docEVP = new DocumentEVP();
        Field[] fields = docEVP.getClass().getDeclaredFields();
        int t = fields.length;
        for (int i = 0; i < t; i++) {
            String field = DocumentEVP.class.getDeclaredFields()[i].getName();
            columnHeaders.add(field);
        }
        VALID_COLUMN_KEYS = columnHeaders;
        createDynamicColumns();
        System.out.println("TotalBean est initialisé...");
    }

    public Date getDebut() {
        return debut;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public Date getFin() {
        return fin;
    }

    public DocumentEVP getSelectedDocumentEVP() {
        return selectedDocumentEVP;
    }

    public void setSelectedDocumentEVP(DocumentEVP selectedDocumentEVP) {
        this.selectedDocumentEVP = selectedDocumentEVP;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public List<String> getColumnHeaders() {
        return columnHeaders;
    }

    public void setColumnHeaders(List<String> columnHeaders) {
        this.columnHeaders = columnHeaders;
    }

    public static List<String> getVALID_COLUMN_KEYS() {
        return VALID_COLUMN_KEYS;
    }

    public static void setVALID_COLUMN_KEYS(List<String> VALID_COLUMN_KEYS) {
        TotalBean.VALID_COLUMN_KEYS = VALID_COLUMN_KEYS;
    }

    public List<ColumnModel> getColumns() {
        return columns;
    }

    public void setColumns(List<ColumnModel> columns) {
        this.columns = columns;
    }

    public String getColumnTemplate() {
        return columnTemplate;
    }

    public void setColumnTemplate(String columnTemplate) {
        this.columnTemplate = columnTemplate;
    }

    public TreeNode getRootEVPparAn() {
        return rootEVPparAn;
    }

    public void setRootEVPparAn(TreeNode rootEVPparAn) {
        this.rootEVPparAn = rootEVPparAn;
    }

    static public class ColumnModel implements Serializable {

        private String header;
        private String property;

        public ColumnModel(String header, String property) {
            this.header = header;
            this.property = property;
        }

        public String getHeader() {
            return header;
        }

        public String getProperty() {
            return property;
        }
    }

    private void createDynamicColumns() {
        List<String> columnKeys = columnHeaders.stream().filter(col -> !col.startsWith("_"))
                .collect(Collectors.toList());
        columns = new ArrayList<>();

        columnKeys.forEach((columnKey) -> {
            String key = columnKey;
            if (VALID_COLUMN_KEYS.contains(key)) {
                columns.add(new TotalBean.ColumnModel(columnKey.toUpperCase(), columnKey));
            }
        });
    }

    public TreeNode getRootEVP() {
        return rootEVP;
    }

    public void setRootEVP(TreeNode rootEVP) {
        this.rootEVP = rootEVP;
    }

    public void updateRoot() {
        root = documentService.createDocuments();
    }

    public void updateRootEVP() {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        rootEVP = documentEVPService.createDocuments();
    }
    public void updateRootEVPParAn() {
        rootEVPparAn = documentEVPService.createMainDocument();
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
    @Named("rootEVP")
    public TreeNode produceRootEVP() {
        return rootEVP;
    }
    
    @Produces
    @Named("rootEVPParAn")
    public TreeNode produceRootEVPParAn() {
        return rootEVPparAn;
    }

    @Produces
    @Named("selectedDocument")
    public Document produceSelectedDocument() {
        return selectedDocument;
    }
    @Produces
    @Named("selectedDocumentEVP")
    public DocumentEVP produceSelectedDocumentEVP() {
        return selectedDocumentEVP;
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
