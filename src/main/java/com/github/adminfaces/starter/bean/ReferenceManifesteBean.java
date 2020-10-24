package com.github.adminfaces.starter.bean;

import static com.github.adminfaces.persistence.util.Messages.addDetailMessage;
import static com.github.adminfaces.template.util.Assert.has;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import com.github.adminfaces.persistence.bean.CrudMB;
import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.persistence.service.Service;
import com.github.adminfaces.starter.model.ReferenceManifeste;
import com.github.adminfaces.starter.service.ManifesteService;
import com.github.adminfaces.starter.service.ReferenceManifesteService;
import com.github.adminfaces.starter.ws.RefManResult;
import com.github.adminfaces.template.exception.BusinessException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 * Created by rmpestano on 12/02/17.
 */
@Named
@ViewScoped
public class ReferenceManifesteBean extends CrudMB<ReferenceManifeste> implements Serializable {

    private Date debut;
    private Date fin;
    private String trafic;
    private SimpleDateFormat format;
    private Integer progress;

    @Inject
    ReferenceManifesteService referenceManifesteService;
    @Inject
    ManifesteService manifesteService;

    @Inject
    @Service
    CrudService<ReferenceManifeste, Integer> referenceManifesteCrudService; //generic injection example

    @Inject
    public void initService() {
        setCrudService(referenceManifesteService);
    }

    @PostConstruct
    public void initBean() {
        format = new SimpleDateFormat("yyyyMMdd-HHmm");
        ZoneId defaultZoneId = ZoneId.systemDefault();
        progress = 0;
        //creating the instance of LocalDate using the day, month, year info
        LocalDate localDate = LocalDate.now();

        //local date + atStartOfDay() + default time zone + toInstant() = Date
        debut = Date.from(localDate.minusDays(10).atStartOfDay(defaultZoneId).toInstant());
        fin = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
    }

    public void refresh() throws InterruptedException {
        progress = 10;
        ZoneId defaultZoneId = ZoneId.systemDefault();

        //creating the instance of LocalDate using the day, month, year info
        LocalDate localDate = LocalDate.now();

        //local date + atStartOfDay() + default time zone + toInstant() = Date
        Date today_6 = Date.from(localDate.minusDays(6).atStartOfDay(defaultZoneId).toInstant());
        Date today = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
        List<RefManResult> refManList_IMP = new ArrayList<>();
        List<RefManResult> refManList_EXP = new ArrayList<>();

        progress = 10;
        Thread.sleep(500);
        
        refManList_IMP = manifesteService.rechercherRefMan(today_6, today, "IMP");
        progress = 40;
        Thread.sleep(500);
        refManList_EXP = manifesteService.rechercherRefMan(today_6, today, "EXP");
        progress = 60;
        Thread.sleep(500);
        saveListRefmanparTrafic(refManList_EXP, "EXP");
        progress = 80;
        Thread.sleep(500);
        saveListRefmanparTrafic(refManList_IMP, "IMP");
        progress = 100;

    }

    public void telecharger(ReferenceManifeste refman) {
        try {
            RefManResult ref = referenceManifesteService.refmanToRef(refman);
            manifesteService.telechargerManifesteFromDouane(ref);
        } catch (IOException ex) {
            Logger.getLogger(ReferenceManifesteBean.class.getName()).log(Level.SEVERE, null, ex);
            throw new BusinessException(ex);
        }
    }

    public void findReferenceManifesteByNumero(String numero) {
        if (id == null) {
            throw new BusinessException("Provide ReferenceManifeste numero to load");
        }
        ReferenceManifeste referenceManifesteFound = referenceManifesteService.findByNumero(numero);
        if (referenceManifesteFound == null) {
            throw new BusinessException(String.format("No referenceManifeste found with numero %s", numero));
        }
        selectionList.add(referenceManifesteFound);
        getFilter().addParam("numero", numero);
    }
    
    public String getSearchCriteria() {
        StringBuilder sb = new StringBuilder(21);

        String navireParam = null;
        ReferenceManifeste referenceManifesteFilter = filter.getEntity();

        Integer idParam = null;
        if (filter.hasParam("id")) {
            idParam = filter.getIntParam("id");
        }

        if (has(idParam)) {
            sb.append("<b>id</b>: ").append(idParam).append(", ");
        }

        if (filter.hasParam("navire")) {
            navireParam = filter.getStringParam("navire");
        } else if (has(referenceManifesteFilter) && referenceManifesteFilter.getNavire() != null) {
            navireParam = referenceManifesteFilter.getNavire();
        }

        if (has(navireParam)) {
            sb.append("<b>navire</b>: ").append(navireParam).append(", ");
        }

        String consignataireParam = null;
        if (filter.hasParam("consignataire")) {
            consignataireParam = filter.getStringParam("consignataire");
        } else if (has(referenceManifesteFilter) && referenceManifesteFilter.getNomTransporteur() != null) {
            consignataireParam = referenceManifesteFilter.getNomTransporteur();
        }

        if (has(consignataireParam)) {
            sb.append("<b>consignataire</b>: ").append(consignataireParam).append(", ");
        }

        int commaIndex = sb.lastIndexOf(",");

        if (commaIndex != -1) {
            sb.deleteCharAt(commaIndex);
        }

        if (sb.toString().trim().isEmpty()) {
            return "No search criteria";
        }

        return sb.toString();
    }

    public void delete() {
        int numReferenceManifestes = 0;
        for (ReferenceManifeste selectedReferenceManifeste : selectionList) {
            numReferenceManifestes++;
            referenceManifesteService.remove(selectedReferenceManifeste);
        }
        selectionList.clear();
        addDetailMessage(numReferenceManifestes + "referenceManifestes deleted successfully!");
        clear();
    }

    
    public List<String> completeConsignataire(String query) {
        List<String> result = referenceManifesteService.getConsignataires(query);
        return result;
    }

    public void saveListRefmanparTrafic(List<RefManResult> listRefMan, String trafic) {
        for (RefManResult ref : listRefMan) {
            ReferenceManifeste refman = new ReferenceManifeste();
            try {
                refman = referenceManifesteService.RefToRefman(ref);
                refman.setTrafic(trafic);
                refman.setManifeste(false);
                String dateheure = format.format(new Date());
                refman.setDateInsertion(dateheure);
                this.setEntity(refman);
                save();
            } catch (BusinessException be) {
                Logger.getGlobal().log(Level.SEVERE, "ReferenceManifeste avec InstanceID : {0} existe deja.", refman.getInstanceId());
                continue;
            }
        }
    }

    public void onComplete() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Terminé"));
    }

    public String toDate(String date) {
        SimpleDateFormat fmt1 = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat fmt2 = new SimpleDateFormat("dd/MM/yyyy");
        String todate = "";
        try {
            todate = fmt2.format(fmt1.parse(date));
        } catch (ParseException ex) {
            Logger.getLogger(ReferenceManifesteBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return todate;
    }

    @Override
    public void beforeInsert() {
        referenceManifesteService.validate(entity);
    }

    @Override
    public void afterInsert() {
        addDetailMsg("Recuperation: manifeste " + entity.getTrafic() + " du " + entity.getNavire() + " numero de voyage " + entity.getNumeroVoyage());
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

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public String getTrafic() {
        return trafic;
    }

    public void setTrafic(String trafic) {
        this.trafic = trafic;
    }

    public SimpleDateFormat getFormat() {
        return format;
    }

    public void setFormat(SimpleDateFormat format) {
        this.format = format;
    }

    public Integer getProgress() {

        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }
}
