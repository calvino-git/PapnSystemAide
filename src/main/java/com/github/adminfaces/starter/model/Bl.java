/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Calvin ILOKI
 */
@Entity
@Table(name = "BL", catalog = "", schema = "PPNCARGO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bl.findAll", query = "SELECT b FROM Bl b"),
    @NamedQuery(name = "Bl.findByBlcleunik", query = "SELECT b FROM Bl b WHERE b.blcleunik = :blcleunik"),
    @NamedQuery(name = "Bl.findByBlNo", query = "SELECT b FROM Bl b WHERE b.blNo = :blNo"),
    @NamedQuery(name = "Bl.findByDclNo", query = "SELECT b FROM Bl b WHERE b.dclNo = :dclNo"),
    @NamedQuery(name = "Bl.findByChargeur", query = "SELECT b FROM Bl b WHERE b.chargeur = :chargeur"),
    @NamedQuery(name = "Bl.findByNotify", query = "SELECT b FROM Bl b WHERE b.notify = :notify"),
    @NamedQuery(name = "Bl.findByClients", query = "SELECT b FROM Bl b WHERE b.clients = :clients"),
    @NamedQuery(name = "Bl.findByTransitaire", query = "SELECT b FROM Bl b WHERE b.transitaire = :transitaire"),
    @NamedQuery(name = "Bl.findByGroupe", query = "SELECT b FROM Bl b WHERE b.groupe = :groupe"),
    @NamedQuery(name = "Bl.findByGestion", query = "SELECT b FROM Bl b WHERE b.gestion = :gestion"),
    @NamedQuery(name = "Bl.findByStatut", query = "SELECT b FROM Bl b WHERE b.statut = :statut"),
    @NamedQuery(name = "Bl.findByCreateur", query = "SELECT b FROM Bl b WHERE b.createur = :createur"),
    @NamedQuery(name = "Bl.findByDCreat", query = "SELECT b FROM Bl b WHERE b.dCreat = :dCreat"),
    @NamedQuery(name = "Bl.findByHCreat", query = "SELECT b FROM Bl b WHERE b.hCreat = :hCreat"),
    @NamedQuery(name = "Bl.findByUtilisat", query = "SELECT b FROM Bl b WHERE b.utilisat = :utilisat"),
    @NamedQuery(name = "Bl.findByDModif", query = "SELECT b FROM Bl b WHERE b.dModif = :dModif"),
    @NamedQuery(name = "Bl.findByHModif", query = "SELECT b FROM Bl b WHERE b.hModif = :hModif"),
    @NamedQuery(name = "Bl.findByDestinationfinal", query = "SELECT b FROM Bl b WHERE b.destinationfinal = :destinationfinal"),
    @NamedQuery(name = "Bl.findByIncoterm", query = "SELECT b FROM Bl b WHERE b.incoterm = :incoterm"),
    @NamedQuery(name = "Bl.findByValeurMarchandise", query = "SELECT b FROM Bl b WHERE b.valeurMarchandise = :valeurMarchandise"),
    @NamedQuery(name = "Bl.findByBscNo", query = "SELECT b FROM Bl b WHERE b.bscNo = :bscNo"),
    @NamedQuery(name = "Bl.findByTypebsc", query = "SELECT b FROM Bl b WHERE b.typebsc = :typebsc"),
    @NamedQuery(name = "Bl.findByChgadresse1", query = "SELECT b FROM Bl b WHERE b.chgadresse1 = :chgadresse1"),
    @NamedQuery(name = "Bl.findByChgadresse2", query = "SELECT b FROM Bl b WHERE b.chgadresse2 = :chgadresse2"),
    @NamedQuery(name = "Bl.findByChgpostal", query = "SELECT b FROM Bl b WHERE b.chgpostal = :chgpostal"),
    @NamedQuery(name = "Bl.findByChgville", query = "SELECT b FROM Bl b WHERE b.chgville = :chgville"),
    @NamedQuery(name = "Bl.findByChgpays", query = "SELECT b FROM Bl b WHERE b.chgpays = :chgpays"),
    @NamedQuery(name = "Bl.findByNotadresse1", query = "SELECT b FROM Bl b WHERE b.notadresse1 = :notadresse1"),
    @NamedQuery(name = "Bl.findByNotadresse2", query = "SELECT b FROM Bl b WHERE b.notadresse2 = :notadresse2"),
    @NamedQuery(name = "Bl.findByNotpostal", query = "SELECT b FROM Bl b WHERE b.notpostal = :notpostal"),
    @NamedQuery(name = "Bl.findByNotville", query = "SELECT b FROM Bl b WHERE b.notville = :notville"),
    @NamedQuery(name = "Bl.findByNotpays", query = "SELECT b FROM Bl b WHERE b.notpays = :notpays"),
    @NamedQuery(name = "Bl.findByCltadresse1", query = "SELECT b FROM Bl b WHERE b.cltadresse1 = :cltadresse1"),
    @NamedQuery(name = "Bl.findByCltadresse2", query = "SELECT b FROM Bl b WHERE b.cltadresse2 = :cltadresse2"),
    @NamedQuery(name = "Bl.findByCltpostal", query = "SELECT b FROM Bl b WHERE b.cltpostal = :cltpostal"),
    @NamedQuery(name = "Bl.findByCltville", query = "SELECT b FROM Bl b WHERE b.cltville = :cltville"),
    @NamedQuery(name = "Bl.findByCltpays", query = "SELECT b FROM Bl b WHERE b.cltpays = :cltpays"),
    @NamedQuery(name = "Bl.findByDepart", query = "SELECT b FROM Bl b WHERE b.depart = :depart"),
    @NamedQuery(name = "Bl.findByArrivee", query = "SELECT b FROM Bl b WHERE b.arrivee = :arrivee"),
    @NamedQuery(name = "Bl.findByNavire", query = "SELECT b FROM Bl b WHERE b.navire = :navire"),
    @NamedQuery(name = "Bl.findByLieureception", query = "SELECT b FROM Bl b WHERE b.lieureception = :lieureception"),
    @NamedQuery(name = "Bl.findByFretpayablea", query = "SELECT b FROM Bl b WHERE b.fretpayablea = :fretpayablea"),
    @NamedQuery(name = "Bl.findByFretmaritime", query = "SELECT b FROM Bl b WHERE b.fretmaritime = :fretmaritime"),
    @NamedQuery(name = "Bl.findByFraisterminal", query = "SELECT b FROM Bl b WHERE b.fraisterminal = :fraisterminal"),
    @NamedQuery(name = "Bl.findByFraissuplement", query = "SELECT b FROM Bl b WHERE b.fraissuplement = :fraissuplement"),
    @NamedQuery(name = "Bl.findByRegime", query = "SELECT b FROM Bl b WHERE b.regime = :regime"),
    @NamedQuery(name = "Bl.findByMontantTaxe", query = "SELECT b FROM Bl b WHERE b.montantTaxe = :montantTaxe"),
    @NamedQuery(name = "Bl.findByReferenceExoneration", query = "SELECT b FROM Bl b WHERE b.referenceExoneration = :referenceExoneration"),
    @NamedQuery(name = "Bl.findByDateFacture", query = "SELECT b FROM Bl b WHERE b.dateFacture = :dateFacture"),
    @NamedQuery(name = "Bl.findByChgemail", query = "SELECT b FROM Bl b WHERE b.chgemail = :chgemail"),
    @NamedQuery(name = "Bl.findByNotemail", query = "SELECT b FROM Bl b WHERE b.notemail = :notemail"),
    @NamedQuery(name = "Bl.findByCltemail", query = "SELECT b FROM Bl b WHERE b.cltemail = :cltemail"),
    @NamedQuery(name = "Bl.findByDevise", query = "SELECT b FROM Bl b WHERE b.devise = :devise"),
    @NamedQuery(name = "Bl.findByTransitaireO", query = "SELECT b FROM Bl b WHERE b.transitaireO = :transitaireO"),
    @NamedQuery(name = "Bl.findByDateDeclarationDouane", query = "SELECT b FROM Bl b WHERE b.dateDeclarationDouane = :dateDeclarationDouane"),
    @NamedQuery(name = "Bl.findByPorts", query = "SELECT b FROM Bl b WHERE b.ports = :ports"),
    @NamedQuery(name = "Bl.findByDateDossier", query = "SELECT b FROM Bl b WHERE b.dateDossier = :dateDossier"),
    @NamedQuery(name = "Bl.findByHeureDossier", query = "SELECT b FROM Bl b WHERE b.heureDossier = :heureDossier"),
    @NamedQuery(name = "Bl.findByLibelleMarchandise", query = "SELECT b FROM Bl b WHERE b.libelleMarchandise = :libelleMarchandise"),
    @NamedQuery(name = "Bl.findByRevision", query = "SELECT b FROM Bl b WHERE b.revision = :revision"),
    @NamedQuery(name = "Bl.findByRevisionSuivante", query = "SELECT b FROM Bl b WHERE b.revisionSuivante = :revisionSuivante"),
    @NamedQuery(name = "Bl.findByDValide", query = "SELECT b FROM Bl b WHERE b.dValide = :dValide"),
    @NamedQuery(name = "Bl.findByValideur", query = "SELECT b FROM Bl b WHERE b.valideur = :valideur"),
    @NamedQuery(name = "Bl.findByTransporteur", query = "SELECT b FROM Bl b WHERE b.transporteur = :transporteur"),
    @NamedQuery(name = "Bl.findByPretransporteur", query = "SELECT b FROM Bl b WHERE b.pretransporteur = :pretransporteur"),
    @NamedQuery(name = "Bl.findByMontantBsc", query = "SELECT b FROM Bl b WHERE b.montantBsc = :montantBsc"),
    @NamedQuery(name = "Bl.findByTBsc", query = "SELECT b FROM Bl b WHERE b.tBsc = :tBsc"),
    @NamedQuery(name = "Bl.findByTVisa", query = "SELECT b FROM Bl b WHERE b.tVisa = :tVisa"),
    @NamedQuery(name = "Bl.findByNumeroDossierTransitaire", query = "SELECT b FROM Bl b WHERE b.numeroDossierTransitaire = :numeroDossierTransitaire"),
    @NamedQuery(name = "Bl.findByPortTransbordement", query = "SELECT b FROM Bl b WHERE b.portTransbordement = :portTransbordement"),
    @NamedQuery(name = "Bl.findByIsoPorts", query = "SELECT b FROM Bl b WHERE b.isoPorts = :isoPorts"),
    @NamedQuery(name = "Bl.findByIsoPortsT", query = "SELECT b FROM Bl b WHERE b.isoPortsT = :isoPortsT"),
    @NamedQuery(name = "Bl.findByFournisseur", query = "SELECT b FROM Bl b WHERE b.fournisseur = :fournisseur"),
    @NamedQuery(name = "Bl.findByFiliere", query = "SELECT b FROM Bl b WHERE b.filiere = :filiere"),
    @NamedQuery(name = "Bl.findByNumPeq", query = "SELECT b FROM Bl b WHERE b.numPeq = :numPeq"),
    @NamedQuery(name = "Bl.findByAssurance", query = "SELECT b FROM Bl b WHERE b.assurance = :assurance"),
    @NamedQuery(name = "Bl.findByValeurCif", query = "SELECT b FROM Bl b WHERE b.valeurCif = :valeurCif"),
    @NamedQuery(name = "Bl.findByChaine", query = "SELECT b FROM Bl b WHERE b.chaine = :chaine"),
    @NamedQuery(name = "Bl.findByDateBae", query = "SELECT b FROM Bl b WHERE b.dateBae = :dateBae"),
    @NamedQuery(name = "Bl.findByDateEnl", query = "SELECT b FROM Bl b WHERE b.dateEnl = :dateEnl"),
    @NamedQuery(name = "Bl.findByMntPrt", query = "SELECT b FROM Bl b WHERE b.mntPrt = :mntPrt"),
    @NamedQuery(name = "Bl.findByMntEnt", query = "SELECT b FROM Bl b WHERE b.mntEnt = :mntEnt"),
    @NamedQuery(name = "Bl.findByMntMan", query = "SELECT b FROM Bl b WHERE b.mntMan = :mntMan"),
    @NamedQuery(name = "Bl.findByMntRel", query = "SELECT b FROM Bl b WHERE b.mntRel = :mntRel"),
    @NamedQuery(name = "Bl.findByMntCnd", query = "SELECT b FROM Bl b WHERE b.mntCnd = :mntCnd"),
    @NamedQuery(name = "Bl.findByMntAva", query = "SELECT b FROM Bl b WHERE b.mntAva = :mntAva"),
    @NamedQuery(name = "Bl.findByMntCch", query = "SELECT b FROM Bl b WHERE b.mntCch = :mntCch"),
    @NamedQuery(name = "Bl.findByMntCtr", query = "SELECT b FROM Bl b WHERE b.mntCtr = :mntCtr"),
    @NamedQuery(name = "Bl.findByMntPhy", query = "SELECT b FROM Bl b WHERE b.mntPhy = :mntPhy"),
    @NamedQuery(name = "Bl.findByMntDne", query = "SELECT b FROM Bl b WHERE b.mntDne = :mntDne"),
    @NamedQuery(name = "Bl.findByMntTrs", query = "SELECT b FROM Bl b WHERE b.mntTrs = :mntTrs"),
    @NamedQuery(name = "Bl.findByMntHad", query = "SELECT b FROM Bl b WHERE b.mntHad = :mntHad"),
    @NamedQuery(name = "Bl.findByMntDeb", query = "SELECT b FROM Bl b WHERE b.mntDeb = :mntDeb"),
    @NamedQuery(name = "Bl.findByMntDiv", query = "SELECT b FROM Bl b WHERE b.mntDiv = :mntDiv"),
    @NamedQuery(name = "Bl.findByMntMpa", query = "SELECT b FROM Bl b WHERE b.mntMpa = :mntMpa"),
    @NamedQuery(name = "Bl.findByPortDebarquement", query = "SELECT b FROM Bl b WHERE b.portDebarquement = :portDebarquement"),
    @NamedQuery(name = "Bl.findByNumeroVoyage", query = "SELECT b FROM Bl b WHERE b.numeroVoyage = :numeroVoyage"),
    @NamedQuery(name = "Bl.findByValeurCaf", query = "SELECT b FROM Bl b WHERE b.valeurCaf = :valeurCaf"),
    @NamedQuery(name = "Bl.findByObservTransitaire", query = "SELECT b FROM Bl b WHERE b.observTransitaire = :observTransitaire"),
    @NamedQuery(name = "Bl.findByDObservTransitaire", query = "SELECT b FROM Bl b WHERE b.dObservTransitaire = :dObservTransitaire"),
    @NamedQuery(name = "Bl.findByHObservTransitaire", query = "SELECT b FROM Bl b WHERE b.hObservTransitaire = :hObservTransitaire"),
    @NamedQuery(name = "Bl.findByObservMandataire", query = "SELECT b FROM Bl b WHERE b.observMandataire = :observMandataire"),
    @NamedQuery(name = "Bl.findByDObservMandataire", query = "SELECT b FROM Bl b WHERE b.dObservMandataire = :dObservMandataire"),
    @NamedQuery(name = "Bl.findByHObservMandataire", query = "SELECT b FROM Bl b WHERE b.hObservMandataire = :hObservMandataire"),
    @NamedQuery(name = "Bl.findByObservDouane", query = "SELECT b FROM Bl b WHERE b.observDouane = :observDouane"),
    @NamedQuery(name = "Bl.findByDObservDouane", query = "SELECT b FROM Bl b WHERE b.dObservDouane = :dObservDouane"),
    @NamedQuery(name = "Bl.findByHObservDouane", query = "SELECT b FROM Bl b WHERE b.hObservDouane = :hObservDouane"),
    @NamedQuery(name = "Bl.findByObservConseil", query = "SELECT b FROM Bl b WHERE b.observConseil = :observConseil"),
    @NamedQuery(name = "Bl.findByDObservConseil", query = "SELECT b FROM Bl b WHERE b.dObservConseil = :dObservConseil"),
    @NamedQuery(name = "Bl.findByHObservConseil", query = "SELECT b FROM Bl b WHERE b.hObservConseil = :hObservConseil"),
    @NamedQuery(name = "Bl.findByCredoc", query = "SELECT b FROM Bl b WHERE b.credoc = :credoc"),
    @NamedQuery(name = "Bl.findByMntAdd", query = "SELECT b FROM Bl b WHERE b.mntAdd = :mntAdd"),
    @NamedQuery(name = "Bl.findByNombreDeclare", query = "SELECT b FROM Bl b WHERE b.nombreDeclare = :nombreDeclare"),
    @NamedQuery(name = "Bl.findByPoidsDeclare", query = "SELECT b FROM Bl b WHERE b.poidsDeclare = :poidsDeclare"),
    @NamedQuery(name = "Bl.findByCafDeclare", query = "SELECT b FROM Bl b WHERE b.cafDeclare = :cafDeclare"),
    @NamedQuery(name = "Bl.findByNomenclatureDouane", query = "SELECT b FROM Bl b WHERE b.nomenclatureDouane = :nomenclatureDouane"),
    @NamedQuery(name = "Bl.findByNif", query = "SELECT b FROM Bl b WHERE b.nif = :nif"),
    @NamedQuery(name = "Bl.findByMontantConsignataire", query = "SELECT b FROM Bl b WHERE b.montantConsignataire = :montantConsignataire"),
    @NamedQuery(name = "Bl.findByMontantTransit", query = "SELECT b FROM Bl b WHERE b.montantTransit = :montantTransit"),
    @NamedQuery(name = "Bl.findByMontantSanitaire", query = "SELECT b FROM Bl b WHERE b.montantSanitaire = :montantSanitaire"),
    @NamedQuery(name = "Bl.findByMontantExpedition", query = "SELECT b FROM Bl b WHERE b.montantExpedition = :montantExpedition"),
    @NamedQuery(name = "Bl.findByBscPaye", query = "SELECT b FROM Bl b WHERE b.bscPaye = :bscPaye"),
    @NamedQuery(name = "Bl.findByNombreExpedition", query = "SELECT b FROM Bl b WHERE b.nombreExpedition = :nombreExpedition"),
    @NamedQuery(name = "Bl.findByNumeroFactureTransit", query = "SELECT b FROM Bl b WHERE b.numeroFactureTransit = :numeroFactureTransit"),
    @NamedQuery(name = "Bl.findByNumManifeste", query = "SELECT b FROM Bl b WHERE b.numManifeste = :numManifeste"),
    @NamedQuery(name = "Bl.findByFacConteneur", query = "SELECT b FROM Bl b WHERE b.facConteneur = :facConteneur"),
    @NamedQuery(name = "Bl.findByFacMg", query = "SELECT b FROM Bl b WHERE b.facMg = :facMg"),
    @NamedQuery(name = "Bl.findByFacPhyto", query = "SELECT b FROM Bl b WHERE b.facPhyto = :facPhyto"),
    @NamedQuery(name = "Bl.findByFacVehicule", query = "SELECT b FROM Bl b WHERE b.facVehicule = :facVehicule"),
    @NamedQuery(name = "Bl.findByFacHyfro", query = "SELECT b FROM Bl b WHERE b.facHyfro = :facHyfro"),
    @NamedQuery(name = "Bl.findByManut", query = "SELECT b FROM Bl b WHERE b.manut = :manut"),
    @NamedQuery(name = "Bl.findByConsignataire", query = "SELECT b FROM Bl b WHERE b.consignataire = :consignataire"),
    @NamedQuery(name = "Bl.findBySituat", query = "SELECT b FROM Bl b WHERE b.situat = :situat"),
    @NamedQuery(name = "Bl.findByVehicule", query = "SELECT b FROM Bl b WHERE b.vehicule = :vehicule"),
    @NamedQuery(name = "Bl.findByRemorque", query = "SELECT b FROM Bl b WHERE b.remorque = :remorque"),
    @NamedQuery(name = "Bl.findByConducteur", query = "SELECT b FROM Bl b WHERE b.conducteur = :conducteur"),
    @NamedQuery(name = "Bl.findByMagasin", query = "SELECT b FROM Bl b WHERE b.magasin = :magasin"),
    @NamedQuery(name = "Bl.findByEmplacement", query = "SELECT b FROM Bl b WHERE b.emplacement = :emplacement"),
    @NamedQuery(name = "Bl.findByContrat", query = "SELECT b FROM Bl b WHERE b.contrat = :contrat"),
    @NamedQuery(name = "Bl.findByDossier", query = "SELECT b FROM Bl b WHERE b.dossier = :dossier"),
    @NamedQuery(name = "Bl.findByDeclaration", query = "SELECT b FROM Bl b WHERE b.declaration = :declaration"),
    @NamedQuery(name = "Bl.findByCampagne", query = "SELECT b FROM Bl b WHERE b.campagne = :campagne"),
    @NamedQuery(name = "Bl.findByBonSortie", query = "SELECT b FROM Bl b WHERE b.bonSortie = :bonSortie"),
    @NamedQuery(name = "Bl.findByBmc", query = "SELECT b FROM Bl b WHERE b.bmc = :bmc"),
    @NamedQuery(name = "Bl.findByObservChargeur", query = "SELECT b FROM Bl b WHERE b.observChargeur = :observChargeur"),
    @NamedQuery(name = "Bl.findByDObservChargeur", query = "SELECT b FROM Bl b WHERE b.dObservChargeur = :dObservChargeur"),
    @NamedQuery(name = "Bl.findByHObservChargeur", query = "SELECT b FROM Bl b WHERE b.hObservChargeur = :hObservChargeur"),
    @NamedQuery(name = "Bl.findByObservTransporteur", query = "SELECT b FROM Bl b WHERE b.observTransporteur = :observTransporteur"),
    @NamedQuery(name = "Bl.findByDObservTransporteur", query = "SELECT b FROM Bl b WHERE b.dObservTransporteur = :dObservTransporteur"),
    @NamedQuery(name = "Bl.findByHObservTransporteur", query = "SELECT b FROM Bl b WHERE b.hObservTransporteur = :hObservTransporteur"),
    @NamedQuery(name = "Bl.findByObservManutention", query = "SELECT b FROM Bl b WHERE b.observManutention = :observManutention"),
    @NamedQuery(name = "Bl.findByDObservManutention", query = "SELECT b FROM Bl b WHERE b.dObservManutention = :dObservManutention"),
    @NamedQuery(name = "Bl.findByHObservManutention", query = "SELECT b FROM Bl b WHERE b.hObservManutention = :hObservManutention"),
    @NamedQuery(name = "Bl.findByDeChargeur", query = "SELECT b FROM Bl b WHERE b.deChargeur = :deChargeur"),
    @NamedQuery(name = "Bl.findByAChargeur", query = "SELECT b FROM Bl b WHERE b.aChargeur = :aChargeur"),
    @NamedQuery(name = "Bl.findByDeTransporteur", query = "SELECT b FROM Bl b WHERE b.deTransporteur = :deTransporteur"),
    @NamedQuery(name = "Bl.findByATransporteur", query = "SELECT b FROM Bl b WHERE b.aTransporteur = :aTransporteur"),
    @NamedQuery(name = "Bl.findByDeManutention", query = "SELECT b FROM Bl b WHERE b.deManutention = :deManutention"),
    @NamedQuery(name = "Bl.findByAManutention", query = "SELECT b FROM Bl b WHERE b.aManutention = :aManutention"),
    @NamedQuery(name = "Bl.findByDeTransitaire", query = "SELECT b FROM Bl b WHERE b.deTransitaire = :deTransitaire"),
    @NamedQuery(name = "Bl.findByATransitaire", query = "SELECT b FROM Bl b WHERE b.aTransitaire = :aTransitaire"),
    @NamedQuery(name = "Bl.findByDeMandataire", query = "SELECT b FROM Bl b WHERE b.deMandataire = :deMandataire"),
    @NamedQuery(name = "Bl.findByAMandataire", query = "SELECT b FROM Bl b WHERE b.aMandataire = :aMandataire"),
    @NamedQuery(name = "Bl.findByDeDouane", query = "SELECT b FROM Bl b WHERE b.deDouane = :deDouane"),
    @NamedQuery(name = "Bl.findByADouane", query = "SELECT b FROM Bl b WHERE b.aDouane = :aDouane"),
    @NamedQuery(name = "Bl.findByDeConseil", query = "SELECT b FROM Bl b WHERE b.deConseil = :deConseil"),
    @NamedQuery(name = "Bl.findByAConseil", query = "SELECT b FROM Bl b WHERE b.aConseil = :aConseil"),
    @NamedQuery(name = "Bl.findByObservPort", query = "SELECT b FROM Bl b WHERE b.observPort = :observPort"),
    @NamedQuery(name = "Bl.findByDObservPort", query = "SELECT b FROM Bl b WHERE b.dObservPort = :dObservPort"),
    @NamedQuery(name = "Bl.findByHObservPort", query = "SELECT b FROM Bl b WHERE b.hObservPort = :hObservPort"),
    @NamedQuery(name = "Bl.findByDePort", query = "SELECT b FROM Bl b WHERE b.dePort = :dePort"),
    @NamedQuery(name = "Bl.findByAPort", query = "SELECT b FROM Bl b WHERE b.aPort = :aPort"),
    @NamedQuery(name = "Bl.findByNiveauProcessus", query = "SELECT b FROM Bl b WHERE b.niveauProcessus = :niveauProcessus"),
    @NamedQuery(name = "Bl.findByHeureBae", query = "SELECT b FROM Bl b WHERE b.heureBae = :heureBae"),
    @NamedQuery(name = "Bl.findByNombreColis", query = "SELECT b FROM Bl b WHERE b.nombreColis = :nombreColis"),
    @NamedQuery(name = "Bl.findByNombreConteneurs", query = "SELECT b FROM Bl b WHERE b.nombreConteneurs = :nombreConteneurs"),
    @NamedQuery(name = "Bl.findByNumExoDg", query = "SELECT b FROM Bl b WHERE b.numExoDg = :numExoDg"),
    @NamedQuery(name = "Bl.findByTauxExo", query = "SELECT b FROM Bl b WHERE b.tauxExo = :tauxExo"),
    @NamedQuery(name = "Bl.findByNumBe", query = "SELECT b FROM Bl b WHERE b.numBe = :numBe"),
    @NamedQuery(name = "Bl.findByNumBooking", query = "SELECT b FROM Bl b WHERE b.numBooking = :numBooking")})
