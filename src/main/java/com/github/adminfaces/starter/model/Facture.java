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
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Calvin ILOKI
 */
@Entity
@Table(name = "FACTURE", catalog = "", schema = "PPNCARGO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facture.findAll", query = "SELECT f FROM Facture f"),
    @NamedQuery(name = "Facture.findByCicleunik", query = "SELECT f FROM Facture f WHERE f.cicleunik = :cicleunik"),
    @NamedQuery(name = "Facture.findByCode", query = "SELECT f FROM Facture f WHERE f.code = :code"),
    @NamedQuery(name = "Facture.findByNumero", query = "SELECT f FROM Facture f WHERE f.numero = :numero"),
    @NamedQuery(name = "Facture.findByMntHt", query = "SELECT f FROM Facture f WHERE f.mntHt = :mntHt"),
    @NamedQuery(name = "Facture.findByMntTva", query = "SELECT f FROM Facture f WHERE f.mntTva = :mntTva"),
    @NamedQuery(name = "Facture.findByMntTtc", query = "SELECT f FROM Facture f WHERE f.mntTtc = :mntTtc"),
    @NamedQuery(name = "Facture.findByTexte", query = "SELECT f FROM Facture f WHERE f.texte = :texte"),
    @NamedQuery(name = "Facture.findByControle", query = "SELECT f FROM Facture f WHERE f.controle = :controle"),
    @NamedQuery(name = "Facture.findByControle2", query = "SELECT f FROM Facture f WHERE f.controle2 = :controle2"),
    @NamedQuery(name = "Facture.findByControle3", query = "SELECT f FROM Facture f WHERE f.controle3 = :controle3"),
    @NamedQuery(name = "Facture.findByTva1", query = "SELECT f FROM Facture f WHERE f.tva1 = :tva1"),
    @NamedQuery(name = "Facture.findByTva2", query = "SELECT f FROM Facture f WHERE f.tva2 = :tva2"),
    @NamedQuery(name = "Facture.findByTva3", query = "SELECT f FROM Facture f WHERE f.tva3 = :tva3"),
    @NamedQuery(name = "Facture.findByTva4", query = "SELECT f FROM Facture f WHERE f.tva4 = :tva4"),
    @NamedQuery(name = "Facture.findByMntTva1", query = "SELECT f FROM Facture f WHERE f.mntTva1 = :mntTva1"),
    @NamedQuery(name = "Facture.findByMntTva2", query = "SELECT f FROM Facture f WHERE f.mntTva2 = :mntTva2"),
    @NamedQuery(name = "Facture.findByMntTva3", query = "SELECT f FROM Facture f WHERE f.mntTva3 = :mntTva3"),
    @NamedQuery(name = "Facture.findByMntTva4", query = "SELECT f FROM Facture f WHERE f.mntTva4 = :mntTva4"),
    @NamedQuery(name = "Facture.findByMntHt1", query = "SELECT f FROM Facture f WHERE f.mntHt1 = :mntHt1"),
    @NamedQuery(name = "Facture.findByMntHt2", query = "SELECT f FROM Facture f WHERE f.mntHt2 = :mntHt2"),
    @NamedQuery(name = "Facture.findByMntHt3", query = "SELECT f FROM Facture f WHERE f.mntHt3 = :mntHt3"),
    @NamedQuery(name = "Facture.findByMntHt4", query = "SELECT f FROM Facture f WHERE f.mntHt4 = :mntHt4"),
    @NamedQuery(name = "Facture.findByLadate", query = "SELECT f FROM Facture f WHERE f.ladate = :ladate"),
    @NamedQuery(name = "Facture.findByFactDate", query = "SELECT f FROM Facture f WHERE f.factDate = :factDate"),
    @NamedQuery(name = "Facture.findBySens", query = "SELECT f FROM Facture f WHERE f.sens = :sens"),
    @NamedQuery(name = "Facture.findByTexte1", query = "SELECT f FROM Facture f WHERE f.texte1 = :texte1"),
    @NamedQuery(name = "Facture.findByCompte", query = "SELECT f FROM Facture f WHERE f.compte = :compte"),
    @NamedQuery(name = "Facture.findByStatut", query = "SELECT f FROM Facture f WHERE f.statut = :statut"),
    @NamedQuery(name = "Facture.findByGestion", query = "SELECT f FROM Facture f WHERE f.gestion = :gestion"),
    @NamedQuery(name = "Facture.findByCreateur", query = "SELECT f FROM Facture f WHERE f.createur = :createur"),
    @NamedQuery(name = "Facture.findByDCreat", query = "SELECT f FROM Facture f WHERE f.dCreat = :dCreat"),
    @NamedQuery(name = "Facture.findByHCreat", query = "SELECT f FROM Facture f WHERE f.hCreat = :hCreat"),
    @NamedQuery(name = "Facture.findByUtilisat", query = "SELECT f FROM Facture f WHERE f.utilisat = :utilisat"),
    @NamedQuery(name = "Facture.findByDModif", query = "SELECT f FROM Facture f WHERE f.dModif = :dModif"),
    @NamedQuery(name = "Facture.findByHModif", query = "SELECT f FROM Facture f WHERE f.hModif = :hModif"),
    @NamedQuery(name = "Facture.findByEscleunik", query = "SELECT f FROM Facture f WHERE f.escleunik = :escleunik"),
    @NamedQuery(name = "Facture.findByCMag", query = "SELECT f FROM Facture f WHERE f.cMag = :cMag"),
    @NamedQuery(name = "Facture.findByBlcleunik", query = "SELECT f FROM Facture f WHERE f.blcleunik = :blcleunik"),
    @NamedQuery(name = "Facture.findByPvcleunik", query = "SELECT f FROM Facture f WHERE f.pvcleunik = :pvcleunik"),
    @NamedQuery(name = "Facture.findByType", query = "SELECT f FROM Facture f WHERE f.type = :type"),
    @NamedQuery(name = "Facture.findByModeReglement", query = "SELECT f FROM Facture f WHERE f.modeReglement = :modeReglement"),
    @NamedQuery(name = "Facture.findByAvoir", query = "SELECT f FROM Facture f WHERE f.avoir = :avoir"),
    @NamedQuery(name = "Facture.findByRegle", query = "SELECT f FROM Facture f WHERE f.regle = :regle"),
    @NamedQuery(name = "Facture.findByEncaisseur", query = "SELECT f FROM Facture f WHERE f.encaisseur = :encaisseur"),
    @NamedQuery(name = "Facture.findByDatePaiement", query = "SELECT f FROM Facture f WHERE f.datePaiement = :datePaiement"),
    @NamedQuery(name = "Facture.findByNumeroQuittance", query = "SELECT f FROM Facture f WHERE f.numeroQuittance = :numeroQuittance"),
    @NamedQuery(name = "Facture.findByCentimesAdd", query = "SELECT f FROM Facture f WHERE f.centimesAdd = :centimesAdd"),
    @NamedQuery(name = "Facture.findByMntCentimesAdd", query = "SELECT f FROM Facture f WHERE f.mntCentimesAdd = :mntCentimesAdd"),
    @NamedQuery(name = "Facture.findByEstrcleunik", query = "SELECT f FROM Facture f WHERE f.estrcleunik = :estrcleunik"),
    @NamedQuery(name = "Facture.findByAvoirImputablePort", query = "SELECT f FROM Facture f WHERE f.avoirImputablePort = :avoirImputablePort"),
    @NamedQuery(name = "Facture.findByTvaSurFacture", query = "SELECT f FROM Facture f WHERE f.tvaSurFacture = :tvaSurFacture"),
    @NamedQuery(name = "Facture.findByCncleunik", query = "SELECT f FROM Facture f WHERE f.cncleunik = :cncleunik"),
    @NamedQuery(name = "Facture.findByControle4", query = "SELECT f FROM Facture f WHERE f.controle4 = :controle4"),
    @NamedQuery(name = "Facture.findBySituation", query = "SELECT f FROM Facture f WHERE f.situation = :situation"),
    @NamedQuery(name = "Facture.findBySolde", query = "SELECT f FROM Facture f WHERE f.solde = :solde"),
    @NamedQuery(name = "Facture.findByMontantPaye", query = "SELECT f FROM Facture f WHERE f.montantPaye = :montantPaye"),
    @NamedQuery(name = "Facture.findByDRecepRecla", query = "SELECT f FROM Facture f WHERE f.dRecepRecla = :dRecepRecla"),
    @NamedQuery(name = "Facture.findByRefRecla", query = "SELECT f FROM Facture f WHERE f.refRecla = :refRecla"),
    @NamedQuery(name = "Facture.findByMotifRecla", query = "SELECT f FROM Facture f WHERE f.motifRecla = :motifRecla"),
    @NamedQuery(name = "Facture.findByMontantRecla", query = "SELECT f FROM Facture f WHERE f.montantRecla = :montantRecla"),
    @NamedQuery(name = "Facture.findByUserRecla", query = "SELECT f FROM Facture f WHERE f.userRecla = :userRecla"),
    @NamedQuery(name = "Facture.findByDCreRecla", query = "SELECT f FROM Facture f WHERE f.dCreRecla = :dCreRecla"),
    @NamedQuery(name = "Facture.findByNumRecla", query = "SELECT f FROM Facture f WHERE f.numRecla = :numRecla"),
    @NamedQuery(name = "Facture.findByInfoRecla", query = "SELECT f FROM Facture f WHERE f.infoRecla = :infoRecla"),
    @NamedQuery(name = "Facture.findByDEnvoiRecla", query = "SELECT f FROM Facture f WHERE f.dEnvoiRecla = :dEnvoiRecla"),
    @NamedQuery(name = "Facture.findByDRetourRecla", query = "SELECT f FROM Facture f WHERE f.dRetourRecla = :dRetourRecla"),
    @NamedQuery(name = "Facture.findByUserControle", query = "SELECT f FROM Facture f WHERE f.userControle = :userControle"),
    @NamedQuery(name = "Facture.findByUserRedacteur", query = "SELECT f FROM Facture f WHERE f.userRedacteur = :userRedacteur"),
    @NamedQuery(name = "Facture.findByDEnvoiDg", query = "SELECT f FROM Facture f WHERE f.dEnvoiDg = :dEnvoiDg"),
    @NamedQuery(name = "Facture.findByDReponse", query = "SELECT f FROM Facture f WHERE f.dReponse = :dReponse"),
    @NamedQuery(name = "Facture.findByNumDg", query = "SELECT f FROM Facture f WHERE f.numDg = :numDg"),
    @NamedQuery(name = "Facture.findByMotifRejet", query = "SELECT f FROM Facture f WHERE f.motifRejet = :motifRejet"),
    @NamedQuery(name = "Facture.findByMontantConcede", query = "SELECT f FROM Facture f WHERE f.montantConcede = :montantConcede"),
    @NamedQuery(name = "Facture.findByMontantCorrige", query = "SELECT f FROM Facture f WHERE f.montantCorrige = :montantCorrige"),
    @NamedQuery(name = "Facture.findByNumAvoir", query = "SELECT f FROM Facture f WHERE f.numAvoir = :numAvoir"),
    @NamedQuery(name = "Facture.findByNumFacture", query = "SELECT f FROM Facture f WHERE f.numFacture = :numFacture"),
    @NamedQuery(name = "Facture.findByDRecepDfc", query = "SELECT f FROM Facture f WHERE f.dRecepDfc = :dRecepDfc"),
    @NamedQuery(name = "Facture.findByDRecepRegu", query = "SELECT f FROM Facture f WHERE f.dRecepRegu = :dRecepRegu"),
    @NamedQuery(name = "Facture.findByDEnvoiRegu", query = "SELECT f FROM Facture f WHERE f.dEnvoiRegu = :dEnvoiRegu"),
    @NamedQuery(name = "Facture.findByMontantLitige", query = "SELECT f FROM Facture f WHERE f.montantLitige = :montantLitige"),
    @NamedQuery(name = "Facture.findByCtcleunik", query = "SELECT f FROM Facture f WHERE f.ctcleunik = :ctcleunik"),
    @NamedQuery(name = "Facture.findByDateRemiseCheque", query = "SELECT f FROM Facture f WHERE f.dateRemiseCheque = :dateRemiseCheque"),
    @NamedQuery(name = "Facture.findByCentreFacturier", query = "SELECT f FROM Facture f WHERE f.centreFacturier = :centreFacturier"),
    @NamedQuery(name = "Facture.findByTopTrafic", query = "SELECT f FROM Facture f WHERE f.topTrafic = :topTrafic"),
    @NamedQuery(name = "Facture.findByDateDepotCheque", query = "SELECT f FROM Facture f WHERE f.dateDepotCheque = :dateDepotCheque"),
    @NamedQuery(name = "Facture.findByHeureDepotCheque", query = "SELECT f FROM Facture f WHERE f.heureDepotCheque = :heureDepotCheque"),
    @NamedQuery(name = "Facture.findByDateTansmisDfc", query = "SELECT f FROM Facture f WHERE f.dateTansmisDfc = :dateTansmisDfc"),
    @NamedQuery(name = "Facture.findByHeureTansmisDfc", query = "SELECT f FROM Facture f WHERE f.heureTansmisDfc = :heureTansmisDfc"),
    @NamedQuery(name = "Facture.findByNumeroCheque", query = "SELECT f FROM Facture f WHERE f.numeroCheque = :numeroCheque"),
    @NamedQuery(name = "Facture.findByMontantCheque", query = "SELECT f FROM Facture f WHERE f.montantCheque = :montantCheque"),
    @NamedQuery(name = "Facture.findByCleDepTr", query = "SELECT f FROM Facture f WHERE f.cleDepTr = :cleDepTr"),
    @NamedQuery(name = "Facture.findByNumBrouillard", query = "SELECT f FROM Facture f WHERE f.numBrouillard = :numBrouillard"),
    @NamedQuery(name = "Facture.findByNumBordereau", query = "SELECT f FROM Facture f WHERE f.numBordereau = :numBordereau"),
    @NamedQuery(name = "Facture.findByTopLitige", query = "SELECT f FROM Facture f WHERE f.topLitige = :topLitige"),
    @NamedQuery(name = "Facture.findByM0cleunik", query = "SELECT f FROM Facture f WHERE f.m0cleunik = :m0cleunik"),
    @NamedQuery(name = "Facture.findByCicleunik2", query = "SELECT f FROM Facture f WHERE f.cicleunik2 = :cicleunik2"),
    @NamedQuery(name = "Facture.findByBanque", query = "SELECT f FROM Facture f WHERE f.banque = :banque"),
    @NamedQuery(name = "Facture.findByCouts", query = "SELECT f FROM Facture f WHERE f.couts = :couts"),
    @NamedQuery(name = "Facture.findByDmcleunik", query = "SELECT f FROM Facture f WHERE f.dmcleunik = :dmcleunik"),
    @NamedQuery(name = "Facture.findByDdcleunik", query = "SELECT f FROM Facture f WHERE f.ddcleunik = :ddcleunik"),
    @NamedQuery(name = "Facture.findByMoisComptable", query = "SELECT f FROM Facture f WHERE f.moisComptable = :moisComptable"),
    @NamedQuery(name = "Facture.findByTexte2", query = "SELECT f FROM Facture f WHERE f.texte2 = :texte2"),
    @NamedQuery(name = "Facture.findByBacleunik", query = "SELECT f FROM Facture f WHERE f.bacleunik = :bacleunik"),
    @NamedQuery(name = "Facture.findByDcOk", query = "SELECT f FROM Facture f WHERE f.dcOk = :dcOk"),
    @NamedQuery(name = "Facture.findByDcDate", query = "SELECT f FROM Facture f WHERE f.dcDate = :dcDate"),
    @NamedQuery(name = "Facture.findByDcHeure", query = "SELECT f FROM Facture f WHERE f.dcHeure = :dcHeure"),
    @NamedQuery(name = "Facture.findByReceptionOk", query = "SELECT f FROM Facture f WHERE f.receptionOk = :receptionOk"),
    @NamedQuery(name = "Facture.findByReceptionDate", query = "SELECT f FROM Facture f WHERE f.receptionDate = :receptionDate"),
    @NamedQuery(name = "Facture.findByReceptionHeure", query = "SELECT f FROM Facture f WHERE f.receptionHeure = :receptionHeure"),
    @NamedQuery(name = "Facture.findByEnvoiOk", query = "SELECT f FROM Facture f WHERE f.envoiOk = :envoiOk"),
    @NamedQuery(name = "Facture.findByEnvoiDate", query = "SELECT f FROM Facture f WHERE f.envoiDate = :envoiDate"),
    @NamedQuery(name = "Facture.findByEnvoiHeure", query = "SELECT f FROM Facture f WHERE f.envoiHeure = :envoiHeure"),
    @NamedQuery(name = "Facture.findByReglementOk", query = "SELECT f FROM Facture f WHERE f.reglementOk = :reglementOk"),
    @NamedQuery(name = "Facture.findByReglementDate", query = "SELECT f FROM Facture f WHERE f.reglementDate = :reglementDate"),
    @NamedQuery(name = "Facture.findByReglementHeure", query = "SELECT f FROM Facture f WHERE f.reglementHeure = :reglementHeure"),
    @NamedQuery(name = "Facture.findByDgOk", query = "SELECT f FROM Facture f WHERE f.dgOk = :dgOk"),
    @NamedQuery(name = "Facture.findByDgDate", query = "SELECT f FROM Facture f WHERE f.dgDate = :dgDate"),
    @NamedQuery(name = "Facture.findByDgHeure", query = "SELECT f FROM Facture f WHERE f.dgHeure = :dgHeure"),
    @NamedQuery(name = "Facture.findByDateTransfert", query = "SELECT f FROM Facture f WHERE f.dateTransfert = :dateTransfert"),
    @NamedQuery(name = "Facture.findByManut", query = "SELECT f FROM Facture f WHERE f.manut = :manut"),
    @NamedQuery(name = "Facture.findByTccleunik", query = "SELECT f FROM Facture f WHERE f.tccleunik = :tccleunik"),
    @NamedQuery(name = "Facture.findByDateProchainePenalite", query = "SELECT f FROM Facture f WHERE f.dateProchainePenalite = :dateProchainePenalite")})
