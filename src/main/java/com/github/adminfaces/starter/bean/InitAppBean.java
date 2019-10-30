package com.github.adminfaces.starter.bean;

import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.persistence.service.Service;
import com.github.adminfaces.starter.model.Car;
import com.github.adminfaces.template.config.AdminConfig;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.stream.IntStream;
import java.util.Locale;
import javax.faces.context.FacesContext;

@Singleton
@Startup
public class InitAppBean implements Serializable {

    @Inject
    @Service
    private CrudService<Car, Integer> crudService;

    @Inject
    AdminConfig adminConfig;

    @PostConstruct
    public void init() {
        adminConfig.setDateFormat("dd/MM/yyyy HH:mm:ss");
        
    }
}
