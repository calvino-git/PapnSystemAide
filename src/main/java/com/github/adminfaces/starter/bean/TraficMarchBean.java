package com.github.adminfaces.starter.bean;

import static com.github.adminfaces.template.util.Assert.has;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.github.adminfaces.persistence.bean.CrudMB;
import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.starter.model.TraficMarchandise;
import com.github.adminfaces.starter.service.TraficMarchandiseService;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.view.ViewScoped;
import javax.json.Json;
import javax.json.JsonArrayBuilder;

/**
 * Created by rmpestano on 12/02/17.
 */
@Named("tmb")
@ApplicationScoped
public class TraficMarchBean extends CrudMB<TraficMarchandise> implements Serializable {

    @Inject
    TraficMarchandiseService traficMarchandiseService;

    private List<Date> periode;
    private Integer annee;
    private String labels;
    private String listeTonnage;
    private String listParMoisN;
    private String listParMoisN_1;
    private ArrayList<Integer> years;
    private List<TraficMarchandise> liste;
    private double total;

    @Inject
    public void initService() {
        setCrudService(traficMarchandiseService);
    }

    @PostConstruct
    public void initBean() {
        annee = LocalDate.now().getYear();
        liste = listParDate("20200101", "20201231");
        updateData(annee);
    }
    
    public void calculTotal(String trafic){
        total = liste.stream()
                .filter(tmb -> tmb.getTrafic().equalsIgnoreCase(trafic))
                .collect(Collectors.summingDouble(tmb->tmb.getPoids()));
    }

    public List<TraficMarchandise> listParDate(String dateDebut, String dateFin) {
        List<TraficMarchandise> result = traficMarchandiseService.listTraficMarchandiseParDate(dateDebut, dateFin);
        return result;
    }

    public void updateData(Integer an) {
        years = new ArrayList<>();
        for (int i = an - 4; i <= an; i++) {
            years.add(i);
        }

        JsonArrayBuilder totals = Json.createArrayBuilder();
        JsonArrayBuilder totalTonnage = Json.createArrayBuilder();
        JsonArrayBuilder dataParMoisN = Json.createArrayBuilder();
        JsonArrayBuilder dataParMoisN_1 = Json.createArrayBuilder();
        years.stream().map((year) -> {
            totals.add(year);
            return year;
        }).map((year) -> Math.ceil(tonnageTotalParAn(year))).forEachOrdered((ton) -> {
            totalTonnage.add(ton);
        });
        for (int i = 1; i <= 12; i++) {
            String t;
            if (i < 10) {
                t = "0" + i;
            } else {
                t = String.valueOf(i);
            }
            Double mnt1 = Math.ceil(tonnageTotalParMois(Integer.valueOf(an.toString() + "" + t)));
            Double mnt2 = Math.ceil(tonnageTotalParMois(Integer.valueOf((an - 1) + "" + t)));
            dataParMoisN.add(mnt1);
            dataParMoisN_1.add(mnt2);
        }
        labels = totals.build().toString();
        listeTonnage = totalTonnage.build().toString();
        listParMoisN = dataParMoisN.build().toString();
        listParMoisN_1 = dataParMoisN_1.build().toString();
    }

    public List<Date> getPeriode() {
        return periode;
    }

    public void setPeriode(List<Date> periode) {
        this.periode = periode;
        if (has(periode)) {
            filter.addParam("debut", periode.get(0));
            filter.addParam("fin", periode.get(1));
        }
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public String getListeTonnage() {
        return listeTonnage;
    }

    public void setListeTonnage(String listeTonnage) {
        this.listeTonnage = listeTonnage;
    }

    public String getListParMoisN() {
        return listParMoisN;
    }

    public void setListParMoisN(String listParMoisN) {
        this.listParMoisN = listParMoisN;
    }

    public String getListParMoisN_1() {
        return listParMoisN_1;
    }

    public void setListParMoisN_1(String listParMoisN_1) {
        this.listParMoisN_1 = listParMoisN_1;
    }

    private double tonnageTotalParAn(Integer year) {
        return traficMarchandiseService.tonnageTotalAn(year);
    }

    private double tonnageTotalParMois(Integer mois) {
        return traficMarchandiseService.tonnageTotalMois(mois);
    }

    public double tonnageParTrafic(String trafic) {
        return liste.stream().filter(m -> m.getTrafic().equals(trafic))
                .collect(Collectors.summingDouble(m -> m.getPoids() == null ? 0.0 : m.getPoids()));
    }

    public ArrayList<Integer> getYears() {
        return years;
    }

    public void setYears(ArrayList<Integer> years) {
        this.years = years;
    }

    public List<TraficMarchandise> getListe() {
        return liste;
    }

    public void setListe(List<TraficMarchandise> liste) {
        this.liste = liste;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
