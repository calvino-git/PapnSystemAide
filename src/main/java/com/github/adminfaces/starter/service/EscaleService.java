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
import com.github.adminfaces.starter.model.Agent;
import com.github.adminfaces.starter.model.Agent_;
import com.github.adminfaces.starter.model.ConteneurCT;
import com.github.adminfaces.starter.model.ConteneurCT_;
import com.github.adminfaces.starter.model.Escale;
import com.github.adminfaces.starter.model.Escale_;
import com.github.adminfaces.starter.model.Navire;
import com.github.adminfaces.starter.model.Navire_;
import com.github.adminfaces.starter.model.Quai;
import com.github.adminfaces.starter.model.Quais;
import com.github.adminfaces.starter.model.TypeNavire;
import com.github.adminfaces.starter.model.TypeNavire_;
import com.github.adminfaces.starter.model.VueAllEvp;
import com.github.adminfaces.starter.repos.EscaleRepository;
import com.github.adminfaces.starter.repos.TypeNavireRepository;
import com.github.adminfaces.starter.repos.VueAllEvpRepository;
import static com.github.adminfaces.template.util.Assert.has;
import java.io.Serializable;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Stateless;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.TypedQuery;
import javax.persistence.metamodel.SingularAttribute;
import org.apache.commons.collections.Predicate;
import org.apache.deltaspike.data.api.criteria.Criteria;

/**
 *
 * @author Calvin ILOKI
 */
@Stateless
@Startup
public class EscaleService extends CrudService<Escale, Integer> implements Serializable {

    @Inject
    protected EscaleRepository escaleRepo;
    @Inject
    TypeNavireRepository typeNavireRepo;
    @Inject
    VueAllEvpRepository evpRepo;
    @Inject
    protected NavireService navireService;
    @Inject
    protected AgentService agentService;

    private String annee;
    private List<Escale> list;
    private Long nombreEscaleByAn;
    private Long nombrePetitEscaleByAn;
    private Long nombreGrandEscaleByAn;

    @PostConstruct
    public void init() {
        annee = String.valueOf(LocalDateTime.now().getYear());
//        list = escaleRepo.listEscaleGrandNav2020();
        update();
        System.out.println("[" + LocalDateTime.now() + "] EscaleService initialisé...");
    }

//    @Schedule(minute = "*/10", hour = "*", persistent = false)
    public void update() {
        System.out.println("[" + LocalDateTime.now() + "] Le nombre d'escale mis à jour ...");
        this.nombrePetitEscaleByAn = getNombrePetitEscaleByAnnee("PARTI", annee);
        this.nombreGrandEscaleByAn = getNombreGrandEscaleByAnnee("PARTI", annee);
        this.nombreEscaleByAn = this.nombrePetitEscaleByAn + this.nombreGrandEscaleByAn;
    }

    public Escale findEscaleParNumero(String numeroEscale) {
        return criteria()
                .eq(Escale_.numero, numeroEscale)
                .getOptionalResult();
    }

    public List<Escale> listParNavire(String navire) {
        return criteria()
                .likeIgnoreCase(Escale_.navire, navire)
                .getResultList();
    }

    public List<VueAllEvp> dataEVPbyEscale(String escale) {
        return evpRepo.listVueAllEvpByEscale(escale);
    }

    public List<String> listNavires(String query) {
        return criteria()
                .select(String.class, attribute(Escale_.navire))
                .likeIgnoreCase(Escale_.navire, "%" + query + "%")
                .distinct()
                .getResultList();
    }

    public List<TypeNavire> listeTypeNavireContains(String query) {
        return typeNavireRepo.listeTypeNavireContains(query.toUpperCase());
    }

    public List<Quais> listeQuai(String query) {
        return escaleRepo.listeQuai("%" + query.toUpperCase() + "%");
    }

    @Override
    protected Criteria<Escale, Escale> configRestrictions(Filter<Escale> filter) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

        Criteria<Escale, Escale> escaleCriteria = criteria();
        Criteria<Navire, Navire> navireCriteria = navireService.criteria();
        Criteria<Agent, Agent> agentCriteria = agentService.criteria();

        List<TypeNavire> listePetitNavire = typeNavireRepo.listeTypePetitNavire();
        List<TypeNavire> listeGrandNavire = typeNavireRepo.listeTypeGrandNavire();

        final TypeNavire array1[] = new TypeNavire[listePetitNavire.size()];
        final TypeNavire array2[] = new TypeNavire[listeGrandNavire.size()];

        listePetitNavire.forEach(t -> {
            array1[listePetitNavire.indexOf(t)] = t;
        });
        listeGrandNavire.forEach(t -> {
            array2[listeGrandNavire.indexOf(t)] = t;
        });
        //create restrictions based on parameters map
        if (filter.hasParam("doublon")) {
            Criteria<Escale, Escale> escale2Criteria = criteria();
            escaleCriteria.notEq(Escale_.situat, "ANNULE");
            escale2Criteria.notEq(Escale_.situat, "ANNULE");

            escaleCriteria.join(Escale_.nacleunik, navireCriteria);
            escale2Criteria.join(Escale_.nacleunik, navireCriteria);

        }
        if (filter.hasParam("catnavire")) {
            if (filter.getStringParam("catnavire").equalsIgnoreCase("GRAND")) {
                navireCriteria.in(Navire_.type, array2);
            } else if (filter.getStringParam("catnavire").equalsIgnoreCase("PETIT")) {
                navireCriteria.in(Navire_.type, array1);
            }
            escaleCriteria.join(Escale_.nacleunik, navireCriteria);
        }
        if (filter.hasParam("typenavire")) {
            navireCriteria.eq(Navire_.type, filter.getParam("typenavire", TypeNavire.class));
            escaleCriteria.join(Escale_.nacleunik, navireCriteria);
        }

