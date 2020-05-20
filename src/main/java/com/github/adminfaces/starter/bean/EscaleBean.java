package com.github.adminfaces.starter.bean;

import com.github.adminfaces.persistence.bean.BeanService;
import static com.github.adminfaces.persistence.util.Messages.addDetailMessage;
import static com.github.adminfaces.persistence.util.Messages.getMessage;
import static com.github.adminfaces.template.util.Assert.has;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import com.github.adminfaces.persistence.bean.CrudMB;
import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.persistence.service.Service;
import com.github.adminfaces.starter.model.Colis;
import com.github.adminfaces.starter.model.Container;
import com.github.adminfaces.starter.model.Escale;
import com.github.adminfaces.starter.model.GeneralInfo;
import com.github.adminfaces.starter.model.Port;
import com.github.adminfaces.starter.model.Quais;
import com.github.adminfaces.starter.model.Trafic;
import com.github.adminfaces.starter.model.TypeNavire;
import com.github.adminfaces.starter.model.VueAllEvp;
import com.github.adminfaces.starter.service.EscaleService;
import com.github.adminfaces.starter.service.ConteneurCTService;
import com.github.adminfaces.template.exception.BusinessException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import org.omnifaces.util.Faces;

/**
 * Created by rmpestano on 12/02/17.
 */
@Named
@ViewScoped
@BeanService(EscaleService.class)
public class EscaleBean extends CrudMB<Escale> implements Serializable {

    @Inject
    private EscaleService escaleService;

    private String numeroEscale;
    private List<Date> range;
    private SimpleDateFormat dateFormat;
    private SimpleDateFormat format;
    private int nombreBLs;
    private int nombreManifestes;
    private int nombreCTNs;
    private double poidsTotal;
    int countPlein;
    int countVide;
    int total;
    private List<Object> dataTrafic;
    private List<VueAllEvp> listEVP;

    @PostConstruct
    public void initBean() {
        init();
        dataTrafic = new ArrayList(0);
        dateFormat = new SimpleDateFormat("yyyyMMdd");
        format = new SimpleDateFormat("yyyyMMddhhmm");
    }

    public List<String> completeNavire(String query) {
        List<String> result = escaleService.listNavires(query)
                .stream()
                .sorted((o1, o2) -> {
                    return o1.compareToIgnoreCase(o2);
                }).collect(Collectors.toList());
        return result;
    }

    public List<TypeNavire> completeTypeNavire(String query) {
        List<TypeNavire> liste = escaleService.listeTypeNavireContains("%" + query + "%")
                .stream()
                .sorted((o1, o2) -> {
                    return o1.getLibelle().compareToIgnoreCase(o2.getLibelle());
                }).collect(Collectors.toList());
        return liste;
    }
    
    public List<Quais> completeQuai(String query) {
        List<Quais> liste = escaleService.listeQuai(query);
        return liste;
    }

    public void findEscaleByNumero(String numeroEscale) {
        if (numeroEscale == null) {
            throw new BusinessException("Merci de saisir le numero d'escale à 10 chiffres");
        }
        Escale escaleFound = escaleService.findEscaleParNumero(numeroEscale);
        if (escaleFound == null) {
            throw new BusinessException(String.format("Aucune escale correspondant au numero %s",
                    numeroEscale));
        }
        selection = escaleFound;
        clear();
        getFilter().addParam("numero", numeroEscale);
    }

    public String getSearchCriteria() {
        StringBuilder sb = new StringBuilder(21);

        String navireParam = null;
        Escale escaleFilter = filter.getEntity();

        Integer numeroParam = null;
        if (filter.hasParam("numero")) {
            numeroParam = filter.getIntParam("numero");
        }

        if (has(numeroParam)) {
            sb.append("<b>numero</b>: ").append(numeroParam).append(", ");
        }

        if (filter.hasParam("navire")) {
            navireParam = filter.getStringParam("navire");
        } else if (has(escaleFilter) && escaleFilter.getNavire() != null) {
            navireParam = escaleFilter.getNavire();
        }

        if (has(navireParam)) {
            sb.append("<b>navire</b>: ").append(navireParam).append(", ");
        }

        String situationParam = null;
        if (filter.hasParam("situation")) {
            situationParam = filter.getStringParam("price");
        } else if (has(escaleFilter) && escaleFilter.getSituat() != null) {
            situationParam = escaleFilter.getSituat();
        }

        if (has(situationParam)) {
            sb.append("<b>situation</b>: ").append(situationParam).append(", ");
        }

        if (filter.hasParam("debutETA")) {
            sb.append("<b>").append(getMessage("label.debutETA")).append("</b>: ")
                    .append(filter.getParam("debutETA")).append(", ");
        }

        if (filter.hasParam("finETA")) {
            sb.append("<b>").append(getMessage("label.finETA")).append("</b>: ")
                    .append(filter.getParam("finETA")).append(", ");
        }

        int commaIndex = sb.lastIndexOf(",");

        if (commaIndex != -1) {
            sb.deleteCharAt(commaIndex);
        }

        if (sb.toString().trim().isEmpty()) {
            return "pas de critère";
        }

        return sb.toString();
    }

    public String getNumeroEscale() {
        return numeroEscale;
    }

    public void setNumeroEscale(String numeroEscale) {
        this.numeroEscale = numeroEscale;
    }

    public List<Date> getRange() {
        return range;
    }

