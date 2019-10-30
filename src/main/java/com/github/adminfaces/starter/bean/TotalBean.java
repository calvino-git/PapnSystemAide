package com.github.adminfaces.starter.bean;

import com.github.adminfaces.starter.model.PrestationChiffreAffaire;
import com.github.adminfaces.starter.service.ChiffreAffaireService;
import com.github.adminfaces.starter.service.EscaleService;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import org.primefaces.model.charts.ChartData;
import org.primefaces.model.charts.axes.cartesian.CartesianScales;
import org.primefaces.model.charts.axes.cartesian.linear.CartesianLinearAxes;
import org.primefaces.model.charts.axes.cartesian.linear.CartesianLinearTicks;
import org.primefaces.model.charts.bar.BarChartDataSet;
import org.primefaces.model.charts.bar.BarChartModel;
import org.primefaces.model.charts.bar.BarChartOptions;
import org.primefaces.model.charts.optionconfig.legend.Legend;
import org.primefaces.model.charts.optionconfig.title.Title;

@ApplicationScoped
@Named
public class TotalBean implements Serializable {
    @Inject
    private EscaleService escaleService;
    @Inject
    private ChiffreAffaireService chiffreAffaireService;
    private BarChartModel chiffreAffaireBar;
    private List<Integer> years;
    Double totalParAn;

    @PostConstruct
    public void init(){
        years = new ArrayList<>(5);
        years.add(2015);
        years.add(2016);
        years.add(2017);
        years.add(2018);
        years.add(2019);
        FacesContext.getCurrentInstance().getViewRoot().setLocale(Locale.FRANCE);
        Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
        System.out.println(locale.getLanguage() + "_" + locale.getCountry());
        createChiffreAffaireBarChart();
    }
    
    public void createChiffreAffaireBarChart() {
        chiffreAffaireBar = new BarChartModel();
        ChartData data = new ChartData();
        
        BarChartDataSet barDataSet = new BarChartDataSet();
        barDataSet.setLabel("Montant HT");
        barDataSet.setBackgroundColor("rgba(255, 51, 51, 0.2)");
        barDataSet.setBorderColor("rgb(255, 51, 51)");
        barDataSet.setBorderWidth(1);

        List<Number> values = new ArrayList<>();
        
        List<String> labels = new ArrayList<>();
        years.forEach(annee -> {
            labels.add(annee.toString());
            totalParAn = 0.0;
            List<PrestationChiffreAffaire> list = chiffreAffaireService.getList().stream().filter(ca -> ca.getAnnee().equals(annee)).collect(Collectors.toList());
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
        cScales.addYAxesData(linearAxes);
        options.setScales(cScales);
        
        Title title = new Title();
        title.setDisplay(true);
        title.setText("CHIFFRE D'AFFAIRE");
        options.setTitle(title);
        Legend legend = new Legend();
        legend.setPosition("ne");
        legend.setDisplay(true);
        options.setLegend(legend);
        
        
        chiffreAffaireBar.setOptions(options);
    }
    
    @Produces
    @Named("nombreEscaleByAnnee")
    public Long nombreEscaleByAnnee() {
        return escaleService.getNombreEscaleByAnnee("PARTI","2019");
    }
    @Produces
    @Named("nombrePetitEscaleByAnnee")
    public Long nombrePetitEscaleByAnnee() {
        return escaleService.getNombrePetitEscaleByAnnee("PARTI","2019");
    }
    @Produces
    @Named("nombreGrandEscaleByAnnee")
    public Long nombreGrandEscaleByAnnee() {
        return escaleService.getNombreGrandEscaleByAnnee("PARTI","2019");
    }
     @Produces
    @Named("montantTotalParAn")
    public Double montantTotalParAn() {
        return chiffreAffaireService.getMontantTotalParAn(2019);
    }

    public BarChartModel getChiffreAffaireBar() {
        return chiffreAffaireBar;
    }

    public void setChiffreAffaireBar(BarChartModel chiffreAffaireBar) {
        this.chiffreAffaireBar = chiffreAffaireBar;
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

    

}
