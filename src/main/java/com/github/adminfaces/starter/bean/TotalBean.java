package com.github.adminfaces.starter.bean;

import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.persistence.service.Service;
import com.github.adminfaces.starter.model.Car;
import com.github.adminfaces.starter.model.Car_;
import com.github.adminfaces.starter.model.Ctn;
import com.github.adminfaces.starter.model.Ctn_;
import com.github.adminfaces.starter.model.Escale;
import com.github.adminfaces.starter.service.EscaleService;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;
import java.util.Locale;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;

@ApplicationScoped
public class TotalBean implements Serializable {
    @Inject
    private EscaleService escaleService;

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

}
