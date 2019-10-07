package com.github.adminfaces.starter.bean;

import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.persistence.service.Service;
import com.github.adminfaces.starter.model.Car;
import com.github.adminfaces.starter.model.Car_;
import com.github.adminfaces.starter.model.Ctn;
import com.github.adminfaces.starter.model.Ctn_;

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
    private CrudService<Ctn,Integer> crudService;
    
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
    @Named("models")
    public List<String> models() {
        return crud_Service.criteria()
                .select(String.class, crud_Service.attribute(Car_.model))
                .getResultList();
    }
    @Produces
    @Named("escales")
    public List<String> escales() {
        return crudService.criteria()
                .select(String.class, crudService.attribute(Ctn_.escale))
                .getResultList();
    }
    @Produces
    @Named("mois")
    public List<String> mois() {
        return crudService.criteria()
                .select(String.class, crudService.attribute(Ctn_.mois))
                .getResultList();
    }

}
