/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.service;

import com.github.adminfaces.persistence.model.Filter;
import com.github.adminfaces.persistence.model.PersistenceEntity;
import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.starter.bean.TypeNavireConverter;
import com.github.adminfaces.starter.model.ConteneurCT;
import com.github.adminfaces.starter.model.ConteneurCT_;
import com.github.adminfaces.starter.model.Navire;
import com.github.adminfaces.starter.model.Navire_;
import com.github.adminfaces.starter.model.Navire;
import com.github.adminfaces.starter.model.TypeNavire;
import com.github.adminfaces.starter.model.TypeNavire_;
import com.github.adminfaces.starter.repos.NavireRepository;
import com.github.adminfaces.starter.repos.TypeNavireRepository;
import static com.github.adminfaces.template.util.Assert.has;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Stateless;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.deltaspike.data.api.criteria.Criteria;

/**
 *
 * @author Calvin ILOKI
 */
@Stateless
@Startup
public class NavireService extends CrudService<Navire, Integer> implements Serializable {
    @Inject
    protected NavireRepository escaleRepo;
}
