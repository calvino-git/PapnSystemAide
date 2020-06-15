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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author calviniloki
 */
@Entity
@Table(name = "CONTRAT_DOMAINE", catalog = "", schema = "PPNCARGO")
@XmlRootElement
public class ContratDomaine extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DMCLEUNIK", nullable = false, precision = 19, scale = 0)
    private BigDecimal dmcleunik;
    @JoinColumn(name = "DDCLEUNIK", referencedColumnName = "DDCLEUNIK")
    @OneToOne
    private DossierDomaine dossierDomaine;
    @Size(max = 20)
    @Column(name = "CONTRAT", length = 20)
    private String contrat;
    @Size(max = 80)
    @Column(name = "REFERENCE", length = 80)
    private String reference;
    @Size(max = 50)
    @Column(name = "LIBELLE", length = 50)
    private String libelle;
    @Size(max = 8)
    @Column(name = "CLIENT", length = 8)
    private String client;
    @Size(max = 8)
    @Column(name = "LOT", length = 8)
    private String lot;
    @Column(name = "QUANTITE", precision = 19, scale = 6)
    private BigDecimal quantite;
    @Column(name = "SUPERFICIE", precision = 19, scale = 6)
    private BigDecimal superficie;
    @Size(max = 20)
    @Column(name = "ZONE", length = 20)
    private String zone;
    @Column(name = "TAUXAPPL", precision = 19, scale = 6)
    private BigDecimal tauxappl;
    @Size(max = 8)
    @Column(name = "DEVISE", length = 8)
    private String devise;
    @Size(max = 8)
    @Column(name = "ETAT", length = 8)
    private String etat;
    @Column(name = "TVA", precision = 19, scale = 6)
    private BigDecimal tva;
    @Column(name = "CENTIMES_ADD", precision = 19, scale = 6)
    private BigDecimal centimesAdd;
    @Column(name = "LIGNE")
    private Short ligne;
    @Size(max = 8)
    @Column(name = "DATE_FACTURE", length = 8)
    private String dateFacture;
    @Column(name = "TAUX", precision = 19, scale = 6)
    private BigDecimal taux;
    @Column(name = "PERIODICITE_FACTURE")
    private Short periodiciteFacture;
    @Size(max = 20)
    @Column(name = "NUMERO_OCCUPATION", length = 20)
    private String numeroOccupation;
    @Size(max = 8)
    @Column(name = "DATE_OCCUPATION", length = 8)
    private String dateOccupation;
    @Size(max = 8)
    @Column(name = "DATE_RESILIATION", length = 8)
    private String dateResiliation;
    @Size(max = 8)
    @Column(name = "DATE_DEBUT_FACTURATION", length = 8)
    private String dateDebutFacturation;
    @Column(name = "MONTANT_CAUTION", precision = 19, scale = 6)
    private BigDecimal montantCaution;
    @Size(max = 1)
    @Column(name = "CAUTION_REGLEE", length = 1)
    private String cautionReglee;
    @Size(max = 8)
    @Column(name = "TYPE_INSTALLATION", length = 8)
    private String typeInstallation;
    @Size(max = 8)
    @Column(name = "STATUT", length = 8)
    private String statut;
    @Column(name = "GESTION")
    private BigInteger gestion;
    @Size(max = 10)
    @Column(name = "CREATEUR", length = 10)
    private String createur;
    @Size(max = 8)
    @Column(name = "D_CREAT", length = 8)
    private String dCreat;
    @Size(max = 4)
    @Column(name = "H_CREAT", length = 4)
    private String hCreat;
    @Size(max = 10)
    @Column(name = "UTILISAT", length = 10)
    private String utilisat;
    @Size(max = 8)
    @Column(name = "D_MODIF", length = 8)
    private String dModif;
    @Size(max = 4)
    @Column(name = "H_MODIF", length = 4)
    private String hModif;
    @Size(max = 8)
    @Column(name = "DATE_SIGNATURE", length = 8)
    private String dateSignature;
    @Size(max = 8)
    @Column(name = "DATE_DEBUT", length = 8)
    private String dateDebut;
    @Size(max = 8)
    @Column(name = "DATE_FIN", length = 8)
    private String dateFin;
    @Column(name = "PREAVIS", precision = 19, scale = 6)
    private BigDecimal preavis;
    @Size(max = 8)
    @Column(name = "DATE_AVENANT", length = 8)
    private String dateAvenant;
    @Column(name = "DOCUMENTS_DEPOSES")
    private Short documentsDeposes;
    @Size(max = 8)
    @Column(name = "DATE_ENREGISTREMENT_IMPOTS", length = 8)
    private String dateEnregistrementImpots;
    @Column(name = "DUREE_OCCUPATION", precision = 19, scale = 6)
    private BigDecimal dureeOccupation;
    @Size(max = 250)
    @Column(name = "OBSERVATIONS", length = 250)
    private String observations;
    @Size(max = 8)
    @Column(name = "DATE_VALIDITE_CAUTION", length = 8)
    private String dateValiditeCaution;
    @Size(max = 8)
    @Column(name = "DATE_MISE_EN_DEMEURE", length = 8)
    private String dateMiseEnDemeure;
    @Size(max = 8)
    @Column(name = "DATE_DEMANDE", length = 8)
    private String dateDemande;
    @Size(max = 8)
    @Column(name = "DATE_COURRIER", length = 8)
    private String dateCourrier;
    @Column(name = "PAPIER_ENTETE")
    private Short papierEntete;
    @Column(name = "PREUVE_INSCRIPTION_RC")
    private Short preuveInscriptionRc;
    @Column(name = "CARTE_CONTRIBUABLE")
    private Short carteContribuable;
    @Column(name = "ATTESTATION_SOUMISSION_CNPS")
    private Short attestationSoumissionCnps;
    @Column(name = "PATENTE")
    private Short patente;
    @Column(name = "CERTIFICAT_IMPOSITION")
    private Short certificatImposition;
    @Column(name = "ATTESTATION_NON_FAILLITE")
    private Short attestationNonFaillite;
    @Column(name = "EXTRAIT_COMPTES_BANCAIRE")
    private Short extraitComptesBancaire;
    @Column(name = "STATUT_SOCIETE")
    private Short statutSociete;
    @Column(name = "EXTRAIT_CASIER_JUDICIAIRE")
    private Short extraitCasierJudiciaire;
    @Column(name = "REFERENCES_TECHNIQUES_PROF")
    private Short referencesTechniquesProf;
    @Column(name = "AUTORISATIONS_ADMINISTRATIVES")
    private Short autorisationsAdministratives;
    @Column(name = "CERTIFICAT_MEDICAL")
    private Short certificatMedical;
    @Column(name = "CERTIFICAT_SALUBRITE")
    private Short certificatSalubrite;
    @Column(name = "POLICE_ASSURANCE_RCCE")
    private Short policeAssuranceRcce;
    @Size(max = 20)
    @Column(name = "NUMERO_CAUTION", length = 20)
    private String numeroCaution;
    @Size(max = 30)
    @Column(name = "NOM_BANQUE", length = 30)
    private String nomBanque;
    @Column(name = "SURFACE_DEMANDEE", precision = 19, scale = 6)
    private BigDecimal surfaceDemandee;
    @Size(max = 8)
    @Column(name = "DATE_SIGNATURE_ACCORD_PRINCIPE", length = 8)
    private String dateSignatureAccordPrincipe;
    @Size(max = 30)
    @Column(name = "NOM_SIGNATAIRE_ACCORD_PRINCIPE", length = 30)
    private String nomSignataireAccordPrincipe;
    @Size(max = 30)
    @Column(name = "QUALITE_SIGN_ACCORD_PRINCIPE", length = 30)
    private String qualiteSignAccordPrincipe;
    @Size(max = 8)
    @Column(name = "DATE_SOUSCRIPTION_CLIENT", length = 8)
    private String dateSouscriptionClient;
    @Size(max = 20)
    @Column(name = "NUMERO_ACCORD_PRINCIPE", length = 20)
    private String numeroAccordPrincipe;
    @Size(max = 20)
    @Column(name = "NUMERO_AVENANT", length = 20)
    private String numeroAvenant;
    @Column(name = "AUTHENTIFICATION_CAUTION")
    private Short authentificationCaution;
    @Column(name = "DOSSIER_TECHNIQUE")
    private Short dossierTechnique;
    @Column(name = "ACCORD_DAM")
    private Short accordDam;
    @Size(max = 80)
    @Column(name = "LOCALISATION", length = 80)
    private String localisation;
    @Column(name = "TOP_BORD_QUAI")
    private Short topBordQuai;
    @Column(name = "TOP_DESSERTE_ROUTIERE")
    private Short topDesserteRoutiere;
    @Column(name = "TOP_DESSERTE_FER")
    private Short topDesserteFer;
    @Column(name = "TOP_RESERVE_EAU")
    private Short topReserveEau;
    @Column(name = "TOP_RESEAU_ELECTRIQUE")
    private Short topReseauElectrique;
    @Column(name = "TOP_RESEAU_TELEPHONE")
    private Short topReseauTelephone;
    @OneToMany(mappedBy = "contratDomaine",fetch = FetchType.EAGER)
    private List<PrestsDomaine> listPrestDomaine;

    public ContratDomaine() {
    }

    public ContratDomaine(BigDecimal dmcleunik) {
        this.dmcleunik = dmcleunik;
    }
    
    @Override
    public BigDecimal getId() {
        return dmcleunik;
    }

    public BigDecimal getDmcleunik() {
        return dmcleunik;
    }

    public void setDmcleunik(BigDecimal dmcleunik) {
        this.dmcleunik = dmcleunik;
    }

    public DossierDomaine getDossierDomaine() {
        return dossierDomaine;
    }

    public void setDossierDomaine(DossierDomaine dossierDomaine) {
        this.dossierDomaine = dossierDomaine;
    }

    public String getContrat() {
        return contrat;
    }

    public void setContrat(String contrat) {
        this.contrat = contrat;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public BigDecimal getQuantite() {
        return quantite;
    }

    public void setQuantite(BigDecimal quantite) {
        this.quantite = quantite;
    }

    public BigDecimal getSuperficie() {
        return superficie;
    }

    public void setSuperficie(BigDecimal superficie) {
        this.superficie = superficie;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public BigDecimal getTauxappl() {
        return tauxappl;
    }

    public void setTauxappl(BigDecimal tauxappl) {
        this.tauxappl = tauxappl;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public BigDecimal getTva() {
        return tva;
    }

    public void setTva(BigDecimal tva) {
        this.tva = tva;
    }

    public BigDecimal getCentimesAdd() {
        return centimesAdd;
    }

    public void setCentimesAdd(BigDecimal centimesAdd) {
        this.centimesAdd = centimesAdd;
    }

    public Short getLigne() {
        return ligne;
    }

    public void setLigne(Short ligne) {
        this.ligne = ligne;
    }

    public String getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(String dateFacture) {
        this.dateFacture = dateFacture;
    }

    public BigDecimal getTaux() {
        return taux;
    }

    public void setTaux(BigDecimal taux) {
        this.taux = taux;
    }

    public Short getPeriodiciteFacture() {
        return periodiciteFacture;
    }

    public void setPeriodiciteFacture(Short periodiciteFacture) {
        this.periodiciteFacture = periodiciteFacture;
    }

    public String getNumeroOccupation() {
        return numeroOccupation;
    }

    public void setNumeroOccupation(String numeroOccupation) {
        this.numeroOccupation = numeroOccupation;
    }

    public String getDateOccupation() {
        return dateOccupation;
    }

    public void setDateOccupation(String dateOccupation) {
        this.dateOccupation = dateOccupation;
    }

    public String getDateResiliation() {
        return dateResiliation;
    }

    public void setDateResiliation(String dateResiliation) {
        this.dateResiliation = dateResiliation;
    }

    public String getDateDebutFacturation() {
        return dateDebutFacturation;
    }

    public void setDateDebutFacturation(String dateDebutFacturation) {
        this.dateDebutFacturation = dateDebutFacturation;
    }

    public BigDecimal getMontantCaution() {
        return montantCaution;
    }

    public void setMontantCaution(BigDecimal montantCaution) {
        this.montantCaution = montantCaution;
    }

    public String getCautionReglee() {
        return cautionReglee;
    }

    public void setCautionReglee(String cautionReglee) {
        this.cautionReglee = cautionReglee;
    }

    public String getTypeInstallation() {
        return typeInstallation;
    }

    public void setTypeInstallation(String typeInstallation) {
        this.typeInstallation = typeInstallation;
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

    public String getDateSignature() {
        return dateSignature;
    }

    public void setDateSignature(String dateSignature) {
        this.dateSignature = dateSignature;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public BigDecimal getPreavis() {
        return preavis;
    }

    public void setPreavis(BigDecimal preavis) {
        this.preavis = preavis;
    }

    public String getDateAvenant() {
        return dateAvenant;
    }

    public void setDateAvenant(String dateAvenant) {
        this.dateAvenant = dateAvenant;
    }

    public Short getDocumentsDeposes() {
        return documentsDeposes;
    }

    public void setDocumentsDeposes(Short documentsDeposes) {
        this.documentsDeposes = documentsDeposes;
    }

    public String getDateEnregistrementImpots() {
        return dateEnregistrementImpots;
    }

    public void setDateEnregistrementImpots(String dateEnregistrementImpots) {
        this.dateEnregistrementImpots = dateEnregistrementImpots;
    }

    public BigDecimal getDureeOccupation() {
        return dureeOccupation;
    }

    public void setDureeOccupation(BigDecimal dureeOccupation) {
        this.dureeOccupation = dureeOccupation;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public String getDateValiditeCaution() {
        return dateValiditeCaution;
    }

    public void setDateValiditeCaution(String dateValiditeCaution) {
        this.dateValiditeCaution = dateValiditeCaution;
    }

    public String getDateMiseEnDemeure() {
        return dateMiseEnDemeure;
    }

    public void setDateMiseEnDemeure(String dateMiseEnDemeure) {
        this.dateMiseEnDemeure = dateMiseEnDemeure;
    }

    public String getDateDemande() {
        return dateDemande;
    }

    public void setDateDemande(String dateDemande) {
        this.dateDemande = dateDemande;
    }

    public String getDateCourrier() {
        return dateCourrier;
    }

    public void setDateCourrier(String dateCourrier) {
        this.dateCourrier = dateCourrier;
    }

    public Short getPapierEntete() {
        return papierEntete;
    }

    public void setPapierEntete(Short papierEntete) {
        this.papierEntete = papierEntete;
    }

    public Short getPreuveInscriptionRc() {
        return preuveInscriptionRc;
    }

    public void setPreuveInscriptionRc(Short preuveInscriptionRc) {
        this.preuveInscriptionRc = preuveInscriptionRc;
    }

    public Short getCarteContribuable() {
        return carteContribuable;
    }

    public void setCarteContribuable(Short carteContribuable) {
        this.carteContribuable = carteContribuable;
    }

    public Short getAttestationSoumissionCnps() {
        return attestationSoumissionCnps;
    }

    public void setAttestationSoumissionCnps(Short attestationSoumissionCnps) {
        this.attestationSoumissionCnps = attestationSoumissionCnps;
    }

    public Short getPatente() {
        return patente;
    }

    public void setPatente(Short patente) {
        this.patente = patente;
    }

    public Short getCertificatImposition() {
        return certificatImposition;
    }

    public void setCertificatImposition(Short certificatImposition) {
        this.certificatImposition = certificatImposition;
    }

    public Short getAttestationNonFaillite() {
        return attestationNonFaillite;
    }

    public void setAttestationNonFaillite(Short attestationNonFaillite) {
        this.attestationNonFaillite = attestationNonFaillite;
    }

    public Short getExtraitComptesBancaire() {
        return extraitComptesBancaire;
    }

    public void setExtraitComptesBancaire(Short extraitComptesBancaire) {
        this.extraitComptesBancaire = extraitComptesBancaire;
    }

    public Short getStatutSociete() {
        return statutSociete;
    }

    public void setStatutSociete(Short statutSociete) {
        this.statutSociete = statutSociete;
    }

    public Short getExtraitCasierJudiciaire() {
        return extraitCasierJudiciaire;
    }

    public void setExtraitCasierJudiciaire(Short extraitCasierJudiciaire) {
        this.extraitCasierJudiciaire = extraitCasierJudiciaire;
    }

    public Short getReferencesTechniquesProf() {
        return referencesTechniquesProf;
    }

    public void setReferencesTechniquesProf(Short referencesTechniquesProf) {
        this.referencesTechniquesProf = referencesTechniquesProf;
    }

    public Short getAutorisationsAdministratives() {
        return autorisationsAdministratives;
    }

    public void setAutorisationsAdministratives(Short autorisationsAdministratives) {
        this.autorisationsAdministratives = autorisationsAdministratives;
    }

    public Short getCertificatMedical() {
        return certificatMedical;
    }

    public void setCertificatMedical(Short certificatMedical) {
        this.certificatMedical = certificatMedical;
    }

    public Short getCertificatSalubrite() {
        return certificatSalubrite;
    }

    public void setCertificatSalubrite(Short certificatSalubrite) {
        this.certificatSalubrite = certificatSalubrite;
    }

    public Short getPoliceAssuranceRcce() {
        return policeAssuranceRcce;
    }

    public void setPoliceAssuranceRcce(Short policeAssuranceRcce) {
        this.policeAssuranceRcce = policeAssuranceRcce;
    }

    public String getNumeroCaution() {
        return numeroCaution;
    }

    public void setNumeroCaution(String numeroCaution) {
        this.numeroCaution = numeroCaution;
    }

    public String getNomBanque() {
        return nomBanque;
    }

    public void setNomBanque(String nomBanque) {
        this.nomBanque = nomBanque;
    }

    public BigDecimal getSurfaceDemandee() {
        return surfaceDemandee;
    }

    public void setSurfaceDemandee(BigDecimal surfaceDemandee) {
        this.surfaceDemandee = surfaceDemandee;
    }

    public String getDateSignatureAccordPrincipe() {
        return dateSignatureAccordPrincipe;
    }

    public void setDateSignatureAccordPrincipe(String dateSignatureAccordPrincipe) {
        this.dateSignatureAccordPrincipe = dateSignatureAccordPrincipe;
    }

    public String getNomSignataireAccordPrincipe() {
        return nomSignataireAccordPrincipe;
    }

    public void setNomSignataireAccordPrincipe(String nomSignataireAccordPrincipe) {
        this.nomSignataireAccordPrincipe = nomSignataireAccordPrincipe;
    }

    public String getQualiteSignAccordPrincipe() {
        return qualiteSignAccordPrincipe;
    }

    public void setQualiteSignAccordPrincipe(String qualiteSignAccordPrincipe) {
        this.qualiteSignAccordPrincipe = qualiteSignAccordPrincipe;
    }

    public String getDateSouscriptionClient() {
        return dateSouscriptionClient;
    }

    public void setDateSouscriptionClient(String dateSouscriptionClient) {
        this.dateSouscriptionClient = dateSouscriptionClient;
    }

    public String getNumeroAccordPrincipe() {
        return numeroAccordPrincipe;
    }

    public void setNumeroAccordPrincipe(String numeroAccordPrincipe) {
        this.numeroAccordPrincipe = numeroAccordPrincipe;
    }

    public String getNumeroAvenant() {
        return numeroAvenant;
    }

    public void setNumeroAvenant(String numeroAvenant) {
        this.numeroAvenant = numeroAvenant;
    }

    public Short getAuthentificationCaution() {
        return authentificationCaution;
    }

    public void setAuthentificationCaution(Short authentificationCaution) {
        this.authentificationCaution = authentificationCaution;
    }

    public Short getDossierTechnique() {
        return dossierTechnique;
    }

    public void setDossierTechnique(Short dossierTechnique) {
        this.dossierTechnique = dossierTechnique;
    }

    public Short getAccordDam() {
        return accordDam;
    }

    public void setAccordDam(Short accordDam) {
        this.accordDam = accordDam;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public Short getTopBordQuai() {
        return topBordQuai;
    }

    public void setTopBordQuai(Short topBordQuai) {
        this.topBordQuai = topBordQuai;
    }

    public Short getTopDesserteRoutiere() {
        return topDesserteRoutiere;
    }

    public void setTopDesserteRoutiere(Short topDesserteRoutiere) {
        this.topDesserteRoutiere = topDesserteRoutiere;
    }

    public Short getTopDesserteFer() {
        return topDesserteFer;
    }

    public void setTopDesserteFer(Short topDesserteFer) {
        this.topDesserteFer = topDesserteFer;
    }

    public Short getTopReserveEau() {
        return topReserveEau;
    }

    public void setTopReserveEau(Short topReserveEau) {
        this.topReserveEau = topReserveEau;
    }

    public Short getTopReseauElectrique() {
        return topReseauElectrique;
    }

    public void setTopReseauElectrique(Short topReseauElectrique) {
        this.topReseauElectrique = topReseauElectrique;
    }

    public Short getTopReseauTelephone() {
        return topReseauTelephone;
    }

    public void setTopReseauTelephone(Short topReseauTelephone) {
        this.topReseauTelephone = topReseauTelephone;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dmcleunik != null ? dmcleunik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContratDomaine)) {
            return false;
        }
        ContratDomaine other = (ContratDomaine) object;
        if ((this.dmcleunik == null && other.dmcleunik != null) || (this.dmcleunik != null && !this.dmcleunik.equals(other.dmcleunik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.adminfaces.starter.model.ContratDomaine[ dmcleunik=" + dmcleunik + " ]";
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

    public List<PrestsDomaine> getListPrestDomaine() {
        return listPrestDomaine;
    }

    public void setListPrestDomaine(List<PrestsDomaine> listPrestDomaine) {
        this.listPrestDomaine = listPrestDomaine;
    }
    
}