public class Facture extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CICLEUNIK")
    private Integer cicleunik;
    @Size(max = 8)
    @Column(name = "CODE")
    private String code;
    @Size(max = 12)
    @Column(name = "NUMERO")
    private String numero;
    @Column(name = "MNT_HT")
    private BigDecimal mntHt;
    @Column(name = "MNT_TVA")
    private BigDecimal mntTva;
    @Column(name = "MNT_TTC")
    private BigDecimal mntTtc;
    @Size(max = 80)
    @Column(name = "TEXTE")
    private String texte;
    @Column(name = "CONTROLE")
    private Short controle;
    @Column(name = "CONTROLE2")
    private Short controle2;
    @Column(name = "CONTROLE3")
    private Short controle3;
    @Column(name = "TVA1")
    private BigDecimal tva1;
    @Column(name = "TVA2")
    private BigDecimal tva2;
    @Column(name = "TVA3")
    private BigDecimal tva3;
    @Column(name = "TVA4")
    private BigDecimal tva4;
    @Column(name = "MNT_TVA1")
    private BigDecimal mntTva1;
    @Column(name = "MNT_TVA2")
    private BigDecimal mntTva2;
    @Column(name = "MNT_TVA3")
    private BigDecimal mntTva3;
    @Column(name = "MNT_TVA4")
    private BigDecimal mntTva4;
    @Column(name = "MNT_HT1")
    private BigDecimal mntHt1;
    @Column(name = "MNT_HT2")
    private BigDecimal mntHt2;
    @Column(name = "MNT_HT3")
    private BigDecimal mntHt3;
    @Column(name = "MNT_HT4")
    private BigDecimal mntHt4;
    @Size(max = 8)
    @Column(name = "LADATE")
    private String ladate;
    @Size(max = 8)
    @Column(name = "F_DATE")
    private String factDate;
    @Size(max = 8)
    @Column(name = "SENS")
    private String sens;
    @Size(max = 300)
    @Column(name = "TEXTE1")
    private String texte1;
    @Size(max = 17)
    @Column(name = "COMPTE")
    private String compte;
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
    @JoinColumn(name = "ESCLEUNIK",referencedColumnName = "ESCLEUNIK")
    @ManyToOne
    private Escale escleunik;
    @Size(max = 8)
    @Column(name = "C_MAG")
    private String cMag;
    @Column(name = "BLCLEUNIK")
    private BigInteger blcleunik;
    @Column(name = "PVCLEUNIK")
    private BigInteger pvcleunik;
    @Size(max = 8)
    @Column(name = "TYPE")
    private String type;
    @Column(name = "MODE_REGLEMENT")
    private Short modeReglement;
    @Column(name = "AVOIR")
    private Short avoir;
    @Size(max = 8)
    @Column(name = "REGLE")
    private String regle;
    @Size(max = 10)
    @Column(name = "ENCAISSEUR")
    private String encaisseur;
    @Size(max = 8)
    @Column(name = "DATE_PAIEMENT")
    private String datePaiement;
    @Size(max = 12)
    @Column(name = "NUMERO_QUITTANCE")
    private String numeroQuittance;
    @Column(name = "CENTIMES_ADD")
    private BigDecimal centimesAdd;
    @Column(name = "MNT_CENTIMES_ADD")
    private BigDecimal mntCentimesAdd;
    @JoinColumn(name = "TRCLEUNIK",referencedColumnName ="TRCLEUNIK" )
    @ManyToOne
    private Escale estrcleunik;
    @Size(max = 8)
    @Column(name = "AVOIR_IMPUTABLE_PORT")
    private String avoirImputablePort;
    @Column(name = "TVA_SUR_FACTURE")
    private Short tvaSurFacture;
    @Column(name = "CNCLEUNIK")
    private BigInteger cncleunik;
    @Column(name = "CONTROLE4")
    private Short controle4;
    @Size(max = 8)
    @Column(name = "SITUATION")
    private String situation;
    @Column(name = "SOLDE")
    private BigDecimal solde;
    @Column(name = "MONTANT_PAYE")
    private BigDecimal montantPaye;
    @Size(max = 8)
    @Column(name = "D_RECEP_RECLA")
    private String dRecepRecla;
    @Size(max = 20)
    @Column(name = "REF_RECLA")
    private String refRecla;
    @Size(max = 8)
    @Column(name = "MOTIF_RECLA")
    private String motifRecla;
    @Column(name = "MONTANT_RECLA")
    private BigDecimal montantRecla;
    @Size(max = 10)
    @Column(name = "USER_RECLA")
    private String userRecla;
    @Size(max = 8)
    @Column(name = "D_CRE_RECLA")
    private String dCreRecla;
    @Size(max = 12)
    @Column(name = "NUM_RECLA")
    private String numRecla;
    @Size(max = 200)
    @Column(name = "INFO_RECLA")
    private String infoRecla;
    @Size(max = 8)
    @Column(name = "D_ENVOI_RECLA")
    private String dEnvoiRecla;
    @Size(max = 8)
    @Column(name = "D_RETOUR_RECLA")
    private String dRetourRecla;
    @Size(max = 10)
    @Column(name = "USER_CONTROLE")
    private String userControle;
    @Size(max = 10)
    @Column(name = "USER_REDACTEUR")
    private String userRedacteur;
    @Size(max = 8)
    @Column(name = "D_ENVOI_DG")
    private String dEnvoiDg;
    @Size(max = 8)
    @Column(name = "D_REPONSE")
    private String dReponse;
    @Size(max = 12)
    @Column(name = "NUM_DG")
    private String numDg;
    @Size(max = 20)
    @Column(name = "MOTIF_REJET")
    private String motifRejet;
    @Column(name = "MONTANT_CONCEDE")
    private BigDecimal montantConcede;
    @Column(name = "MONTANT_CORRIGE")
    private BigDecimal montantCorrige;
    @Size(max = 12)
    @Column(name = "NUM_AVOIR")
    private String numAvoir;
    @Size(max = 12)
    @Column(name = "NUM_FACTURE")
    private String numFacture;
    @Size(max = 8)
    @Column(name = "D_RECEP_DFC")
    private String dRecepDfc;
    @Size(max = 8)
    @Column(name = "D_RECEP_REGU")
    private String dRecepRegu;
    @Size(max = 8)
    @Column(name = "D_ENVOI_REGU")
    private String dEnvoiRegu;
    @Column(name = "MONTANT_LITIGE")
    private BigDecimal montantLitige;
    @Column(name = "CTCLEUNIK")
    private BigInteger ctcleunik;
    @Size(max = 8)
    @Column(name = "DATE_REMISE_CHEQUE")
    private String dateRemiseCheque;
    @Size(max = 8)
    @Column(name = "CENTRE_FACTURIER")
    private String centreFacturier;
    @Size(max = 1)
    @Column(name = "TOP_TRAFIC")
    private String topTrafic;
    @Size(max = 8)
    @Column(name = "DATE_DEPOT_CHEQUE")
    private String dateDepotCheque;
    @Size(max = 4)
    @Column(name = "HEURE_DEPOT_CHEQUE")
    private String heureDepotCheque;
    @Size(max = 8)
    @Column(name = "DATE_TANSMIS_DFC")
    private String dateTansmisDfc;
    @Size(max = 4)
    @Column(name = "HEURE_TANSMIS_DFC")
    private String heureTansmisDfc;
    @Size(max = 12)
    @Column(name = "NUMERO_CHEQUE")
    private String numeroCheque;
    @Column(name = "MONTANT_CHEQUE")
    private BigDecimal montantCheque;
    @Column(name = "CLE_DEP_TR")
    private BigInteger cleDepTr;
    @Size(max = 12)
    @Column(name = "NUM_BROUILLARD")
    private String numBrouillard;
    @Size(max = 12)
    @Column(name = "NUM_BORDEREAU")
    private String numBordereau;
    @Column(name = "TOP_LITIGE")
    private Short topLitige;
    @Column(name = "M0CLEUNIK")
    private BigInteger m0cleunik;
    @Column(name = "CICLEUNIK2")
    private BigInteger cicleunik2;
    @Size(max = 32)
    @Column(name = "BANQUE")
    private String banque;
    @Column(name = "COUTS")
    private BigDecimal couts;
    @Column(name = "DMCLEUNIK")
    private BigInteger dmcleunik;
    @JoinColumn(name = "DDCLEUNIK",referencedColumnName = "DDCLEUNIK")
    @ManyToOne
    private DossierDomaine ddcleunik;
    @Size(max = 6)
    @Column(name = "MOIS_COMPTABLE")
    private String moisComptable;
    @Size(max = 240)
    @Column(name = "TEXTE2")
    private String texte2;
    @Column(name = "BACLEUNIK")
    private BigInteger bacleunik;
    @Column(name = "DC_OK")
    private Short dcOk;
    @Size(max = 8)
    @Column(name = "DC_DATE")
    private String dcDate;
    @Size(max = 4)
    @Column(name = "DC_HEURE")
    private String dcHeure;
    @Column(name = "RECEPTION_OK")
    private Short receptionOk;
    @Size(max = 8)
    @Column(name = "RECEPTION_DATE")
    private String receptionDate;
    @Size(max = 4)
    @Column(name = "RECEPTION_HEURE")
    private String receptionHeure;
    @Column(name = "ENVOI_OK")
    private Short envoiOk;
    @Size(max = 8)
    @Column(name = "ENVOI_DATE")
    private String envoiDate;
    @Size(max = 4)
    @Column(name = "ENVOI_HEURE")
    private String envoiHeure;
    @Column(name = "REGLEMENT_OK")
    private Short reglementOk;
    @Size(max = 8)
    @Column(name = "REGLEMENT_DATE")
    private String reglementDate;
    @Size(max = 4)
    @Column(name = "REGLEMENT_HEURE")
    private String reglementHeure;
    @Column(name = "DG_OK")
    private Short dgOk;
    @Size(max = 8)
    @Column(name = "DG_DATE")
    private String dgDate;
    @Size(max = 4)
    @Column(name = "DG_HEURE")
    private String dgHeure;
    @Size(max = 8)
    @Column(name = "DATE_TRANSFERT")
    private String dateTransfert;
    @Size(max = 8)
    @Column(name = "MANUT")
    private String manut;
    @JoinColumn(name = "TCCLEUNIK",referencedColumnName = "TCCLEUNIK")
    @OneToOne
    private ImportTcsCt tccleunik;
    @Size(max = 8)
    @Column(name = "DATE_PROCHAINE_PENALITE")
    private String dateProchainePenalite;
    @OneToMany(mappedBy = "CICLEUNIK",fetch = FetchType.EAGER)
    private List<Prests> listPrests;

    public Facture() {
    }

    public Facture(Integer cicleunik) {
        this.cicleunik = cicleunik;
    }

    public Integer getCicleunik() {
        return cicleunik;
    }

    public void setCicleunik(Integer cicleunik) {
        this.cicleunik = cicleunik;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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

    public BigDecimal getTva1() {
        return tva1;
    }

    public void setTva1(BigDecimal tva1) {
        this.tva1 = tva1;
    }

    public BigDecimal getTva2() {
        return tva2;
    }

    public void setTva2(BigDecimal tva2) {
        this.tva2 = tva2;
    }

    public BigDecimal getTva3() {
        return tva3;
    }

    public void setTva3(BigDecimal tva3) {
        this.tva3 = tva3;
    }

    public BigDecimal getTva4() {
        return tva4;
    }

    public void setTva4(BigDecimal tva4) {
        this.tva4 = tva4;
    }

    public BigDecimal getMntTva1() {
        return mntTva1;
    }

    public void setMntTva1(BigDecimal mntTva1) {
        this.mntTva1 = mntTva1;
    }

    public BigDecimal getMntTva2() {
        return mntTva2;
    }

    public void setMntTva2(BigDecimal mntTva2) {
        this.mntTva2 = mntTva2;
    }

    public BigDecimal getMntTva3() {
        return mntTva3;
    }

    public void setMntTva3(BigDecimal mntTva3) {
        this.mntTva3 = mntTva3;
    }

    public BigDecimal getMntTva4() {
        return mntTva4;
    }

    public void setMntTva4(BigDecimal mntTva4) {
        this.mntTva4 = mntTva4;
    }

    public BigDecimal getMntHt1() {
        return mntHt1;
    }

    public void setMntHt1(BigDecimal mntHt1) {
        this.mntHt1 = mntHt1;
    }

    public BigDecimal getMntHt2() {
        return mntHt2;
    }

    public void setMntHt2(BigDecimal mntHt2) {
        this.mntHt2 = mntHt2;
    }

    public BigDecimal getMntHt3() {
        return mntHt3;
    }

    public void setMntHt3(BigDecimal mntHt3) {
        this.mntHt3 = mntHt3;
    }

    public BigDecimal getMntHt4() {
        return mntHt4;
    }

    public void setMntHt4(BigDecimal mntHt4) {
        this.mntHt4 = mntHt4;
    }

    public String getLadate() {
        return ladate;
    }

    public void setLadate(String ladate) {
        this.ladate = ladate;
    }

    public String getFactDate() {
        return factDate;
    }

    public void setFactDate(String fDate) {
        this.factDate = fDate;
    }

    public String getSens() {
        return sens;
    }

    public void setSens(String sens) {
        this.sens = sens;
    }

    public String getTexte1() {
        return texte1;
    }

    public void setTexte1(String texte1) {
        this.texte1 = texte1;
    }

    public String getCompte() {
        return compte;
    }

    public void setCompte(String compte) {
        this.compte = compte;
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

    public Escale getEscleunik() {
        return escleunik;
    }

    public void setEscleunik(Escale escleunik) {
        this.escleunik = escleunik;
    }

    public String getCMag() {
        return cMag;
    }

    public void setCMag(String cMag) {
        this.cMag = cMag;
    }

    public BigInteger getBlcleunik() {
        return blcleunik;
    }

    public void setBlcleunik(BigInteger blcleunik) {
        this.blcleunik = blcleunik;
    }

    public BigInteger getPvcleunik() {
        return pvcleunik;
    }

    public void setPvcleunik(BigInteger pvcleunik) {
        this.pvcleunik = pvcleunik;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Short getModeReglement() {
        return modeReglement;
    }

    public void setModeReglement(Short modeReglement) {
        this.modeReglement = modeReglement;
    }

    public Short getAvoir() {
        return avoir;
    }

    public void setAvoir(Short avoir) {
        this.avoir = avoir;
    }

    public String getRegle() {
        return regle;
    }

    public void setRegle(String regle) {
        this.regle = regle;
    }

    public String getEncaisseur() {
        return encaisseur;
    }

    public void setEncaisseur(String encaisseur) {
        this.encaisseur = encaisseur;
    }

    public String getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(String datePaiement) {
        this.datePaiement = datePaiement;
    }

    public String getNumeroQuittance() {
        return numeroQuittance;
    }

    public void setNumeroQuittance(String numeroQuittance) {
        this.numeroQuittance = numeroQuittance;
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

    public Escale getEstrcleunik() {
        return estrcleunik;
    }

    public void setEstrcleunik(Escale estrcleunik) {
        this.estrcleunik = estrcleunik;
    }

    public String getAvoirImputablePort() {
        return avoirImputablePort;
    }

    public void setAvoirImputablePort(String avoirImputablePort) {
        this.avoirImputablePort = avoirImputablePort;
    }

    public Short getTvaSurFacture() {
        return tvaSurFacture;
    }

    public void setTvaSurFacture(Short tvaSurFacture) {
        this.tvaSurFacture = tvaSurFacture;
    }

    public BigInteger getCncleunik() {
        return cncleunik;
    }

    public void setCncleunik(BigInteger cncleunik) {
        this.cncleunik = cncleunik;
    }

    public Short getControle4() {
        return controle4;
    }

    public void setControle4(Short controle4) {
        this.controle4 = controle4;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public BigDecimal getSolde() {
        return solde;
    }

    public void setSolde(BigDecimal solde) {
        this.solde = solde;
    }

    public BigDecimal getMontantPaye() {
        return montantPaye;
    }

    public void setMontantPaye(BigDecimal montantPaye) {
        this.montantPaye = montantPaye;
    }

    public String getDRecepRecla() {
        return dRecepRecla;
    }

    public void setDRecepRecla(String dRecepRecla) {
        this.dRecepRecla = dRecepRecla;
    }

    public String getRefRecla() {
        return refRecla;
    }

    public void setRefRecla(String refRecla) {
        this.refRecla = refRecla;
    }

    public String getMotifRecla() {
        return motifRecla;
    }

    public void setMotifRecla(String motifRecla) {
        this.motifRecla = motifRecla;
    }

    public BigDecimal getMontantRecla() {
        return montantRecla;
    }

    public void setMontantRecla(BigDecimal montantRecla) {
        this.montantRecla = montantRecla;
    }

    public String getUserRecla() {
        return userRecla;
    }

    public void setUserRecla(String userRecla) {
        this.userRecla = userRecla;
    }

    public String getDCreRecla() {
        return dCreRecla;
    }

    public void setDCreRecla(String dCreRecla) {
        this.dCreRecla = dCreRecla;
    }

    public String getNumRecla() {
        return numRecla;
    }

    public void setNumRecla(String numRecla) {
        this.numRecla = numRecla;
    }

    public String getInfoRecla() {
        return infoRecla;
    }

    public void setInfoRecla(String infoRecla) {
        this.infoRecla = infoRecla;
    }

    public String getDEnvoiRecla() {
        return dEnvoiRecla;
    }

    public void setDEnvoiRecla(String dEnvoiRecla) {
        this.dEnvoiRecla = dEnvoiRecla;
    }

    public String getDRetourRecla() {
        return dRetourRecla;
    }

    public void setDRetourRecla(String dRetourRecla) {
        this.dRetourRecla = dRetourRecla;
    }

    public String getUserControle() {
        return userControle;
    }

    public void setUserControle(String userControle) {
        this.userControle = userControle;
    }

    public String getUserRedacteur() {
        return userRedacteur;
    }

    public void setUserRedacteur(String userRedacteur) {
        this.userRedacteur = userRedacteur;
    }

    public String getDEnvoiDg() {
        return dEnvoiDg;
    }

    public void setDEnvoiDg(String dEnvoiDg) {
        this.dEnvoiDg = dEnvoiDg;
    }

    public String getDReponse() {
        return dReponse;
    }

    public void setDReponse(String dReponse) {
        this.dReponse = dReponse;
    }

    public String getNumDg() {
        return numDg;
    }

    public void setNumDg(String numDg) {
        this.numDg = numDg;
    }

    public String getMotifRejet() {
        return motifRejet;
    }

    public void setMotifRejet(String motifRejet) {
        this.motifRejet = motifRejet;
    }

    public BigDecimal getMontantConcede() {
        return montantConcede;
    }

    public void setMontantConcede(BigDecimal montantConcede) {
        this.montantConcede = montantConcede;
    }

    public BigDecimal getMontantCorrige() {
        return montantCorrige;
    }

    public void setMontantCorrige(BigDecimal montantCorrige) {
        this.montantCorrige = montantCorrige;
    }

    public String getNumAvoir() {
        return numAvoir;
    }

    public void setNumAvoir(String numAvoir) {
        this.numAvoir = numAvoir;
    }

    public String getNumFacture() {
        return numFacture;
    }

    public void setNumFacture(String numFacture) {
        this.numFacture = numFacture;
    }

    public String getDRecepDfc() {
        return dRecepDfc;
    }

    public void setDRecepDfc(String dRecepDfc) {
        this.dRecepDfc = dRecepDfc;
    }

    public String getDRecepRegu() {
        return dRecepRegu;
    }

    public void setDRecepRegu(String dRecepRegu) {
        this.dRecepRegu = dRecepRegu;
    }

    public String getDEnvoiRegu() {
        return dEnvoiRegu;
    }

    public void setDEnvoiRegu(String dEnvoiRegu) {
        this.dEnvoiRegu = dEnvoiRegu;
    }

    public BigDecimal getMontantLitige() {
        return montantLitige;
    }

    public void setMontantLitige(BigDecimal montantLitige) {
        this.montantLitige = montantLitige;
    }

    public BigInteger getCtcleunik() {
        return ctcleunik;
    }

    public void setCtcleunik(BigInteger ctcleunik) {
        this.ctcleunik = ctcleunik;
    }

    public String getDateRemiseCheque() {
        return dateRemiseCheque;
    }

    public void setDateRemiseCheque(String dateRemiseCheque) {
        this.dateRemiseCheque = dateRemiseCheque;
    }

    public String getCentreFacturier() {
        return centreFacturier;
    }

    public void setCentreFacturier(String centreFacturier) {
        this.centreFacturier = centreFacturier;
    }

    public String getTopTrafic() {
        return topTrafic;
    }

    public void setTopTrafic(String topTrafic) {
        this.topTrafic = topTrafic;
    }

    public String getDateDepotCheque() {
        return dateDepotCheque;
    }

    public void setDateDepotCheque(String dateDepotCheque) {
        this.dateDepotCheque = dateDepotCheque;
    }

    public String getHeureDepotCheque() {
        return heureDepotCheque;
    }

    public void setHeureDepotCheque(String heureDepotCheque) {
        this.heureDepotCheque = heureDepotCheque;
    }

    public String getDateTansmisDfc() {
        return dateTansmisDfc;
    }

    public void setDateTansmisDfc(String dateTansmisDfc) {
        this.dateTansmisDfc = dateTansmisDfc;
    }

    public String getHeureTansmisDfc() {
        return heureTansmisDfc;
    }

    public void setHeureTansmisDfc(String heureTansmisDfc) {
        this.heureTansmisDfc = heureTansmisDfc;
    }

    public String getNumeroCheque() {
        return numeroCheque;
    }

    public void setNumeroCheque(String numeroCheque) {
        this.numeroCheque = numeroCheque;
    }

    public BigDecimal getMontantCheque() {
        return montantCheque;
    }

    public void setMontantCheque(BigDecimal montantCheque) {
        this.montantCheque = montantCheque;
    }

    public BigInteger getCleDepTr() {
        return cleDepTr;
    }

    public void setCleDepTr(BigInteger cleDepTr) {
        this.cleDepTr = cleDepTr;
    }

    public String getNumBrouillard() {
        return numBrouillard;
    }

    public void setNumBrouillard(String numBrouillard) {
        this.numBrouillard = numBrouillard;
    }

    public String getNumBordereau() {
        return numBordereau;
    }

    public void setNumBordereau(String numBordereau) {
        this.numBordereau = numBordereau;
    }

    public Short getTopLitige() {
        return topLitige;
    }

    public void setTopLitige(Short topLitige) {
        this.topLitige = topLitige;
    }

    public BigInteger getM0cleunik() {
        return m0cleunik;
    }

    public void setM0cleunik(BigInteger m0cleunik) {
        this.m0cleunik = m0cleunik;
    }

    public BigInteger getCicleunik2() {
        return cicleunik2;
    }

    public void setCicleunik2(BigInteger cicleunik2) {
        this.cicleunik2 = cicleunik2;
    }

    public String getBanque() {
        return banque;
    }

    public void setBanque(String banque) {
        this.banque = banque;
    }

    public BigDecimal getCouts() {
        return couts;
    }

    public void setCouts(BigDecimal couts) {
        this.couts = couts;
    }

    public BigInteger getDmcleunik() {
        return dmcleunik;
    }

    public void setDmcleunik(BigInteger dmcleunik) {
        this.dmcleunik = dmcleunik;
    }

    public DossierDomaine getDdcleunik() {
        return ddcleunik;
    }

    public void setDdcleunik(DossierDomaine ddcleunik) {
        this.ddcleunik = ddcleunik;
    }

    public String getMoisComptable() {
        return moisComptable;
    }

    public void setMoisComptable(String moisComptable) {
        this.moisComptable = moisComptable;
    }

    public String getTexte2() {
        return texte2;
    }

    public void setTexte2(String texte2) {
        this.texte2 = texte2;
    }

    public BigInteger getBacleunik() {
        return bacleunik;
    }

    public void setBacleunik(BigInteger bacleunik) {
        this.bacleunik = bacleunik;
    }

    public Short getDcOk() {
        return dcOk;
    }

    public void setDcOk(Short dcOk) {
        this.dcOk = dcOk;
    }

    public String getDcDate() {
        return dcDate;
    }

    public void setDcDate(String dcDate) {
        this.dcDate = dcDate;
    }

    public String getDcHeure() {
        return dcHeure;
    }

    public void setDcHeure(String dcHeure) {
        this.dcHeure = dcHeure;
    }

    public Short getReceptionOk() {
        return receptionOk;
    }

    public void setReceptionOk(Short receptionOk) {
        this.receptionOk = receptionOk;
    }

    public String getReceptionDate() {
        return receptionDate;
    }

    public void setReceptionDate(String receptionDate) {
        this.receptionDate = receptionDate;
    }

    public String getReceptionHeure() {
        return receptionHeure;
    }

    public void setReceptionHeure(String receptionHeure) {
        this.receptionHeure = receptionHeure;
    }

    public Short getEnvoiOk() {
        return envoiOk;
    }

    public void setEnvoiOk(Short envoiOk) {
        this.envoiOk = envoiOk;
    }

    public String getEnvoiDate() {
        return envoiDate;
    }

    public void setEnvoiDate(String envoiDate) {
        this.envoiDate = envoiDate;
    }

    public String getEnvoiHeure() {
        return envoiHeure;
    }

    public void setEnvoiHeure(String envoiHeure) {
        this.envoiHeure = envoiHeure;
    }

    public Short getReglementOk() {
        return reglementOk;
    }

    public void setReglementOk(Short reglementOk) {
        this.reglementOk = reglementOk;
    }

    public String getReglementDate() {
        return reglementDate;
    }

    public void setReglementDate(String reglementDate) {
        this.reglementDate = reglementDate;
    }

    public String getReglementHeure() {
        return reglementHeure;
    }

    public void setReglementHeure(String reglementHeure) {
        this.reglementHeure = reglementHeure;
    }

    public Short getDgOk() {
        return dgOk;
    }

    public void setDgOk(Short dgOk) {
        this.dgOk = dgOk;
    }

    public String getDgDate() {
        return dgDate;
    }

    public void setDgDate(String dgDate) {
        this.dgDate = dgDate;
    }

    public String getDgHeure() {
        return dgHeure;
    }

    public void setDgHeure(String dgHeure) {
        this.dgHeure = dgHeure;
    }

    public String getDateTransfert() {
        return dateTransfert;
    }

    public void setDateTransfert(String dateTransfert) {
        this.dateTransfert = dateTransfert;
    }

    public String getManut() {
        return manut;
    }

    public void setManut(String manut) {
        this.manut = manut;
    }

    public ImportTcsCt getTccleunik() {
        return tccleunik;
    }

    public void setTccleunik(ImportTcsCt tccleunik) {
        this.tccleunik = tccleunik;
    }

    public String getDateProchainePenalite() {
        return dateProchainePenalite;
    }

    public void setDateProchainePenalite(String dateProchainePenalite) {
        this.dateProchainePenalite = dateProchainePenalite;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cicleunik != null ? cicleunik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facture)) {
            return false;
        }
        Facture other = (Facture) object;
        if ((this.cicleunik == null && other.cicleunik != null) || (this.cicleunik != null && !this.cicleunik.equals(other.cicleunik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.adminfaces.starter.model.Facture[ cicleunik=" + cicleunik + " ]";
    }

    @Override
    public Integer getId() {
        return cicleunik;
    }

    public List<Prests> getPrestsCollection() {
        return listPrests;
    }

    public void setPrestsCollection(List<Prests> prestsCollection) {
        this.listPrests = prestsCollection;
    }

    public String getdCreat() {
        return dCreat;
    }

    public void setdCreat(String dCreat) {
        this.dCreat = dCreat;
    }

    public String gethCreat() {
        return hCreat;
    }

    public void sethCreat(String hCreat) {
        this.hCreat = hCreat;
    }

    public String getdModif() {
        return dModif;
    }

    public void setdModif(String dModif) {
        this.dModif = dModif;
    }

    public String gethModif() {
        return hModif;
    }

    public void sethModif(String hModif) {
        this.hModif = hModif;
    }

    public String getcMag() {
        return cMag;
    }

    public void setcMag(String cMag) {
        this.cMag = cMag;
    }

    public String getdRecepRecla() {
        return dRecepRecla;
    }

    public void setdRecepRecla(String dRecepRecla) {
        this.dRecepRecla = dRecepRecla;
    }

    public String getdCreRecla() {
        return dCreRecla;
    }

    public void setdCreRecla(String dCreRecla) {
        this.dCreRecla = dCreRecla;
    }

    public String getdEnvoiRecla() {
        return dEnvoiRecla;
    }

    public void setdEnvoiRecla(String dEnvoiRecla) {
        this.dEnvoiRecla = dEnvoiRecla;
    }

    public String getdRetourRecla() {
        return dRetourRecla;
    }

    public void setdRetourRecla(String dRetourRecla) {
        this.dRetourRecla = dRetourRecla;
    }

    public String getdEnvoiDg() {
        return dEnvoiDg;
    }

    public void setdEnvoiDg(String dEnvoiDg) {
        this.dEnvoiDg = dEnvoiDg;
    }

    public String getdReponse() {
        return dReponse;
    }

    public void setdReponse(String dReponse) {
        this.dReponse = dReponse;
    }

    public String getdRecepDfc() {
        return dRecepDfc;
    }

    public void setdRecepDfc(String dRecepDfc) {
        this.dRecepDfc = dRecepDfc;
    }

    public String getdRecepRegu() {
        return dRecepRegu;
    }

    public void setdRecepRegu(String dRecepRegu) {
        this.dRecepRegu = dRecepRegu;
    }

    public String getdEnvoiRegu() {
        return dEnvoiRegu;
    }

    public void setdEnvoiRegu(String dEnvoiRegu) {
        this.dEnvoiRegu = dEnvoiRegu;
    }
    
}