        if (filter.hasParam("numero")) {
            escaleCriteria.like(Escale_.numero, filter.getStringParam("numero") + "%");
        }
        if (filter.hasParam("quai")) {
            escaleCriteria.eq(Escale_.quai, filter.getParam("quai", Quais.class));
        }
        if (filter.hasParam("agent")) {
            agentCriteria.like(Agent_.libelle, filter.getStringParam("agent").toUpperCase() + "%");
            escaleCriteria.join(Escale_.agent, agentCriteria);
        }
        if (filter.hasParam("an")) {
            try {
                Date parseDebutETA = dateFormat.parse(filter.getIntParam("an") + "0101");
                Date parseFinETA = dateFormat.parse(filter.getIntParam("an") + "1231");
                if (!filter.hasParam("debutETA")) {
                    filter.addParam("debutETA", parseDebutETA);
                }
                if (!filter.hasParam("finETA")) {
                    filter.addParam("finETA", parseFinETA);
                }
                escaleCriteria.between(Escale_.arrivee, dateFormat.format(filter.getParam("debutETA", Date.class)), dateFormat.format(filter.getParam("finETA", Date.class)));

            } catch (ParseException ex) {
                Logger.getLogger(EscaleService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

            if (filter.hasParam("debutETA") && filter.hasParam("finETA")) {
                escaleCriteria.between(Escale_.arrivee, dateFormat.format(filter.getParam("debutETA", Date.class)), dateFormat.format(filter.getParam("finETA", Date.class)));
            } else if (filter.hasParam("debutETA")) {
                escaleCriteria.gtOrEq(Escale_.arrivee, dateFormat.format(filter.getParam("debutETA", Date.class)));
            } else if (filter.hasParam("finETA")) {
                escaleCriteria.ltOrEq(Escale_.arrivee, dateFormat.format(filter.getParam("finETA", Date.class)));
            }
        }
        //create restrictions based on filter entity
        if (has(filter.getEntity())) {
            Escale filterEntity = filter.getEntity();
            escaleCriteria.notEq(Escale_.id, 0);

            if (has(filterEntity.getSituat())) {
                escaleCriteria.eq(Escale_.situat, filterEntity.getSituat());
            }

            if (has(filterEntity.getNavire())) {
                escaleCriteria.likeIgnoreCase(Escale_.navire, filterEntity.getNavire());
            }

            if (has(filterEntity.getNumero())) {
                escaleCriteria.like(Escale_.numero, filterEntity.getNumero() + "%");
            }

            if (has(filterEntity.getArrivee())) {
                escaleCriteria.likeIgnoreCase(Escale_.arrivee, filterEntity.getArrivee() + "%");
            }
            if (has(filterEntity.getFiliere())) {
                escaleCriteria.eq(Escale_.filiere, filterEntity.getFiliere());
            }
        }
        return escaleCriteria;
    }

    @Override
    public Long count(Filter<Escale> filter) {
        if (filter.hasParam("doublon")) {
            return escaleRepo.countEscaleDouble();
        } else {
            return count(configRestrictions(filter));
        }
    }

    @Override
    public List<Escale> paginate(Filter<Escale> filter) {
        if (filter.hasParam("doublon")) {
            return escaleRepo.listEscaleDouble(filter.getFirst(), filter.getFirst() + filter.getPageSize());
        } else {
            Criteria<Escale, Escale> criteria = configRestrictions(filter);
            configSort(filter, criteria);
            return criteria.createQuery()
                    .setFirstResult(filter.getFirst())
                    .setMaxResults(filter.getPageSize())
                    .getResultList();
        }
    }

    public Long getNbrPetitEscaleByAn(String an) {
        return getNombrePetitEscaleByAnnee("PARTI", an);
    }

    public Long getNbrGrandEscaleByAn(String an) {
        return getNombreGrandEscaleByAnnee("PARTI", an);
    }

    public Long getNbrEscaleByAn(String an) {
        return getNombreEscaleByAnnee("PARTI", an);
    }

    public List<Escale> getList() {
        return list;
    }

    public void setList(List<Escale> list) {
        this.list = list;
    }

    public Long getNombreEscaleByAn() {
        return nombreEscaleByAn;
    }

    public void setNombreEscaleByAn(Long nombreEscaleByAn) {
        this.nombreEscaleByAn = nombreEscaleByAn;
    }

    public Long getNombrePetitEscaleByAn() {
        return nombrePetitEscaleByAn;
    }

    public void setNombrePetitEscaleByAn(Long nombrePetitEscaleByAn) {
        this.nombrePetitEscaleByAn = nombrePetitEscaleByAn;
    }

    public Long getNombreGrandEscaleByAn() {
        return nombreGrandEscaleByAn;
    }

    public void setNombreGrandEscaleByAn(Long nombreGrandEscaleByAn) {
        this.nombreGrandEscaleByAn = nombreGrandEscaleByAn;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public long getNombreEscaleByAnnee(String situat, String annee) {
        return escaleRepo.getNombreEscaleByAnnee(situat, annee);
    }

    public Long getNombrePetitEscaleByAnnee(String situat, String annee) {
        return escaleRepo.getNombrePetitEscaleByAnnee(situat, annee);
    }

    public Long getNombreGrandEscaleByAnnee(String situat, String annee) {
        return escaleRepo.getNombreGrandEscaleByAnnee(situat, annee);
    }
}
