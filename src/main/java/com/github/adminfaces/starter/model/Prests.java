/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.model;

import com.github.adminfaces.persistence.model.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Calvin ILOKI
 */
@Entity
@Table(name = "PRESTS", catalog = "", schema = "PPNCARGO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prests.findAll", query = "SELECT p FROM Prests p"),
    @NamedQuery(name = "Prests.findByPucleunik", query = "SELECT p FROM Prests p WHERE p.pucleunik = :pucleunik"),
    @NamedQuery(name = "Prests.findByIdentite", query = "SELECT p FROM Prests p WHERE p.identite = :identite"),
    @NamedQuery(name = "Prests.findByNumero", query = "SELECT p FROM Prests p WHERE p.numero = :numero"),
    @NamedQuery(name = "Prests.findByReferenc", query = "SELECT p FROM Prests p WHERE p.referenc = :referenc"),
    @NamedQuery(name = "Prests.findByNom", query = "SELECT p FROM Prests p WHERE p.nom = :nom"),
    @NamedQuery(name = "Prests.findByClient", query = "SELECT p FROM Prests p WHERE p.client = :client"),
    @NamedQuery(name = "Prests.findByProprie", query = "SELECT p FROM Prests p WHERE p.proprie = :proprie"),
    @NamedQuery(name = "Prests.findByRespons", query = "SELECT p FROM Prests p WHERE p.respons = :respons"),
    @NamedQuery(name = "Prests.findByTarif", query = "SELECT p FROM Prests p WHERE p.tarif = :tarif"),
    @NamedQuery(name = "Prests.findByRegle", query = "SELECT p FROM Prests p WHERE p.regle = :regle"),
    @NamedQuery(name = "Prests.findByAnnonce", query = "SELECT p FROM Prests p WHERE p.annonce = :annonce"),
    @NamedQuery(name = "Prests.findByPrestat", query = "SELECT p FROM Prests p WHERE p.prestat = :prestat"),
    @NamedQuery(name = "Prests.findByCDate", query = "SELECT p FROM Prests p WHERE p.cDate = :cDate"),
    @NamedQuery(name = "Prests.findByCHeure", query = "SELECT p FROM Prests p WHERE p.cHeure = :cHeure"),
    @NamedQuery(name = "Prests.findByCDeb", query = "SELECT p FROM Prests p WHERE p.cDeb = :cDeb"),
    @NamedQuery(name = "Prests.findByCFin", query = "SELECT p FROM Prests p WHERE p.cFin = :cFin"),
    @NamedQuery(name = "Prests.findByCQuant", query = "SELECT p FROM Prests p WHERE p.cQuant = :cQuant"),
    @NamedQuery(name = "Prests.findByLDate", query = "SELECT p FROM Prests p WHERE p.lDate = :lDate"),
    @NamedQuery(name = "Prests.findByLHeure", query = "SELECT p FROM Prests p WHERE p.lHeure = :lHeure"),
    @NamedQuery(name = "Prests.findByLDeb", query = "SELECT p FROM Prests p WHERE p.lDeb = :lDeb"),
    @NamedQuery(name = "Prests.findByLFin", query = "SELECT p FROM Prests p WHERE p.lFin = :lFin"),
    @NamedQuery(name = "Prests.findByLQuant", query = "SELECT p FROM Prests p WHERE p.lQuant = :lQuant"),
    @NamedQuery(name = "Prests.findByFDate", query = "SELECT p FROM Prests p WHERE p.fDate = :fDate"),
    @NamedQuery(name = "Prests.findByFHeure", query = "SELECT p FROM Prests p WHERE p.fHeure = :fHeure"),
    @NamedQuery(name = "Prests.findByFDeb", query = "SELECT p FROM Prests p WHERE p.fDeb = :fDeb"),
    @NamedQuery(name = "Prests.findByFFin", query = "SELECT p FROM Prests p WHERE p.fFin = :fFin"),
    @NamedQuery(name = "Prests.findByFQuant", query = "SELECT p FROM Prests p WHERE p.fQuant = :fQuant"),
    @NamedQuery(name = "Prests.findByTaux", query = "SELECT p FROM Prests p WHERE p.taux = :taux"),
    @NamedQuery(name = "Prests.findByMajorat", query = "SELECT p FROM Prests p WHERE p.majorat = :majorat"),
    @NamedQuery(name = "Prests.findByReduct", query = "SELECT p FROM Prests p WHERE p.reduct = :reduct"),
    @NamedQuery(name = "Prests.findByForfait", query = "SELECT p FROM Prests p WHERE p.forfait = :forfait"),
    @NamedQuery(name = "Prests.findByMntHt", query = "SELECT p FROM Prests p WHERE p.mntHt = :mntHt"),
    @NamedQuery(name = "Prests.findByMntTva", query = "SELECT p FROM Prests p WHERE p.mntTva = :mntTva"),
    @NamedQuery(name = "Prests.findByMntTtc", query = "SELECT p FROM Prests p WHERE p.mntTtc = :mntTtc"),
    @NamedQuery(name = "Prests.findByTexte", query = "SELECT p FROM Prests p WHERE p.texte = :texte"),
    @NamedQuery(name = "Prests.findByLDuree", query = "SELECT p FROM Prests p WHERE p.lDuree = :lDuree"),
    @NamedQuery(name = "Prests.findByFDuree", query = "SELECT p FROM Prests p WHERE p.fDuree = :fDuree"),
    @NamedQuery(name = "Prests.findByControle", query = "SELECT p FROM Prests p WHERE p.controle = :controle"),
    @NamedQuery(name = "Prests.findByControle2", query = "SELECT p FROM Prests p WHERE p.controle2 = :controle2"),
    @NamedQuery(name = "Prests.findByControle3", query = "SELECT p FROM Prests p WHERE p.controle3 = :controle3"),
    @NamedQuery(name = "Prests.findByTva", query = "SELECT p FROM Prests p WHERE p.tva = :tva"),
    @NamedQuery(name = "Prests.findByDurPre", query = "SELECT p FROM Prests p WHERE p.durPre = :durPre"),
    @NamedQuery(name = "Prests.findByNombre", query = "SELECT p FROM Prests p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Prests.findByNH", query = "SELECT p FROM Prests p WHERE p.nH = :nH"),
    @NamedQuery(name = "Prests.findBySH", query = "SELECT p FROM Prests p WHERE p.sH = :sH"),
    @NamedQuery(name = "Prests.findByCode", query = "SELECT p FROM Prests p WHERE p.code = :code"),
    @NamedQuery(name = "Prests.findByNbrSht", query = "SELECT p FROM Prests p WHERE p.nbrSht = :nbrSht"),
    @NamedQuery(name = "Prests.findByNbAtt", query = "SELECT p FROM Prests p WHERE p.nbAtt = :nbAtt"),
    @NamedQuery(name = "Prests.findByType", query = "SELECT p FROM Prests p WHERE p.type = :type"),
    @NamedQuery(name = "Prests.findByGestion", query = "SELECT p FROM Prests p WHERE p.gestion = :gestion"),
    @NamedQuery(name = "Prests.findByStatut", query = "SELECT p FROM Prests p WHERE p.statut = :statut"),
    @NamedQuery(name = "Prests.findByCreateur", query = "SELECT p FROM Prests p WHERE p.createur = :createur"),
    @NamedQuery(name = "Prests.findByDCreat", query = "SELECT p FROM Prests p WHERE p.dCreat = :dCreat"),
    @NamedQuery(name = "Prests.findByHCreat", query = "SELECT p FROM Prests p WHERE p.hCreat = :hCreat"),
    @NamedQuery(name = "Prests.findByUtilisat", query = "SELECT p FROM Prests p WHERE p.utilisat = :utilisat"),
    @NamedQuery(name = "Prests.findByDModif", query = "SELECT p FROM Prests p WHERE p.dModif = :dModif"),
    @NamedQuery(name = "Prests.findByHModif", query = "SELECT p FROM Prests p WHERE p.hModif = :hModif"),
    @NamedQuery(name = "Prests.findByEncleunik", query = "SELECT p FROM Prests p WHERE p.encleunik = :encleunik"),
    @NamedQuery(name = "Prests.findByCicleunik", query = "SELECT p FROM Prests p WHERE p.cicleunik = :cicleunik"),
    @NamedQuery(name = "Prests.findByQucleunik", query = "SELECT p FROM Prests p WHERE p.qucleunik = :qucleunik"),
    @NamedQuery(name = "Prests.findByOkAgent", query = "SELECT p FROM Prests p WHERE p.okAgent = :okAgent"),
    @NamedQuery(name = "Prests.findByOkCapitaine", query = "SELECT p FROM Prests p WHERE p.okCapitaine = :okCapitaine"),
    @NamedQuery(name = "Prests.findByOkManutentionnaire", query = "SELECT p FROM Prests p WHERE p.okManutentionnaire = :okManutentionnaire"),
    @NamedQuery(name = "Prests.findByOkExploitation", query = "SELECT p FROM Prests p WHERE p.okExploitation = :okExploitation"),
    @NamedQuery(name = "Prests.findByDateAgent", query = "SELECT p FROM Prests p WHERE p.dateAgent = :dateAgent"),
    @NamedQuery(name = "Prests.findByHeureAgent", query = "SELECT p FROM Prests p WHERE p.heureAgent = :heureAgent"),
    @NamedQuery(name = "Prests.findByDateCapitaine", query = "SELECT p FROM Prests p WHERE p.dateCapitaine = :dateCapitaine"),
    @NamedQuery(name = "Prests.findByHeureCapitaine", query = "SELECT p FROM Prests p WHERE p.heureCapitaine = :heureCapitaine"),
    @NamedQuery(name = "Prests.findByDateManutentionnaire", query = "SELECT p FROM Prests p WHERE p.dateManutentionnaire = :dateManutentionnaire"),
    @NamedQuery(name = "Prests.findByHeureManutentionnaire", query = "SELECT p FROM Prests p WHERE p.heureManutentionnaire = :heureManutentionnaire"),
    @NamedQuery(name = "Prests.findByDateExploitation", query = "SELECT p FROM Prests p WHERE p.dateExploitation = :dateExploitation"),
    @NamedQuery(name = "Prests.findByHeureExploitation", query = "SELECT p FROM Prests p WHERE p.heureExploitation = :heureExploitation"),
    @NamedQuery(name = "Prests.findByAffectation", query = "SELECT p FROM Prests p WHERE p.affectation = :affectation"),
    @NamedQuery(name = "Prests.findByEscleunik", query = "SELECT p FROM Prests p WHERE p.escleunik = :escleunik"),
    @NamedQuery(name = "Prests.findByBase", query = "SELECT p FROM Prests p WHERE p.base = :base"),
    @NamedQuery(name = "Prests.findByChargeFixe", query = "SELECT p FROM Prests p WHERE p.chargeFixe = :chargeFixe"),
    @NamedQuery(name = "Prests.findByAvoir", query = "SELECT p FROM Prests p WHERE p.avoir = :avoir"),
    @NamedQuery(name = "Prests.findByBlcleunik", query = "SELECT p FROM Prests p WHERE p.blcleunik = :blcleunik"),
    @NamedQuery(name = "Prests.findByC2cleunik", query = "SELECT p FROM Prests p WHERE p.c2cleunik = :c2cleunik"),
    @NamedQuery(name = "Prests.findByMacleunik", query = "SELECT p FROM Prests p WHERE p.macleunik = :macleunik"),
    @NamedQuery(name = "Prests.findByM0cleunik", query = "SELECT p FROM Prests p WHERE p.m0cleunik = :m0cleunik"),
    @NamedQuery(name = "Prests.findByOkFact", query = "SELECT p FROM Prests p WHERE p.okFact = :okFact"),
    @NamedQuery(name = "Prests.findByDateFact", query = "SELECT p FROM Prests p WHERE p.dateFact = :dateFact"),
    @NamedQuery(name = "Prests.findByHeureFact", query = "SELECT p FROM Prests p WHERE p.heureFact = :heureFact"),
    @NamedQuery(name = "Prests.findByCodeGen", query = "SELECT p FROM Prests p WHERE p.codeGen = :codeGen"),
    @NamedQuery(name = "Prests.findByCodeAna", query = "SELECT p FROM Prests p WHERE p.codeAna = :codeAna"),
    @NamedQuery(name = "Prests.findByReduc1", query = "SELECT p FROM Prests p WHERE p.reduc1 = :reduc1"),
    @NamedQuery(name = "Prests.findByReduc2", query = "SELECT p FROM Prests p WHERE p.reduc2 = :reduc2"),
    @NamedQuery(name = "Prests.findByReduc3", query = "SELECT p FROM Prests p WHERE p.reduc3 = :reduc3"),
    @NamedQuery(name = "Prests.findByReduc4", query = "SELECT p FROM Prests p WHERE p.reduc4 = :reduc4"),
    @NamedQuery(name = "Prests.findByReduc5", query = "SELECT p FROM Prests p WHERE p.reduc5 = :reduc5"),
    @NamedQuery(name = "Prests.findByReduc6", query = "SELECT p FROM Prests p WHERE p.reduc6 = :reduc6"),
    @NamedQuery(name = "Prests.findByReduc7", query = "SELECT p FROM Prests p WHERE p.reduc7 = :reduc7"),
    @NamedQuery(name = "Prests.findByReduc8", query = "SELECT p FROM Prests p WHERE p.reduc8 = :reduc8"),
    @NamedQuery(name = "Prests.findByTotalReduc", query = "SELECT p FROM Prests p WHERE p.totalReduc = :totalReduc"),
    @NamedQuery(name = "Prests.findByTrcleunik", query = "SELECT p FROM Prests p WHERE p.trcleunik = :trcleunik"),
    @NamedQuery(name = "Prests.findByOpcleunik", query = "SELECT p FROM Prests p WHERE p.opcleunik = :opcleunik"),
    @NamedQuery(name = "Prests.findByConditions", query = "SELECT p FROM Prests p WHERE p.conditions = :conditions"),
    @NamedQuery(name = "Prests.findByQuantiteMini", query = "SELECT p FROM Prests p WHERE p.quantiteMini = :quantiteMini"),
    @NamedQuery(name = "Prests.findByMiniPerception", query = "SELECT p FROM Prests p WHERE p.miniPerception = :miniPerception"),
    @NamedQuery(name = "Prests.findByCentimesAdd", query = "SELECT p FROM Prests p WHERE p.centimesAdd = :centimesAdd"),
    @NamedQuery(name = "Prests.findByMntCentimesAdd", query = "SELECT p FROM Prests p WHERE p.mntCentimesAdd = :mntCentimesAdd"),
    @NamedQuery(name = "Prests.findByEgcleunik", query = "SELECT p FROM Prests p WHERE p.egcleunik = :egcleunik"),
    @NamedQuery(name = "Prests.findByDatePrestation", query = "SELECT p FROM Prests p WHERE p.datePrestation = :datePrestation"),
    @NamedQuery(name = "Prests.findByCpcleunik", query = "SELECT p FROM Prests p WHERE p.cpcleunik = :cpcleunik"),
    @NamedQuery(name = "Prests.findByNumeroExoneration", query = "SELECT p FROM Prests p WHERE p.numeroExoneration = :numeroExoneration"),
    @NamedQuery(name = "Prests.findByVicleunik", query = "SELECT p FROM Prests p WHERE p.vicleunik = :vicleunik"),
    @NamedQuery(name = "Prests.findByCouts", query = "SELECT p FROM Prests p WHERE p.couts = :couts"),
    @NamedQuery(name = "Prests.findBySrcleunik", query = "SELECT p FROM Prests p WHERE p.srcleunik = :srcleunik"),
    @NamedQuery(name = "Prests.findByDmcleunik", query = "SELECT p FROM Prests p WHERE p.dmcleunik = :dmcleunik"),
    @NamedQuery(name = "Prests.findByPdcleunik", query = "SELECT p FROM Prests p WHERE p.pdcleunik = :pdcleunik")})
