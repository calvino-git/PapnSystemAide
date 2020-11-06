/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Calvin ILOKI
 */
@Entity
@Table(name = "QUAI", catalog = "", schema = "PPNCARGO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Quai.findAll", query = "SELECT q FROM Quai q"),
    @NamedQuery(name = "Quai.findByQucleunik", query = "SELECT q FROM Quai q WHERE q.qucleunik = :qucleunik"),
    @NamedQuery(name = "Quai.findByQuai", query = "SELECT q FROM Quai q WHERE q.quai = :quai"),
    @NamedQuery(name = "Quai.findByDemande", query = "SELECT q FROM Quai q WHERE q.demande = :demande"),
    @NamedQuery(name = "Quai.findByBolDeb", query = "SELECT q FROM Quai q WHERE q.bolDeb = :bolDeb"),
    @NamedQuery(name = "Quai.findByBolFin", query = "SELECT q FROM Quai q WHERE q.bolFin = :bolFin"),
    @NamedQuery(name = "Quai.findByAccostage", query = "SELECT q FROM Quai q WHERE q.accostage = :accostage"),
    @NamedQuery(name = "Quai.findByHAccostage", query = "SELECT q FROM Quai q WHERE q.hAccostage = :hAccostage"),
    @NamedQuery(name = "Quai.findByAppareillage", query = "SELECT q FROM Quai q WHERE q.appareillage = :appareillage"),
    @NamedQuery(name = "Quai.findByHAppareillage", query = "SELECT q FROM Quai q WHERE q.hAppareillage = :hAppareillage"),
    @NamedQuery(name = "Quai.findBySejour", query = "SELECT q FROM Quai q WHERE q.sejour = :sejour"),
    @NamedQuery(name = "Quai.findByDuree", query = "SELECT q FROM Quai q WHERE q.duree = :duree"),
    @NamedQuery(name = "Quai.findBySituat", query = "SELECT q FROM Quai q WHERE q.situat = :situat"),
    @NamedQuery(name = "Quai.findByArrivee", query = "SELECT q FROM Quai q WHERE q.arrivee = :arrivee"),
    @NamedQuery(name = "Quai.findByArrH", query = "SELECT q FROM Quai q WHERE q.arrH = :arrH"),
    @NamedQuery(name = "Quai.findByDebut", query = "SELECT q FROM Quai q WHERE q.debut = :debut"),
    @NamedQuery(name = "Quai.findByDebH", query = "SELECT q FROM Quai q WHERE q.debH = :debH"),
    @NamedQuery(name = "Quai.findByAttenteAv", query = "SELECT q FROM Quai q WHERE q.attenteAv = :attenteAv"),
    @NamedQuery(name = "Quai.findByAttenteAp", query = "SELECT q FROM Quai q WHERE q.attenteAp = :attenteAp"),
    @NamedQuery(name = "Quai.findByDurAttAv", query = "SELECT q FROM Quai q WHERE q.durAttAv = :durAttAv"),
    @NamedQuery(name = "Quai.findByDurAttAp", query = "SELECT q FROM Quai q WHERE q.durAttAp = :durAttAp"),
    @NamedQuery(name = "Quai.findByCondit", query = "SELECT q FROM Quai q WHERE q.condit = :condit"),
    @NamedQuery(name = "Quai.findByDepart", query = "SELECT q FROM Quai q WHERE q.depart = :depart"),
    @NamedQuery(name = "Quai.findByDepH", query = "SELECT q FROM Quai q WHERE q.depH = :depH"),
    @NamedQuery(name = "Quai.findByFin", query = "SELECT q FROM Quai q WHERE q.fin = :fin"),
    @NamedQuery(name = "Quai.findByFinH", query = "SELECT q FROM Quai q WHERE q.finH = :finH"),
    @NamedQuery(name = "Quai.findByTonTot", query = "SELECT q FROM Quai q WHERE q.tonTot = :tonTot"),
    @NamedQuery(name = "Quai.findByTonTrait", query = "SELECT q FROM Quai q WHERE q.tonTrait = :tonTrait"),
    @NamedQuery(name = "Quai.findByTonRest", query = "SELECT q FROM Quai q WHERE q.tonRest = :tonRest"),
    @NamedQuery(name = "Quai.findByNombre", query = "SELECT q FROM Quai q WHERE q.nombre = :nombre"),
    @NamedQuery(name = "Quai.findByNbrTcs", query = "SELECT q FROM Quai q WHERE q.nbrTcs = :nbrTcs"),
    @NamedQuery(name = "Quai.findByNbrTcst", query = "SELECT q FROM Quai q WHERE q.nbrTcst = :nbrTcst"),
    @NamedQuery(name = "Quai.findByNbrTcsn", query = "SELECT q FROM Quai q WHERE q.nbrTcsn = :nbrTcsn"),
    @NamedQuery(name = "Quai.findByOkAgent", query = "SELECT q FROM Quai q WHERE q.okAgent = :okAgent"),
    @NamedQuery(name = "Quai.findByOkCapitaine", query = "SELECT q FROM Quai q WHERE q.okCapitaine = :okCapitaine"),
    @NamedQuery(name = "Quai.findByStatut", query = "SELECT q FROM Quai q WHERE q.statut = :statut"),
    @NamedQuery(name = "Quai.findByGestion", query = "SELECT q FROM Quai q WHERE q.gestion = :gestion"),
    @NamedQuery(name = "Quai.findByCreateur", query = "SELECT q FROM Quai q WHERE q.createur = :createur"),
    @NamedQuery(name = "Quai.findByDCreat", query = "SELECT q FROM Quai q WHERE q.dCreat = :dCreat"),
    @NamedQuery(name = "Quai.findByHCreat", query = "SELECT q FROM Quai q WHERE q.hCreat = :hCreat"),
    @NamedQuery(name = "Quai.findByUtilisat", query = "SELECT q FROM Quai q WHERE q.utilisat = :utilisat"),
    @NamedQuery(name = "Quai.findByDModif", query = "SELECT q FROM Quai q WHERE q.dModif = :dModif"),
    @NamedQuery(name = "Quai.findByHModif", query = "SELECT q FROM Quai q WHERE q.hModif = :hModif"),
    @NamedQuery(name = "Quai.findByFracBolDeb", query = "SELECT q FROM Quai q WHERE q.fracBolDeb = :fracBolDeb"),
    @NamedQuery(name = "Quai.findByFracBolFin", query = "SELECT q FROM Quai q WHERE q.fracBolFin = :fracBolFin"),
    @NamedQuery(name = "Quai.findByPosition", query = "SELECT q FROM Quai q WHERE q.position = :position"),
    @NamedQuery(name = "Quai.findByRang1", query = "SELECT q FROM Quai q WHERE q.rang1 = :rang1"),
    @NamedQuery(name = "Quai.findByPosit", query = "SELECT q FROM Quai q WHERE q.posit = :posit"),
    @NamedQuery(name = "Quai.findByMagasin", query = "SELECT q FROM Quai q WHERE q.magasin = :magasin"),
    @NamedQuery(name = "Quai.findByQuaiSuivant", query = "SELECT q FROM Quai q WHERE q.quaiSuivant = :quaiSuivant"),
    @NamedQuery(name = "Quai.findByMvtAccostage", query = "SELECT q FROM Quai q WHERE q.mvtAccostage = :mvtAccostage"),
    @NamedQuery(name = "Quai.findByMvtAppareillage", query = "SELECT q FROM Quai q WHERE q.mvtAppareillage = :mvtAppareillage"),
    @NamedQuery(name = "Quai.findByOkCapEntree", query = "SELECT q FROM Quai q WHERE q.okCapEntree = :okCapEntree"),
    @NamedQuery(name = "Quai.findByDateCapEntree", query = "SELECT q FROM Quai q WHERE q.dateCapEntree = :dateCapEntree"),
    @NamedQuery(name = "Quai.findByHeureCapEntree", query = "SELECT q FROM Quai q WHERE q.heureCapEntree = :heureCapEntree"),
    @NamedQuery(name = "Quai.findByOkCapSortie", query = "SELECT q FROM Quai q WHERE q.okCapSortie = :okCapSortie"),
    @NamedQuery(name = "Quai.findByDateCapSortie", query = "SELECT q FROM Quai q WHERE q.dateCapSortie = :dateCapSortie"),
    @NamedQuery(name = "Quai.findByHeureCapSortie", query = "SELECT q FROM Quai q WHERE q.heureCapSortie = :heureCapSortie"),
    @NamedQuery(name = "Quai.findByOkAgentEntree", query = "SELECT q FROM Quai q WHERE q.okAgentEntree = :okAgentEntree"),
    @NamedQuery(name = "Quai.findByDateAgentEntree", query = "SELECT q FROM Quai q WHERE q.dateAgentEntree = :dateAgentEntree"),
    @NamedQuery(name = "Quai.findByHeureAgentEntree", query = "SELECT q FROM Quai q WHERE q.heureAgentEntree = :heureAgentEntree"),
    @NamedQuery(name = "Quai.findByOkAgentSortie", query = "SELECT q FROM Quai q WHERE q.okAgentSortie = :okAgentSortie"),
    @NamedQuery(name = "Quai.findByDateAgentSortie", query = "SELECT q FROM Quai q WHERE q.dateAgentSortie = :dateAgentSortie"),
    @NamedQuery(name = "Quai.findByHeureAgentSortie", query = "SELECT q FROM Quai q WHERE q.heureAgentSortie = :heureAgentSortie"),
    @NamedQuery(name = "Quai.findByDateAssistanceEntree", query = "SELECT q FROM Quai q WHERE q.dateAssistanceEntree = :dateAssistanceEntree"),
    @NamedQuery(name = "Quai.findByStatutAssistanceEntree", query = "SELECT q FROM Quai q WHERE q.statutAssistanceEntree = :statutAssistanceEntree"),
    @NamedQuery(name = "Quai.findByHorodatageAssistanceEntree", query = "SELECT q FROM Quai q WHERE q.horodatageAssistanceEntree = :horodatageAssistanceEntree"),
    @NamedQuery(name = "Quai.findByDateAssistanceSortie", query = "SELECT q FROM Quai q WHERE q.dateAssistanceSortie = :dateAssistanceSortie"),
    @NamedQuery(name = "Quai.findByStatutAssistanceSortie", query = "SELECT q FROM Quai q WHERE q.statutAssistanceSortie = :statutAssistanceSortie"),
    @NamedQuery(name = "Quai.findByHorodatageAssistanceSortie", query = "SELECT q FROM Quai q WHERE q.horodatageAssistanceSortie = :horodatageAssistanceSortie"),
    @NamedQuery(name = "Quai.findBySituatAccostage", query = "SELECT q FROM Quai q WHERE q.situatAccostage = :situatAccostage"),
    @NamedQuery(name = "Quai.findBySituatAppareillage", query = "SELECT q FROM Quai q WHERE q.situatAppareillage = :situatAppareillage"),
    @NamedQuery(name = "Quai.findByPiloteAc", query = "SELECT q FROM Quai q WHERE q.piloteAc = :piloteAc"),
    @NamedQuery(name = "Quai.findByPiloteAp", query = "SELECT q FROM Quai q WHERE q.piloteAp = :piloteAp"),
    @NamedQuery(name = "Quai.findByDatePiloteAc", query = "SELECT q FROM Quai q WHERE q.datePiloteAc = :datePiloteAc"),
    @NamedQuery(name = "Quai.findByHeurePiloteAc", query = "SELECT q FROM Quai q WHERE q.heurePiloteAc = :heurePiloteAc"),
    @NamedQuery(name = "Quai.findByDatePiloteAp", query = "SELECT q FROM Quai q WHERE q.datePiloteAp = :datePiloteAp"),
    @NamedQuery(name = "Quai.findByHeurePiloteAp", query = "SELECT q FROM Quai q WHERE q.heurePiloteAp = :heurePiloteAp"),
    @NamedQuery(name = "Quai.findByStatutConferenceEntree", query = "SELECT q FROM Quai q WHERE q.statutConferenceEntree = :statutConferenceEntree"),
    @NamedQuery(name = "Quai.findByDateConferenceEntree", query = "SELECT q FROM Quai q WHERE q.dateConferenceEntree = :dateConferenceEntree"),
    @NamedQuery(name = "Quai.findByHeureConferenceEntree", query = "SELECT q FROM Quai q WHERE q.heureConferenceEntree = :heureConferenceEntree"),
    @NamedQuery(name = "Quai.findByStatutConferenceSortie", query = "SELECT q FROM Quai q WHERE q.statutConferenceSortie = :statutConferenceSortie"),
    @NamedQuery(name = "Quai.findByDateConferenceSortie", query = "SELECT q FROM Quai q WHERE q.dateConferenceSortie = :dateConferenceSortie"),
    @NamedQuery(name = "Quai.findByHeureConferenceSortie", query = "SELECT q FROM Quai q WHERE q.heureConferenceSortie = :heureConferenceSortie"),
    @NamedQuery(name = "Quai.findByAgent", query = "SELECT q FROM Quai q WHERE q.agent = :agent"),
    @NamedQuery(name = "Quai.findByOkControleur", query = "SELECT q FROM Quai q WHERE q.okControleur = :okControleur"),
    @NamedQuery(name = "Quai.findByOkControleurDate", query = "SELECT q FROM Quai q WHERE q.okControleurDate = :okControleurDate"),
    @NamedQuery(name = "Quai.findByOkControleurHeure", query = "SELECT q FROM Quai q WHERE q.okControleurHeure = :okControleurHeure"),
    @NamedQuery(name = "Quai.findByNombreFacture", query = "SELECT q FROM Quai q WHERE q.nombreFacture = :nombreFacture"),
    @NamedQuery(name = "Quai.findByOkControleurUtilisat", query = "SELECT q FROM Quai q WHERE q.okControleurUtilisat = :okControleurUtilisat"),
    @NamedQuery(name = "Quai.findByNombrePilotage", query = "SELECT q FROM Quai q WHERE q.nombrePilotage = :nombrePilotage")})
