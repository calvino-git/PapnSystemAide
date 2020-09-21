package com.github.adminfaces.starter.bean;

import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.persistence.service.Service;
import com.github.adminfaces.starter.model.Car;
import com.github.adminfaces.starter.model.Car_;
import com.github.adminfaces.starter.model.ConteneurCT;
import com.github.adminfaces.starter.model.ConteneurCT_;

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
public class Lists implements Serializable {
    @Inject
    @Service
    private CrudService<ConteneurCT,Integer> crudService;
    
    @Inject
    @Service
    private CrudService<Car,Integer> crud_Service;

    @PostConstruct
    public void init(){
        FacesContext.getCurrentInstance().getViewRoot().setLocale(Locale.FRANCE);
        Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
        System.out.println(locale.getLanguage() + "_" + locale.getCountry());
    }
    

    @Produces
    @Named("nombreEscale")
    public List<String> nombreEscale() {
        return crud_Service.criteria()
                .select(String.class, crud_Service.attribute(Car_.model))
                .getResultList();
    }
    

}
