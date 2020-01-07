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
@Table(name = "SERVICES", catalog = "", schema = "PPNCARGO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Services.findAll", query = "SELECT s FROM Services s"),
    @NamedQuery(name = "Services.findBySrcleunik", query = "SELECT s FROM Services s WHERE s.srcleunik = :srcleunik"),
    @NamedQuery(name = "Services.findByIdentite", query = "SELECT s FROM Services s WHERE s.identite = :identite"),
    @NamedQuery(name = "Services.findByNumero", query = "SELECT s FROM Services s WHERE s.numero = :numero"),
    @NamedQuery(name = "Services.findByReferenc", query = "SELECT s FROM Services s WHERE s.referenc = :referenc"),
    @NamedQuery(name = "Services.findByNom", query = "SELECT s FROM Services s WHERE s.nom = :nom"),
    @NamedQuery(name = "Services.findByClient", query = "SELECT s FROM Services s WHERE s.client = :client"),
    @NamedQuery(name = "Services.findByProprie", query = "SELECT s FROM Services s WHERE s.proprie = :proprie"),
    @NamedQuery(name = "Services.findByRespons", query = "SELECT s FROM Services s WHERE s.respons = :respons"),
    @NamedQuery(name = "Services.findByTarif", query = "SELECT s FROM Services s WHERE s.tarif = :tarif"),
    @NamedQuery(name = "Services.findByRegle", query = "SELECT s FROM Services s WHERE s.regle = :regle"),
    @NamedQuery(name = "Services.findByAnnonce", query = "SELECT s FROM Services s WHERE s.annonce = :annonce"),
    @NamedQuery(name = "Services.findByPrestat", query = "SELECT s FROM Services s WHERE s.prestat = :prestat"),
    @NamedQuery(name = "Services.findByCDate", query = "SELECT s FROM Services s WHERE s.cDate = :cDate"),
    @NamedQuery(name = "Services.findByCHeure", query = "SELECT s FROM Services s WHERE s.cHeure = :cHeure"),
    @NamedQuery(name = "Services.findByCDeb", query = "SELECT s FROM Services s WHERE s.cDeb = :cDeb"),
    @NamedQuery(name = "Services.findByCFin", query = "SELECT s FROM Services s WHERE s.cFin = :cFin"),
    @NamedQuery(name = "Services.findByCQuant", query = "SELECT s FROM Services s WHERE s.cQuant = :cQuant"),
    @NamedQuery(name = "Services.findByLDate", query = "SELECT s FROM Services s WHERE s.lDate = :lDate"),
    @NamedQuery(name = "Services.findByLHeure", query = "SELECT s FROM Services s WHERE s.lHeure = :lHeure"),
    @NamedQuery(name = "Services.findByLDeb", query = "SELECT s FROM Services s WHERE s.lDeb = :lDeb"),
    @NamedQuery(name = "Services.findByLFin", query = "SELECT s FROM Services s WHERE s.lFin = :lFin"),
    @NamedQuery(name = "Services.findByLQuant", query = "SELECT s FROM Services s WHERE s.lQuant = :lQuant"),
    @NamedQuery(name = "Services.findByFDate", query = "SELECT s FROM Services s WHERE s.fDate = :fDate"),
    @NamedQuery(name = "Services.findByFHeure", query = "SELECT s FROM Services s WHERE s.fHeure = :fHeure"),
    @NamedQuery(name = "Services.findByFDeb", query = "SELECT s FROM Services s WHERE s.fDeb = :fDeb"),
    @NamedQuery(name = "Services.findByFFin", query = "SELECT s FROM Services s WHERE s.fFin = :fFin"),
    @NamedQuery(name = "Services.findByFQuant", query = "SELECT s FROM Services s WHERE s.fQuant = :fQuant"),
    @NamedQuery(name = "Services.findByTaux", query = "SELECT s FROM Services s WHERE s.taux = :taux"),
    @NamedQuery(name = "Services.findByMajorat", query = "SELECT s FROM Services s WHERE s.majorat = :majorat"),
    @NamedQuery(name = "Services.findByReduct", query = "SELECT s FROM Services s WHERE s.reduct = :reduct"),
    @NamedQuery(name = "Services.findByForfait", query = "SELECT s FROM Services s WHERE s.forfait = :forfait"),
    @NamedQuery(name = "Services.findByMntHt", query = "SELECT s FROM Services s WHERE s.mntHt = :mntHt"),
    @NamedQuery(name = "Services.findByMntTva", query = "SELECT s FROM Services s WHERE s.mntTva = :mntTva"),
    @NamedQuery(name = "Services.findByMntTtc", query = "SELECT s FROM Services s WHERE s.mntTtc = :mntTtc"),
    @NamedQuery(name = "Services.findByTexte", query = "SELECT s FROM Services s WHERE s.texte = :texte"),
    @NamedQuery(name = "Services.findByLDuree", query = "SELECT s FROM Services s WHERE s.lDuree = :lDuree"),
    @NamedQuery(name = "Services.findByFDuree", query = "SELECT s FROM Services s WHERE s.fDuree = :fDuree"),
    @NamedQuery(name = "Services.findByControle", query = "SELECT s FROM Services s WHERE s.controle = :controle"),
    @NamedQuery(name = "Services.findByControle2", query = "SELECT s FROM Services s WHERE s.controle2 = :controle2"),
    @NamedQuery(name = "Services.findByControle3", query = "SELECT s FROM Services s WHERE s.controle3 = :controle3"),
    @NamedQuery(name = "Services.findByTva", query = "SELECT s FROM Services s WHERE s.tva = :tva"),
    @NamedQuery(name = "Services.findByDurPre", query = "SELECT s FROM Services s WHERE s.durPre = :durPre"),
    @NamedQuery(name = "Services.findByNombre", query = "SELECT s FROM Services s WHERE s.nombre = :nombre"),
    @NamedQuery(name = "Services.findByNH", query = "SELECT s FROM Services s WHERE s.nH = :nH"),
    @NamedQuery(name = "Services.findBySH", query = "SELECT s FROM Services s WHERE s.sH = :sH"),
    @NamedQuery(name = "Services.findByCode", query = "SELECT s FROM Services s WHERE s.code = :code"),
    @NamedQuery(name = "Services.findByNbrSht", query = "SELECT s FROM Services s WHERE s.nbrSht = :nbrSht"),
    @NamedQuery(name = "Services.findByNbAtt", query = "SELECT s FROM Services s WHERE s.nbAtt = :nbAtt"),
    @NamedQuery(name = "Services.findByType", query = "SELECT s FROM Services s WHERE s.type = :type"),
    @NamedQuery(name = "Services.findByGestion", query = "SELECT s FROM Services s WHERE s.gestion = :gestion"),
    @NamedQuery(name = "Services.findByStatut", query = "SELECT s FROM Services s WHERE s.statut = :statut"),
    @NamedQuery(name = "Services.findByCreateur", query = "SELECT s FROM Services s WHERE s.createur = :createur"),
    @NamedQuery(name = "Services.findByDCreat", query = "SELECT s FROM Services s WHERE s.dCreat = :dCreat"),
    @NamedQuery(name = "Services.findByHCreat", query = "SELECT s FROM Services s WHERE s.hCreat = :hCreat"),
    @NamedQuery(name = "Services.findByUtilisat", query = "SELECT s FROM Services s WHERE s.utilisat = :utilisat"),
    @NamedQuery(name = "Services.findByDModif", query = "SELECT s FROM Services s WHERE s.dModif = :dModif"),
    @NamedQuery(name = "Services.findByHModif", query = "SELECT s FROM Services s WHERE s.hModif = :hModif"),
    @NamedQuery(name = "Services.findByEncleunik", query = "SELECT s FROM Services s WHERE s.encleunik = :encleunik"),
    @NamedQuery(name = "Services.findByCicleunik", query = "SELECT s FROM Services s WHERE s.cicleunik = :cicleunik"),
    @NamedQuery(name = "Services.findByOkAgent", query = "SELECT s FROM Services s WHERE s.okAgent = :okAgent"),
    @NamedQuery(name = "Services.findByOkCapitaine", query = "SELECT s FROM Services s WHERE s.okCapitaine = :okCapitaine"),
    @NamedQuery(name = "Services.findByOkManutentionnaire", query = "SELECT s FROM Services s WHERE s.okManutentionnaire = :okManutentionnaire"),
    @NamedQuery(name = "Services.findByOkExploitation", query = "SELECT s FROM Services s WHERE s.okExploitation = :okExploitation"),
    @NamedQuery(name = "Services.findByDateAgent", query = "SELECT s FROM Services s WHERE s.dateAgent = :dateAgent"),
    @NamedQuery(name = "Services.findByHeureAgent", query = "SELECT s FROM Services s WHERE s.heureAgent = :heureAgent"),
    @NamedQuery(name = "Services.findByDateCapitaine", query = "SELECT s FROM Services s WHERE s.dateCapitaine = :dateCapitaine"),
    @NamedQuery(name = "Services.findByHeureCapitaine", query = "SELECT s FROM Services s WHERE s.heureCapitaine = :heureCapitaine"),
    @NamedQuery(name = "Services.findByDateManutentionnaire", query = "SELECT s FROM Services s WHERE s.dateManutentionnaire = :dateManutentionnaire"),
    @NamedQuery(name = "Services.findByHeureManutentionnaire", query = "SELECT s FROM Services s WHERE s.heureManutentionnaire = :heureManutentionnaire"),
    @NamedQuery(name = "Services.findByDateExploitation", query = "SELECT s FROM Services s WHERE s.dateExploitation = :dateExploitation"),
    @NamedQuery(name = "Services.findByHeureExploitation", query = "SELECT s FROM Services s WHERE s.heureExploitation = :heureExploitation"),
    @NamedQuery(name = "Services.findByAffectation", query = "SELECT s FROM Services s WHERE s.affectation = :affectation"),
    @NamedQuery(name = "Services.findByQucleunik", query = "SELECT s FROM Services s WHERE s.qucleunik = :qucleunik"),
    @NamedQuery(name = "Services.findByEscleunik", query = "SELECT s FROM Services s WHERE s.escleunik = :escleunik"),
    @NamedQuery(name = "Services.findByBase", query = "SELECT s FROM Services s WHERE s.base = :base"),
    @NamedQuery(name = "Services.findByChargeFixe", query = "SELECT s FROM Services s WHERE s.chargeFixe = :chargeFixe"),
    @NamedQuery(name = "Services.findByAvoir", query = "SELECT s FROM Services s WHERE s.avoir = :avoir"),
    @NamedQuery(name = "Services.findByBlcleunik", query = "SELECT s FROM Services s WHERE s.blcleunik = :blcleunik"),
    @NamedQuery(name = "Services.findByC2cleunik", query = "SELECT s FROM Services s WHERE s.c2cleunik = :c2cleunik"),
    @NamedQuery(name = "Services.findByMacleunik", query = "SELECT s FROM Services s WHERE s.macleunik = :macleunik"),
    @NamedQuery(name = "Services.findByM0cleunik", query = "SELECT s FROM Services s WHERE s.m0cleunik = :m0cleunik"),
    @NamedQuery(name = "Services.findByOkFact", query = "SELECT s FROM Services s WHERE s.okFact = :okFact"),
    @NamedQuery(name = "Services.findByDateFact", query = "SELECT s FROM Services s WHERE s.dateFact = :dateFact"),
    @NamedQuery(name = "Services.findByHeureFact", query = "SELECT s FROM Services s WHERE s.heureFact = :heureFact"),
    @NamedQuery(name = "Services.findByCodeGen", query = "SELECT s FROM Services s WHERE s.codeGen = :codeGen"),
    @NamedQuery(name = "Services.findByCodeAna", query = "SELECT s FROM Services s WHERE s.codeAna = :codeAna"),
    @NamedQuery(name = "Services.findByReduc1", query = "SELECT s FROM Services s WHERE s.reduc1 = :reduc1"),
    @NamedQuery(name = "Services.findByReduc2", query = "SELECT s FROM Services s WHERE s.reduc2 = :reduc2"),
    @NamedQuery(name = "Services.findByReduc3", query = "SELECT s FROM Services s WHERE s.reduc3 = :reduc3"),
    @NamedQuery(name = "Services.findByReduc4", query = "SELECT s FROM Services s WHERE s.reduc4 = :reduc4"),
    @NamedQuery(name = "Services.findByReduc5", query = "SELECT s FROM Services s WHERE s.reduc5 = :reduc5"),
    @NamedQuery(name = "Services.findByReduc6", query = "SELECT s FROM Services s WHERE s.reduc6 = :reduc6"),
    @NamedQuery(name = "Services.findByReduc7", query = "SELECT s FROM Services s WHERE s.reduc7 = :reduc7"),
    @NamedQuery(name = "Services.findByReduc8", query = "SELECT s FROM Services s WHERE s.reduc8 = :reduc8"),
    @NamedQuery(name = "Services.findByTotalReduc", query = "SELECT s FROM Services s WHERE s.totalReduc = :totalReduc"),
    @NamedQuery(name = "Services.findByTrcleunik", query = "SELECT s FROM Services s WHERE s.trcleunik = :trcleunik"),
    @NamedQuery(name = "Services.findByOpcleunik", query = "SELECT s FROM Services s WHERE s.opcleunik = :opcleunik"),
    @NamedQuery(name = "Services.findByConditions", query = "SELECT s FROM Services s WHERE s.conditions = :conditions"),
    @NamedQuery(name = "Services.findByQuantiteMini", query = "SELECT s FROM Services s WHERE s.quantiteMini = :quantiteMini"),
    @NamedQuery(name = "Services.findByMiniPerception", query = "SELECT s FROM Services s WHERE s.miniPerception = :miniPerception"),
    @NamedQuery(name = "Services.findByCentimesAdd", query = "SELECT s FROM Services s WHERE s.centimesAdd = :centimesAdd"),
    @NamedQuery(name = "Services.findByGroupeTarifaire1", query = "SELECT s FROM Services s WHERE s.groupeTarifaire1 = :groupeTarifaire1"),
    @NamedQuery(name = "Services.findByGroupeTarifaire2", query = "SELECT s FROM Services s WHERE s.groupeTarifaire2 = :groupeTarifaire2"),
    @NamedQuery(name = "Services.findByGroupeTarifaire3", query = "SELECT s FROM Services s WHERE s.groupeTarifaire3 = :groupeTarifaire3"),
    @NamedQuery(name = "Services.findByGroupeTarifaire4", query = "SELECT s FROM Services s WHERE s.groupeTarifaire4 = :groupeTarifaire4"),
    @NamedQuery(name = "Services.findByGroupeTarifaire5", query = "SELECT s FROM Services s WHERE s.groupeTarifaire5 = :groupeTarifaire5"),
    @NamedQuery(name = "Services.findByGroupeTarifaire6", query = "SELECT s FROM Services s WHERE s.groupeTarifaire6 = :groupeTarifaire6"),
    @NamedQuery(name = "Services.findByGroupeTarifaire7", query = "SELECT s FROM Services s WHERE s.groupeTarifaire7 = :groupeTarifaire7"),
    @NamedQuery(name = "Services.findByGroupeTarifaire8", query = "SELECT s FROM Services s WHERE s.groupeTarifaire8 = :groupeTarifaire8"),
    @NamedQuery(name = "Services.findByOccursTarifaireASuivre1", query = "SELECT s FROM Services s WHERE s.occursTarifaireASuivre1 = :occursTarifaireASuivre1"),
    @NamedQuery(name = "Services.findByOccursTarifaireASuivre2", query = "SELECT s FROM Services s WHERE s.occursTarifaireASuivre2 = :occursTarifaireASuivre2"),
    @NamedQuery(name = "Services.findByOccursTarifaireASuivre3", query = "SELECT s FROM Services s WHERE s.occursTarifaireASuivre3 = :occursTarifaireASuivre3"),
    @NamedQuery(name = "Services.findByOccursTarifaireASuivre4", query = "SELECT s FROM Services s WHERE s.occursTarifaireASuivre4 = :occursTarifaireASuivre4"),
    @NamedQuery(name = "Services.findByOccursTarifaireASuivre5", query = "SELECT s FROM Services s WHERE s.occursTarifaireASuivre5 = :occursTarifaireASuivre5"),
    @NamedQuery(name = "Services.findByOccursTarifaireASuivre6", query = "SELECT s FROM Services s WHERE s.occursTarifaireASuivre6 = :occursTarifaireASuivre6"),
    @NamedQuery(name = "Services.findByOccursTarifaireASuivre7", query = "SELECT s FROM Services s WHERE s.occursTarifaireASuivre7 = :occursTarifaireASuivre7"),
    @NamedQuery(name = "Services.findByOccursTarifaireASuivre8", query = "SELECT s FROM Services s WHERE s.occursTarifaireASuivre8 = :occursTarifaireASuivre8"),
    @NamedQuery(name = "Services.findByMntCentimesAdd", query = "SELECT s FROM Services s WHERE s.mntCentimesAdd = :mntCentimesAdd"),
    @NamedQuery(name = "Services.findByHorodatageAssistanceSortie", query = "SELECT s FROM Services s WHERE s.horodatageAssistanceSortie = :horodatageAssistanceSortie"),
    @NamedQuery(name = "Services.findByHVedette", query = "SELECT s FROM Services s WHERE s.hVedette = :hVedette"),
    @NamedQuery(name = "Services.findByHEmbarquement", query = "SELECT s FROM Services s WHERE s.hEmbarquement = :hEmbarquement"),
    @NamedQuery(name = "Services.findByHRemorqueur", query = "SELECT s FROM Services s WHERE s.hRemorqueur = :hRemorqueur"),
    @NamedQuery(name = "Services.findByPresenceBollards", query = "SELECT s FROM Services s WHERE s.presenceBollards = :presenceBollards"),
    @NamedQuery(name = "Services.findByCapelageAmarres", query = "SELECT s FROM Services s WHERE s.capelageAmarres = :capelageAmarres"),
    @NamedQuery(name = "Services.findByEspacesTravail", query = "SELECT s FROM Services s WHERE s.espacesTravail = :espacesTravail"),
    @NamedQuery(name = "Services.findByConditions2", query = "SELECT s FROM Services s WHERE s.conditions2 = :conditions2"),
    @NamedQuery(name = "Services.findByAgent", query = "SELECT s FROM Services s WHERE s.agent = :agent")})