public class Bl implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "BLCLEUNIK")
    private BigDecimal blcleunik;
    @Size(max = 24)
    @Column(name = "BL_NO")
    private String blNo;
    @Size(max = 24)
    @Column(name = "DCL_NO")
    private String dclNo;
    @Size(max = 80)
    @Column(name = "CHARGEUR")
    private String chargeur;
    @Size(max = 80)
    @Column(name = "NOTIFY")
    private String notify;
    @Size(max = 80)
    @Column(name = "CLIENTS")
    private String clients;
    @Size(max = 64)
    @Column(name = "TRANSITAIRE")
    private String transitaire;
    @Size(max = 12)
    @Column(name = "GROUPE")
    private String groupe;
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
    @Size(max = 80)
    @Column(name = "DESTINATIONFINAL")
    private String destinationfinal;
    @Size(max = 6)
    @Column(name = "INCOTERM")
    private String incoterm;
    @Column(name = "VALEUR_MARCHANDISE")
    private BigDecimal valeurMarchandise;
    @Size(max = 23)
    @Column(name = "BSC_NO")
    private String bscNo;
    @Column(name = "TYPEBSC")
    private Long typebsc;
    @Size(max = 35)
    @Column(name = "CHGADRESSE1")
    private String chgadresse1;
    @Size(max = 35)
    @Column(name = "CHGADRESSE2")
    private String chgadresse2;
    @Size(max = 8)
    @Column(name = "CHGPOSTAL")
    private String chgpostal;
    @Size(max = 17)
    @Column(name = "CHGVILLE")
    private String chgville;
    @Size(max = 17)
    @Column(name = "CHGPAYS")
    private String chgpays;
    @Size(max = 35)
    @Column(name = "NOTADRESSE1")
    private String notadresse1;
    @Size(max = 35)
    @Column(name = "NOTADRESSE2")
    private String notadresse2;
    @Size(max = 8)
    @Column(name = "NOTPOSTAL")
    private String notpostal;
    @Size(max = 17)
    @Column(name = "NOTVILLE")
    private String notville;
    @Size(max = 17)
    @Column(name = "NOTPAYS")
    private String notpays;
    @Size(max = 35)
    @Column(name = "CLTADRESSE1")
    private String cltadresse1;
    @Size(max = 35)
    @Column(name = "CLTADRESSE2")
    private String cltadresse2;
    @Size(max = 8)
    @Column(name = "CLTPOSTAL")
    private String cltpostal;
    @Size(max = 17)
    @Column(name = "CLTVILLE")
    private String cltville;
    @Size(max = 17)
    @Column(name = "CLTPAYS")
    private String cltpays;
    @Size(max = 8)
    @Column(name = "DEPART")
    private String depart;
    @Size(max = 8)
    @Column(name = "ARRIVEE")
    private String arrivee;
    @Size(max = 80)
    @Column(name = "NAVIRE")
    private String navire;
    @Size(max = 80)
    @Column(name = "LIEURECEPTION")
    private String lieureception;
    @Size(max = 80)
    @Column(name = "FRETPAYABLEA")
    private String fretpayablea;
    @Column(name = "FRETMARITIME")
    private BigDecimal fretmaritime;
    @Column(name = "FRAISTERMINAL")
    private BigDecimal fraisterminal;
    @Column(name = "FRAISSUPLEMENT")
    private BigDecimal fraissuplement;
    @Size(max = 8)
    @Column(name = "REGIME")
    private String regime;
    @Column(name = "MONTANT_TAXE")
    private BigDecimal montantTaxe;
    @Size(max = 12)
    @Column(name = "REFERENCE_EXONERATION")
    private String referenceExoneration;
    @Size(max = 8)
    @Column(name = "DATE_FACTURE")
    private String dateFacture;
    @Size(max = 30)
    @Column(name = "CHGEMAIL")
    private String chgemail;
    @Size(max = 30)
    @Column(name = "NOTEMAIL")
    private String notemail;
    @Size(max = 30)
    @Column(name = "CLTEMAIL")
    private String cltemail;
    @Size(max = 1)
    @Column(name = "DEVISE")
    private String devise;
    @Size(max = 64)
    @Column(name = "TRANSITAIRE_O")
    private String transitaireO;
    @Size(max = 8)
    @Column(name = "DATE_DECLARATION_DOUANE")
    private String dateDeclarationDouane;
    @Size(max = 8)
    @Column(name = "PORTS")
    private String ports;
    @Size(max = 8)
    @Column(name = "DATE_DOSSIER")
    private String dateDossier;
    @Size(max = 4)
    @Column(name = "HEURE_DOSSIER")
    private String heureDossier;
    @Size(max = 40)
    @Column(name = "LIBELLE_MARCHANDISE")
    private String libelleMarchandise;
    @Column(name = "REVISION")
    private Short revision;
    @Column(name = "REVISION_SUIVANTE")
    private Short revisionSuivante;
    @Size(max = 8)
    @Column(name = "D_VALIDE")
    private String dValide;
    @Size(max = 10)
    @Column(name = "VALIDEUR")
    private String valideur;
    @Size(max = 80)
    @Column(name = "TRANSPORTEUR")
    private String transporteur;
    @Size(max = 80)
    @Column(name = "PRETRANSPORTEUR")
    private String pretransporteur;
    @Column(name = "MONTANT_BSC")
    private BigDecimal montantBsc;
    @Size(max = 10)
    @Column(name = "T_BSC")
    private String tBsc;
    @Size(max = 10)
    @Column(name = "T_VISA")
    private String tVisa;
    @Size(max = 20)
    @Column(name = "NUMERO_DOSSIER_TRANSITAIRE")
    private String numeroDossierTransitaire;
    @Size(max = 64)
    @Column(name = "PORT_TRANSBORDEMENT")
    private String portTransbordement;
    @Size(max = 9)
    @Column(name = "ISO_PORTS")
    private String isoPorts;
    @Size(max = 9)
    @Column(name = "ISO_PORTS_T")
    private String isoPortsT;
    @Size(max = 80)
    @Column(name = "FOURNISSEUR")
    private String fournisseur;
    @Size(max = 8)
    @Column(name = "FILIERE")
    private String filiere;
    @Size(max = 8)
    @Column(name = "NUM_PEQ")
    private String numPeq;
    @Column(name = "ASSURANCE")
    private BigDecimal assurance;
    @Column(name = "VALEUR_CIF")
    private BigDecimal valeurCif;
    @Size(max = 8)
    @Column(name = "CHAINE")
    private String chaine;
    @Size(max = 8)
    @Column(name = "DATE_BAE")
    private String dateBae;
    @Size(max = 8)
    @Column(name = "DATE_ENL")
    private String dateEnl;
    @Column(name = "MNT_PRT")
    private BigDecimal mntPrt;
    @Column(name = "MNT_ENT")
    private BigDecimal mntEnt;
    @Column(name = "MNT_MAN")
    private BigDecimal mntMan;
    @Column(name = "MNT_REL")
    private BigDecimal mntRel;
    @Column(name = "MNT_CND")
    private BigDecimal mntCnd;
    @Column(name = "MNT_AVA")
    private BigDecimal mntAva;
    @Column(name = "MNT_CCH")
    private BigDecimal mntCch;
    @Column(name = "MNT_CTR")
    private BigDecimal mntCtr;
    @Column(name = "MNT_PHY")
    private BigDecimal mntPhy;
    @Column(name = "MNT_DNE")
    private BigDecimal mntDne;
    @Column(name = "MNT_TRS")
    private BigDecimal mntTrs;
    @Column(name = "MNT_HAD")
    private BigDecimal mntHad;
    @Column(name = "MNT_DEB")
    private BigDecimal mntDeb;
    @Column(name = "MNT_DIV")
    private BigDecimal mntDiv;
    @Column(name = "MNT_MPA")
    private BigDecimal mntMpa;
    @Size(max = 8)
    @Column(name = "PORT_DEBARQUEMENT")
    private String portDebarquement;
    @Size(max = 12)
    @Column(name = "NUMERO_VOYAGE")
    private String numeroVoyage;
    @Column(name = "VALEUR_CAF")
    private BigDecimal valeurCaf;
    @Size(max = 120)
    @Column(name = "OBSERV_TRANSITAIRE")
    private String observTransitaire;
    @Size(max = 8)
    @Column(name = "D_OBSERV_TRANSITAIRE")
    private String dObservTransitaire;
    @Size(max = 4)
    @Column(name = "H_OBSERV_TRANSITAIRE")
    private String hObservTransitaire;
    @Size(max = 120)
    @Column(name = "OBSERV_MANDATAIRE")
    private String observMandataire;
    @Size(max = 8)
    @Column(name = "D_OBSERV_MANDATAIRE")
    private String dObservMandataire;
    @Size(max = 4)
    @Column(name = "H_OBSERV_MANDATAIRE")
    private String hObservMandataire;
    @Size(max = 120)
    @Column(name = "OBSERV_DOUANE")
    private String observDouane;
    @Size(max = 8)
    @Column(name = "D_OBSERV_DOUANE")
    private String dObservDouane;
    @Size(max = 4)
    @Column(name = "H_OBSERV_DOUANE")
    private String hObservDouane;
    @Size(max = 120)
    @Column(name = "OBSERV_CONSEIL")
    private String observConseil;
    @Size(max = 8)
    @Column(name = "D_OBSERV_CONSEIL")
    private String dObservConseil;
    @Size(max = 4)
    @Column(name = "H_OBSERV_CONSEIL")
    private String hObservConseil;
    @Column(name = "CREDOC")
    private Short credoc;
    @Column(name = "MNT_ADD")
    private BigDecimal mntAdd;
    @Column(name = "NOMBRE_DECLARE")
    private BigDecimal nombreDeclare;
    @Column(name = "POIDS_DECLARE")
    private BigDecimal poidsDeclare;
    @Column(name = "CAF_DECLARE")
    private BigDecimal cafDeclare;
    @Size(max = 12)
    @Column(name = "NOMENCLATURE_DOUANE")
    private String nomenclatureDouane;
    @Size(max = 12)
    @Column(name = "NIF")
    private String nif;
    @Column(name = "MONTANT_CONSIGNATAIRE")
    private BigDecimal montantConsignataire;
    @Column(name = "MONTANT_TRANSIT")
    private BigDecimal montantTransit;
    @Column(name = "MONTANT_SANITAIRE")
    private BigDecimal montantSanitaire;
    @Column(name = "MONTANT_EXPEDITION")
    private BigDecimal montantExpedition;
    @Size(max = 8)
    @Column(name = "BSC_PAYE")
    private String bscPaye;
    @Column(name = "NOMBRE_EXPEDITION")
    private BigDecimal nombreExpedition;
    @Size(max = 12)
    @Column(name = "NUMERO_FACTURE_TRANSIT")
    private String numeroFactureTransit;
    @Size(max = 24)
    @Column(name = "NUM_MANIFESTE")
    private String numManifeste;
    @Column(name = "FAC_CONTENEUR")
    private Short facConteneur;
    @Column(name = "FAC_MG")
    private Short facMg;
    @Column(name = "FAC_PHYTO")
    private Short facPhyto;
    @Column(name = "FAC_VEHICULE")
    private Short facVehicule;
    @Column(name = "FAC_HYFRO")
    private Short facHyfro;
    @Size(max = 8)
    @Column(name = "MANUT")
    private String manut;
    @Size(max = 80)
    @Column(name = "CONSIGNATAIRE")
    private String consignataire;
    @Size(max = 8)
    @Column(name = "SITUAT")
    private String situat;
    @Size(max = 20)
    @Column(name = "VEHICULE")
    private String vehicule;
    @Size(max = 20)
    @Column(name = "REMORQUE")
    private String remorque;
    @Size(max = 20)
    @Column(name = "CONDUCTEUR")
    private String conducteur;
    @Size(max = 8)
    @Column(name = "MAGASIN")
    private String magasin;
    @Size(max = 8)
    @Column(name = "EMPLACEMENT")
    private String emplacement;
    @Size(max = 32)
    @Column(name = "CONTRAT")
    private String contrat;
    @Size(max = 32)
    @Column(name = "DOSSIER")
    private String dossier;
    @Size(max = 32)
    @Column(name = "DECLARATION")
    private String declaration;
    @Size(max = 32)
    @Column(name = "CAMPAGNE")
    private String campagne;
    @Size(max = 32)
    @Column(name = "BON_SORTIE")
    private String bonSortie;
    @Size(max = 32)
    @Column(name = "BMC")
    private String bmc;
    @Size(max = 120)
    @Column(name = "OBSERV_CHARGEUR")
    private String observChargeur;
    @Size(max = 8)
    @Column(name = "D_OBSERV_CHARGEUR")
    private String dObservChargeur;
    @Size(max = 4)
    @Column(name = "H_OBSERV_CHARGEUR")
    private String hObservChargeur;
    @Size(max = 120)
    @Column(name = "OBSERV_TRANSPORTEUR")
    private String observTransporteur;
    @Size(max = 8)
    @Column(name = "D_OBSERV_TRANSPORTEUR")
    private String dObservTransporteur;
    @Size(max = 4)
    @Column(name = "H_OBSERV_TRANSPORTEUR")
    private String hObservTransporteur;
    @Size(max = 120)
    @Column(name = "OBSERV_MANUTENTION")
    private String observManutention;
    @Size(max = 8)
    @Column(name = "D_OBSERV_MANUTENTION")
    private String dObservManutention;
    @Size(max = 4)
    @Column(name = "H_OBSERV_MANUTENTION")
    private String hObservManutention;
    @Size(max = 10)
    @Column(name = "DE_CHARGEUR")
    private String deChargeur;
    @Size(max = 10)
    @Column(name = "A_CHARGEUR")
    private String aChargeur;
    @Size(max = 10)
    @Column(name = "DE_TRANSPORTEUR")
    private String deTransporteur;
    @Size(max = 10)
    @Column(name = "A_TRANSPORTEUR")
    private String aTransporteur;
    @Size(max = 10)
    @Column(name = "DE_MANUTENTION")
    private String deManutention;
    @Size(max = 10)
    @Column(name = "A_MANUTENTION")
    private String aManutention;
    @Size(max = 10)
    @Column(name = "DE_TRANSITAIRE")
    private String deTransitaire;
    @Size(max = 10)
    @Column(name = "A_TRANSITAIRE")
    private String aTransitaire;
    @Size(max = 10)
    @Column(name = "DE_MANDATAIRE")
    private String deMandataire;
    @Size(max = 10)
    @Column(name = "A_MANDATAIRE")
    private String aMandataire;
    @Size(max = 10)
    @Column(name = "DE_DOUANE")
    private String deDouane;
    @Size(max = 10)
    @Column(name = "A_DOUANE")
    private String aDouane;
    @Size(max = 10)
    @Column(name = "DE_CONSEIL")
    private String deConseil;
    @Size(max = 10)
    @Column(name = "A_CONSEIL")
    private String aConseil;
    @Size(max = 120)
    @Column(name = "OBSERV_PORT")
    private String observPort;
    @Size(max = 8)
    @Column(name = "D_OBSERV_PORT")
    private String dObservPort;
    @Size(max = 4)
    @Column(name = "H_OBSERV_PORT")
    private String hObservPort;
    @Size(max = 10)
    @Column(name = "DE_PORT")
    private String dePort;
    @Size(max = 10)
    @Column(name = "A_PORT")
    private String aPort;
    @Column(name = "NIVEAU_PROCESSUS")
    private Integer niveauProcessus;
    @Size(max = 4)
    @Column(name = "HEURE_BAE")
    private String heureBae;
    @Column(name = "NOMBRE_COLIS")
    private BigDecimal nombreColis;
    @Column(name = "NOMBRE_CONTENEURS")
    private BigDecimal nombreConteneurs;
    @Size(max = 32)
    @Column(name = "NUM_EXO_DG")
    private String numExoDg;
    @Column(name = "TAUX_EXO")
    private BigDecimal tauxExo;
    @Size(max = 32)
    @Column(name = "NUM_BE")
    private String numBe;
    @Size(max = 32)
    @Column(name = "NUM_BOOKING")
    private String numBooking;
    @JoinColumn(name = "POCLEUNIK", referencedColumnName = "POCLEUNIK")
    @ManyToOne
    private Port pocleunik;
    @OneToMany(mappedBy = "blcleunik")
    private Collection<March> marchCollection;
    @OneToMany(mappedBy = "blcleunik")
    private Collection<Colis> colisCollection;

    public Bl() {
    }

    public Bl(BigDecimal blcleunik) {
        this.blcleunik = blcleunik;
    }

    public BigDecimal getBlcleunik() {
        return blcleunik;
    }

    public void setBlcleunik(BigDecimal blcleunik) {
        this.blcleunik = blcleunik;
    }

    public String getBlNo() {
        return blNo;
    }

    public void setBlNo(String blNo) {
        this.blNo = blNo;
    }

    public String getDclNo() {
        return dclNo;
    }

    public void setDclNo(String dclNo) {
        this.dclNo = dclNo;
    }

    public String getChargeur() {
        return chargeur;
    }

    public void setChargeur(String chargeur) {
        this.chargeur = chargeur;
    }

    public String getNotify() {
        return notify;
    }

    public void setNotify(String notify) {
        this.notify = notify;
    }

    public String getClients() {
        return clients;
    }

    public void setClients(String clients) {
        this.clients = clients;
    }

    public String getTransitaire() {
        return transitaire;
    }

    public void setTransitaire(String transitaire) {
        this.transitaire = transitaire;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
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

    public String getDestinationfinal() {
        return destinationfinal;
    }

    public void setDestinationfinal(String destinationfinal) {
        this.destinationfinal = destinationfinal;
    }

    public String getIncoterm() {
        return incoterm;
    }

    public void setIncoterm(String incoterm) {
        this.incoterm = incoterm;
    }

    public BigDecimal getValeurMarchandise() {
        return valeurMarchandise;
    }

    public void setValeurMarchandise(BigDecimal valeurMarchandise) {
        this.valeurMarchandise = valeurMarchandise;
    }

    public String getBscNo() {
        return bscNo;
    }

    public void setBscNo(String bscNo) {
        this.bscNo = bscNo;
    }

    public Long getTypebsc() {
        return typebsc;
    }

    public void setTypebsc(Long typebsc) {
        this.typebsc = typebsc;
    }

    public String getChgadresse1() {
        return chgadresse1;
    }

    public void setChgadresse1(String chgadresse1) {
        this.chgadresse1 = chgadresse1;
    }

    public String getChgadresse2() {
        return chgadresse2;
    }

    public void setChgadresse2(String chgadresse2) {
        this.chgadresse2 = chgadresse2;
    }

    public String getChgpostal() {
        return chgpostal;
    }

    public void setChgpostal(String chgpostal) {
        this.chgpostal = chgpostal;
    }

    public String getChgville() {
        return chgville;
    }

    public void setChgville(String chgville) {
        this.chgville = chgville;
    }

    public String getChgpays() {
        return chgpays;
    }

    public void setChgpays(String chgpays) {
        this.chgpays = chgpays;
    }

    public String getNotadresse1() {
        return notadresse1;
    }

    public void setNotadresse1(String notadresse1) {
        this.notadresse1 = notadresse1;
    }

    public String getNotadresse2() {
        return notadresse2;
    }

    public void setNotadresse2(String notadresse2) {
        this.notadresse2 = notadresse2;
    }

    public String getNotpostal() {
        return notpostal;
    }

    public void setNotpostal(String notpostal) {
        this.notpostal = notpostal;
    }

    public String getNotville() {
        return notville;
    }

    public void setNotville(String notville) {
        this.notville = notville;
    }

    public String getNotpays() {
        return notpays;
    }

    public void setNotpays(String notpays) {
        this.notpays = notpays;
    }

    public String getCltadresse1() {
        return cltadresse1;
    }

    public void setCltadresse1(String cltadresse1) {
        this.cltadresse1 = cltadresse1;
    }

    public String getCltadresse2() {
        return cltadresse2;
    }

    public void setCltadresse2(String cltadresse2) {
        this.cltadresse2 = cltadresse2;
    }

    public String getCltpostal() {
        return cltpostal;
    }

    public void setCltpostal(String cltpostal) {
        this.cltpostal = cltpostal;
    }

    public String getCltville() {
        return cltville;
    }

    public void setCltville(String cltville) {
        this.cltville = cltville;
    }

    public String getCltpays() {
        return cltpays;
    }

    public void setCltpays(String cltpays) {
        this.cltpays = cltpays;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getArrivee() {
        return arrivee;
    }

    public void setArrivee(String arrivee) {
        this.arrivee = arrivee;
    }

    public String getNavire() {
        return navire;
    }

    public void setNavire(String navire) {
        this.navire = navire;
    }

    public String getLieureception() {
        return lieureception;
    }

    public void setLieureception(String lieureception) {
        this.lieureception = lieureception;
    }

    public String getFretpayablea() {
        return fretpayablea;
    }

    public void setFretpayablea(String fretpayablea) {
        this.fretpayablea = fretpayablea;
    }

    public BigDecimal getFretmaritime() {
        return fretmaritime;
    }

    public void setFretmaritime(BigDecimal fretmaritime) {
        this.fretmaritime = fretmaritime;
    }

    public BigDecimal getFraisterminal() {
        return fraisterminal;
    }

    public void setFraisterminal(BigDecimal fraisterminal) {
        this.fraisterminal = fraisterminal;
    }

    public BigDecimal getFraissuplement() {
        return fraissuplement;
    }

    public void setFraissuplement(BigDecimal fraissuplement) {
        this.fraissuplement = fraissuplement;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }

    public BigDecimal getMontantTaxe() {
        return montantTaxe;
    }

    public void setMontantTaxe(BigDecimal montantTaxe) {
        this.montantTaxe = montantTaxe;
    }

    public String getReferenceExoneration() {
        return referenceExoneration;
    }

    public void setReferenceExoneration(String referenceExoneration) {
        this.referenceExoneration = referenceExoneration;
    }

    public String getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(String dateFacture) {
        this.dateFacture = dateFacture;
    }

    public String getChgemail() {
        return chgemail;
    }

    public void setChgemail(String chgemail) {
        this.chgemail = chgemail;
    }

    public String getNotemail() {
        return notemail;
    }

    public void setNotemail(String notemail) {
        this.notemail = notemail;
    }

    public String getCltemail() {
        return cltemail;
    }

    public void setCltemail(String cltemail) {
        this.cltemail = cltemail;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public String getTransitaireO() {
        return transitaireO;
    }

    public void setTransitaireO(String transitaireO) {
        this.transitaireO = transitaireO;
    }

    public String getDateDeclarationDouane() {
        return dateDeclarationDouane;
    }

    public void setDateDeclarationDouane(String dateDeclarationDouane) {
        this.dateDeclarationDouane = dateDeclarationDouane;
    }

    public String getPorts() {
        return ports;
    }

    public void setPorts(String ports) {
        this.ports = ports;
    }

    public String getDateDossier() {
        return dateDossier;
    }

    public void setDateDossier(String dateDossier) {
        this.dateDossier = dateDossier;
    }

    public String getHeureDossier() {
        return heureDossier;
    }

    public void setHeureDossier(String heureDossier) {
        this.heureDossier = heureDossier;
    }

    public String getLibelleMarchandise() {
        return libelleMarchandise;
    }

    public void setLibelleMarchandise(String libelleMarchandise) {
        this.libelleMarchandise = libelleMarchandise;
    }

    public Short getRevision() {
        return revision;
    }

    public void setRevision(Short revision) {
        this.revision = revision;
    }

    public Short getRevisionSuivante() {
        return revisionSuivante;
    }

    public void setRevisionSuivante(Short revisionSuivante) {
        this.revisionSuivante = revisionSuivante;
    }

    public String getDValide() {
        return dValide;
    }

    public void setDValide(String dValide) {
        this.dValide = dValide;
    }

    public String getValideur() {
        return valideur;
    }

    public void setValideur(String valideur) {
        this.valideur = valideur;
    }

    public String getTransporteur() {
        return transporteur;
    }

    public void setTransporteur(String transporteur) {
        this.transporteur = transporteur;
    }

    public String getPretransporteur() {
        return pretransporteur;
    }

    public void setPretransporteur(String pretransporteur) {
        this.pretransporteur = pretransporteur;
    }

    public BigDecimal getMontantBsc() {
        return montantBsc;
    }

    public void setMontantBsc(BigDecimal montantBsc) {
        this.montantBsc = montantBsc;
    }

    public String getTBsc() {
        return tBsc;
    }

    public void setTBsc(String tBsc) {
        this.tBsc = tBsc;
    }

    public String getTVisa() {
        return tVisa;
    }

    public void setTVisa(String tVisa) {
        this.tVisa = tVisa;
    }

    public String getNumeroDossierTransitaire() {
        return numeroDossierTransitaire;
    }

    public void setNumeroDossierTransitaire(String numeroDossierTransitaire) {
        this.numeroDossierTransitaire = numeroDossierTransitaire;
    }

    public String getPortTransbordement() {
        return portTransbordement;
    }

    public void setPortTransbordement(String portTransbordement) {
        this.portTransbordement = portTransbordement;
    }

    public String getIsoPorts() {
        return isoPorts;
    }

    public void setIsoPorts(String isoPorts) {
        this.isoPorts = isoPorts;
    }

    public String getIsoPortsT() {
        return isoPortsT;
    }

    public void setIsoPortsT(String isoPortsT) {
        this.isoPortsT = isoPortsT;
    }

    public String getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(String fournisseur) {
        this.fournisseur = fournisseur;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public String getNumPeq() {
        return numPeq;
    }

    public void setNumPeq(String numPeq) {
        this.numPeq = numPeq;
    }

    public BigDecimal getAssurance() {
        return assurance;
    }

    public void setAssurance(BigDecimal assurance) {
        this.assurance = assurance;
    }

    public BigDecimal getValeurCif() {
        return valeurCif;
    }

    public void setValeurCif(BigDecimal valeurCif) {
        this.valeurCif = valeurCif;
    }

    public String getChaine() {
        return chaine;
    }

    public void setChaine(String chaine) {
        this.chaine = chaine;
    }

    public String getDateBae() {
        return dateBae;
    }

    public void setDateBae(String dateBae) {
        this.dateBae = dateBae;
    }

    public String getDateEnl() {
        return dateEnl;
    }

    public void setDateEnl(String dateEnl) {
        this.dateEnl = dateEnl;
    }

    public BigDecimal getMntPrt() {
        return mntPrt;
    }

    public void setMntPrt(BigDecimal mntPrt) {
        this.mntPrt = mntPrt;
    }

    public BigDecimal getMntEnt() {
        return mntEnt;
    }

    public void setMntEnt(BigDecimal mntEnt) {
        this.mntEnt = mntEnt;
    }

    public BigDecimal getMntMan() {
        return mntMan;
    }

    public void setMntMan(BigDecimal mntMan) {
        this.mntMan = mntMan;
    }

    public BigDecimal getMntRel() {
        return mntRel;
    }

    public void setMntRel(BigDecimal mntRel) {
        this.mntRel = mntRel;
    }

    public BigDecimal getMntCnd() {
        return mntCnd;
    }

    public void setMntCnd(BigDecimal mntCnd) {
        this.mntCnd = mntCnd;
    }

    public BigDecimal getMntAva() {
        return mntAva;
    }

    public void setMntAva(BigDecimal mntAva) {
        this.mntAva = mntAva;
    }

    public BigDecimal getMntCch() {
        return mntCch;
    }

    public void setMntCch(BigDecimal mntCch) {
        this.mntCch = mntCch;
    }

    public BigDecimal getMntCtr() {
        return mntCtr;
    }

    public void setMntCtr(BigDecimal mntCtr) {
        this.mntCtr = mntCtr;
    }

    public BigDecimal getMntPhy() {
        return mntPhy;
    }

    public void setMntPhy(BigDecimal mntPhy) {
        this.mntPhy = mntPhy;
    }

    public BigDecimal getMntDne() {
        return mntDne;
    }

    public void setMntDne(BigDecimal mntDne) {
        this.mntDne = mntDne;
    }

    public BigDecimal getMntTrs() {
        return mntTrs;
    }

    public void setMntTrs(BigDecimal mntTrs) {
        this.mntTrs = mntTrs;
    }

    public BigDecimal getMntHad() {
        return mntHad;
    }

    public void setMntHad(BigDecimal mntHad) {
        this.mntHad = mntHad;
    }

    public BigDecimal getMntDeb() {
        return mntDeb;
    }

    public void setMntDeb(BigDecimal mntDeb) {
        this.mntDeb = mntDeb;
    }

    public BigDecimal getMntDiv() {
        return mntDiv;
    }

    public void setMntDiv(BigDecimal mntDiv) {
        this.mntDiv = mntDiv;
    }

    public BigDecimal getMntMpa() {
        return mntMpa;
    }

    public void setMntMpa(BigDecimal mntMpa) {
        this.mntMpa = mntMpa;
    }

    public String getPortDebarquement() {
        return portDebarquement;
    }

    public void setPortDebarquement(String portDebarquement) {
        this.portDebarquement = portDebarquement;
    }

    public String getNumeroVoyage() {
        return numeroVoyage;
    }

    public void setNumeroVoyage(String numeroVoyage) {
        this.numeroVoyage = numeroVoyage;
    }

    public BigDecimal getValeurCaf() {
        return valeurCaf;
    }

    public void setValeurCaf(BigDecimal valeurCaf) {
        this.valeurCaf = valeurCaf;
    }

    public String getObservTransitaire() {
        return observTransitaire;
    }

    public void setObservTransitaire(String observTransitaire) {
        this.observTransitaire = observTransitaire;
    }

    public String getDObservTransitaire() {
        return dObservTransitaire;
    }

    public void setDObservTransitaire(String dObservTransitaire) {
        this.dObservTransitaire = dObservTransitaire;
    }

    public String getHObservTransitaire() {
        return hObservTransitaire;
    }

    public void setHObservTransitaire(String hObservTransitaire) {
        this.hObservTransitaire = hObservTransitaire;
    }

    public String getObservMandataire() {
        return observMandataire;
    }

    public void setObservMandataire(String observMandataire) {
        this.observMandataire = observMandataire;
    }

    public String getDObservMandataire() {
        return dObservMandataire;
    }

    public void setDObservMandataire(String dObservMandataire) {
        this.dObservMandataire = dObservMandataire;
    }

    public String getHObservMandataire() {
        return hObservMandataire;
    }

    public void setHObservMandataire(String hObservMandataire) {
        this.hObservMandataire = hObservMandataire;
    }

    public String getObservDouane() {
        return observDouane;
    }

    public void setObservDouane(String observDouane) {
        this.observDouane = observDouane;
    }

    public String getDObservDouane() {
        return dObservDouane;
    }

    public void setDObservDouane(String dObservDouane) {
        this.dObservDouane = dObservDouane;
    }

    public String getHObservDouane() {
        return hObservDouane;
    }

    public void setHObservDouane(String hObservDouane) {
        this.hObservDouane = hObservDouane;
    }

    public String getObservConseil() {
        return observConseil;
    }

    public void setObservConseil(String observConseil) {
        this.observConseil = observConseil;
    }

    public String getDObservConseil() {
        return dObservConseil;
    }

    public void setDObservConseil(String dObservConseil) {
        this.dObservConseil = dObservConseil;
    }

    public String getHObservConseil() {
        return hObservConseil;
    }

    public void setHObservConseil(String hObservConseil) {
        this.hObservConseil = hObservConseil;
    }

    public Short getCredoc() {
        return credoc;
    }

    public void setCredoc(Short credoc) {
        this.credoc = credoc;
    }

    public BigDecimal getMntAdd() {
        return mntAdd;
    }

    public void setMntAdd(BigDecimal mntAdd) {
        this.mntAdd = mntAdd;
    }

    public BigDecimal getNombreDeclare() {
        return nombreDeclare;
    }

    public void setNombreDeclare(BigDecimal nombreDeclare) {
        this.nombreDeclare = nombreDeclare;
    }

    public BigDecimal getPoidsDeclare() {
        return poidsDeclare;
    }

    public void setPoidsDeclare(BigDecimal poidsDeclare) {
        this.poidsDeclare = poidsDeclare;
    }

    public BigDecimal getCafDeclare() {
        return cafDeclare;
    }

    public void setCafDeclare(BigDecimal cafDeclare) {
        this.cafDeclare = cafDeclare;
    }

    public String getNomenclatureDouane() {
        return nomenclatureDouane;
    }

    public void setNomenclatureDouane(String nomenclatureDouane) {
        this.nomenclatureDouane = nomenclatureDouane;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public BigDecimal getMontantConsignataire() {
        return montantConsignataire;
    }

    public void setMontantConsignataire(BigDecimal montantConsignataire) {
        this.montantConsignataire = montantConsignataire;
    }

    public BigDecimal getMontantTransit() {
        return montantTransit;
    }

    public void setMontantTransit(BigDecimal montantTransit) {
        this.montantTransit = montantTransit;
    }

    public BigDecimal getMontantSanitaire() {
        return montantSanitaire;
    }

    public void setMontantSanitaire(BigDecimal montantSanitaire) {
        this.montantSanitaire = montantSanitaire;
    }

    public BigDecimal getMontantExpedition() {
        return montantExpedition;
    }

    public void setMontantExpedition(BigDecimal montantExpedition) {
        this.montantExpedition = montantExpedition;
    }

    public String getBscPaye() {
        return bscPaye;
    }

    public void setBscPaye(String bscPaye) {
        this.bscPaye = bscPaye;
    }

    public BigDecimal getNombreExpedition() {
        return nombreExpedition;
    }

    public void setNombreExpedition(BigDecimal nombreExpedition) {
        this.nombreExpedition = nombreExpedition;
    }

    public String getNumeroFactureTransit() {
        return numeroFactureTransit;
    }

    public void setNumeroFactureTransit(String numeroFactureTransit) {
        this.numeroFactureTransit = numeroFactureTransit;
    }

    public String getNumManifeste() {
        return numManifeste;
    }

    public void setNumManifeste(String numManifeste) {
        this.numManifeste = numManifeste;
    }

    public Short getFacConteneur() {
        return facConteneur;
    }

    public void setFacConteneur(Short facConteneur) {
        this.facConteneur = facConteneur;
    }

    public Short getFacMg() {
        return facMg;
    }

    public void setFacMg(Short facMg) {
        this.facMg = facMg;
    }

    public Short getFacPhyto() {
        return facPhyto;
    }

    public void setFacPhyto(Short facPhyto) {
        this.facPhyto = facPhyto;
    }

    public Short getFacVehicule() {
        return facVehicule;
    }

    public void setFacVehicule(Short facVehicule) {
        this.facVehicule = facVehicule;
    }

    public Short getFacHyfro() {
        return facHyfro;
    }

    public void setFacHyfro(Short facHyfro) {
        this.facHyfro = facHyfro;
    }

    public String getManut() {
        return manut;
    }

    public void setManut(String manut) {
        this.manut = manut;
    }

    public String getConsignataire() {
        return consignataire;
    }

    public void setConsignataire(String consignataire) {
        this.consignataire = consignataire;
    }

    public String getSituat() {
        return situat;
    }

    public void setSituat(String situat) {
        this.situat = situat;
    }

    public String getVehicule() {
        return vehicule;
    }

    public void setVehicule(String vehicule) {
        this.vehicule = vehicule;
    }

    public String getRemorque() {
        return remorque;
    }

    public void setRemorque(String remorque) {
        this.remorque = remorque;
    }

    public String getConducteur() {
        return conducteur;
    }

    public void setConducteur(String conducteur) {
        this.conducteur = conducteur;
    }

    public String getMagasin() {
        return magasin;
    }

    public void setMagasin(String magasin) {
        this.magasin = magasin;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public String getContrat() {
        return contrat;
    }

    public void setContrat(String contrat) {
        this.contrat = contrat;
    }

    public String getDossier() {
        return dossier;
    }

    public void setDossier(String dossier) {
        this.dossier = dossier;
    }

    public String getDeclaration() {
        return declaration;
    }

    public void setDeclaration(String declaration) {
        this.declaration = declaration;
    }

    public String getCampagne() {
        return campagne;
    }

    public void setCampagne(String campagne) {
        this.campagne = campagne;
    }

    public String getBonSortie() {
        return bonSortie;
    }

    public void setBonSortie(String bonSortie) {
        this.bonSortie = bonSortie;
    }

    public String getBmc() {
        return bmc;
    }

    public void setBmc(String bmc) {
        this.bmc = bmc;
    }

    public String getObservChargeur() {
        return observChargeur;
    }

    public void setObservChargeur(String observChargeur) {
        this.observChargeur = observChargeur;
    }

    public String getDObservChargeur() {
        return dObservChargeur;
    }

    public void setDObservChargeur(String dObservChargeur) {
        this.dObservChargeur = dObservChargeur;
    }

    public String getHObservChargeur() {
        return hObservChargeur;
    }

    public void setHObservChargeur(String hObservChargeur) {
        this.hObservChargeur = hObservChargeur;
    }

    public String getObservTransporteur() {
        return observTransporteur;
    }

    public void setObservTransporteur(String observTransporteur) {
        this.observTransporteur = observTransporteur;
    }

    public String getDObservTransporteur() {
        return dObservTransporteur;
    }

    public void setDObservTransporteur(String dObservTransporteur) {
        this.dObservTransporteur = dObservTransporteur;
    }

    public String getHObservTransporteur() {
        return hObservTransporteur;
    }

    public void setHObservTransporteur(String hObservTransporteur) {
        this.hObservTransporteur = hObservTransporteur;
    }

    public String getObservManutention() {
        return observManutention;
    }

    public void setObservManutention(String observManutention) {
        this.observManutention = observManutention;
    }

    public String getDObservManutention() {
        return dObservManutention;
    }

    public void setDObservManutention(String dObservManutention) {
        this.dObservManutention = dObservManutention;
    }

    public String getHObservManutention() {
        return hObservManutention;
    }

    public void setHObservManutention(String hObservManutention) {
        this.hObservManutention = hObservManutention;
    }

    public String getDeChargeur() {
        return deChargeur;
    }

    public void setDeChargeur(String deChargeur) {
        this.deChargeur = deChargeur;
    }

    public String getAChargeur() {
        return aChargeur;
    }

    public void setAChargeur(String aChargeur) {
        this.aChargeur = aChargeur;
    }

    public String getDeTransporteur() {
        return deTransporteur;
    }

    public void setDeTransporteur(String deTransporteur) {
        this.deTransporteur = deTransporteur;
    }

    public String getATransporteur() {
        return aTransporteur;
    }

    public void setATransporteur(String aTransporteur) {
        this.aTransporteur = aTransporteur;
    }

    public String getDeManutention() {
        return deManutention;
    }

    public void setDeManutention(String deManutention) {
        this.deManutention = deManutention;
    }

    public String getAManutention() {
        return aManutention;
    }

    public void setAManutention(String aManutention) {
        this.aManutention = aManutention;
    }

    public String getDeTransitaire() {
        return deTransitaire;
    }

    public void setDeTransitaire(String deTransitaire) {
        this.deTransitaire = deTransitaire;
    }

    public String getATransitaire() {
        return aTransitaire;
    }

    public void setATransitaire(String aTransitaire) {
        this.aTransitaire = aTransitaire;
    }

    public String getDeMandataire() {
        return deMandataire;
    }

    public void setDeMandataire(String deMandataire) {
        this.deMandataire = deMandataire;
    }

    public String getAMandataire() {
        return aMandataire;
    }

    public void setAMandataire(String aMandataire) {
        this.aMandataire = aMandataire;
    }

    public String getDeDouane() {
        return deDouane;
    }

    public void setDeDouane(String deDouane) {
        this.deDouane = deDouane;
    }

    public String getADouane() {
        return aDouane;
    }

    public void setADouane(String aDouane) {
        this.aDouane = aDouane;
    }

    public String getDeConseil() {
        return deConseil;
    }

    public void setDeConseil(String deConseil) {
        this.deConseil = deConseil;
    }

    public String getAConseil() {
        return aConseil;
    }

    public void setAConseil(String aConseil) {
        this.aConseil = aConseil;
    }

    public String getObservPort() {
        return observPort;
    }

    public void setObservPort(String observPort) {
        this.observPort = observPort;
    }

    public String getDObservPort() {
        return dObservPort;
    }

    public void setDObservPort(String dObservPort) {
        this.dObservPort = dObservPort;
    }

    public String getHObservPort() {
        return hObservPort;
    }

    public void setHObservPort(String hObservPort) {
        this.hObservPort = hObservPort;
    }

    public String getDePort() {
        return dePort;
    }

    public void setDePort(String dePort) {
        this.dePort = dePort;
    }

    public String getAPort() {
        return aPort;
    }

    public void setAPort(String aPort) {
        this.aPort = aPort;
    }

    public Integer getNiveauProcessus() {
        return niveauProcessus;
    }

    public void setNiveauProcessus(Integer niveauProcessus) {
        this.niveauProcessus = niveauProcessus;
    }

    public String getHeureBae() {
        return heureBae;
    }

    public void setHeureBae(String heureBae) {
        this.heureBae = heureBae;
    }

    public BigDecimal getNombreColis() {
        return nombreColis;
    }

    public void setNombreColis(BigDecimal nombreColis) {
        this.nombreColis = nombreColis;
    }

    public BigDecimal getNombreConteneurs() {
        return nombreConteneurs;
    }

    public void setNombreConteneurs(BigDecimal nombreConteneurs) {
        this.nombreConteneurs = nombreConteneurs;
    }

    public String getNumExoDg() {
        return numExoDg;
    }

    public void setNumExoDg(String numExoDg) {
        this.numExoDg = numExoDg;
    }

    public BigDecimal getTauxExo() {
        return tauxExo;
    }

    public void setTauxExo(BigDecimal tauxExo) {
        this.tauxExo = tauxExo;
    }

    public String getNumBe() {
        return numBe;
    }

    public void setNumBe(String numBe) {
        this.numBe = numBe;
    }

    public String getNumBooking() {
        return numBooking;
    }

    public void setNumBooking(String numBooking) {
        this.numBooking = numBooking;
    }

    public Port getPocleunik() {
        return pocleunik;
    }

    public void setPocleunik(Port pocleunik) {
        this.pocleunik = pocleunik;
    }

    @XmlTransient
    public Collection<March> getMarchCollection() {
        return marchCollection;
    }

    public void setMarchCollection(Collection<March> marchCollection) {
        this.marchCollection = marchCollection;
    }

    @XmlTransient
    public Collection<Colis> getColisCollection() {
        return colisCollection;
    }

    public void setColisCollection(Collection<Colis> colisCollection) {
        this.colisCollection = colisCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (blcleunik != null ? blcleunik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bl)) {
            return false;
        }
        Bl other = (Bl) object;
        if ((this.blcleunik == null && other.blcleunik != null) || (this.blcleunik != null && !this.blcleunik.equals(other.blcleunik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.adminfaces.starter.model.Bl[ blcleunik=" + blcleunik + " ]";
    }
    
}
