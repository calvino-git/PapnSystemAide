package com.github.adminfaces.starter.bean;

import com.github.adminfaces.starter.service.ChiffreAffaireService;
import com.github.adminfaces.starter.service.EscaleService;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Locale;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;

@ApplicationScoped
public class TotalBean implements Serializable {
    @Inject
    private EscaleService escaleService;
    @Inject
    private ChiffreAffaireService chiffreAffaireService;

    @PostConstruct
    public void init(){
        FacesContext.getCurrentInstance().getViewRoot().setLocale(Locale.FRANCE);
        Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
        System.out.println(locale.getLanguage() + "_" + locale.getCountry());
    }
    
    @Produces
    @Named("nombreEscaleByAnnee")
    public Long nombreEscaleByAnnee() {
        return escaleService.getNombreEscaleByAnnee("PARTI","2019");
    }
     @Produces
    @Named("montantTotalParAn")
    public Double montantTotalParAn() {
        return chiffreAffaireService.getMontantTotalParAn(2019);
    }

}
