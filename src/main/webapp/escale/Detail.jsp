<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <title>Escale Detail</title>
            <link rel="stylesheet" type="text/css" href="/sysaide/jsfcrud.xhtml" />
        </head>
        <body>
            <h:panelGroup id="messagePanel" layout="block">
                <h:messages errorStyle="color: red" infoStyle="color: green" layout="table"/>
            </h:panelGroup>
            <h1>Escale Detail</h1>
            <h:form>
                <h:panelGrid columns="2">
                    <h:outputText value="Escleunik:"/>
                    <h:outputText value="#{escale.escale.escleunik}" title="Escleunik" />
                    <h:outputText value="Numero:"/>
                    <h:outputText value="#{escale.escale.numero}" title="Numero" />
                    <h:outputText value="Agent:"/>
                    <h:outputText value="#{escale.escale.agent}" title="Agent" />
                    <h:outputText value="Manuten:"/>
                    <h:outputText value="#{escale.escale.manuten}" title="Manuten" />
                    <h:outputText value="Filiere:"/>
                    <h:outputText value="#{escale.escale.filiere}" title="Filiere" />
                    <h:outputText value="Radio:"/>
                    <h:outputText value="#{escale.escale.radio}" title="Radio" />
                    <h:outputText value="Service:"/>
                    <h:outputText value="#{escale.escale.service}" title="Service" />
                    <h:outputText value="Identite:"/>
                    <h:outputText value="#{escale.escale.identite}" title="Identite" />
                    <h:outputText value="Ligne:"/>
                    <h:outputText value="#{escale.escale.ligne}" title="Ligne" />
                    <h:outputText value="MoisStat:"/>
                    <h:outputText value="#{escale.escale.moisStat}" title="MoisStat" />
                    <h:outputText value="Capitaine:"/>
                    <h:outputText value="#{escale.escale.capitaine}" title="Capitaine" />
                    <h:outputText value="Construc:"/>
                    <h:outputText value="#{escale.escale.construc}" title="Construc" />
                    <h:outputText value="Objet:"/>
                    <h:outputText value="#{escale.escale.objet}" title="Objet" />
                    <h:outputText value="Etat:"/>
                    <h:outputText value="#{escale.escale.etat}" title="Etat" />
                    <h:outputText value="Nombre:"/>
                    <h:outputText value="#{escale.escale.nombre}" title="Nombre" />
                    <h:outputText value="NbAtt:"/>
                    <h:outputText value="#{escale.escale.nbAtt}" title="NbAtt" />
                    <h:outputText value="Sejour:"/>
                    <h:outputText value="#{escale.escale.sejour}" title="Sejour" />
                    <h:outputText value="Duree:"/>
                    <h:outputText value="#{escale.escale.duree}" title="Duree" />
                    <h:outputText value="Travail:"/>
                    <h:outputText value="#{escale.escale.travail}" title="Travail" />
                    <h:outputText value="Situat:"/>
                    <h:outputText value="#{escale.escale.situat}" title="Situat" />
                    <h:outputText value="Arrivee:"/>
                    <h:outputText value="#{escale.escale.arrivee}" title="Arrivee" />
                    <h:outputText value="ArrH:"/>
                    <h:outputText value="#{escale.escale.arrH}" title="ArrH" />
                    <h:outputText value="Mouill:"/>
                    <h:outputText value="#{escale.escale.mouill}" title="Mouill" />
                    <h:outputText value="Mouillh:"/>
                    <h:outputText value="#{escale.escale.mouillh}" title="Mouillh" />
                    <h:outputText value="PilEnt:"/>
                    <h:outputText value="#{escale.escale.pilEnt}" title="PilEnt" />
                    <h:outputText value="PilEnth:"/>
                    <h:outputText value="#{escale.escale.pilEnth}" title="PilEnth" />
                    <h:outputText value="RemE:"/>
                    <h:outputText value="#{escale.escale.remE}" title="RemE" />
                    <h:outputText value="Debut:"/>
                    <h:outputText value="#{escale.escale.debut}" title="Debut" />
                    <h:outputText value="DebH:"/>
                    <h:outputText value="#{escale.escale.debH}" title="DebH" />
                    <h:outputText value="DebOpe:"/>
                    <h:outputText value="#{escale.escale.debOpe}" title="DebOpe" />
                    <h:outputText value="DebOpeh:"/>
                    <h:outputText value="#{escale.escale.debOpeh}" title="DebOpeh" />
                    <h:outputText value="AttAr:"/>
                    <h:outputText value="#{escale.escale.attAr}" title="AttAr" />
                    <h:outputText value="MotAr:"/>
                    <h:outputText value="#{escale.escale.motAr}" title="MotAr" />
                    <h:outputText value="CondAr:"/>
                    <h:outputText value="#{escale.escale.condAr}" title="CondAr" />
                    <h:outputText value="PortAttac:"/>
                    <h:outputText value="#{escale.escale.portAttac}" title="PortAttac" />
                    <h:outputText value="RemS:"/>
                    <h:outputText value="#{escale.escale.remS}" title="RemS" />
                    <h:outputText value="FinOpe:"/>
                    <h:outputText value="#{escale.escale.finOpe}" title="FinOpe" />
                    <h:outputText value="FinOpeh:"/>
                    <h:outputText value="#{escale.escale.finOpeh}" title="FinOpeh" />
                    <h:outputText value="PilSor:"/>
                    <h:outputText value="#{escale.escale.pilSor}" title="PilSor" />
                    <h:outputText value="PilSorh:"/>
                    <h:outputText value="#{escale.escale.pilSorh}" title="PilSorh" />
                    <h:outputText value="Depart:"/>
                    <h:outputText value="#{escale.escale.depart}" title="Depart" />
                    <h:outputText value="DepH:"/>
                    <h:outputText value="#{escale.escale.depH}" title="DepH" />
                    <h:outputText value="Fin:"/>
                    <h:outputText value="#{escale.escale.fin}" title="Fin" />
                    <h:outputText value="FinH:"/>
                    <h:outputText value="#{escale.escale.finH}" title="FinH" />
                    <h:outputText value="AttDp:"/>
                    <h:outputText value="#{escale.escale.attDp}" title="AttDp" />
                    <h:outputText value="MotDp:"/>
                    <h:outputText value="#{escale.escale.motDp}" title="MotDp" />
                    <h:outputText value="CondDp:"/>
                    <h:outputText value="#{escale.escale.condDp}" title="CondDp" />
                    <h:outputText value="FoBrd:"/>
                    <h:outputText value="#{escale.escale.foBrd}" title="FoBrd" />
                    <h:outputText value="DoBrd:"/>
                    <h:outputText value="#{escale.escale.doBrd}" title="DoBrd" />
                    <h:outputText value="FoStg:"/>
                    <h:outputText value="#{escale.escale.foStg}" title="FoStg" />
                    <h:outputText value="DoStg:"/>
                    <h:outputText value="#{escale.escale.doStg}" title="DoStg" />
                    <h:outputText value="Eau:"/>
                    <h:outputText value="#{escale.escale.eau}" title="Eau" />
                    <h:outputText value="Activite:"/>
                    <h:outputText value="#{escale.escale.activite}" title="Activite" />
                    <h:outputText value="Person:"/>
                    <h:outputText value="#{escale.escale.person}" title="Person" />
                    <h:outputText value="Traite:"/>
                    <h:outputText value="#{escale.escale.traite}" title="Traite" />
                    <h:outputText value="Quai:"/>
                    <h:outputText value="#{escale.escale.quai}" title="Quai" />
                    <h:outputText value="Tonnage:"/>
                    <h:outputText value="#{escale.escale.tonnage}" title="Tonnage" />
                    <h:outputText value="FDate:"/>
                    <h:outputText value="#{escale.escale.FDate}" title="FDate" />
                    <h:outputText value="FHeure:"/>
                    <h:outputText value="#{escale.escale.FHeure}" title="FHeure" />
                    <h:outputText value="NFact:"/>
                    <h:outputText value="#{escale.escale.NFact}" title="NFact" />
                    <h:outputText value="FEche:"/>
                    <h:outputText value="#{escale.escale.FEche}" title="FEche" />
                    <h:outputText value="NbrTcs:"/>
                    <h:outputText value="#{escale.escale.nbrTcs}" title="NbrTcs" />
                    <h:outputText value="NbrVeh:"/>
                    <h:outputText value="#{escale.escale.nbrVeh}" title="NbrVeh" />
                    <h:outputText value="NbrPas:"/>
                    <h:outputText value="#{escale.escale.nbrPas}" title="NbrPas" />
                    <h:outputText value="NbrTcst:"/>
                    <h:outputText value="#{escale.escale.nbrTcst}" title="NbrTcst" />
                    <h:outputText value="ChargN:"/>
                    <h:outputText value="#{escale.escale.chargN}" title="ChargN" />
                    <h:outputText value="NbrTcsn:"/>
                    <h:outputText value="#{escale.escale.nbrTcsn}" title="NbrTcsn" />
                    <h:outputText value="Motif:"/>
                    <h:outputText value="#{escale.escale.motif}" title="Motif" />
                    <h:outputText value="NbrSht:"/>
                    <h:outputText value="#{escale.escale.nbrSht}" title="NbrSht" />
                    <h:outputText value="Port:"/>
                    <h:outputText value="#{escale.escale.port}" title="Port" />
                    <h:outputText value="Rendement:"/>
                    <h:outputText value="#{escale.escale.rendement}" title="Rendement" />
                    <h:outputText value="Avarie:"/>
                    <h:outputText value="#{escale.escale.avarie}" title="Avarie" />
                    <h:outputText value="Nature:"/>
                    <h:outputText value="#{escale.escale.nature}" title="Nature" />
                    <h:outputText value="Importance:"/>
                    <h:outputText value="#{escale.escale.importance}" title="Importance" />
                    <h:outputText value="TopTriton:"/>
                    <h:outputText value="#{escale.escale.topTriton}" title="TopTriton" />
                    <h:outputText value="TopDanger:"/>
                    <h:outputText value="#{escale.escale.topDanger}" title="TopDanger" />
                    <h:outputText value="Hauteur:"/>
                    <h:outputText value="#{escale.escale.hauteur}" title="Hauteur" />
                    <h:outputText value="Largeur:"/>
                    <h:outputText value="#{escale.escale.largeur}" title="Largeur" />
                    <h:outputText value="TopFacAg:"/>
                    <h:outputText value="#{escale.escale.topFacAg}" title="TopFacAg" />
                    <h:outputText value="TopFacMn:"/>
                    <h:outputText value="#{escale.escale.topFacMn}" title="TopFacMn" />
                    <h:outputText value="THoraire:"/>
                    <h:outputText value="#{escale.escale.THoraire}" title="THoraire" />
                    <h:outputText value="NbPortique:"/>
                    <h:outputText value="#{escale.escale.nbPortique}" title="NbPortique" />
                    <h:outputText value="OkAgent:"/>
                    <h:outputText value="#{escale.escale.okAgent}" title="OkAgent" />
                    <h:outputText value="OkCapitaine:"/>
                    <h:outputText value="#{escale.escale.okCapitaine}" title="OkCapitaine" />
                    <h:outputText value="OkManutentionnaire:"/>
                    <h:outputText value="#{escale.escale.okManutentionnaire}" title="OkManutentionnaire" />
                    <h:outputText value="DateAgent:"/>
                    <h:outputText value="#{escale.escale.dateAgent}" title="DateAgent" />
                    <h:outputText value="HeureAgent:"/>
                    <h:outputText value="#{escale.escale.heureAgent}" title="HeureAgent" />
                    <h:outputText value="DateCapitaine:"/>
                    <h:outputText value="#{escale.escale.dateCapitaine}" title="DateCapitaine" />
                    <h:outputText value="HeureCapitaine:"/>
                    <h:outputText value="#{escale.escale.heureCapitaine}" title="HeureCapitaine" />
                    <h:outputText value="DateManutentionnaire:"/>
                    <h:outputText value="#{escale.escale.dateManutentionnaire}" title="DateManutentionnaire" />
                    <h:outputText value="HeureManutentionnaire:"/>
                    <h:outputText value="#{escale.escale.heureManutentionnaire}" title="HeureManutentionnaire" />
                    <h:outputText value="ProvenanceI:"/>
                    <h:outputText value="#{escale.escale.provenanceI}" title="ProvenanceI" />
                    <h:outputText value="ProvenanceO:"/>
                    <h:outputText value="#{escale.escale.provenanceO}" title="ProvenanceO" />
                    <h:outputText value="DestinationI:"/>
                    <h:outputText value="#{escale.escale.destinationI}" title="DestinationI" />
                    <h:outputText value="DestinationF:"/>
                    <h:outputText value="#{escale.escale.destinationF}" title="DestinationF" />
                    <h:outputText value="Navire:"/>
                    <h:outputText value="#{escale.escale.navire}" title="Navire" />
                    <h:outputText value="DDemande:"/>
                    <h:outputText value="#{escale.escale.DDemande}" title="DDemande" />
                    <h:outputText value="HDemande:"/>
                    <h:outputText value="#{escale.escale.HDemande}" title="HDemande" />
                    <h:outputText value="Referenc:"/>
                    <h:outputText value="#{escale.escale.referenc}" title="Referenc" />
                    <h:outputText value="TotPrimeEq1:"/>
                    <h:outputText value="#{escale.escale.totPrimeEq1}" title="TotPrimeEq1" />
                    <h:outputText value="TotPrimeEq2:"/>
                    <h:outputText value="#{escale.escale.totPrimeEq2}" title="TotPrimeEq2" />
                    <h:outputText value="Voyage:"/>
                    <h:outputText value="#{escale.escale.voyage}" title="Voyage" />
                    <h:outputText value="NbrHtrb:"/>
                    <h:outputText value="#{escale.escale.nbrHtrb}" title="NbrHtrb" />
                    <h:outputText value="NbrTrb:"/>
                    <h:outputText value="#{escale.escale.nbrTrb}" title="NbrTrb" />
                    <h:outputText value="NbrNtrb:"/>
                    <h:outputText value="#{escale.escale.nbrNtrb}" title="NbrNtrb" />
                    <h:outputText value="HrsNdf:"/>
                    <h:outputText value="#{escale.escale.hrsNdf}" title="HrsNdf" />
                    <h:outputText value="HrsNbr:"/>
                    <h:outputText value="#{escale.escale.hrsNbr}" title="HrsNbr" />
                    <h:outputText value="Gestion:"/>
                    <h:outputText value="#{escale.escale.gestion}" title="Gestion" />
                    <h:outputText value="Statut:"/>
                    <h:outputText value="#{escale.escale.statut}" title="Statut" />
                    <h:outputText value="Createur:"/>
                    <h:outputText value="#{escale.escale.createur}" title="Createur" />
                    <h:outputText value="DCreat:"/>
                    <h:outputText value="#{escale.escale.DCreat}" title="DCreat" />
                    <h:outputText value="HCreat:"/>
                    <h:outputText value="#{escale.escale.HCreat}" title="HCreat" />
                    <h:outputText value="Utilisat:"/>
                    <h:outputText value="#{escale.escale.utilisat}" title="Utilisat" />
                    <h:outputText value="DModif:"/>
                    <h:outputText value="#{escale.escale.DModif}" title="DModif" />
                    <h:outputText value="HModif:"/>
                    <h:outputText value="#{escale.escale.HModif}" title="HModif" />
                    <h:outputText value="Facleunik:"/>
                    <h:outputText value="#{escale.escale.facleunik}" title="Facleunik" />
                    <h:outputText value="ChargB:"/>
                    <h:outputText value="#{escale.escale.chargB}" title="ChargB" />
                    <h:outputText value="Pavillon:"/>
                    <h:outputText value="#{escale.escale.pavillon}" title="Pavillon" />
                    <h:outputText value="Armateur:"/>
                    <h:outputText value="#{escale.escale.armateur}" title="Armateur" />
                    <h:outputText value="JaugeNet:"/>
                    <h:outputText value="#{escale.escale.jaugeNet}" title="JaugeNet" />
                    <h:outputText value="RedemU:"/>
                    <h:outputText value="#{escale.escale.redemU}" title="RedemU" />
                    <h:outputText value="ChefPoste:"/>
                    <h:outputText value="#{escale.escale.chefPoste}" title="ChefPoste" />
                    <h:outputText value="OkFactNav:"/>
                    <h:outputText value="#{escale.escale.okFactNav}" title="OkFactNav" />
                    <h:outputText value="OkFactEqu:"/>
                    <h:outputText value="#{escale.escale.okFactEqu}" title="OkFactEqu" />
                    <h:outputText value="TraiteHier:"/>
                    <h:outputText value="#{escale.escale.traiteHier}" title="TraiteHier" />
                    <h:outputText value="DateStat:"/>
                    <h:outputText value="#{escale.escale.dateStat}" title="DateStat" >
                        <f:convertDateTime pattern="MM/dd/yyyy HH:mm:ss" />
                    </h:outputText>
                    <h:outputText value="Priorite:"/>
                    <h:outputText value="#{escale.escale.priorite}" title="Priorite" />
                    <h:outputText value="DatePasseEntree:"/>
                    <h:outputText value="#{escale.escale.datePasseEntree}" title="DatePasseEntree" />
                    <h:outputText value="HeurePasseEntree:"/>
                    <h:outputText value="#{escale.escale.heurePasseEntree}" title="HeurePasseEntree" />
                    <h:outputText value="DatePasseSortie:"/>
                    <h:outputText value="#{escale.escale.datePasseSortie}" title="DatePasseSortie" />
                    <h:outputText value="HeurePasseSortie:"/>
                    <h:outputText value="#{escale.escale.heurePasseSortie}" title="HeurePasseSortie" />
                    <h:outputText value="DateArriveeRade:"/>
                    <h:outputText value="#{escale.escale.dateArriveeRade}" title="DateArriveeRade" />
                    <h:outputText value="HeureArriveeRade:"/>
                    <h:outputText value="#{escale.escale.heureArriveeRade}" title="HeureArriveeRade" />
                    <h:outputText value="ResponsableShipping:"/>
                    <h:outputText value="#{escale.escale.responsableShipping}" title="ResponsableShipping" />
                    <h:outputText value="ChefEscale:"/>
                    <h:outputText value="#{escale.escale.chefEscale}" title="ChefEscale" />
                    <h:outputText value="TelAgent:"/>
                    <h:outputText value="#{escale.escale.telAgent}" title="TelAgent" />
                    <h:outputText value="TelResponsableShipping:"/>
                    <h:outputText value="#{escale.escale.telResponsableShipping}" title="TelResponsableShipping" />
                    <h:outputText value="TelChefEscale:"/>
                    <h:outputText value="#{escale.escale.telChefEscale}" title="TelChefEscale" />
                    <h:outputText value="ArriveeRade:"/>
                    <h:outputText value="#{escale.escale.arriveeRade}" title="ArriveeRade" />
                    <h:outputText value="ArrHRade:"/>
                    <h:outputText value="#{escale.escale.arrHRade}" title="ArrHRade" />
                    <h:outputText value="DepartEffectif:"/>
                    <h:outputText value="#{escale.escale.departEffectif}" title="DepartEffectif" />
                    <h:outputText value="DepHEffectif:"/>
                    <h:outputText value="#{escale.escale.depHEffectif}" title="DepHEffectif" />
                    <h:outputText value="MouillDepart:"/>
                    <h:outputText value="#{escale.escale.mouillDepart}" title="MouillDepart" />
                    <h:outputText value="MouillhDepart:"/>
                    <h:outputText value="#{escale.escale.mouillhDepart}" title="MouillhDepart" />
                    <h:outputText value="AgentSortie:"/>
                    <h:outputText value="#{escale.escale.agentSortie}" title="AgentSortie" />
                    <h:outputText value="TelephoneAgentSortie:"/>
                    <h:outputText value="#{escale.escale.telephoneAgentSortie}" title="TelephoneAgentSortie" />
                    <h:outputText value="OkApparaux:"/>
                    <h:outputText value="#{escale.escale.okApparaux}" title="OkApparaux" />
                    <h:outputText value="OkAssurance:"/>
                    <h:outputText value="#{escale.escale.okAssurance}" title="OkAssurance" />
                    <h:outputText value="OkDeclaration:"/>
                    <h:outputText value="#{escale.escale.okDeclaration}" title="OkDeclaration" />
                    <h:outputText value="FreeGaz:"/>
                    <h:outputText value="#{escale.escale.freeGaz}" title="FreeGaz" />
                    <h:outputText value="Reparation:"/>
                    <h:outputText value="#{escale.escale.reparation}" title="Reparation" />
                    <h:outputText value="Controle:"/>
                    <h:outputText value="#{escale.escale.controle}" title="Controle" />
                    <h:outputText value="Avaries:"/>
                    <h:outputText value="#{escale.escale.avaries}" title="Avaries" />
                    <h:outputText value="ManutentionnaireSortie:"/>
                    <h:outputText value="#{escale.escale.manutentionnaireSortie}" title="ManutentionnaireSortie" />
                    <h:outputText value="DateStatut:"/>
                    <h:outputText value="#{escale.escale.dateStatut}" title="DateStatut" />
                    <h:outputText value="HeureStatut:"/>
                    <h:outputText value="#{escale.escale.heureStatut}" title="HeureStatut" />
                    <h:outputText value="MobileChefEscale:"/>
                    <h:outputText value="#{escale.escale.mobileChefEscale}" title="MobileChefEscale" />
                    <h:outputText value="MobileResponsableShipping:"/>
                    <h:outputText value="#{escale.escale.mobileResponsableShipping}" title="MobileResponsableShipping" />
                    <h:outputText value="Quai2:"/>
                    <h:outputText value="#{escale.escale.quai2}" title="Quai2" />
                    <h:outputText value="Quai3:"/>
                    <h:outputText value="#{escale.escale.quai3}" title="Quai3" />
                    <h:outputText value="DateModifEta:"/>
                    <h:outputText value="#{escale.escale.dateModifEta}" title="DateModifEta" />
                    <h:outputText value="HeureModifEta:"/>
                    <h:outputText value="#{escale.escale.heureModifEta}" title="HeureModifEta" />
                    <h:outputText value="DateAppelVigie:"/>
                    <h:outputText value="#{escale.escale.dateAppelVigie}" title="DateAppelVigie" />
                    <h:outputText value="HeureAppelVigie:"/>
                    <h:outputText value="#{escale.escale.heureAppelVigie}" title="HeureAppelVigie" />
                    <h:outputText value="ControleurVigie:"/>
                    <h:outputText value="#{escale.escale.controleurVigie}" title="ControleurVigie" />
                    <h:outputText value="SaisieNavire:"/>
                    <h:outputText value="#{escale.escale.saisieNavire}" title="SaisieNavire" />
                    <h:outputText value="DateModifEtd:"/>
                    <h:outputText value="#{escale.escale.dateModifEtd}" title="DateModifEtd" />
                    <h:outputText value="HeureModifEtd:"/>
                    <h:outputText value="#{escale.escale.heureModifEtd}" title="HeureModifEtd" />
                    <h:outputText value="Bassin:"/>
                    <h:outputText value="#{escale.escale.bassin}" title="Bassin" />
                    <h:outputText value="DateFeux:"/>
                    <h:outputText value="#{escale.escale.dateFeux}" title="DateFeux" />
                    <h:outputText value="HeureFeux:"/>
                    <h:outputText value="#{escale.escale.heureFeux}" title="HeureFeux" />
                    <h:outputText value="DateFeuxSortie:"/>
                    <h:outputText value="#{escale.escale.dateFeuxSortie}" title="DateFeuxSortie" />
                    <h:outputText value="HeureFeuxSortie:"/>
                    <h:outputText value="#{escale.escale.heureFeuxSortie}" title="HeureFeuxSortie" />
                    <h:outputText value="Position:"/>
                    <h:outputText value="#{escale.escale.position}" title="Position" />
                    <h:outputText value="EtaNavire:"/>
                    <h:outputText value="#{escale.escale.etaNavire}" title="EtaNavire" />
                    <h:outputText value="HEtaNavire:"/>
                    <h:outputText value="#{escale.escale.HEtaNavire}" title="HEtaNavire" />
                    <h:outputText value="ModifEtaNavire:"/>
                    <h:outputText value="#{escale.escale.modifEtaNavire}" title="ModifEtaNavire" />
                    <h:outputText value="ModifHEtaNavire:"/>
                    <h:outputText value="#{escale.escale.modifHEtaNavire}" title="ModifHEtaNavire" />
                    <h:outputText value="UtilisatEtaNavire:"/>
                    <h:outputText value="#{escale.escale.utilisatEtaNavire}" title="UtilisatEtaNavire" />
                    <h:outputText value="TeauArEntree:"/>
                    <h:outputText value="#{escale.escale.teauArEntree}" title="TeauArEntree" />
                    <h:outputText value="TeauArSortie:"/>
                    <h:outputText value="#{escale.escale.teauArSortie}" title="TeauArSortie" />
                    <h:outputText value="OkAgentSortie:"/>
                    <h:outputText value="#{escale.escale.okAgentSortie}" title="OkAgentSortie" />
                    <h:outputText value="OkCapitaineSortie:"/>
                    <h:outputText value="#{escale.escale.okCapitaineSortie}" title="OkCapitaineSortie" />
                    <h:outputText value="DateAgentSortie:"/>
                    <h:outputText value="#{escale.escale.dateAgentSortie}" title="DateAgentSortie" />
                    <h:outputText value="HeureAgentSortie:"/>
                    <h:outputText value="#{escale.escale.heureAgentSortie}" title="HeureAgentSortie" />
                    <h:outputText value="DateCapitaineSortie:"/>
                    <h:outputText value="#{escale.escale.dateCapitaineSortie}" title="DateCapitaineSortie" />
                    <h:outputText value="HeureCapitaineSortie:"/>
                    <h:outputText value="#{escale.escale.heureCapitaineSortie}" title="HeureCapitaineSortie" />
                    <h:outputText value="EMail:"/>
                    <h:outputText value="#{escale.escale.EMail}" title="EMail" />
                    <h:outputText value="LongitudeRade:"/>
                    <h:outputText value="#{escale.escale.longitudeRade}" title="LongitudeRade" />
                    <h:outputText value="LatitudeRade:"/>
                    <h:outputText value="#{escale.escale.latitudeRade}" title="LatitudeRade" />
                    <h:outputText value="NumeroVetting:"/>
                    <h:outputText value="#{escale.escale.numeroVetting}" title="NumeroVetting" />
                    <h:outputText value="TypeManutention:"/>
                    <h:outputText value="#{escale.escale.typeManutention}" title="TypeManutention" />
                    <h:outputText value="TonnageDeb:"/>
                    <h:outputText value="#{escale.escale.tonnageDeb}" title="TonnageDeb" />
                    <h:outputText value="TonnageEmb:"/>
                    <h:outputText value="#{escale.escale.tonnageEmb}" title="TonnageEmb" />
                    <h:outputText value="PiloteEntree:"/>
                    <h:outputText value="#{escale.escale.piloteEntree}" title="PiloteEntree" />
                    <h:outputText value="PiloteSortie:"/>
                    <h:outputText value="#{escale.escale.piloteSortie}" title="PiloteSortie" />
                    <h:outputText value="DateAppelVigieSortie:"/>
                    <h:outputText value="#{escale.escale.dateAppelVigieSortie}" title="DateAppelVigieSortie" />
                    <h:outputText value="HeureAppelVigieSortie:"/>
                    <h:outputText value="#{escale.escale.heureAppelVigieSortie}" title="HeureAppelVigieSortie" />
                    <h:outputText value="DDebPilote:"/>
                    <h:outputText value="#{escale.escale.DDebPilote}" title="DDebPilote" />
                    <h:outputText value="HDebPilote:"/>
                    <h:outputText value="#{escale.escale.HDebPilote}" title="HDebPilote" />
                    <h:outputText value="DEmbPilote:"/>
                    <h:outputText value="#{escale.escale.DEmbPilote}" title="DEmbPilote" />
                    <h:outputText value="HEmbPilote:"/>
                    <h:outputText value="#{escale.escale.HEmbPilote}" title="HEmbPilote" />
                    <h:outputText value="DateProgrammation:"/>
                    <h:outputText value="#{escale.escale.dateProgrammation}" title="DateProgrammation" />
                    <h:outputText value="HeureProgrammation:"/>
                    <h:outputText value="#{escale.escale.heureProgrammation}" title="HeureProgrammation" />
                    <h:outputText value="DureeProgrammation:"/>
                    <h:outputText value="#{escale.escale.dureeProgrammation}" title="DureeProgrammation" />
                    <h:outputText value="StatutConferenceEntree:"/>
                    <h:outputText value="#{escale.escale.statutConferenceEntree}" title="StatutConferenceEntree" />
                    <h:outputText value="DateConferenceEntree:"/>
                    <h:outputText value="#{escale.escale.dateConferenceEntree}" title="DateConferenceEntree" />
                    <h:outputText value="HeureConferenceEntree:"/>
                    <h:outputText value="#{escale.escale.heureConferenceEntree}" title="HeureConferenceEntree" />
                    <h:outputText value="StatutConferenceSortie:"/>
                    <h:outputText value="#{escale.escale.statutConferenceSortie}" title="StatutConferenceSortie" />
                    <h:outputText value="DateConferenceSortie:"/>
                    <h:outputText value="#{escale.escale.dateConferenceSortie}" title="DateConferenceSortie" />
                    <h:outputText value="HeureConferenceSortie:"/>
                    <h:outputText value="#{escale.escale.heureConferenceSortie}" title="HeureConferenceSortie" />
                    <h:outputText value="TonnageDebDeclare:"/>
                    <h:outputText value="#{escale.escale.tonnageDebDeclare}" title="TonnageDebDeclare" />
                    <h:outputText value="TonnageEmbDeclare:"/>
                    <h:outputText value="#{escale.escale.tonnageEmbDeclare}" title="TonnageEmbDeclare" />
                    <h:outputText value="NbreBl:"/>
                    <h:outputText value="#{escale.escale.nbreBl}" title="NbreBl" />
                    <h:outputText value="TonnageFPilotageImport:"/>
                    <h:outputText value="#{escale.escale.tonnageFPilotageImport}" title="TonnageFPilotageImport" />
                    <h:outputText value="TonnageFPilotageExport:"/>
                    <h:outputText value="#{escale.escale.tonnageFPilotageExport}" title="TonnageFPilotageExport" />
                    <h:outputText value="TonnageFPilotageTotal:"/>
                    <h:outputText value="#{escale.escale.tonnageFPilotageTotal}" title="TonnageFPilotageTotal" />
                    <h:outputText value="TonnageMaxFacture:"/>
                    <h:outputText value="#{escale.escale.tonnageMaxFacture}" title="TonnageMaxFacture" />
                    <h:outputText value="NumEscCt:"/>
                    <h:outputText value="#{escale.escale.numEscCt}" title="NumEscCt" />
                    <h:outputText value="OkDepotManifesteEntree:"/>
                    <h:outputText value="#{escale.escale.okDepotManifesteEntree}" title="OkDepotManifesteEntree" />
                    <h:outputText value="DateDepotManifesteEntree:"/>
                    <h:outputText value="#{escale.escale.dateDepotManifesteEntree}" title="DateDepotManifesteEntree" />
                    <h:outputText value="HeureDepotManifesteEntree:"/>
                    <h:outputText value="#{escale.escale.heureDepotManifesteEntree}" title="HeureDepotManifesteEntree" />
                    <h:outputText value="OkDepotManifesteSortie:"/>
                    <h:outputText value="#{escale.escale.okDepotManifesteSortie}" title="OkDepotManifesteSortie" />
                    <h:outputText value="DateDepotManifesteSortie:"/>
                    <h:outputText value="#{escale.escale.dateDepotManifesteSortie}" title="DateDepotManifesteSortie" />
                    <h:outputText value="HeureDepotManifesteSortie:"/>
                    <h:outputText value="#{escale.escale.heureDepotManifesteSortie}" title="HeureDepotManifesteSortie" />
                    <h:outputText value="NombreConteneur20Import:"/>
                    <h:outputText value="#{escale.escale.nombreConteneur20Import}" title="NombreConteneur20Import" />
                    <h:outputText value="NombreConteneur40Import:"/>
                    <h:outputText value="#{escale.escale.nombreConteneur40Import}" title="NombreConteneur40Import" />
                    <h:outputText value="NombreConteneur20Export:"/>
                    <h:outputText value="#{escale.escale.nombreConteneur20Export}" title="NombreConteneur20Export" />
                    <h:outputText value="NombreConteneur40Export:"/>
                    <h:outputText value="#{escale.escale.nombreConteneur40Export}" title="NombreConteneur40Export" />
                    <h:outputText value="NombreConteneur20Transbi:"/>
                    <h:outputText value="#{escale.escale.nombreConteneur20Transbi}" title="NombreConteneur20Transbi" />
                    <h:outputText value="NombreConteneur40Transbi:"/>
                    <h:outputText value="#{escale.escale.nombreConteneur40Transbi}" title="NombreConteneur40Transbi" />
                    <h:outputText value="NombreConteneur20Transbe:"/>
                    <h:outputText value="#{escale.escale.nombreConteneur20Transbe}" title="NombreConteneur20Transbe" />
                    <h:outputText value="NombreConteneur40Transbe:"/>
                    <h:outputText value="#{escale.escale.nombreConteneur40Transbe}" title="NombreConteneur40Transbe" />
                    <h:outputText value="TopTdr:"/>
                    <h:outputText value="#{escale.escale.topTdr}" title="TopTdr" />
                    <h:outputText value="TopTdrDate:"/>
                    <h:outputText value="#{escale.escale.topTdrDate}" title="TopTdrDate" />
                    <h:outputText value="TopTdrHeure:"/>
                    <h:outputText value="#{escale.escale.topTdrHeure}" title="TopTdrHeure" />
                    <h:outputText value="TopTimesheet:"/>
                    <h:outputText value="#{escale.escale.topTimesheet}" title="TopTimesheet" />
                    <h:outputText value="TopTimesheetDate:"/>
                    <h:outputText value="#{escale.escale.topTimesheetDate}" title="TopTimesheetDate" />
                    <h:outputText value="TopTimesheetHeure:"/>
                    <h:outputText value="#{escale.escale.topTimesheetHeure}" title="TopTimesheetHeure" />
                    <h:outputText value="TopTdrMensuel:"/>
                    <h:outputText value="#{escale.escale.topTdrMensuel}" title="TopTdrMensuel" />
                    <h:outputText value="TopTdrMensuelDate:"/>
                    <h:outputText value="#{escale.escale.topTdrMensuelDate}" title="TopTdrMensuelDate" />
                    <h:outputText value="TopTdrMensuelHeure:"/>
                    <h:outputText value="#{escale.escale.topTdrMensuelHeure}" title="TopTdrMensuelHeure" />
                    <h:outputText value="DateMatrice:"/>
                    <h:outputText value="#{escale.escale.dateMatrice}" title="DateMatrice" />
                    <h:outputText value="DateBrouillard:"/>
                    <h:outputText value="#{escale.escale.dateBrouillard}" title="DateBrouillard" />
                    <h:outputText value="DateFacture:"/>
                    <h:outputText value="#{escale.escale.dateFacture}" title="DateFacture" />
                    <h:outputText value="DateValidationTimesheet:"/>
                    <h:outputText value="#{escale.escale.dateValidationTimesheet}" title="DateValidationTimesheet" />
                    <h:outputText value="UtilisatValidationTimesheet:"/>
                    <h:outputText value="#{escale.escale.utilisatValidationTimesheet}" title="UtilisatValidationTimesheet" />
                    <h:outputText value="UtilisatMatrice:"/>
                    <h:outputText value="#{escale.escale.utilisatMatrice}" title="UtilisatMatrice" />
                    <h:outputText value="UtilisatBrouillard:"/>
                    <h:outputText value="#{escale.escale.utilisatBrouillard}" title="UtilisatBrouillard" />
                    <h:outputText value="UtilisatFacture:"/>
                    <h:outputText value="#{escale.escale.utilisatFacture}" title="UtilisatFacture" />
                    <h:outputText value="DateEscaleInitiale:"/>
                    <h:outputText value="#{escale.escale.dateEscaleInitiale}" title="DateEscaleInitiale" />
                    <h:outputText value="Nacleunik:"/>
                    <h:panelGroup>
                        <h:outputText value="#{escale.escale.nacleunik}"/>
                        <h:panelGroup rendered="#{escale.escale.nacleunik != null}">
                            <h:outputText value=" ("/>
                            <h:commandLink value="Show" action="#{navire.detailSetup}">
                                <f:param name="jsfcrud.currentEscale" value="#{jsfcrud_class['com.github.adminfaces.starter.bean.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][escale.escale][escale.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.currentNavire" value="#{jsfcrud_class['com.github.adminfaces.starter.bean.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][escale.escale.nacleunik][navire.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.relatedController" value="escale"/>
                                <f:param name="jsfcrud.relatedControllerType" value="com.github.adminfaces.starter.bean.EscaleController"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Edit" action="#{navire.editSetup}">
                                <f:param name="jsfcrud.currentEscale" value="#{jsfcrud_class['com.github.adminfaces.starter.bean.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][escale.escale][escale.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.currentNavire" value="#{jsfcrud_class['com.github.adminfaces.starter.bean.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][escale.escale.nacleunik][navire.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.relatedController" value="escale"/>
                                <f:param name="jsfcrud.relatedControllerType" value="com.github.adminfaces.starter.bean.EscaleController"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Destroy" action="#{navire.destroy}">
                                <f:param name="jsfcrud.currentEscale" value="#{jsfcrud_class['com.github.adminfaces.starter.bean.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][escale.escale][escale.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.currentNavire" value="#{jsfcrud_class['com.github.adminfaces.starter.bean.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][escale.escale.nacleunik][navire.converter].jsfcrud_invoke}"/>
                                <f:param name="jsfcrud.relatedController" value="escale"/>
                                <f:param name="jsfcrud.relatedControllerType" value="com.github.adminfaces.starter.bean.EscaleController"/>
                            </h:commandLink>
                            <h:outputText value=" )"/>
                        </h:panelGroup>
                    </h:panelGroup>
                    <h:outputText value="Id:"/>
                    <h:outputText value="#{escale.escale.id}" title="Id" />

                    <h:outputText value="GeneralInfoCollection:" />
                    <h:panelGroup>
                        <h:outputText rendered="#{empty escale.escale.generalInfoCollection}" value="(No Items)"/>
                        <h:dataTable value="#{escale.escale.generalInfoCollection}" var="item" 
                                     border="0" cellpadding="2" cellspacing="0" rowClasses="jsfcrud_odd_row,jsfcrud_even_row" rules="all" style="border:solid 1px" 
                                     rendered="#{not empty escale.escale.generalInfoCollection}">
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText value="Id"/>
                                </f:facet>
                                <h:outputText value="#{item.id}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText value="CarrierAddress"/>
                                </f:facet>
                                <h:outputText value="#{item.carrierAddress}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText value="CarrierCode"/>
                                </f:facet>
                                <h:outputText value="#{item.carrierCode}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText value="CarrierName"/>
                                </f:facet>
                                <h:outputText value="#{item.carrierName}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText value="CustomsOfficeCode"/>
                                </f:facet>
                                <h:outputText value="#{item.customsOfficeCode}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText value="DateArrival"/>
                                </f:facet>
                                <h:outputText value="#{item.dateArrival}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText value="DateDeparture"/>
                                </f:facet>
                                <h:outputText value="#{item.dateDeparture}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText value="DateLastDischarge"/>
                                </f:facet>
                                <h:outputText value="#{item.dateLastDischarge}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText value="DateOfRegistration"/>
                                </f:facet>
                                <h:outputText value="#{item.dateOfRegistration}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText value="IdentityTransporter"/>
                                </f:facet>
                                <h:outputText value="#{item.identityTransporter}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText value="MasterInformation"/>
                                </f:facet>
                                <h:outputText value="#{item.masterInformation}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText value="ModeTransport"/>
                                </f:facet>
                                <h:outputText value="#{item.modeTransport}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText value="NationalityTransporter"/>
                                </f:facet>
                                <h:outputText value="#{item.nationalityTransporter}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText value="NumeroEscale"/>
                                </f:facet>
                                <h:outputText value="#{item.numeroEscale}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText value="PlaceOfDepartureCode"/>
                                </f:facet>
                                <h:outputText value="#{item.placeOfDepartureCode}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText value="PlaceOfDestinationCode"/>
                                </f:facet>
                                <h:outputText value="#{item.placeOfDestinationCode}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText value="PlaceOfTransporter"/>
                                </f:facet>
                                <h:outputText value="#{item.placeOfTransporter}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText value="RegistrationNumber"/>
                                </f:facet>
                                <h:outputText value="#{item.registrationNumber}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText value="ShippingAgentCode"/>
                                </f:facet>
                                <h:outputText value="#{item.shippingAgentCode}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText value="ShippingAgentName"/>
                                </f:facet>
                                <h:outputText value="#{item.shippingAgentName}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText value="TimeArrival"/>
                                </f:facet>
                                <h:outputText value="#{item.timeArrival}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText value="TonnageGrossWeight"/>
                                </f:facet>
                                <h:outputText value="#{item.tonnageGrossWeight}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText value="TonnageNetWeight"/>
                                </f:facet>
                                <h:outputText value="#{item.tonnageNetWeight}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText value="TotalNumberOfBols"/>
                                </f:facet>
                                <h:outputText value="#{item.totalNumberOfBols}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText value="TotalGrossMass"/>
                                </f:facet>
                                <h:outputText value="#{item.totalGrossMass}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText value="TotalNumberOfContainers"/>
                                </f:facet>
                                <h:outputText value="#{item.totalNumberOfContainers}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText value="TotalNumberOfPackages"/>
                                </f:facet>
                                <h:outputText value="#{item.totalNumberOfPackages}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText value="VoyageNumber"/>
                                </f:facet>
                                <h:outputText value="#{item.voyageNumber}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText value="IdEscale"/>
                                </f:facet>
                                <h:outputText value="#{item.idEscale}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText escape="false" value="&nbsp;"/>
                                </f:facet>
                                <h:commandLink value="Show" action="#{generalInfo.detailSetup}">
                                    <f:param name="jsfcrud.currentEscale" value="#{jsfcrud_class['com.github.adminfaces.starter.bean.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][escale.escale][escale.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.currentGeneralInfo" value="#{jsfcrud_class['com.github.adminfaces.starter.bean.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][generalInfo.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.relatedController" value="escale" />
                                    <f:param name="jsfcrud.relatedControllerType" value="com.github.adminfaces.starter.bean.EscaleController" />
                                </h:commandLink>
                                <h:outputText value=" "/>
                                <h:commandLink value="Edit" action="#{generalInfo.editSetup}">
                                    <f:param name="jsfcrud.currentEscale" value="#{jsfcrud_class['com.github.adminfaces.starter.bean.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][escale.escale][escale.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.currentGeneralInfo" value="#{jsfcrud_class['com.github.adminfaces.starter.bean.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][generalInfo.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.relatedController" value="escale" />
                                    <f:param name="jsfcrud.relatedControllerType" value="com.github.adminfaces.starter.bean.EscaleController" />
                                </h:commandLink>
                                <h:outputText value=" "/>
                                <h:commandLink value="Destroy" action="#{generalInfo.destroy}">
                                    <f:param name="jsfcrud.currentEscale" value="#{jsfcrud_class['com.github.adminfaces.starter.bean.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][escale.escale][escale.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.currentGeneralInfo" value="#{jsfcrud_class['com.github.adminfaces.starter.bean.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][generalInfo.converter].jsfcrud_invoke}"/>
                                    <f:param name="jsfcrud.relatedController" value="escale" />
                                    <f:param name="jsfcrud.relatedControllerType" value="com.github.adminfaces.starter.bean.EscaleController" />
                                </h:commandLink>
                            </h:column>
                        </h:dataTable>
                    </h:panelGroup>

                </h:panelGrid>
                <br />
                <h:commandLink action="#{escale.remove}" value="Destroy">
                    <f:param name="jsfcrud.currentEscale" value="#{jsfcrud_class['com.github.adminfaces.starter.bean.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][escale.escale][escale.converter].jsfcrud_invoke}" />
                </h:commandLink>
                <br />
                <br />
                <h:commandLink action="#{escale.editSetup}" value="Edit">
                    <f:param name="jsfcrud.currentEscale" value="#{jsfcrud_class['com.github.adminfaces.starter.bean.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][escale.escale][escale.converter].jsfcrud_invoke}" />
                </h:commandLink>
                <br />
                <h:commandLink action="#{escale.createSetup}" value="New Escale" />
                <br />
                <h:commandLink action="#{escale.listSetup}" value="Show All Escale Items"/>
                <br />

            </h:form>
        </body>
    </html>
</f:view>
