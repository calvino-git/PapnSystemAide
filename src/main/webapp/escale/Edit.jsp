<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <title>Editing Escale</title>
            <link rel="stylesheet" type="text/css" href="/sysaide/jsfcrud.xhtml" />
        </head>
        <body>
            <h:panelGroup id="messagePanel" layout="block">
                <h:messages errorStyle="color: red" infoStyle="color: green" layout="table"/>
            </h:panelGroup>
            <h1>Editing Escale</h1>
            <h:form>
                <h:panelGrid columns="2">
                    <h:outputText value="Escleunik:"/>
                    <h:outputText value="#{escale.escale.escleunik}" title="Escleunik" />
                    <h:outputText value="Numero:"/>
                    <h:inputText id="numero" value="#{escale.escale.numero}" title="Numero" />
                    <h:outputText value="Agent:"/>
                    <h:inputText id="agent" value="#{escale.escale.agent}" title="Agent" />
                    <h:outputText value="Manuten:"/>
                    <h:inputText id="manuten" value="#{escale.escale.manuten}" title="Manuten" />
                    <h:outputText value="Filiere:"/>
                    <h:inputText id="filiere" value="#{escale.escale.filiere}" title="Filiere" />
                    <h:outputText value="Radio:"/>
                    <h:inputText id="radio" value="#{escale.escale.radio}" title="Radio" />
                    <h:outputText value="Service:"/>
                    <h:inputText id="service" value="#{escale.escale.service}" title="Service" />
                    <h:outputText value="Identite:"/>
                    <h:inputText id="identite" value="#{escale.escale.identite}" title="Identite" />
                    <h:outputText value="Ligne:"/>
                    <h:inputText id="ligne" value="#{escale.escale.ligne}" title="Ligne" />
                    <h:outputText value="MoisStat:"/>
                    <h:inputText id="moisStat" value="#{escale.escale.moisStat}" title="MoisStat" />
                    <h:outputText value="Capitaine:"/>
                    <h:inputText id="capitaine" value="#{escale.escale.capitaine}" title="Capitaine" />
                    <h:outputText value="Construc:"/>
                    <h:inputText id="construc" value="#{escale.escale.construc}" title="Construc" />
                    <h:outputText value="Objet:"/>
                    <h:inputText id="objet" value="#{escale.escale.objet}" title="Objet" />
                    <h:outputText value="Etat:"/>
                    <h:inputText id="etat" value="#{escale.escale.etat}" title="Etat" />
                    <h:outputText value="Nombre:"/>
                    <h:inputText id="nombre" value="#{escale.escale.nombre}" title="Nombre" />
                    <h:outputText value="NbAtt:"/>
                    <h:inputText id="nbAtt" value="#{escale.escale.nbAtt}" title="NbAtt" />
                    <h:outputText value="Sejour:"/>
                    <h:inputText id="sejour" value="#{escale.escale.sejour}" title="Sejour" />
                    <h:outputText value="Duree:"/>
                    <h:inputText id="duree" value="#{escale.escale.duree}" title="Duree" />
                    <h:outputText value="Travail:"/>
                    <h:inputText id="travail" value="#{escale.escale.travail}" title="Travail" />
                    <h:outputText value="Situat:"/>
                    <h:inputText id="situat" value="#{escale.escale.situat}" title="Situat" />
                    <h:outputText value="Arrivee:"/>
                    <h:inputText id="arrivee" value="#{escale.escale.arrivee}" title="Arrivee" />
                    <h:outputText value="ArrH:"/>
                    <h:inputText id="arrH" value="#{escale.escale.arrH}" title="ArrH" />
                    <h:outputText value="Mouill:"/>
                    <h:inputText id="mouill" value="#{escale.escale.mouill}" title="Mouill" />
                    <h:outputText value="Mouillh:"/>
                    <h:inputText id="mouillh" value="#{escale.escale.mouillh}" title="Mouillh" />
                    <h:outputText value="PilEnt:"/>
                    <h:inputText id="pilEnt" value="#{escale.escale.pilEnt}" title="PilEnt" />
                    <h:outputText value="PilEnth:"/>
                    <h:inputText id="pilEnth" value="#{escale.escale.pilEnth}" title="PilEnth" />
                    <h:outputText value="RemE:"/>
                    <h:inputText id="remE" value="#{escale.escale.remE}" title="RemE" />
                    <h:outputText value="Debut:"/>
                    <h:inputText id="debut" value="#{escale.escale.debut}" title="Debut" />
                    <h:outputText value="DebH:"/>
                    <h:inputText id="debH" value="#{escale.escale.debH}" title="DebH" />
                    <h:outputText value="DebOpe:"/>
                    <h:inputText id="debOpe" value="#{escale.escale.debOpe}" title="DebOpe" />
                    <h:outputText value="DebOpeh:"/>
                    <h:inputText id="debOpeh" value="#{escale.escale.debOpeh}" title="DebOpeh" />
                    <h:outputText value="AttAr:"/>
                    <h:inputText id="attAr" value="#{escale.escale.attAr}" title="AttAr" />
                    <h:outputText value="MotAr:"/>
                    <h:inputText id="motAr" value="#{escale.escale.motAr}" title="MotAr" />
                    <h:outputText value="CondAr:"/>
                    <h:inputText id="condAr" value="#{escale.escale.condAr}" title="CondAr" />
                    <h:outputText value="PortAttac:"/>
                    <h:inputText id="portAttac" value="#{escale.escale.portAttac}" title="PortAttac" />
                    <h:outputText value="RemS:"/>
                    <h:inputText id="remS" value="#{escale.escale.remS}" title="RemS" />
                    <h:outputText value="FinOpe:"/>
                    <h:inputText id="finOpe" value="#{escale.escale.finOpe}" title="FinOpe" />
                    <h:outputText value="FinOpeh:"/>
                    <h:inputText id="finOpeh" value="#{escale.escale.finOpeh}" title="FinOpeh" />
                    <h:outputText value="PilSor:"/>
                    <h:inputText id="pilSor" value="#{escale.escale.pilSor}" title="PilSor" />
                    <h:outputText value="PilSorh:"/>
                    <h:inputText id="pilSorh" value="#{escale.escale.pilSorh}" title="PilSorh" />
                    <h:outputText value="Depart:"/>
                    <h:inputText id="depart" value="#{escale.escale.depart}" title="Depart" />
                    <h:outputText value="DepH:"/>
                    <h:inputText id="depH" value="#{escale.escale.depH}" title="DepH" />
                    <h:outputText value="Fin:"/>
                    <h:inputText id="fin" value="#{escale.escale.fin}" title="Fin" />
                    <h:outputText value="FinH:"/>
                    <h:inputText id="finH" value="#{escale.escale.finH}" title="FinH" />
                    <h:outputText value="AttDp:"/>
                    <h:inputText id="attDp" value="#{escale.escale.attDp}" title="AttDp" />
                    <h:outputText value="MotDp:"/>
                    <h:inputText id="motDp" value="#{escale.escale.motDp}" title="MotDp" />
                    <h:outputText value="CondDp:"/>
                    <h:inputText id="condDp" value="#{escale.escale.condDp}" title="CondDp" />
                    <h:outputText value="FoBrd:"/>
                    <h:inputText id="foBrd" value="#{escale.escale.foBrd}" title="FoBrd" />
                    <h:outputText value="DoBrd:"/>
                    <h:inputText id="doBrd" value="#{escale.escale.doBrd}" title="DoBrd" />
                    <h:outputText value="FoStg:"/>
                    <h:inputText id="foStg" value="#{escale.escale.foStg}" title="FoStg" />
                    <h:outputText value="DoStg:"/>
                    <h:inputText id="doStg" value="#{escale.escale.doStg}" title="DoStg" />
                    <h:outputText value="Eau:"/>
                    <h:inputText id="eau" value="#{escale.escale.eau}" title="Eau" />
                    <h:outputText value="Activite:"/>
                    <h:inputText id="activite" value="#{escale.escale.activite}" title="Activite" />
                    <h:outputText value="Person:"/>
                    <h:inputText id="person" value="#{escale.escale.person}" title="Person" />
                    <h:outputText value="Traite:"/>
                    <h:inputText id="traite" value="#{escale.escale.traite}" title="Traite" />
                    <h:outputText value="Quai:"/>
                    <h:inputText id="quai" value="#{escale.escale.quai}" title="Quai" />
                    <h:outputText value="Tonnage:"/>
                    <h:inputText id="tonnage" value="#{escale.escale.tonnage}" title="Tonnage" />
                    <h:outputText value="FDate:"/>
                    <h:inputText id="FDate" value="#{escale.escale.FDate}" title="FDate" />
                    <h:outputText value="FHeure:"/>
                    <h:inputText id="FHeure" value="#{escale.escale.FHeure}" title="FHeure" />
                    <h:outputText value="NFact:"/>
                    <h:inputText id="NFact" value="#{escale.escale.NFact}" title="NFact" />
                    <h:outputText value="FEche:"/>
                    <h:inputText id="FEche" value="#{escale.escale.FEche}" title="FEche" />
                    <h:outputText value="NbrTcs:"/>
                    <h:inputText id="nbrTcs" value="#{escale.escale.nbrTcs}" title="NbrTcs" />
                    <h:outputText value="NbrVeh:"/>
                    <h:inputText id="nbrVeh" value="#{escale.escale.nbrVeh}" title="NbrVeh" />
                    <h:outputText value="NbrPas:"/>
                    <h:inputText id="nbrPas" value="#{escale.escale.nbrPas}" title="NbrPas" />
                    <h:outputText value="NbrTcst:"/>
                    <h:inputText id="nbrTcst" value="#{escale.escale.nbrTcst}" title="NbrTcst" />
                    <h:outputText value="ChargN:"/>
                    <h:inputText id="chargN" value="#{escale.escale.chargN}" title="ChargN" />
                    <h:outputText value="NbrTcsn:"/>
                    <h:inputText id="nbrTcsn" value="#{escale.escale.nbrTcsn}" title="NbrTcsn" />
                    <h:outputText value="Motif:"/>
                    <h:inputText id="motif" value="#{escale.escale.motif}" title="Motif" />
                    <h:outputText value="NbrSht:"/>
                    <h:inputText id="nbrSht" value="#{escale.escale.nbrSht}" title="NbrSht" />
                    <h:outputText value="Port:"/>
                    <h:inputText id="port" value="#{escale.escale.port}" title="Port" />
                    <h:outputText value="Rendement:"/>
                    <h:inputText id="rendement" value="#{escale.escale.rendement}" title="Rendement" />
                    <h:outputText value="Avarie:"/>
                    <h:inputText id="avarie" value="#{escale.escale.avarie}" title="Avarie" />
                    <h:outputText value="Nature:"/>
                    <h:inputText id="nature" value="#{escale.escale.nature}" title="Nature" />
                    <h:outputText value="Importance:"/>
                    <h:inputText id="importance" value="#{escale.escale.importance}" title="Importance" />
                    <h:outputText value="TopTriton:"/>
                    <h:inputText id="topTriton" value="#{escale.escale.topTriton}" title="TopTriton" />
                    <h:outputText value="TopDanger:"/>
                    <h:inputText id="topDanger" value="#{escale.escale.topDanger}" title="TopDanger" />
                    <h:outputText value="Hauteur:"/>
                    <h:inputText id="hauteur" value="#{escale.escale.hauteur}" title="Hauteur" />
                    <h:outputText value="Largeur:"/>
                    <h:inputText id="largeur" value="#{escale.escale.largeur}" title="Largeur" />
                    <h:outputText value="TopFacAg:"/>
                    <h:inputText id="topFacAg" value="#{escale.escale.topFacAg}" title="TopFacAg" />
                    <h:outputText value="TopFacMn:"/>
                    <h:inputText id="topFacMn" value="#{escale.escale.topFacMn}" title="TopFacMn" />
                    <h:outputText value="THoraire:"/>
                    <h:inputText id="THoraire" value="#{escale.escale.THoraire}" title="THoraire" />
                    <h:outputText value="NbPortique:"/>
                    <h:inputText id="nbPortique" value="#{escale.escale.nbPortique}" title="NbPortique" />
                    <h:outputText value="OkAgent:"/>
                    <h:inputText id="okAgent" value="#{escale.escale.okAgent}" title="OkAgent" />
                    <h:outputText value="OkCapitaine:"/>
                    <h:inputText id="okCapitaine" value="#{escale.escale.okCapitaine}" title="OkCapitaine" />
                    <h:outputText value="OkManutentionnaire:"/>
                    <h:inputText id="okManutentionnaire" value="#{escale.escale.okManutentionnaire}" title="OkManutentionnaire" />
                    <h:outputText value="DateAgent:"/>
                    <h:inputText id="dateAgent" value="#{escale.escale.dateAgent}" title="DateAgent" />
                    <h:outputText value="HeureAgent:"/>
                    <h:inputText id="heureAgent" value="#{escale.escale.heureAgent}" title="HeureAgent" />
                    <h:outputText value="DateCapitaine:"/>
                    <h:inputText id="dateCapitaine" value="#{escale.escale.dateCapitaine}" title="DateCapitaine" />
                    <h:outputText value="HeureCapitaine:"/>
                    <h:inputText id="heureCapitaine" value="#{escale.escale.heureCapitaine}" title="HeureCapitaine" />
                    <h:outputText value="DateManutentionnaire:"/>
                    <h:inputText id="dateManutentionnaire" value="#{escale.escale.dateManutentionnaire}" title="DateManutentionnaire" />
                    <h:outputText value="HeureManutentionnaire:"/>
                    <h:inputText id="heureManutentionnaire" value="#{escale.escale.heureManutentionnaire}" title="HeureManutentionnaire" />
                    <h:outputText value="ProvenanceI:"/>
                    <h:inputText id="provenanceI" value="#{escale.escale.provenanceI}" title="ProvenanceI" />
                    <h:outputText value="ProvenanceO:"/>
                    <h:inputText id="provenanceO" value="#{escale.escale.provenanceO}" title="ProvenanceO" />
                    <h:outputText value="DestinationI:"/>
                    <h:inputText id="destinationI" value="#{escale.escale.destinationI}" title="DestinationI" />
                    <h:outputText value="DestinationF:"/>
                    <h:inputText id="destinationF" value="#{escale.escale.destinationF}" title="DestinationF" />
                    <h:outputText value="Navire:"/>
                    <h:inputText id="navire" value="#{escale.escale.navire}" title="Navire" />
                    <h:outputText value="DDemande:"/>
                    <h:inputText id="DDemande" value="#{escale.escale.DDemande}" title="DDemande" />
                    <h:outputText value="HDemande:"/>
                    <h:inputText id="HDemande" value="#{escale.escale.HDemande}" title="HDemande" />
                    <h:outputText value="Referenc:"/>
                    <h:inputText id="referenc" value="#{escale.escale.referenc}" title="Referenc" />
                    <h:outputText value="TotPrimeEq1:"/>
                    <h:inputText id="totPrimeEq1" value="#{escale.escale.totPrimeEq1}" title="TotPrimeEq1" />
                    <h:outputText value="TotPrimeEq2:"/>
                    <h:inputText id="totPrimeEq2" value="#{escale.escale.totPrimeEq2}" title="TotPrimeEq2" />
                    <h:outputText value="Voyage:"/>
                    <h:inputText id="voyage" value="#{escale.escale.voyage}" title="Voyage" />
                    <h:outputText value="NbrHtrb:"/>
                    <h:inputText id="nbrHtrb" value="#{escale.escale.nbrHtrb}" title="NbrHtrb" />
                    <h:outputText value="NbrTrb:"/>
                    <h:inputText id="nbrTrb" value="#{escale.escale.nbrTrb}" title="NbrTrb" />
                    <h:outputText value="NbrNtrb:"/>
                    <h:inputText id="nbrNtrb" value="#{escale.escale.nbrNtrb}" title="NbrNtrb" />
                    <h:outputText value="HrsNdf:"/>
                    <h:inputText id="hrsNdf" value="#{escale.escale.hrsNdf}" title="HrsNdf" />
                    <h:outputText value="HrsNbr:"/>
                    <h:inputText id="hrsNbr" value="#{escale.escale.hrsNbr}" title="HrsNbr" />
                    <h:outputText value="Gestion:"/>
                    <h:inputText id="gestion" value="#{escale.escale.gestion}" title="Gestion" />
                    <h:outputText value="Statut:"/>
                    <h:inputText id="statut" value="#{escale.escale.statut}" title="Statut" />
                    <h:outputText value="Createur:"/>
                    <h:inputText id="createur" value="#{escale.escale.createur}" title="Createur" />
                    <h:outputText value="DCreat:"/>
                    <h:inputText id="DCreat" value="#{escale.escale.DCreat}" title="DCreat" />
                    <h:outputText value="HCreat:"/>
                    <h:inputText id="HCreat" value="#{escale.escale.HCreat}" title="HCreat" />
                    <h:outputText value="Utilisat:"/>
                    <h:inputText id="utilisat" value="#{escale.escale.utilisat}" title="Utilisat" />
                    <h:outputText value="DModif:"/>
                    <h:inputText id="DModif" value="#{escale.escale.DModif}" title="DModif" />
                    <h:outputText value="HModif:"/>
                    <h:inputText id="HModif" value="#{escale.escale.HModif}" title="HModif" />
                    <h:outputText value="Facleunik:"/>
                    <h:inputText id="facleunik" value="#{escale.escale.facleunik}" title="Facleunik" />
                    <h:outputText value="ChargB:"/>
                    <h:inputText id="chargB" value="#{escale.escale.chargB}" title="ChargB" />
                    <h:outputText value="Pavillon:"/>
                    <h:inputText id="pavillon" value="#{escale.escale.pavillon}" title="Pavillon" />
                    <h:outputText value="Armateur:"/>
                    <h:inputText id="armateur" value="#{escale.escale.armateur}" title="Armateur" />
                    <h:outputText value="JaugeNet:"/>
                    <h:inputText id="jaugeNet" value="#{escale.escale.jaugeNet}" title="JaugeNet" />
                    <h:outputText value="RedemU:"/>
                    <h:inputText id="redemU" value="#{escale.escale.redemU}" title="RedemU" />
                    <h:outputText value="ChefPoste:"/>
                    <h:inputText id="chefPoste" value="#{escale.escale.chefPoste}" title="ChefPoste" />
                    <h:outputText value="OkFactNav:"/>
                    <h:inputText id="okFactNav" value="#{escale.escale.okFactNav}" title="OkFactNav" />
                    <h:outputText value="OkFactEqu:"/>
                    <h:inputText id="okFactEqu" value="#{escale.escale.okFactEqu}" title="OkFactEqu" />
                    <h:outputText value="TraiteHier:"/>
                    <h:inputText id="traiteHier" value="#{escale.escale.traiteHier}" title="TraiteHier" />
                    <h:outputText value="DateStat (MM/dd/yyyy HH:mm:ss):"/>
                    <h:inputText id="dateStat" value="#{escale.escale.dateStat}" title="DateStat" >
                        <f:convertDateTime pattern="MM/dd/yyyy HH:mm:ss" />
                    </h:inputText>
                    <h:outputText value="Priorite:"/>
                    <h:inputText id="priorite" value="#{escale.escale.priorite}" title="Priorite" />
                    <h:outputText value="DatePasseEntree:"/>
                    <h:inputText id="datePasseEntree" value="#{escale.escale.datePasseEntree}" title="DatePasseEntree" />
                    <h:outputText value="HeurePasseEntree:"/>
                    <h:inputText id="heurePasseEntree" value="#{escale.escale.heurePasseEntree}" title="HeurePasseEntree" />
                    <h:outputText value="DatePasseSortie:"/>
                    <h:inputText id="datePasseSortie" value="#{escale.escale.datePasseSortie}" title="DatePasseSortie" />
                    <h:outputText value="HeurePasseSortie:"/>
                    <h:inputText id="heurePasseSortie" value="#{escale.escale.heurePasseSortie}" title="HeurePasseSortie" />
                    <h:outputText value="DateArriveeRade:"/>
                    <h:inputText id="dateArriveeRade" value="#{escale.escale.dateArriveeRade}" title="DateArriveeRade" />
                    <h:outputText value="HeureArriveeRade:"/>
                    <h:inputText id="heureArriveeRade" value="#{escale.escale.heureArriveeRade}" title="HeureArriveeRade" />
                    <h:outputText value="ResponsableShipping:"/>
                    <h:inputText id="responsableShipping" value="#{escale.escale.responsableShipping}" title="ResponsableShipping" />
                    <h:outputText value="ChefEscale:"/>
                    <h:inputText id="chefEscale" value="#{escale.escale.chefEscale}" title="ChefEscale" />
                    <h:outputText value="TelAgent:"/>
                    <h:inputText id="telAgent" value="#{escale.escale.telAgent}" title="TelAgent" />
                    <h:outputText value="TelResponsableShipping:"/>
                    <h:inputText id="telResponsableShipping" value="#{escale.escale.telResponsableShipping}" title="TelResponsableShipping" />
                    <h:outputText value="TelChefEscale:"/>
                    <h:inputText id="telChefEscale" value="#{escale.escale.telChefEscale}" title="TelChefEscale" />
                    <h:outputText value="ArriveeRade:"/>
                    <h:inputText id="arriveeRade" value="#{escale.escale.arriveeRade}" title="ArriveeRade" />
                    <h:outputText value="ArrHRade:"/>
                    <h:inputText id="arrHRade" value="#{escale.escale.arrHRade}" title="ArrHRade" />
                    <h:outputText value="DepartEffectif:"/>
                    <h:inputText id="departEffectif" value="#{escale.escale.departEffectif}" title="DepartEffectif" />
                    <h:outputText value="DepHEffectif:"/>
                    <h:inputText id="depHEffectif" value="#{escale.escale.depHEffectif}" title="DepHEffectif" />
                    <h:outputText value="MouillDepart:"/>
                    <h:inputText id="mouillDepart" value="#{escale.escale.mouillDepart}" title="MouillDepart" />
                    <h:outputText value="MouillhDepart:"/>
                    <h:inputText id="mouillhDepart" value="#{escale.escale.mouillhDepart}" title="MouillhDepart" />
                    <h:outputText value="AgentSortie:"/>
                    <h:inputText id="agentSortie" value="#{escale.escale.agentSortie}" title="AgentSortie" />
                    <h:outputText value="TelephoneAgentSortie:"/>
                    <h:inputText id="telephoneAgentSortie" value="#{escale.escale.telephoneAgentSortie}" title="TelephoneAgentSortie" />
                    <h:outputText value="OkApparaux:"/>
                    <h:inputText id="okApparaux" value="#{escale.escale.okApparaux}" title="OkApparaux" />
                    <h:outputText value="OkAssurance:"/>
                    <h:inputText id="okAssurance" value="#{escale.escale.okAssurance}" title="OkAssurance" />
                    <h:outputText value="OkDeclaration:"/>
                    <h:inputText id="okDeclaration" value="#{escale.escale.okDeclaration}" title="OkDeclaration" />
                    <h:outputText value="FreeGaz:"/>
                    <h:inputText id="freeGaz" value="#{escale.escale.freeGaz}" title="FreeGaz" />
                    <h:outputText value="Reparation:"/>
                    <h:inputText id="reparation" value="#{escale.escale.reparation}" title="Reparation" />
                    <h:outputText value="Controle:"/>
                    <h:inputText id="controle" value="#{escale.escale.controle}" title="Controle" />
                    <h:outputText value="Avaries:"/>
                    <h:inputText id="avaries" value="#{escale.escale.avaries}" title="Avaries" />
                    <h:outputText value="ManutentionnaireSortie:"/>
                    <h:inputText id="manutentionnaireSortie" value="#{escale.escale.manutentionnaireSortie}" title="ManutentionnaireSortie" />
                    <h:outputText value="DateStatut:"/>
                    <h:inputText id="dateStatut" value="#{escale.escale.dateStatut}" title="DateStatut" />
                    <h:outputText value="HeureStatut:"/>
                    <h:inputText id="heureStatut" value="#{escale.escale.heureStatut}" title="HeureStatut" />
                    <h:outputText value="MobileChefEscale:"/>
                    <h:inputText id="mobileChefEscale" value="#{escale.escale.mobileChefEscale}" title="MobileChefEscale" />
                    <h:outputText value="MobileResponsableShipping:"/>
                    <h:inputText id="mobileResponsableShipping" value="#{escale.escale.mobileResponsableShipping}" title="MobileResponsableShipping" />
                    <h:outputText value="Quai2:"/>
                    <h:inputText id="quai2" value="#{escale.escale.quai2}" title="Quai2" />
                    <h:outputText value="Quai3:"/>
                    <h:inputText id="quai3" value="#{escale.escale.quai3}" title="Quai3" />
                    <h:outputText value="DateModifEta:"/>
                    <h:inputText id="dateModifEta" value="#{escale.escale.dateModifEta}" title="DateModifEta" />
                    <h:outputText value="HeureModifEta:"/>
                    <h:inputText id="heureModifEta" value="#{escale.escale.heureModifEta}" title="HeureModifEta" />
                    <h:outputText value="DateAppelVigie:"/>
                    <h:inputText id="dateAppelVigie" value="#{escale.escale.dateAppelVigie}" title="DateAppelVigie" />
                    <h:outputText value="HeureAppelVigie:"/>
                    <h:inputText id="heureAppelVigie" value="#{escale.escale.heureAppelVigie}" title="HeureAppelVigie" />
                    <h:outputText value="ControleurVigie:"/>
                    <h:inputText id="controleurVigie" value="#{escale.escale.controleurVigie}" title="ControleurVigie" />
                    <h:outputText value="SaisieNavire:"/>
                    <h:inputText id="saisieNavire" value="#{escale.escale.saisieNavire}" title="SaisieNavire" />
                    <h:outputText value="DateModifEtd:"/>
                    <h:inputText id="dateModifEtd" value="#{escale.escale.dateModifEtd}" title="DateModifEtd" />
                    <h:outputText value="HeureModifEtd:"/>
                    <h:inputText id="heureModifEtd" value="#{escale.escale.heureModifEtd}" title="HeureModifEtd" />
                    <h:outputText value="Bassin:"/>
                    <h:inputText id="bassin" value="#{escale.escale.bassin}" title="Bassin" />
                    <h:outputText value="DateFeux:"/>
                    <h:inputText id="dateFeux" value="#{escale.escale.dateFeux}" title="DateFeux" />
                    <h:outputText value="HeureFeux:"/>
                    <h:inputText id="heureFeux" value="#{escale.escale.heureFeux}" title="HeureFeux" />
                    <h:outputText value="DateFeuxSortie:"/>
                    <h:inputText id="dateFeuxSortie" value="#{escale.escale.dateFeuxSortie}" title="DateFeuxSortie" />
                    <h:outputText value="HeureFeuxSortie:"/>
                    <h:inputText id="heureFeuxSortie" value="#{escale.escale.heureFeuxSortie}" title="HeureFeuxSortie" />
                    <h:outputText value="Position:"/>
                    <h:inputText id="position" value="#{escale.escale.position}" title="Position" />
                    <h:outputText value="EtaNavire:"/>
                    <h:inputText id="etaNavire" value="#{escale.escale.etaNavire}" title="EtaNavire" />
                    <h:outputText value="HEtaNavire:"/>
                    <h:inputText id="HEtaNavire" value="#{escale.escale.HEtaNavire}" title="HEtaNavire" />
                    <h:outputText value="ModifEtaNavire:"/>
                    <h:inputText id="modifEtaNavire" value="#{escale.escale.modifEtaNavire}" title="ModifEtaNavire" />
                    <h:outputText value="ModifHEtaNavire:"/>
                    <h:inputText id="modifHEtaNavire" value="#{escale.escale.modifHEtaNavire}" title="ModifHEtaNavire" />
                    <h:outputText value="UtilisatEtaNavire:"/>
                    <h:inputText id="utilisatEtaNavire" value="#{escale.escale.utilisatEtaNavire}" title="UtilisatEtaNavire" />
                    <h:outputText value="TeauArEntree:"/>
                    <h:inputText id="teauArEntree" value="#{escale.escale.teauArEntree}" title="TeauArEntree" />
                    <h:outputText value="TeauArSortie:"/>
                    <h:inputText id="teauArSortie" value="#{escale.escale.teauArSortie}" title="TeauArSortie" />
                    <h:outputText value="OkAgentSortie:"/>
                    <h:inputText id="okAgentSortie" value="#{escale.escale.okAgentSortie}" title="OkAgentSortie" />
                    <h:outputText value="OkCapitaineSortie:"/>
                    <h:inputText id="okCapitaineSortie" value="#{escale.escale.okCapitaineSortie}" title="OkCapitaineSortie" />
                    <h:outputText value="DateAgentSortie:"/>
                    <h:inputText id="dateAgentSortie" value="#{escale.escale.dateAgentSortie}" title="DateAgentSortie" />
                    <h:outputText value="HeureAgentSortie:"/>
                    <h:inputText id="heureAgentSortie" value="#{escale.escale.heureAgentSortie}" title="HeureAgentSortie" />
                    <h:outputText value="DateCapitaineSortie:"/>
                    <h:inputText id="dateCapitaineSortie" value="#{escale.escale.dateCapitaineSortie}" title="DateCapitaineSortie" />
                    <h:outputText value="HeureCapitaineSortie:"/>
                    <h:inputText id="heureCapitaineSortie" value="#{escale.escale.heureCapitaineSortie}" title="HeureCapitaineSortie" />
                    <h:outputText value="EMail:"/>
                    <h:inputText id="EMail" value="#{escale.escale.EMail}" title="EMail" />
                    <h:outputText value="LongitudeRade:"/>
                    <h:inputText id="longitudeRade" value="#{escale.escale.longitudeRade}" title="LongitudeRade" />
                    <h:outputText value="LatitudeRade:"/>
                    <h:inputText id="latitudeRade" value="#{escale.escale.latitudeRade}" title="LatitudeRade" />
                    <h:outputText value="NumeroVetting:"/>
                    <h:inputText id="numeroVetting" value="#{escale.escale.numeroVetting}" title="NumeroVetting" />
                    <h:outputText value="TypeManutention:"/>
                    <h:inputText id="typeManutention" value="#{escale.escale.typeManutention}" title="TypeManutention" />
                    <h:outputText value="TonnageDeb:"/>
                    <h:inputText id="tonnageDeb" value="#{escale.escale.tonnageDeb}" title="TonnageDeb" />
                    <h:outputText value="TonnageEmb:"/>
                    <h:inputText id="tonnageEmb" value="#{escale.escale.tonnageEmb}" title="TonnageEmb" />
                    <h:outputText value="PiloteEntree:"/>
                    <h:inputText id="piloteEntree" value="#{escale.escale.piloteEntree}" title="PiloteEntree" />
                    <h:outputText value="PiloteSortie:"/>
                    <h:inputText id="piloteSortie" value="#{escale.escale.piloteSortie}" title="PiloteSortie" />
                    <h:outputText value="DateAppelVigieSortie:"/>
                    <h:inputText id="dateAppelVigieSortie" value="#{escale.escale.dateAppelVigieSortie}" title="DateAppelVigieSortie" />
                    <h:outputText value="HeureAppelVigieSortie:"/>
                    <h:inputText id="heureAppelVigieSortie" value="#{escale.escale.heureAppelVigieSortie}" title="HeureAppelVigieSortie" />
                    <h:outputText value="DDebPilote:"/>
                    <h:inputText id="DDebPilote" value="#{escale.escale.DDebPilote}" title="DDebPilote" />
                    <h:outputText value="HDebPilote:"/>
                    <h:inputText id="HDebPilote" value="#{escale.escale.HDebPilote}" title="HDebPilote" />
                    <h:outputText value="DEmbPilote:"/>
                    <h:inputText id="DEmbPilote" value="#{escale.escale.DEmbPilote}" title="DEmbPilote" />
                    <h:outputText value="HEmbPilote:"/>
                    <h:inputText id="HEmbPilote" value="#{escale.escale.HEmbPilote}" title="HEmbPilote" />
                    <h:outputText value="DateProgrammation:"/>
                    <h:inputText id="dateProgrammation" value="#{escale.escale.dateProgrammation}" title="DateProgrammation" />
                    <h:outputText value="HeureProgrammation:"/>
                    <h:inputText id="heureProgrammation" value="#{escale.escale.heureProgrammation}" title="HeureProgrammation" />
                    <h:outputText value="DureeProgrammation:"/>
                    <h:inputText id="dureeProgrammation" value="#{escale.escale.dureeProgrammation}" title="DureeProgrammation" />
                    <h:outputText value="StatutConferenceEntree:"/>
                    <h:inputText id="statutConferenceEntree" value="#{escale.escale.statutConferenceEntree}" title="StatutConferenceEntree" />
                    <h:outputText value="DateConferenceEntree:"/>
                    <h:inputText id="dateConferenceEntree" value="#{escale.escale.dateConferenceEntree}" title="DateConferenceEntree" />
                    <h:outputText value="HeureConferenceEntree:"/>
                    <h:inputText id="heureConferenceEntree" value="#{escale.escale.heureConferenceEntree}" title="HeureConferenceEntree" />
                    <h:outputText value="StatutConferenceSortie:"/>
                    <h:inputText id="statutConferenceSortie" value="#{escale.escale.statutConferenceSortie}" title="StatutConferenceSortie" />
                    <h:outputText value="DateConferenceSortie:"/>
                    <h:inputText id="dateConferenceSortie" value="#{escale.escale.dateConferenceSortie}" title="DateConferenceSortie" />
                    <h:outputText value="HeureConferenceSortie:"/>
                    <h:inputText id="heureConferenceSortie" value="#{escale.escale.heureConferenceSortie}" title="HeureConferenceSortie" />
                    <h:outputText value="TonnageDebDeclare:"/>
                    <h:inputText id="tonnageDebDeclare" value="#{escale.escale.tonnageDebDeclare}" title="TonnageDebDeclare" />
                    <h:outputText value="TonnageEmbDeclare:"/>
                    <h:inputText id="tonnageEmbDeclare" value="#{escale.escale.tonnageEmbDeclare}" title="TonnageEmbDeclare" />
                    <h:outputText value="NbreBl:"/>
                    <h:inputText id="nbreBl" value="#{escale.escale.nbreBl}" title="NbreBl" />
                    <h:outputText value="TonnageFPilotageImport:"/>
                    <h:inputText id="tonnageFPilotageImport" value="#{escale.escale.tonnageFPilotageImport}" title="TonnageFPilotageImport" />
                    <h:outputText value="TonnageFPilotageExport:"/>
                    <h:inputText id="tonnageFPilotageExport" value="#{escale.escale.tonnageFPilotageExport}" title="TonnageFPilotageExport" />
                    <h:outputText value="TonnageFPilotageTotal:"/>
                    <h:inputText id="tonnageFPilotageTotal" value="#{escale.escale.tonnageFPilotageTotal}" title="TonnageFPilotageTotal" />
                    <h:outputText value="TonnageMaxFacture:"/>
                    <h:inputText id="tonnageMaxFacture" value="#{escale.escale.tonnageMaxFacture}" title="TonnageMaxFacture" />
                    <h:outputText value="NumEscCt:"/>
                    <h:inputText id="numEscCt" value="#{escale.escale.numEscCt}" title="NumEscCt" />
                    <h:outputText value="OkDepotManifesteEntree:"/>
                    <h:inputText id="okDepotManifesteEntree" value="#{escale.escale.okDepotManifesteEntree}" title="OkDepotManifesteEntree" />
                    <h:outputText value="DateDepotManifesteEntree:"/>
                    <h:inputText id="dateDepotManifesteEntree" value="#{escale.escale.dateDepotManifesteEntree}" title="DateDepotManifesteEntree" />
                    <h:outputText value="HeureDepotManifesteEntree:"/>
                    <h:inputText id="heureDepotManifesteEntree" value="#{escale.escale.heureDepotManifesteEntree}" title="HeureDepotManifesteEntree" />
                    <h:outputText value="OkDepotManifesteSortie:"/>
                    <h:inputText id="okDepotManifesteSortie" value="#{escale.escale.okDepotManifesteSortie}" title="OkDepotManifesteSortie" />
                    <h:outputText value="DateDepotManifesteSortie:"/>
                    <h:inputText id="dateDepotManifesteSortie" value="#{escale.escale.dateDepotManifesteSortie}" title="DateDepotManifesteSortie" />
                    <h:outputText value="HeureDepotManifesteSortie:"/>
                    <h:inputText id="heureDepotManifesteSortie" value="#{escale.escale.heureDepotManifesteSortie}" title="HeureDepotManifesteSortie" />
                    <h:outputText value="NombreConteneur20Import:"/>
                    <h:inputText id="nombreConteneur20Import" value="#{escale.escale.nombreConteneur20Import}" title="NombreConteneur20Import" />
                    <h:outputText value="NombreConteneur40Import:"/>
                    <h:inputText id="nombreConteneur40Import" value="#{escale.escale.nombreConteneur40Import}" title="NombreConteneur40Import" />
                    <h:outputText value="NombreConteneur20Export:"/>
                    <h:inputText id="nombreConteneur20Export" value="#{escale.escale.nombreConteneur20Export}" title="NombreConteneur20Export" />
                    <h:outputText value="NombreConteneur40Export:"/>
                    <h:inputText id="nombreConteneur40Export" value="#{escale.escale.nombreConteneur40Export}" title="NombreConteneur40Export" />
                    <h:outputText value="NombreConteneur20Transbi:"/>
                    <h:inputText id="nombreConteneur20Transbi" value="#{escale.escale.nombreConteneur20Transbi}" title="NombreConteneur20Transbi" />
                    <h:outputText value="NombreConteneur40Transbi:"/>
                    <h:inputText id="nombreConteneur40Transbi" value="#{escale.escale.nombreConteneur40Transbi}" title="NombreConteneur40Transbi" />
                    <h:outputText value="NombreConteneur20Transbe:"/>
                    <h:inputText id="nombreConteneur20Transbe" value="#{escale.escale.nombreConteneur20Transbe}" title="NombreConteneur20Transbe" />
                    <h:outputText value="NombreConteneur40Transbe:"/>
                    <h:inputText id="nombreConteneur40Transbe" value="#{escale.escale.nombreConteneur40Transbe}" title="NombreConteneur40Transbe" />
                    <h:outputText value="TopTdr:"/>
                    <h:inputText id="topTdr" value="#{escale.escale.topTdr}" title="TopTdr" />
                    <h:outputText value="TopTdrDate:"/>
                    <h:inputText id="topTdrDate" value="#{escale.escale.topTdrDate}" title="TopTdrDate" />
                    <h:outputText value="TopTdrHeure:"/>
                    <h:inputText id="topTdrHeure" value="#{escale.escale.topTdrHeure}" title="TopTdrHeure" />
                    <h:outputText value="TopTimesheet:"/>
                    <h:inputText id="topTimesheet" value="#{escale.escale.topTimesheet}" title="TopTimesheet" />
                    <h:outputText value="TopTimesheetDate:"/>
                    <h:inputText id="topTimesheetDate" value="#{escale.escale.topTimesheetDate}" title="TopTimesheetDate" />
                    <h:outputText value="TopTimesheetHeure:"/>
                    <h:inputText id="topTimesheetHeure" value="#{escale.escale.topTimesheetHeure}" title="TopTimesheetHeure" />
                    <h:outputText value="TopTdrMensuel:"/>
                    <h:inputText id="topTdrMensuel" value="#{escale.escale.topTdrMensuel}" title="TopTdrMensuel" />
                    <h:outputText value="TopTdrMensuelDate:"/>
                    <h:inputText id="topTdrMensuelDate" value="#{escale.escale.topTdrMensuelDate}" title="TopTdrMensuelDate" />
                    <h:outputText value="TopTdrMensuelHeure:"/>
                    <h:inputText id="topTdrMensuelHeure" value="#{escale.escale.topTdrMensuelHeure}" title="TopTdrMensuelHeure" />
                    <h:outputText value="DateMatrice:"/>
                    <h:inputText id="dateMatrice" value="#{escale.escale.dateMatrice}" title="DateMatrice" />
                    <h:outputText value="DateBrouillard:"/>
                    <h:inputText id="dateBrouillard" value="#{escale.escale.dateBrouillard}" title="DateBrouillard" />
                    <h:outputText value="DateFacture:"/>
                    <h:inputText id="dateFacture" value="#{escale.escale.dateFacture}" title="DateFacture" />
                    <h:outputText value="DateValidationTimesheet:"/>
                    <h:inputText id="dateValidationTimesheet" value="#{escale.escale.dateValidationTimesheet}" title="DateValidationTimesheet" />
                    <h:outputText value="UtilisatValidationTimesheet:"/>
                    <h:inputText id="utilisatValidationTimesheet" value="#{escale.escale.utilisatValidationTimesheet}" title="UtilisatValidationTimesheet" />
                    <h:outputText value="UtilisatMatrice:"/>
                    <h:inputText id="utilisatMatrice" value="#{escale.escale.utilisatMatrice}" title="UtilisatMatrice" />
                    <h:outputText value="UtilisatBrouillard:"/>
                    <h:inputText id="utilisatBrouillard" value="#{escale.escale.utilisatBrouillard}" title="UtilisatBrouillard" />
                    <h:outputText value="UtilisatFacture:"/>
                    <h:inputText id="utilisatFacture" value="#{escale.escale.utilisatFacture}" title="UtilisatFacture" />
                    <h:outputText value="DateEscaleInitiale:"/>
                    <h:inputText id="dateEscaleInitiale" value="#{escale.escale.dateEscaleInitiale}" title="DateEscaleInitiale" />
                    <h:outputText value="Nacleunik:"/>
                    <h:selectOneMenu id="nacleunik" value="#{escale.escale.nacleunik}" title="Nacleunik" >
                        <f:selectItems value="#{navire.navireItemsAvailableSelectOne}"/>
                    </h:selectOneMenu>
                    <h:outputText value="GeneralInfoCollection:"/>
                    <h:selectManyListbox id="generalInfoCollection" value="#{escale.escale.jsfcrud_transform[jsfcrud_class['com.github.adminfaces.starter.bean.util.JsfUtil'].jsfcrud_method.collectionToArray][jsfcrud_class['com.github.adminfaces.starter.bean.util.JsfUtil'].jsfcrud_method.arrayToList].generalInfoCollection}" title="GeneralInfoCollection" size="6" converter="#{generalInfo.converter}" >
                        <f:selectItems value="#{generalInfo.generalInfoItemsAvailableSelectMany}"/>
                    </h:selectManyListbox>
                    <h:outputText value="Id:"/>
                    <h:outputText value="#{escale.escale.id}" title="Id" />

                </h:panelGrid>
                <br />
                <h:commandLink action="#{escale.edit}" value="Save">
                    <f:param name="jsfcrud.currentEscale" value="#{jsfcrud_class['com.github.adminfaces.starter.bean.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][escale.escale][escale.converter].jsfcrud_invoke}"/>
                </h:commandLink>
                <br />
                <br />
                <h:commandLink action="#{escale.detailSetup}" value="Show" immediate="true">
                    <f:param name="jsfcrud.currentEscale" value="#{jsfcrud_class['com.github.adminfaces.starter.bean.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][escale.escale][escale.converter].jsfcrud_invoke}"/>
                </h:commandLink>
                <br />
                <h:commandLink action="#{escale.listSetup}" value="Show All Escale Items" immediate="true"/>
                <br />

            </h:form>
        </body>
    </html>
</f:view>