public class Prests extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PUCLEUNIK")
    private BigDecimal pucleunik;
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
    @Size(max = 240)
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
    @JoinColumn(name = "CICLEUNIK",referencedColumnName = "CICLEUNIK")
    @ManyToOne
    private Facture cicleunik;
    @Column(name = "QUCLEUNIK")
    private BigInteger qucleunik;
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
    @JoinColumn(name = "ESCLEUNIK",referencedColumnName = "ESCLEUNIK")
    @ManyToOne
    private Escale escleunik;
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
    @JoinColumn(name = "TRCLEUNIK",referencedColumnName = "TRCLEUNIK")
    @ManyToOne
    private Trafic trcleunik;
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
    @Column(name = "MNT_CENTIMES_ADD")
    private BigDecimal mntCentimesAdd;
    @Column(name = "EGCLEUNIK")
    private BigInteger egcleunik;
    @Size(max = 8)
    @Column(name = "DATE_PRESTATION")
    private String datePrestation;
    @Column(name = "CPCLEUNIK")
    private BigInteger cpcleunik;
    @Size(max = 32)
    @Column(name = "NUMERO_EXONERATION")
    private String numeroExoneration;
    @Column(name = "VICLEUNIK")
    private BigInteger vicleunik;
    @Column(name = "COUTS")
    private BigDecimal couts;
    @Column(name = "SRCLEUNIK")
    private BigInteger srcleunik;
    @Column(name = "DMCLEUNIK")
    private BigInteger dmcleunik;
    @JoinColumn(name = "PDCLEUNIK", referencedColumnName = "PDCLEUNIK")
    @ManyToOne
    private PrestsDomaine pdcleunik;

    public Prests() {
    }

    public Prests(BigDecimal pucleunik) {
        this.pucleunik = pucleunik;
    }

    @Override
    public BigDecimal getId() {
        return pucleunik;
    }
    public BigDecimal getPucleunik() {
        return pucleunik;
    }

    public void setPucleunik(BigDecimal pucleunik) {
        this.pucleunik = pucleunik;
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

    public Facture getCicleunik() {
        return cicleunik;
    }

    public void setCicleunik(Facture cicleunik) {
        this.cicleunik = cicleunik;
    }

    public BigInteger getQucleunik() {
        return qucleunik;
    }

    public void setQucleunik(BigInteger qucleunik) {
        this.qucleunik = qucleunik;
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

    public Escale getEscleunik() {
        return escleunik;
    }

    public void setEscleunik(Escale escleunik) {
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

    public Trafic getTrcleunik() {
        return trcleunik;
    }

    public void setTrcleunik(Trafic trcleunik) {
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

    public BigDecimal getMntCentimesAdd() {
        return mntCentimesAdd;
    }

    public void setMntCentimesAdd(BigDecimal mntCentimesAdd) {
        this.mntCentimesAdd = mntCentimesAdd;
    }

    public BigInteger getEgcleunik() {
        return egcleunik;
    }

    public void setEgcleunik(BigInteger egcleunik) {
        this.egcleunik = egcleunik;
    }

    public String getDatePrestation() {
        return datePrestation;
    }

    public void setDatePrestation(String datePrestation) {
        this.datePrestation = datePrestation;
    }

    public BigInteger getCpcleunik() {
        return cpcleunik;
    }

    public void setCpcleunik(BigInteger cpcleunik) {
        this.cpcleunik = cpcleunik;
    }

    public String getNumeroExoneration() {
        return numeroExoneration;
    }

    public void setNumeroExoneration(String numeroExoneration) {
        this.numeroExoneration = numeroExoneration;
    }

    public BigInteger getVicleunik() {
        return vicleunik;
    }

    public void setVicleunik(BigInteger vicleunik) {
        this.vicleunik = vicleunik;
    }

    public BigDecimal getCouts() {
        return couts;
    }

    public void setCouts(BigDecimal couts) {
        this.couts = couts;
    }

    public BigInteger getSrcleunik() {
        return srcleunik;
    }

    public void setSrcleunik(BigInteger srcleunik) {
        this.srcleunik = srcleunik;
    }

    public BigInteger getDmcleunik() {
        return dmcleunik;
    }

    public void setDmcleunik(BigInteger dmcleunik) {
        this.dmcleunik = dmcleunik;
    }

    public PrestsDomaine getPdcleunik() {
        return pdcleunik;
    }

    public void setPdcleunik(PrestsDomaine pdcleunik) {
        this.pdcleunik = pdcleunik;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pucleunik != null ? pucleunik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prests)) {
            return false;
        }
        Prests other = (Prests) object;
        if ((this.pucleunik == null && other.pucleunik != null) || (this.pucleunik != null && !this.pucleunik.equals(other.pucleunik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.adminfaces.starter.model.Prests[ pucleunik=" + pucleunik + " ]";
    }
    
}