public class Services implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SRCLEUNIK")
    private BigDecimal srcleunik;
    @Size(max = 12)
    @Column(name = "IDENTITE")
    private String identite;
    @Size(max = 12)
    @Column(name = "NUMERO")
    private String numero;
    @Size(max = 12)
    @Column(name = "REFERENC")
    private String referenc;
    @Size(max = 40)
    @Column(name = "NOM")
    private String nom;
    @Size(max = 20)
    @Column(name = "CLIENT")
    private String client;
    @Size(max = 8)
    @Column(name = "PROPRIE")
    private String proprie;
    @Size(max = 8)
    @Column(name = "RESPONS")
    private String respons;
    @Size(max = 80)
    @Column(name = "TARIF")
    private String tarif;
    @Size(max = 8)
    @Column(name = "REGLE")
    private String regle;
    @Size(max = 8)
    @Column(name = "ANNONCE")
    private String annonce;
    @Size(max = 8)
    @Column(name = "PRESTAT")
    private String prestat;
    @Size(max = 8)
    @Column(name = "C_DATE")
    private String cDate;
    @Size(max = 4)
    @Column(name = "C_HEURE")
    private String cHeure;
    @Column(name = "C_DEB")
    private BigInteger cDeb;
    @Column(name = "C_FIN")
    private BigInteger cFin;
    @Column(name = "C_QUANT")
    private BigInteger cQuant;
    @Size(max = 8)
    @Column(name = "L_DATE")
    private String lDate;
    @Size(max = 4)
    @Column(name = "L_HEURE")
    private String lHeure;
    @Column(name = "L_DEB")
    private BigInteger lDeb;
    @Column(name = "L_FIN")
    private BigInteger lFin;
    @Column(name = "L_QUANT")
    private BigInteger lQuant;
    @Size(max = 8)
    @Column(name = "F_DATE")
    private String fDate;
    @Size(max = 4)
    @Column(name = "F_HEURE")
    private String fHeure;
    @Column(name = "F_DEB")
    private BigInteger fDeb;
    @Column(name = "F_FIN")
    private BigInteger fFin;
    @Column(name = "F_QUANT")
    private BigDecimal fQuant;
    @Column(name = "TAUX")
    private BigDecimal taux;
    @Column(name = "MAJORAT")
    private BigDecimal majorat;
    @Column(name = "REDUCT")
    private BigDecimal reduct;
    @Column(name = "FORFAIT")
    private BigDecimal forfait;
    @Column(name = "MNT_HT")
    private BigDecimal mntHt;
    @Column(name = "MNT_TVA")
    private BigDecimal mntTva;
    @Column(name = "MNT_TTC")
    private BigDecimal mntTtc;
    @Size(max = 80)
    @Column(name = "TEXTE")
    private String texte;
    @Column(name = "L_DUREE")
    private BigInteger lDuree;
    @Column(name = "F_DUREE")
    private BigInteger fDuree;
    @Column(name = "CONTROLE")
    private Short controle;
    @Column(name = "CONTROLE2")
    private Short controle2;
    @Column(name = "CONTROLE3")
    private Short controle3;
    @Column(name = "TVA")
    private BigDecimal tva;
    @Column(name = "DUR_PRE")
    private Double durPre;
    @Column(name = "NOMBRE")
    private BigInteger nombre;
    @Column(name = "N_H")
    private Double nH;
    @Column(name = "S_H")
    private Double sH;
    @Size(max = 8)
    @Column(name = "CODE")
    private String code;
    @Column(name = "NBR_SHT")
    private Integer nbrSht;
    @Column(name = "NB_ATT")
    private Short nbAtt;
    @Size(max = 8)
    @Column(name = "TYPE")
    private String type;
    @Column(name = "GESTION")
    private BigInteger gestion;
    @Size(max = 8)
    @Column(name = "STATUT")
    private String statut;
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
    @Column(name = "ENCLEUNIK")
    private BigInteger encleunik;
    @Column(name = "CICLEUNIK")
    private BigInteger cicleunik;
    @Column(name = "OK_AGENT")
    private Short okAgent;
    @Column(name = "OK_CAPITAINE")
    private Short okCapitaine;
    @Column(name = "OK_MANUTENTIONNAIRE")
    private Short okManutentionnaire;
    @Column(name = "OK_EXPLOITATION")
    private Short okExploitation;
    @Size(max = 8)
    @Column(name = "DATE_AGENT")
    private String dateAgent;
    @Size(max = 4)
    @Column(name = "HEURE_AGENT")
    private String heureAgent;
    @Size(max = 8)
    @Column(name = "DATE_CAPITAINE")
    private String dateCapitaine;
    @Size(max = 4)
    @Column(name = "HEURE_CAPITAINE")
    private String heureCapitaine;
    @Size(max = 8)
    @Column(name = "DATE_MANUTENTIONNAIRE")
    private String dateManutentionnaire;
    @Size(max = 4)
    @Column(name = "HEURE_MANUTENTIONNAIRE")
    private String heureManutentionnaire;
    @Size(max = 8)
    @Column(name = "DATE_EXPLOITATION")
    private String dateExploitation;
    @Size(max = 4)
    @Column(name = "HEURE_EXPLOITATION")
    private String heureExploitation;
    @Size(max = 8)
    @Column(name = "AFFECTATION")
    private String affectation;
    @Column(name = "QUCLEUNIK")
    private BigInteger qucleunik;
    @Column(name = "ESCLEUNIK")
    private BigInteger escleunik;
    @Column(name = "BASE")
    private BigDecimal base;
    @Column(name = "CHARGE_FIXE")
    private BigDecimal chargeFixe;
    @Column(name = "AVOIR")
    private Short avoir;
    @Column(name = "BLCLEUNIK")
    private BigInteger blcleunik;
    @Column(name = "C2CLEUNIK")
    private BigInteger c2cleunik;
    @Column(name = "MACLEUNIK")
    private BigInteger macleunik;
    @Column(name = "M0CLEUNIK")
    private BigInteger m0cleunik;
    @Column(name = "OK_FACT")
    private Short okFact;
    @Size(max = 8)
    @Column(name = "DATE_FACT")
    private String dateFact;
    @Size(max = 4)
    @Column(name = "HEURE_FACT")
    private String heureFact;
    @Size(max = 8)
    @Column(name = "CODE_GEN")
    private String codeGen;
    @Size(max = 12)
    @Column(name = "CODE_ANA")
    private String codeAna;
    @Column(name = "REDUC1")
    private BigDecimal reduc1;
    @Column(name = "REDUC2")
    private BigDecimal reduc2;
    @Column(name = "REDUC3")
    private BigDecimal reduc3;
    @Column(name = "REDUC4")
    private BigDecimal reduc4;
    @Column(name = "REDUC5")
    private BigDecimal reduc5;
    @Column(name = "REDUC6")
    private BigDecimal reduc6;
    @Column(name = "REDUC7")
    private BigDecimal reduc7;
    @Column(name = "REDUC8")
    private BigDecimal reduc8;
    @Column(name = "TOTAL_REDUC")
    private BigDecimal totalReduc;
    @Column(name = "TRCLEUNIK")
    private BigInteger trcleunik;
    @Column(name = "OPCLEUNIK")
    private BigInteger opcleunik;
    @Size(max = 8)
    @Column(name = "CONDITIONS")
    private String conditions;
    @Column(name = "QUANTITE_MINI")
    private BigDecimal quantiteMini;
    @Column(name = "MINI_PERCEPTION")
    private BigDecimal miniPerception;
    @Column(name = "CENTIMES_ADD")
    private BigDecimal centimesAdd;
    @Size(max = 8)
    @Column(name = "GROUPE_TARIFAIRE1")
    private String groupeTarifaire1;
    @Size(max = 8)
    @Column(name = "GROUPE_TARIFAIRE2")
    private String groupeTarifaire2;
    @Size(max = 8)
    @Column(name = "GROUPE_TARIFAIRE3")
    private String groupeTarifaire3;
    @Size(max = 8)
    @Column(name = "GROUPE_TARIFAIRE4")
    private String groupeTarifaire4;
    @Size(max = 8)
    @Column(name = "GROUPE_TARIFAIRE5")
    private String groupeTarifaire5;
    @Size(max = 8)
    @Column(name = "GROUPE_TARIFAIRE6")
    private String groupeTarifaire6;
    @Size(max = 8)
    @Column(name = "GROUPE_TARIFAIRE7")
    private String groupeTarifaire7;
    @Size(max = 8)
    @Column(name = "GROUPE_TARIFAIRE8")
    private String groupeTarifaire8;
    @Column(name = "OCCURS_TARIFAIRE_A_SUIVRE1")
    private Short occursTarifaireASuivre1;
    @Column(name = "OCCURS_TARIFAIRE_A_SUIVRE2")
    private Short occursTarifaireASuivre2;
    @Column(name = "OCCURS_TARIFAIRE_A_SUIVRE3")
    private Short occursTarifaireASuivre3;
    @Column(name = "OCCURS_TARIFAIRE_A_SUIVRE4")
    private Short occursTarifaireASuivre4;
    @Column(name = "OCCURS_TARIFAIRE_A_SUIVRE5")
    private Short occursTarifaireASuivre5;
    @Column(name = "OCCURS_TARIFAIRE_A_SUIVRE6")
    private Short occursTarifaireASuivre6;
    @Column(name = "OCCURS_TARIFAIRE_A_SUIVRE7")
    private Short occursTarifaireASuivre7;
    @Column(name = "OCCURS_TARIFAIRE_A_SUIVRE8")
    private Short occursTarifaireASuivre8;
    @Column(name = "MNT_CENTIMES_ADD")
    private BigDecimal mntCentimesAdd;
    @Column(name = "HORODATAGE_ASSISTANCE_SORTIE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horodatageAssistanceSortie;
    @Size(max = 4)
    @Column(name = "H_VEDETTE")
    private String hVedette;
    @Size(max = 4)
    @Column(name = "H_EMBARQUEMENT")
    private String hEmbarquement;
    @Size(max = 4)
    @Column(name = "H_REMORQUEUR")
    private String hRemorqueur;
    @Column(name = "PRESENCE_BOLLARDS")
    private Short presenceBollards;
    @Column(name = "CAPELAGE_AMARRES")
    private Short capelageAmarres;
    @Column(name = "ESPACES_TRAVAIL")
    private Short espacesTravail;
    @Size(max = 8)
    @Column(name = "CONDITIONS2")
    private String conditions2;
    @Size(max = 8)
    @Column(name = "AGENT")
    private String agent;

    public Services() {
    }

    public Services(BigDecimal srcleunik) {
        this.srcleunik = srcleunik;
    }

    public BigDecimal getSrcleunik() {
        return srcleunik;
    }

    public void setSrcleunik(BigDecimal srcleunik) {
        this.srcleunik = srcleunik;
    }

    public String getIdentite() {
        return identite;
    }

    public void setIdentite(String identite) {
        this.identite = identite;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getReferenc() {
        return referenc;
    }

    public void setReferenc(String referenc) {
        this.referenc = referenc;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getProprie() {
        return proprie;
    }

    public void setProprie(String proprie) {
        this.proprie = proprie;
    }

    public String getRespons() {
        return respons;
    }

    public void setRespons(String respons) {
        this.respons = respons;
    }

    public String getTarif() {
        return tarif;
    }

    public void setTarif(String tarif) {
        this.tarif = tarif;
    }

    public String getRegle() {
        return regle;
    }

    public void setRegle(String regle) {
        this.regle = regle;
    }

    public String getAnnonce() {
        return annonce;
    }

    public void setAnnonce(String annonce) {
        this.annonce = annonce;
    }

    public String getPrestat() {
        return prestat;
    }

    public void setPrestat(String prestat) {
        this.prestat = prestat;
    }

    public String getCDate() {
        return cDate;
    }

    public void setCDate(String cDate) {
        this.cDate = cDate;
    }

    public String getCHeure() {
        return cHeure;
    }

    public void setCHeure(String cHeure) {
        this.cHeure = cHeure;
    }

    public BigInteger getCDeb() {
        return cDeb;
    }

    public void setCDeb(BigInteger cDeb) {
        this.cDeb = cDeb;
    }

    public BigInteger getCFin() {
        return cFin;
    }

    public void setCFin(BigInteger cFin) {
        this.cFin = cFin;
    }

    public BigInteger getCQuant() {
        return cQuant;
    }

    public void setCQuant(BigInteger cQuant) {
        this.cQuant = cQuant;
    }

    public String getLDate() {
        return lDate;
    }

    public void setLDate(String lDate) {
        this.lDate = lDate;
    }

    public String getLHeure() {
        return lHeure;
    }

    public void setLHeure(String lHeure) {
        this.lHeure = lHeure;
    }

    public BigInteger getLDeb() {
        return lDeb;
    }

    public void setLDeb(BigInteger lDeb) {
        this.lDeb = lDeb;
    }

    public BigInteger getLFin() {
        return lFin;
    }

    public void setLFin(BigInteger lFin) {
        this.lFin = lFin;
    }

    public BigInteger getLQuant() {
        return lQuant;
    }

    public void setLQuant(BigInteger lQuant) {
        this.lQuant = lQuant;
    }

    public String getFDate() {
        return fDate;
    }

    public void setFDate(String fDate) {
        this.fDate = fDate;
    }

    public String getFHeure() {
        return fHeure;
    }

    public void setFHeure(String fHeure) {
        this.fHeure = fHeure;
    }

    public BigInteger getFDeb() {
        return fDeb;
    }

    public void setFDeb(BigInteger fDeb) {
        this.fDeb = fDeb;
    }

    public BigInteger getFFin() {
        return fFin;
    }

    public void setFFin(BigInteger fFin) {
        this.fFin = fFin;
    }

    public BigDecimal getFQuant() {
        return fQuant;
    }

    public void setFQuant(BigDecimal fQuant) {
        this.fQuant = fQuant;
    }

    public BigDecimal getTaux() {
        return taux;
    }

    public void setTaux(BigDecimal taux) {
        this.taux = taux;
    }

    public BigDecimal getMajorat() {
        return majorat;
    }

    public void setMajorat(BigDecimal majorat) {
        this.majorat = majorat;
    }

    public BigDecimal getReduct() {
        return reduct;
    }

    public void setReduct(BigDecimal reduct) {
        this.reduct = reduct;
    }

    public BigDecimal getForfait() {
        return forfait;
    }

    public void setForfait(BigDecimal forfait) {
        this.forfait = forfait;
    }

    public BigDecimal getMntHt() {
        return mntHt;
    }

    public void setMntHt(BigDecimal mntHt) {
        this.mntHt = mntHt;
    }

    public BigDecimal getMntTva() {
        return mntTva;
    }

    public void setMntTva(BigDecimal mntTva) {
        this.mntTva = mntTva;
    }

    public BigDecimal getMntTtc() {
        return mntTtc;
    }

    public void setMntTtc(BigDecimal mntTtc) {
        this.mntTtc = mntTtc;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public BigInteger getLDuree() {
        return lDuree;
    }

    public void setLDuree(BigInteger lDuree) {
        this.lDuree = lDuree;
    }

    public BigInteger getFDuree() {
        return fDuree;
    }

    public void setFDuree(BigInteger fDuree) {
        this.fDuree = fDuree;
    }

    public Short getControle() {
        return controle;
    }

    public void setControle(Short controle) {
        this.controle = controle;
    }

    public Short getControle2() {
        return controle2;
    }

    public void setControle2(Short controle2) {
        this.controle2 = controle2;
    }

    public Short getControle3() {
        return controle3;
    }

    public void setControle3(Short controle3) {
        this.controle3 = controle3;
    }

    public BigDecimal getTva() {
        return tva;
    }

    public void setTva(BigDecimal tva) {
        this.tva = tva;
    }

    public Double getDurPre() {
        return durPre;
    }

    public void setDurPre(Double durPre) {
        this.durPre = durPre;
    }

    public BigInteger getNombre() {
        return nombre;
    }

    public void setNombre(BigInteger nombre) {
        this.nombre = nombre;
    }

    public Double getNH() {
        return nH;
    }

    public void setNH(Double nH) {
        this.nH = nH;
    }

    public Double getSH() {
        return sH;
    }

    public void setSH(Double sH) {
        this.sH = sH;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getNbrSht() {
        return nbrSht;
    }

    public void setNbrSht(Integer nbrSht) {
        this.nbrSht = nbrSht;
    }

    public Short getNbAtt() {
        return nbAtt;
    }

    public void setNbAtt(Short nbAtt) {
        this.nbAtt = nbAtt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigInteger getGestion() {
        return gestion;
    }

    public void setGestion(BigInteger gestion) {
        this.gestion = gestion;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
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

    public BigInteger getEncleunik() {
        return encleunik;
    }

    public void setEncleunik(BigInteger encleunik) {
        this.encleunik = encleunik;
    }

    public BigInteger getCicleunik() {
        return cicleunik;
    }

    public void setCicleunik(BigInteger cicleunik) {
        this.cicleunik = cicleunik;
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

    public Short getOkManutentionnaire() {
        return okManutentionnaire;
    }

    public void setOkManutentionnaire(Short okManutentionnaire) {
        this.okManutentionnaire = okManutentionnaire;
    }

    public Short getOkExploitation() {
        return okExploitation;
    }

    public void setOkExploitation(Short okExploitation) {
        this.okExploitation = okExploitation;
    }

    public String getDateAgent() {
        return dateAgent;
    }

    public void setDateAgent(String dateAgent) {
        this.dateAgent = dateAgent;
    }

    public String getHeureAgent() {
        return heureAgent;
    }

    public void setHeureAgent(String heureAgent) {
        this.heureAgent = heureAgent;
    }

    public String getDateCapitaine() {
        return dateCapitaine;
    }

    public void setDateCapitaine(String dateCapitaine) {
        this.dateCapitaine = dateCapitaine;
    }

    public String getHeureCapitaine() {
        return heureCapitaine;
    }

    public void setHeureCapitaine(String heureCapitaine) {
        this.heureCapitaine = heureCapitaine;
    }

    public String getDateManutentionnaire() {
        return dateManutentionnaire;
    }

    public void setDateManutentionnaire(String dateManutentionnaire) {
        this.dateManutentionnaire = dateManutentionnaire;
    }

    public String getHeureManutentionnaire() {
        return heureManutentionnaire;
    }

    public void setHeureManutentionnaire(String heureManutentionnaire) {
        this.heureManutentionnaire = heureManutentionnaire;
    }

    public String getDateExploitation() {
        return dateExploitation;
    }

    public void setDateExploitation(String dateExploitation) {
        this.dateExploitation = dateExploitation;
    }

    public String getHeureExploitation() {
        return heureExploitation;
    }

    public void setHeureExploitation(String heureExploitation) {
        this.heureExploitation = heureExploitation;
    }

    public String getAffectation() {
        return affectation;
    }

    public void setAffectation(String affectation) {
        this.affectation = affectation;
    }

    public BigInteger getQucleunik() {
        return qucleunik;
    }

    public void setQucleunik(BigInteger qucleunik) {
        this.qucleunik = qucleunik;
    }

    public BigInteger getEscleunik() {
        return escleunik;
    }

    public void setEscleunik(BigInteger escleunik) {
        this.escleunik = escleunik;
    }

    public BigDecimal getBase() {
        return base;
    }

    public void setBase(BigDecimal base) {
        this.base = base;
    }

    public BigDecimal getChargeFixe() {
        return chargeFixe;
    }

    public void setChargeFixe(BigDecimal chargeFixe) {
        this.chargeFixe = chargeFixe;
    }

    public Short getAvoir() {
        return avoir;
    }

    public void setAvoir(Short avoir) {
        this.avoir = avoir;
    }

    public BigInteger getBlcleunik() {
        return blcleunik;
    }

    public void setBlcleunik(BigInteger blcleunik) {
        this.blcleunik = blcleunik;
    }

    public BigInteger getC2cleunik() {
        return c2cleunik;
    }

    public void setC2cleunik(BigInteger c2cleunik) {
        this.c2cleunik = c2cleunik;
    }

    public BigInteger getMacleunik() {
        return macleunik;
    }

    public void setMacleunik(BigInteger macleunik) {
        this.macleunik = macleunik;
    }

    public BigInteger getM0cleunik() {
        return m0cleunik;
    }

    public void setM0cleunik(BigInteger m0cleunik) {
        this.m0cleunik = m0cleunik;
    }

    public Short getOkFact() {
        return okFact;
    }

    public void setOkFact(Short okFact) {
        this.okFact = okFact;
    }

    public String getDateFact() {
        return dateFact;
    }

    public void setDateFact(String dateFact) {
        this.dateFact = dateFact;
    }

    public String getHeureFact() {
        return heureFact;
    }

    public void setHeureFact(String heureFact) {
        this.heureFact = heureFact;
    }

    public String getCodeGen() {
        return codeGen;
    }

    public void setCodeGen(String codeGen) {
        this.codeGen = codeGen;
    }

    public String getCodeAna() {
        return codeAna;
    }

    public void setCodeAna(String codeAna) {
        this.codeAna = codeAna;
    }

    public BigDecimal getReduc1() {
        return reduc1;
    }

    public void setReduc1(BigDecimal reduc1) {
        this.reduc1 = reduc1;
    }

    public BigDecimal getReduc2() {
        return reduc2;
    }

    public void setReduc2(BigDecimal reduc2) {
        this.reduc2 = reduc2;
    }

    public BigDecimal getReduc3() {
        return reduc3;
    }

    public void setReduc3(BigDecimal reduc3) {
        this.reduc3 = reduc3;
    }

    public BigDecimal getReduc4() {
        return reduc4;
    }

    public void setReduc4(BigDecimal reduc4) {
        this.reduc4 = reduc4;
    }

    public BigDecimal getReduc5() {
        return reduc5;
    }

    public void setReduc5(BigDecimal reduc5) {
        this.reduc5 = reduc5;
    }

    public BigDecimal getReduc6() {
        return reduc6;
    }

    public void setReduc6(BigDecimal reduc6) {
        this.reduc6 = reduc6;
    }

    public BigDecimal getReduc7() {
        return reduc7;
    }

    public void setReduc7(BigDecimal reduc7) {
        this.reduc7 = reduc7;
    }

    public BigDecimal getReduc8() {
        return reduc8;
    }

    public void setReduc8(BigDecimal reduc8) {
        this.reduc8 = reduc8;
    }

    public BigDecimal getTotalReduc() {
        return totalReduc;
    }

    public void setTotalReduc(BigDecimal totalReduc) {
        this.totalReduc = totalReduc;
    }

    public BigInteger getTrcleunik() {
        return trcleunik;
    }

    public void setTrcleunik(BigInteger trcleunik) {
        this.trcleunik = trcleunik;
    }

    public BigInteger getOpcleunik() {
        return opcleunik;
    }

    public void setOpcleunik(BigInteger opcleunik) {
        this.opcleunik = opcleunik;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public BigDecimal getQuantiteMini() {
        return quantiteMini;
    }

    public void setQuantiteMini(BigDecimal quantiteMini) {
        this.quantiteMini = quantiteMini;
    }

    public BigDecimal getMiniPerception() {
        return miniPerception;
    }

    public void setMiniPerception(BigDecimal miniPerception) {
        this.miniPerception = miniPerception;
    }

    public BigDecimal getCentimesAdd() {
        return centimesAdd;
    }

    public void setCentimesAdd(BigDecimal centimesAdd) {
        this.centimesAdd = centimesAdd;
    }

    public String getGroupeTarifaire1() {
        return groupeTarifaire1;
    }

    public void setGroupeTarifaire1(String groupeTarifaire1) {
        this.groupeTarifaire1 = groupeTarifaire1;
    }

    public String getGroupeTarifaire2() {
        return groupeTarifaire2;
    }

    public void setGroupeTarifaire2(String groupeTarifaire2) {
        this.groupeTarifaire2 = groupeTarifaire2;
    }

    public String getGroupeTarifaire3() {
        return groupeTarifaire3;
    }

    public void setGroupeTarifaire3(String groupeTarifaire3) {
        this.groupeTarifaire3 = groupeTarifaire3;
    }

    public String getGroupeTarifaire4() {
        return groupeTarifaire4;
    }

    public void setGroupeTarifaire4(String groupeTarifaire4) {
        this.groupeTarifaire4 = groupeTarifaire4;
    }

    public String getGroupeTarifaire5() {
        return groupeTarifaire5;
    }

    public void setGroupeTarifaire5(String groupeTarifaire5) {
        this.groupeTarifaire5 = groupeTarifaire5;
    }

    public String getGroupeTarifaire6() {
        return groupeTarifaire6;
    }

    public void setGroupeTarifaire6(String groupeTarifaire6) {
        this.groupeTarifaire6 = groupeTarifaire6;
    }

    public String getGroupeTarifaire7() {
        return groupeTarifaire7;
    }

    public void setGroupeTarifaire7(String groupeTarifaire7) {
        this.groupeTarifaire7 = groupeTarifaire7;
    }

    public String getGroupeTarifaire8() {
        return groupeTarifaire8;
    }

    public void setGroupeTarifaire8(String groupeTarifaire8) {
        this.groupeTarifaire8 = groupeTarifaire8;
    }

    public Short getOccursTarifaireASuivre1() {
        return occursTarifaireASuivre1;
    }

    public void setOccursTarifaireASuivre1(Short occursTarifaireASuivre1) {
        this.occursTarifaireASuivre1 = occursTarifaireASuivre1;
    }

    public Short getOccursTarifaireASuivre2() {
        return occursTarifaireASuivre2;
    }

    public void setOccursTarifaireASuivre2(Short occursTarifaireASuivre2) {
        this.occursTarifaireASuivre2 = occursTarifaireASuivre2;
    }

    public Short getOccursTarifaireASuivre3() {
        return occursTarifaireASuivre3;
    }

    public void setOccursTarifaireASuivre3(Short occursTarifaireASuivre3) {
        this.occursTarifaireASuivre3 = occursTarifaireASuivre3;
    }

    public Short getOccursTarifaireASuivre4() {
        return occursTarifaireASuivre4;
    }

    public void setOccursTarifaireASuivre4(Short occursTarifaireASuivre4) {
        this.occursTarifaireASuivre4 = occursTarifaireASuivre4;
    }

    public Short getOccursTarifaireASuivre5() {
        return occursTarifaireASuivre5;
    }

    public void setOccursTarifaireASuivre5(Short occursTarifaireASuivre5) {
        this.occursTarifaireASuivre5 = occursTarifaireASuivre5;
    }

    public Short getOccursTarifaireASuivre6() {
        return occursTarifaireASuivre6;
    }

    public void setOccursTarifaireASuivre6(Short occursTarifaireASuivre6) {
        this.occursTarifaireASuivre6 = occursTarifaireASuivre6;
    }

    public Short getOccursTarifaireASuivre7() {
        return occursTarifaireASuivre7;
    }

    public void setOccursTarifaireASuivre7(Short occursTarifaireASuivre7) {
        this.occursTarifaireASuivre7 = occursTarifaireASuivre7;
    }

    public Short getOccursTarifaireASuivre8() {
        return occursTarifaireASuivre8;
    }

    public void setOccursTarifaireASuivre8(Short occursTarifaireASuivre8) {
        this.occursTarifaireASuivre8 = occursTarifaireASuivre8;
    }

    public BigDecimal getMntCentimesAdd() {
        return mntCentimesAdd;
    }

    public void setMntCentimesAdd(BigDecimal mntCentimesAdd) {
        this.mntCentimesAdd = mntCentimesAdd;
    }

    public Date getHorodatageAssistanceSortie() {
        return horodatageAssistanceSortie;
    }

    public void setHorodatageAssistanceSortie(Date horodatageAssistanceSortie) {
        this.horodatageAssistanceSortie = horodatageAssistanceSortie;
    }

    public String getHVedette() {
        return hVedette;
    }

    public void setHVedette(String hVedette) {
        this.hVedette = hVedette;
    }

    public String getHEmbarquement() {
        return hEmbarquement;
    }

    public void setHEmbarquement(String hEmbarquement) {
        this.hEmbarquement = hEmbarquement;
    }

    public String getHRemorqueur() {
        return hRemorqueur;
    }

    public void setHRemorqueur(String hRemorqueur) {
        this.hRemorqueur = hRemorqueur;
    }

    public Short getPresenceBollards() {
        return presenceBollards;
    }

    public void setPresenceBollards(Short presenceBollards) {
        this.presenceBollards = presenceBollards;
    }

    public Short getCapelageAmarres() {
        return capelageAmarres;
    }

    public void setCapelageAmarres(Short capelageAmarres) {
        this.capelageAmarres = capelageAmarres;
    }

    public Short getEspacesTravail() {
        return espacesTravail;
    }

    public void setEspacesTravail(Short espacesTravail) {
        this.espacesTravail = espacesTravail;
    }

    public String getConditions2() {
        return conditions2;
    }

    public void setConditions2(String conditions2) {
        this.conditions2 = conditions2;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (srcleunik != null ? srcleunik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Services)) {
            return false;
        }
        Services other = (Services) object;
        if ((this.srcleunik == null && other.srcleunik != null) || (this.srcleunik != null && !this.srcleunik.equals(other.srcleunik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.adminfaces.starter.model.Services[ srcleunik=" + srcleunik + " ]";
    }
    
}
