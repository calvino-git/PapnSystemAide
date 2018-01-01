package com.github.adminfaces.starter.bean;

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
import com.github.adminfaces.starter.model.Car;
import com.github.adminfaces.starter.model.ChiffrePrestation;
import com.github.adminfaces.starter.service.CarService;
import com.github.adminfaces.starter.service.ChiffreAffaireService;
import com.github.adminfaces.starter.service.PrestService;
import com.github.adminfaces.template.exception.BusinessException;
import java.util.ArrayList;
import javax.annotation.PostConstruct;

/**
 * Created by rmpestano on 12/02/17.
 */
@Named
@ViewScoped
public class ChiffreAffaireBean implements Serializable {

    private Integer yearCount ;
    private List<Integer> years;
    
    @Inject
    @Service
    CrudService<ChiffrePrestation,Integer> prestService;
    
    @PostConstruct
    public void init(){
        this.yearCount = 5;
        years.add(2015);
        years.add(2016);
        years.add(2017);
        years.add(2018);
        years.add(2019);
        
    }

    public Integer getYearCount() {
        return yearCount;
    }

    public void setYearCount(Integer yearCount) {
        this.yearCount = yearCount;
    }

    public List<Integer> getYears() {
        return years;
    }

    public void setYears(List<Integer> years) {
        this.years = years;
    }
    
    
    
    
}