    public void setRange(List<Date> range) {
        if (has(range)) {
            getFilter().addParam("debutETA", range.get(0))
                    .addParam("finETA", range.get(range.size() - 1));
        }
        this.range = range;
    }

    public EscaleService getEscaleService() {
        return escaleService;
    }

    public void setEscaleService(EscaleService escaleService) {
        this.escaleService = escaleService;
    }

    public SimpleDateFormat getDateFormat() {
        return dateFormat;
    }

    public SimpleDateFormat getFormat() {
        return format;
    }

    public void setFormat(SimpleDateFormat format) {
        this.format = format;
    }

    public int getNombreCTNs() {
        nombreCTNs = 0;
        this.entity.getGeneralInfoCollection().forEach(manifeste -> {
            nombreCTNs += manifeste.getTotalNumberOfContainers();
        });
        return nombreCTNs;
    }

    public int getNombreBLs() {
        nombreBLs = 0;
        this.entity.getGeneralInfoCollection().forEach(manifeste -> {
            nombreBLs += manifeste.getTotalNumberOfBols();
        });
        return nombreBLs;
    }

    public int getNombreManifestes() {
        nombreManifestes = entity.getGeneralInfoCollection().size();
        return nombreManifestes;
    }

    public double getPoidsTotal() {
        poidsTotal = 0;
        this.entity.getGeneralInfoCollection().forEach(manifeste -> {
            poidsTotal += manifeste.getTotalGrossMass();
        });
        return poidsTotal;
    }

    public List<Object> genererDataFromDouaneByTrafic(String trafic) {
        dataTrafic.clear();
        countPlein = 0;
        countVide = 0;
        List<GeneralInfo> manifeste = new ArrayList();
        if (trafic.contains("I")) {
            manifeste = entity.getGeneralInfoCollection().stream()
                    .filter(m -> m.getPlaceOfDestinationCode().equalsIgnoreCase("POINTE-NOIRE"))
                    .collect(Collectors.toList());
        }

        if (trafic.contains("E")) {
            manifeste = entity.getGeneralInfoCollection().stream()
                    .filter(m -> m.getPlaceOfDepartureCode().equalsIgnoreCase("POINTE-NOIRE"))
                    .collect(Collectors.toList());
        }

        manifeste.forEach(m -> {
            m.getBlCollection().stream()
                    .filter(bl -> bl.getBolNature().contains(trafic))
                    .collect(Collectors.toList())
                    .forEach(bl -> {
                        Long nbrCtnPleinByBl = bl.getContainerCollection().stream()
                                .filter(c -> c.getEmptyFull().equalsIgnoreCase("1/1"))
                                .collect(Collectors.counting());
                        countPlein += nbrCtnPleinByBl.intValue();
                        Long nbrCtnVideByBl = bl.getContainerCollection().stream()
                                .filter(c -> c.getEmptyFull().equalsIgnoreCase("0/0"))
                                .collect(Collectors.counting());
                        countVide += nbrCtnVideByBl.intValue();
                    });
        });
        dataTrafic.add(countPlein);
        dataTrafic.add(countVide);
        dataTrafic.add(Math.addExact(countPlein, countVide));
        return dataTrafic;
    }

    public void refreshEVPData() {
        listEVP = escaleService.dataEVPbyEscale(entity.getNumero());
    }

    public List<Object> genererDataByTrafic(String trafic, String source) {
        dataTrafic.clear();
        countPlein = 0;
        countVide = 0;
        total = 0;
        List<VueAllEvp> liste = listEVP.stream()
                .filter(e -> e.getTrafic().contains(trafic) && e.getSource().equalsIgnoreCase(source))
                .collect(Collectors.toList());
        liste.forEach(evp -> {
            countPlein += evp.getPlein().intValue();
            countVide += evp.getVide().intValue();
            total += evp.getTotalEvp().intValue();
        });
        dataTrafic.add(countPlein);
        dataTrafic.add(countVide);
        dataTrafic.add(total);
        return dataTrafic;
    }

    public List<Object> genererDataFromColisByTrafic(String trafic) {
        dataTrafic.clear();
        countPlein = 0;
        countVide = 0;
        List<Trafic> trafics = entity.getTraficCollection().stream()
                .filter(t -> t.getTrafic().contains(trafic))
                .collect(Collectors.toList());
        trafics.forEach(t -> {
            t.getPortCollection().forEach(p -> {
                p.getBlCollection().forEach(bl -> {
                    int nbrCtnPleinByBl = bl.getColisCollection().stream()
                            .filter(c -> c.getPlvVde().equalsIgnoreCase("PLEIN"))
                            .collect(Collectors.summingInt(Colis::getNombre));
                    countPlein += nbrCtnPleinByBl;
                    int nbrCtnVideByBl = bl.getColisCollection().stream()
                            .filter(c -> c.getPlvVde().equalsIgnoreCase("VIDE"))
                            .collect(Collectors.summingInt(Colis::getNombre));
                    countVide += nbrCtnVideByBl;
                });
            });
        });
        dataTrafic.add(countPlein);
        dataTrafic.add(countVide);
        dataTrafic.add(Math.addExact(countPlein, countVide));
        return dataTrafic;
    }

    public List<Object> getDataTrafic() {
        return dataTrafic;
    }

    public void setDataTrafic(List<Object> impTrafic) {
        this.dataTrafic = impTrafic;
    }

    public List<VueAllEvp> getListEVP() {
        return listEVP;
    }

    public void setListEVP(List<VueAllEvp> listEVP) {
        this.listEVP = listEVP;
    }

}