public class Quai implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "QUCLEUNIK")
    private BigDecimal qucleunik;
    @Size(max = 8)
    @JoinColumn(name = "QUAI",referencedColumnName = "code")
    @ManyToOne
    private Quais quai;
    @Size(max = 8)
    @Column(name = "DEMANDE")
    private String demande;
    @Size(max = 8)
    @Column(name = "BOL_DEB")
    private String bolDeb;
    @Size(max = 8)
    @Column(name = "BOL_FIN")
    private String bolFin;
    @Size(max = 8)
    @Column(name = "ACCOSTAGE")
    private String accostage;
    @Size(max = 4)
    @Column(name = "H_ACCOSTAGE")
    private String hAccostage;
    @Size(max = 8)
    @Column(name = "APPAREILLAGE")
    private String appareillage;
    @Size(max = 4)
    @Column(name = "H_APPAREILLAGE")
    private String hAppareillage;
    @Column(name = "SEJOUR")
    private BigInteger sejour;
    @Column(name = "DUREE")
    private BigInteger duree;
    @Size(max = 8)
    @Column(name = "SITUAT")
    private String situat;
    @Size(max = 8)
    @Column(name = "ARRIVEE")
    private String arrivee;
    @Size(max = 4)
    @Column(name = "ARR_H")
    private String arrH;
    @Size(max = 8)
    @Column(name = "DEBUT")
    private String debut;
    @Size(max = 4)
    @Column(name = "DEB_H")
    private String debH;
    @Size(max = 8)
    @Column(name = "ATTENTE_AV")
    private String attenteAv;
    @Size(max = 8)
    @Column(name = "ATTENTE_AP")
    private String attenteAp;
    @Column(name = "DUR_ATT_AV")
    private BigInteger durAttAv;
    @Column(name = "DUR_ATT_AP")
    private BigInteger durAttAp;
    @Size(max = 35)
    @Column(name = "CONDIT")
    private String condit;
    @Size(max = 8)
    @Column(name = "DEPART")
    private String depart;
    @Size(max = 4)
    @Column(name = "DEP_H")
    private String depH;
    @Size(max = 8)
    @Column(name = "FIN_")
    private String fin;
    @Size(max = 4)
    @Column(name = "FIN_H")
    private String finH;
    @Column(name = "TON_TOT")
    private BigInteger tonTot;
    @Column(name = "TON_TRAIT")
    private BigInteger tonTrait;
    @Column(name = "TON_REST")
    private BigInteger tonRest;
    @Column(name = "NOMBRE")
    private BigInteger nombre;
    @Column(name = "NBR_TCS")
    private Double nbrTcs;
    @Column(name = "NBR_TCST")
    private Double nbrTcst;
    @Column(name = "NBR_TCSN")
    private Double nbrTcsn;
    @Column(name = "OK_AGENT")
    private Short okAgent;
    @Column(name = "OK_CAPITAINE")
    private Short okCapitaine;
    @Size(max = 8)
    @Column(name = "STATUT")
    private String statut;
    @Column(name = "GESTION")
    private BigInteger gestion;
    @Size(max = 10)
    @Column(name = "CREATEUR")
    private String createur;
    @Size(max = 8)
    @Column(name = "D_CREAT")
    private String dCreat;
    @Size(max = 4)
    @Column(name = "H_CREAT")
    private String hCreat;
    @Size(max = 10)
    @Column(name = "UTILISAT")
    private String utilisat;
    @Size(max = 8)
    @Column(name = "D_MODIF")
    private String dModif;
    @Size(max = 4)
    @Column(name = "H_MODIF")
    private String hModif;
    @Size(max = 8)
    @Column(name = "FRAC_BOL_DEB")
    private String fracBolDeb;
    @Size(max = 8)
    @Column(name = "FRAC_BOL_FIN")
    private String fracBolFin;
    @Size(max = 12)
    @Column(name = "POSITION")
    private String position;
    @Column(name = "RANG1")
    private Short rang1;
    @Size(max = 12)
    @Column(name = "POSIT")
    private String posit;
    @Size(max = 8)
    @Column(name = "MAGASIN")
    private String magasin;
    @Size(max = 8)
    @Column(name = "QUAI_SUIVANT")
    private String quaiSuivant;
    @Size(max = 8)
    @Column(name = "MVT_ACCOSTAGE")
    private String mvtAccostage;
    @Size(max = 8)
    @Column(name = "MVT_APPAREILLAGE")
    private String mvtAppareillage;
    @Column(name = "OK_CAP_ENTREE")
    private Short okCapEntree;
    @Size(max = 8)
    @Column(name = "DATE_CAP_ENTREE")
    private String dateCapEntree;
    @Size(max = 4)
    @Column(name = "HEURE_CAP_ENTREE")
    private String heureCapEntree;
    @Column(name = "OK_CAP_SORTIE")
    private Short okCapSortie;
    @Size(max = 8)
    @Column(name = "DATE_CAP_SORTIE")
    private String dateCapSortie;
    @Size(max = 4)
    @Column(name = "HEURE_CAP_SORTIE")
    private String heureCapSortie;
    @Column(name = "OK_AGENT_ENTREE")
    private Short okAgentEntree;
    @Size(max = 8)
    @Column(name = "DATE_AGENT_ENTREE")
    private String dateAgentEntree;
    @Size(max = 4)
    @Column(name = "HEURE_AGENT_ENTREE")
    private String heureAgentEntree;
    @Column(name = "OK_AGENT_SORTIE")
    private Short okAgentSortie;
    @Size(max = 8)
    @Column(name = "DATE_AGENT_SORTIE")
    private String dateAgentSortie;
    @Size(max = 4)
    @Column(name = "HEURE_AGENT_SORTIE")
    private String heureAgentSortie;
    @Column(name = "DATE_ASSISTANCE_ENTREE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAssistanceEntree;
    @Size(max = 8)
    @Column(name = "STATUT_ASSISTANCE_ENTREE")
    private String statutAssistanceEntree;
    @Column(name = "HORODATAGE_ASSISTANCE_ENTREE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horodatageAssistanceEntree;
    @Column(name = "DATE_ASSISTANCE_SORTIE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAssistanceSortie;
    @Size(max = 8)
    @Column(name = "STATUT_ASSISTANCE_SORTIE")
    private String statutAssistanceSortie;
    @Column(name = "HORODATAGE_ASSISTANCE_SORTIE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horodatageAssistanceSortie;
    @Size(max = 8)
    @Column(name = "SITUAT_ACCOSTAGE")
    private String situatAccostage;
    @Size(max = 8)
    @Column(name = "SITUAT_APPAREILLAGE")
    private String situatAppareillage;
    @Size(max = 8)
    @Column(name = "PILOTE_AC")
    private String piloteAc;
    @Size(max = 8)
    @Column(name = "PILOTE_AP")
    private String piloteAp;
    @Size(max = 8)
    @Column(name = "DATE_PILOTE_AC")
    private String datePiloteAc;
    @Size(max = 4)
    @Column(name = "HEURE_PILOTE_AC")
    private String heurePiloteAc;
    @Size(max = 8)
    @Column(name = "DATE_PILOTE_AP")
    private String datePiloteAp;
    @Size(max = 4)
    @Column(name = "HEURE_PILOTE_AP")
    private String heurePiloteAp;
    @Size(max = 8)
    @Column(name = "STATUT_CONFERENCE_ENTREE")
    private String statutConferenceEntree;
    @Size(max = 8)
    @Column(name = "DATE_CONFERENCE_ENTREE")
    private String dateConferenceEntree;
    @Size(max = 4)
    @Column(name = "HEURE_CONFERENCE_ENTREE")
    private String heureConferenceEntree;
    @Size(max = 8)
    @Column(name = "STATUT_CONFERENCE_SORTIE")
    private String statutConferenceSortie;
    @Size(max = 8)
    @Column(name = "DATE_CONFERENCE_SORTIE")
    private String dateConferenceSortie;
    @Size(max = 4)
    @Column(name = "HEURE_CONFERENCE_SORTIE")
    private String heureConferenceSortie;
    @Size(max = 8)
    @Column(name = "AGENT")
    private String agent;
    @Column(name = "OK_CONTROLEUR")
    private Short okControleur;
    @Size(max = 8)
    @Column(name = "OK_CONTROLEUR_DATE")
    private String okControleurDate;
    @Size(max = 4)
    @Column(name = "OK_CONTROLEUR_HEURE")
    private String okControleurHeure;
    @Column(name = "NOMBRE_FACTURE")
    private BigInteger nombreFacture;
    @Size(max = 10)
    @Column(name = "OK_CONTROLEUR_UTILISAT")
    private String okControleurUtilisat;
    @Column(name = "NOMBRE_PILOTAGE")
    private Long nombrePilotage;
    @JoinColumn(name = "ESCLEUNIK", referencedColumnName = "ESCLEUNIK")
    @ManyToOne
    private Escale escale;

    public Quai() {
    }

    public Quai(BigDecimal qucleunik) {
        this.qucleunik = qucleunik;
    }

    public BigDecimal getQucleunik() {
        return qucleunik;
    }

    public void setQucleunik(BigDecimal qucleunik) {
        this.qucleunik = qucleunik;
    }

    public Quais getQuai() {
        return quai;
    }

    public void setQuai(Quais quai) {
        this.quai = quai;
    }

    public String getDemande() {
        return demande;
    }

    public void setDemande(String demande) {
        this.demande = demande;
    }

    public String getBolDeb() {
        return bolDeb;
    }

    public void setBolDeb(String bolDeb) {
        this.bolDeb = bolDeb;
    }

    public String getBolFin() {
        return bolFin;
    }

    public void setBolFin(String bolFin) {
        this.bolFin = bolFin;
    }

    public String getAccostage() {
        return accostage;
    }

    public void setAccostage(String accostage) {
        this.accostage = accostage;
    }

    public String getHAccostage() {
        return hAccostage;
    }

    public void setHAccostage(String hAccostage) {
        this.hAccostage = hAccostage;
    }

    public String getAppareillage() {
        return appareillage;
    }

    public void setAppareillage(String appareillage) {
        this.appareillage = appareillage;
    }

    public String getHAppareillage() {
        return hAppareillage;
    }

    public void setHAppareillage(String hAppareillage) {
        this.hAppareillage = hAppareillage;
    }

    public BigInteger getSejour() {
        return sejour;
    }

    public void setSejour(BigInteger sejour) {
        this.sejour = sejour;
    }

    public BigInteger getDuree() {
        return duree;
    }

    public void setDuree(BigInteger duree) {
        this.duree = duree;
    }

    public String getSituat() {
        return situat;
    }

    public void setSituat(String situat) {
        this.situat = situat;
    }

    public String getArrivee() {
        return arrivee;
    }

    public void setArrivee(String arrivee) {
        this.arrivee = arrivee;
    }

    public String getArrH() {
        return arrH;
    }

    public void setArrH(String arrH) {
        this.arrH = arrH;
    }

    public String getDebut() {
        return debut;
    }

    public void setDebut(String debut) {
        this.debut = debut;
    }

    public String getDebH() {
        return debH;
    }

    public void setDebH(String debH) {
        this.debH = debH;
    }

    public String getAttenteAv() {
        return attenteAv;
    }

    public void setAttenteAv(String attenteAv) {
        this.attenteAv = attenteAv;
    }

    public String getAttenteAp() {
        return attenteAp;
    }

    public void setAttenteAp(String attenteAp) {
        this.attenteAp = attenteAp;
    }

    public BigInteger getDurAttAv() {
        return durAttAv;
    }

    public void setDurAttAv(BigInteger durAttAv) {
        this.durAttAv = durAttAv;
    }

    public BigInteger getDurAttAp() {
        return durAttAp;
    }

    public void setDurAttAp(BigInteger durAttAp) {
        this.durAttAp = durAttAp;
    }

    public String getCondit() {
        return condit;
    }

    public void setCondit(String condit) {
        this.condit = condit;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getDepH() {
        return depH;
    }

    public void setDepH(String depH) {
        this.depH = depH;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getFinH() {
        return finH;
    }

    public void setFinH(String finH) {
        this.finH = finH;
    }

    public BigInteger getTonTot() {
        return tonTot;
    }

    public void setTonTot(BigInteger tonTot) {
        this.tonTot = tonTot;
    }

    public BigInteger getTonTrait() {
        return tonTrait;
    }

    public void setTonTrait(BigInteger tonTrait) {
        this.tonTrait = tonTrait;
    }

    public BigInteger getTonRest() {
        return tonRest;
    }

    public void setTonRest(BigInteger tonRest) {
        this.tonRest = tonRest;
    }

    public BigInteger getNombre() {
        return nombre;
    }

    public void setNombre(BigInteger nombre) {
        this.nombre = nombre;
    }

    public Double getNbrTcs() {
        return nbrTcs;
    }

    public void setNbrTcs(Double nbrTcs) {
        this.nbrTcs = nbrTcs;
    }

    public Double getNbrTcst() {
        return nbrTcst;
    }

    public void setNbrTcst(Double nbrTcst) {
        this.nbrTcst = nbrTcst;
    }

    public Double getNbrTcsn() {
        return nbrTcsn;
    }

    public void setNbrTcsn(Double nbrTcsn) {
        this.nbrTcsn = nbrTcsn;
    }

    public Short getOkAgent() {
        return okAgent;
    }

    public void setOkAgent(Short okAgent) {
        this.okAgent = okAgent;
    }

    public Short getOkCapitaine() {
        return okCapitaine;
    }

    public void setOkCapitaine(Short okCapitaine) {
        this.okCapitaine = okCapitaine;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public BigInteger getGestion() {
        return gestion;
    }

    public void setGestion(BigInteger gestion) {
        this.gestion = gestion;
    }

    public String getCreateur() {
        return createur;
    }

    public void setCreateur(String createur) {
        this.createur = createur;
    }

    public String getDCreat() {
        return dCreat;
    }

    public void setDCreat(String dCreat) {
        this.dCreat = dCreat;
    }

    public String getHCreat() {
        return hCreat;
    }

    public void setHCreat(String hCreat) {
        this.hCreat = hCreat;
    }

    public String getUtilisat() {
        return utilisat;
    }

    public void setUtilisat(String utilisat) {
        this.utilisat = utilisat;
    }

    public String getDModif() {
        return dModif;
    }

    public void setDModif(String dModif) {
        this.dModif = dModif;
    }

    public String getHModif() {
        return hModif;
    }

    public void setHModif(String hModif) {
        this.hModif = hModif;
    }

    public String getFracBolDeb() {
        return fracBolDeb;
    }

    public void setFracBolDeb(String fracBolDeb) {
        this.fracBolDeb = fracBolDeb;
    }

    public String getFracBolFin() {
        return fracBolFin;
    }

    public void setFracBolFin(String fracBolFin) {
        this.fracBolFin = fracBolFin;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Short getRang1() {
        return rang1;
    }

    public void setRang1(Short rang1) {
        this.rang1 = rang1;
    }

    public String getPosit() {
        return posit;
    }

    public void setPosit(String posit) {
        this.posit = posit;
    }

    public String getMagasin() {
        return magasin;
    }

    public void setMagasin(String magasin) {
        this.magasin = magasin;
    }

    public String getQuaiSuivant() {
        return quaiSuivant;
    }

    public void setQuaiSuivant(String quaiSuivant) {
        this.quaiSuivant = quaiSuivant;
    }

    public String getMvtAccostage() {
        return mvtAccostage;
    }

    public void setMvtAccostage(String mvtAccostage) {
        this.mvtAccostage = mvtAccostage;
    }

    public String getMvtAppareillage() {
        return mvtAppareillage;
    }

    public void setMvtAppareillage(String mvtAppareillage) {
        this.mvtAppareillage = mvtAppareillage;
    }

    public Short getOkCapEntree() {
        return okCapEntree;
    }

    public void setOkCapEntree(Short okCapEntree) {
        this.okCapEntree = okCapEntree;
    }

    public String getDateCapEntree() {
        return dateCapEntree;
    }

    public void setDateCapEntree(String dateCapEntree) {
        this.dateCapEntree = dateCapEntree;
    }

    public String getHeureCapEntree() {
        return heureCapEntree;
    }

    public void setHeureCapEntree(String heureCapEntree) {
        this.heureCapEntree = heureCapEntree;
    }

    public Short getOkCapSortie() {
        return okCapSortie;
    }

    public void setOkCapSortie(Short okCapSortie) {
        this.okCapSortie = okCapSortie;
    }

    public String getDateCapSortie() {
        return dateCapSortie;
    }

    public void setDateCapSortie(String dateCapSortie) {
        this.dateCapSortie = dateCapSortie;
    }

    public String getHeureCapSortie() {
        return heureCapSortie;
    }

    public void setHeureCapSortie(String heureCapSortie) {
        this.heureCapSortie = heureCapSortie;
    }

    public Short getOkAgentEntree() {
        return okAgentEntree;
    }

    public void setOkAgentEntree(Short okAgentEntree) {
        this.okAgentEntree = okAgentEntree;
    }

    public String getDateAgentEntree() {
        return dateAgentEntree;
    }

    public void setDateAgentEntree(String dateAgentEntree) {
        this.dateAgentEntree = dateAgentEntree;
    }

    public String getHeureAgentEntree() {
        return heureAgentEntree;
    }

    public void setHeureAgentEntree(String heureAgentEntree) {
        this.heureAgentEntree = heureAgentEntree;
    }

    public Short getOkAgentSortie() {
        return okAgentSortie;
    }

    public void setOkAgentSortie(Short okAgentSortie) {
        this.okAgentSortie = okAgentSortie;
    }

    public String getDateAgentSortie() {
        return dateAgentSortie;
    }

    public void setDateAgentSortie(String dateAgentSortie) {
        this.dateAgentSortie = dateAgentSortie;
    }

    public String getHeureAgentSortie() {
        return heureAgentSortie;
    }

    public void setHeureAgentSortie(String heureAgentSortie) {
        this.heureAgentSortie = heureAgentSortie;
    }

    public Date getDateAssistanceEntree() {
        return dateAssistanceEntree;
    }

    public void setDateAssistanceEntree(Date dateAssistanceEntree) {
        this.dateAssistanceEntree = dateAssistanceEntree;
    }

    public String getStatutAssistanceEntree() {
        return statutAssistanceEntree;
    }

    public void setStatutAssistanceEntree(String statutAssistanceEntree) {
        this.statutAssistanceEntree = statutAssistanceEntree;
    }

    public Date getHorodatageAssistanceEntree() {
        return horodatageAssistanceEntree;
    }

    public void setHorodatageAssistanceEntree(Date horodatageAssistanceEntree) {
        this.horodatageAssistanceEntree = horodatageAssistanceEntree;
    }

    public Date getDateAssistanceSortie() {
        return dateAssistanceSortie;
    }

    public void setDateAssistanceSortie(Date dateAssistanceSortie) {
        this.dateAssistanceSortie = dateAssistanceSortie;
    }

    public String getStatutAssistanceSortie() {
        return statutAssistanceSortie;
    }

    public void setStatutAssistanceSortie(String statutAssistanceSortie) {
        this.statutAssistanceSortie = statutAssistanceSortie;
    }

    public Date getHorodatageAssistanceSortie() {
        return horodatageAssistanceSortie;
    }

    public void setHorodatageAssistanceSortie(Date horodatageAssistanceSortie) {
        this.horodatageAssistanceSortie = horodatageAssistanceSortie;
    }

    public String getSituatAccostage() {
        return situatAccostage;
    }

    public void setSituatAccostage(String situatAccostage) {
        this.situatAccostage = situatAccostage;
    }

    public String getSituatAppareillage() {
        return situatAppareillage;
    }

    public void setSituatAppareillage(String situatAppareillage) {
        this.situatAppareillage = situatAppareillage;
    }

    public String getPiloteAc() {
        return piloteAc;
    }

    public void setPiloteAc(String piloteAc) {
        this.piloteAc = piloteAc;
    }

    public String getPiloteAp() {
        return piloteAp;
    }

    public void setPiloteAp(String piloteAp) {
        this.piloteAp = piloteAp;
    }

    public String getDatePiloteAc() {
        return datePiloteAc;
    }

    public void setDatePiloteAc(String datePiloteAc) {
        this.datePiloteAc = datePiloteAc;
    }

    public String getHeurePiloteAc() {
        return heurePiloteAc;
    }

    public void setHeurePiloteAc(String heurePiloteAc) {
        this.heurePiloteAc = heurePiloteAc;
    }

    public String getDatePiloteAp() {
        return datePiloteAp;
    }

    public void setDatePiloteAp(String datePiloteAp) {
        this.datePiloteAp = datePiloteAp;
    }

    public String getHeurePiloteAp() {
        return heurePiloteAp;
    }

    public void setHeurePiloteAp(String heurePiloteAp) {
        this.heurePiloteAp = heurePiloteAp;
    }

    public String getStatutConferenceEntree() {
        return statutConferenceEntree;
    }

    public void setStatutConferenceEntree(String statutConferenceEntree) {
        this.statutConferenceEntree = statutConferenceEntree;
    }

    public String getDateConferenceEntree() {
        return dateConferenceEntree;
    }

    public void setDateConferenceEntree(String dateConferenceEntree) {
        this.dateConferenceEntree = dateConferenceEntree;
    }

    public String getHeureConferenceEntree() {
        return heureConferenceEntree;
    }

    public void setHeureConferenceEntree(String heureConferenceEntree) {
        this.heureConferenceEntree = heureConferenceEntree;
    }

    public String getStatutConferenceSortie() {
        return statutConferenceSortie;
    }

    public void setStatutConferenceSortie(String statutConferenceSortie) {
        this.statutConferenceSortie = statutConferenceSortie;
    }

    public String getDateConferenceSortie() {
        return dateConferenceSortie;
    }

    public void setDateConferenceSortie(String dateConferenceSortie) {
        this.dateConferenceSortie = dateConferenceSortie;
    }

    public String getHeureConferenceSortie() {
        return heureConferenceSortie;
    }

    public void setHeureConferenceSortie(String heureConferenceSortie) {
        this.heureConferenceSortie = heureConferenceSortie;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public Short getOkControleur() {
        return okControleur;
    }

    public void setOkControleur(Short okControleur) {
        this.okControleur = okControleur;
    }

    public String getOkControleurDate() {
        return okControleurDate;
    }

    public void setOkControleurDate(String okControleurDate) {
        this.okControleurDate = okControleurDate;
    }

    public String getOkControleurHeure() {
        return okControleurHeure;
    }

    public void setOkControleurHeure(String okControleurHeure) {
        this.okControleurHeure = okControleurHeure;
    }

    public BigInteger getNombreFacture() {
        return nombreFacture;
    }

    public void setNombreFacture(BigInteger nombreFacture) {
        this.nombreFacture = nombreFacture;
    }

    public String getOkControleurUtilisat() {
        return okControleurUtilisat;
    }

    public void setOkControleurUtilisat(String okControleurUtilisat) {
        this.okControleurUtilisat = okControleurUtilisat;
    }

    public Long getNombrePilotage() {
        return nombrePilotage;
    }

    public void setNombrePilotage(Long nombrePilotage) {
        this.nombrePilotage = nombrePilotage;
    }

    public Escale getEscale() {
        return escale;
    }

    public void setEscale(Escale escale) {
        this.escale = escale;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (qucleunik != null ? qucleunik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Quai)) {
            return false;
        }
        Quai other = (Quai) object;
        if ((this.qucleunik == null && other.qucleunik != null) || (this.qucleunik != null && !this.qucleunik.equals(other.qucleunik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return quai.getLibelle();
    }
    
}
