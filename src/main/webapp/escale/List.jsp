<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://java.sun.com/jsf/html"
      xmlns:f="http://java.sun.com/jsf/core"
      xmlns:ui="http://java.sun.com/jsf/facelets"
      xmlns:p="http://primefaces.org/ui"
      xmlns:adm="http://github.com/adminfaces">
    <h:head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>Listing Escale Items</title>
        <link rel="stylesheet" type="text/css" href="/sysaide/jsfcrud.xhtml" />
    </h:head>
    <h:body>
        <h:panelGroup id="messagePanel" layout="block">
            <h:messages errorStyle="color: red" infoStyle="color: green" layout="table"/>
        </h:panelGroup>
        <h1>Listing Escale Items</h1>
        <h:form styleClass="jsfcrud_list_form">
            <h:outputText escape="false" value="(No Escale Items Found)<br />" rendered="#{escale.pagingInfo.itemCount == 0}" />
            <h:panelGroup rendered="#{escale.pagingInfo.itemCount > 0}">
                <h:outputText value="Item #{escale.pagingInfo.firstItem + 1}..#{escale.pagingInfo.lastItem} of #{escale.pagingInfo.itemCount}"/>&nbsp;
                <h:commandLink action="#{escale.prev}" value="Previous #{escale.pagingInfo.batchSize}" rendered="#{escale.pagingInfo.firstItem >= escale.pagingInfo.batchSize}"/>&nbsp;
                <h:commandLink action="#{escale.next}" value="Next #{escale.pagingInfo.batchSize}" rendered="#{escale.pagingInfo.lastItem + escale.pagingInfo.batchSize <= escale.pagingInfo.itemCount}"/>&nbsp;
                <h:commandLink action="#{escale.next}" value="Remaining #{escale.pagingInfo.itemCount - escale.pagingInfo.lastItem}"
                               rendered="#{escale.pagingInfo.lastItem < escale.pagingInfo.itemCount && escale.pagingInfo.lastItem + escale.pagingInfo.batchSize > escale.pagingInfo.itemCount}"/>
                <h:dataTable value="#{escale.escaleItems}" var="item" border="0" cellpadding="2" cellspacing="0" rowClasses="jsfcrud_odd_row,jsfcrud_even_row" rules="all" style="border:solid 1px">
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Escleunik"/>
                        </f:facet>
                        <h:outputText value="#{item.escleunik}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Numero"/>
                        </f:facet>
                        <h:outputText value="#{item.numero}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Agent"/>
                        </f:facet>
                        <h:outputText value="#{item.agent}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Manuten"/>
                        </f:facet>
                        <h:outputText value="#{item.manuten}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Filiere"/>
                        </f:facet>
                        <h:outputText value="#{item.filiere}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Radio"/>
                        </f:facet>
                        <h:outputText value="#{item.radio}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Service"/>
                        </f:facet>
                        <h:outputText value="#{item.service}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Identite"/>
                        </f:facet>
                        <h:outputText value="#{item.identite}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Ligne"/>
                        </f:facet>
                        <h:outputText value="#{item.ligne}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="MoisStat"/>
                        </f:facet>
                        <h:outputText value="#{item.moisStat}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Capitaine"/>
                        </f:facet>
                        <h:outputText value="#{item.capitaine}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Construc"/>
                        </f:facet>
                        <h:outputText value="#{item.construc}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Objet"/>
                        </f:facet>
                        <h:outputText value="#{item.objet}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Etat"/>
                        </f:facet>
                        <h:outputText value="#{item.etat}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Nombre"/>
                        </f:facet>
                        <h:outputText value="#{item.nombre}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="NbAtt"/>
                        </f:facet>
                        <h:outputText value="#{item.nbAtt}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Sejour"/>
                        </f:facet>
                        <h:outputText value="#{item.sejour}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Duree"/>
                        </f:facet>
                        <h:outputText value="#{item.duree}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Travail"/>
                        </f:facet>
                        <h:outputText value="#{item.travail}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Situat"/>
                        </f:facet>
                        <h:outputText value="#{item.situat}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Arrivee"/>
                        </f:facet>
                        <h:outputText value="#{item.arrivee}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="ArrH"/>
                        </f:facet>
                        <h:outputText value="#{item.arrH}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Mouill"/>
                        </f:facet>
                        <h:outputText value="#{item.mouill}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Mouillh"/>
                        </f:facet>
                        <h:outputText value="#{item.mouillh}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="PilEnt"/>
                        </f:facet>
                        <h:outputText value="#{item.pilEnt}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="PilEnth"/>
                        </f:facet>
                        <h:outputText value="#{item.pilEnth}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="RemE"/>
                        </f:facet>
                        <h:outputText value="#{item.remE}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Debut"/>
                        </f:facet>
                        <h:outputText value="#{item.debut}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DebH"/>
                        </f:facet>
                        <h:outputText value="#{item.debH}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DebOpe"/>
                        </f:facet>
                        <h:outputText value="#{item.debOpe}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DebOpeh"/>
                        </f:facet>
                        <h:outputText value="#{item.debOpeh}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="AttAr"/>
                        </f:facet>
                        <h:outputText value="#{item.attAr}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="MotAr"/>
                        </f:facet>
                        <h:outputText value="#{item.motAr}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="CondAr"/>
                        </f:facet>
                        <h:outputText value="#{item.condAr}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="PortAttac"/>
                        </f:facet>
                        <h:outputText value="#{item.portAttac}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="RemS"/>
                        </f:facet>
                        <h:outputText value="#{item.remS}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="FinOpe"/>
                        </f:facet>
                        <h:outputText value="#{item.finOpe}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="FinOpeh"/>
                        </f:facet>
                        <h:outputText value="#{item.finOpeh}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="PilSor"/>
                        </f:facet>
                        <h:outputText value="#{item.pilSor}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="PilSorh"/>
                        </f:facet>
                        <h:outputText value="#{item.pilSorh}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Depart"/>
                        </f:facet>
                        <h:outputText value="#{item.depart}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DepH"/>
                        </f:facet>
                        <h:outputText value="#{item.depH}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Fin"/>
                        </f:facet>
                        <h:outputText value="#{item.fin}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="FinH"/>
                        </f:facet>
                        <h:outputText value="#{item.finH}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="AttDp"/>
                        </f:facet>
                        <h:outputText value="#{item.attDp}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="MotDp"/>
                        </f:facet>
                        <h:outputText value="#{item.motDp}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="CondDp"/>
                        </f:facet>
                        <h:outputText value="#{item.condDp}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="FoBrd"/>
                        </f:facet>
                        <h:outputText value="#{item.foBrd}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DoBrd"/>
                        </f:facet>
                        <h:outputText value="#{item.doBrd}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="FoStg"/>
                        </f:facet>
                        <h:outputText value="#{item.foStg}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DoStg"/>
                        </f:facet>
                        <h:outputText value="#{item.doStg}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Eau"/>
                        </f:facet>
                        <h:outputText value="#{item.eau}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Activite"/>
                        </f:facet>
                        <h:outputText value="#{item.activite}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Person"/>
                        </f:facet>
                        <h:outputText value="#{item.person}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Traite"/>
                        </f:facet>
                        <h:outputText value="#{item.traite}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Quai"/>
                        </f:facet>
                        <h:outputText value="#{item.quai}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Tonnage"/>
                        </f:facet>
                        <h:outputText value="#{item.tonnage}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="FDate"/>
                        </f:facet>
                        <h:outputText value="#{item.FDate}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="FHeure"/>
                        </f:facet>
                        <h:outputText value="#{item.FHeure}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="NFact"/>
                        </f:facet>
                        <h:outputText value="#{item.NFact}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="FEche"/>
                        </f:facet>
                        <h:outputText value="#{item.FEche}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="NbrTcs"/>
                        </f:facet>
                        <h:outputText value="#{item.nbrTcs}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="NbrVeh"/>
                        </f:facet>
                        <h:outputText value="#{item.nbrVeh}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="NbrPas"/>
                        </f:facet>
                        <h:outputText value="#{item.nbrPas}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="NbrTcst"/>
                        </f:facet>
                        <h:outputText value="#{item.nbrTcst}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="ChargN"/>
                        </f:facet>
                        <h:outputText value="#{item.chargN}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="NbrTcsn"/>
                        </f:facet>
                        <h:outputText value="#{item.nbrTcsn}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Motif"/>
                        </f:facet>
                        <h:outputText value="#{item.motif}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="NbrSht"/>
                        </f:facet>
                        <h:outputText value="#{item.nbrSht}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Port"/>
                        </f:facet>
                        <h:outputText value="#{item.port}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Rendement"/>
                        </f:facet>
                        <h:outputText value="#{item.rendement}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Avarie"/>
                        </f:facet>
                        <h:outputText value="#{item.avarie}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Nature"/>
                        </f:facet>
                        <h:outputText value="#{item.nature}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Importance"/>
                        </f:facet>
                        <h:outputText value="#{item.importance}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TopTriton"/>
                        </f:facet>
                        <h:outputText value="#{item.topTriton}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TopDanger"/>
                        </f:facet>
                        <h:outputText value="#{item.topDanger}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Hauteur"/>
                        </f:facet>
                        <h:outputText value="#{item.hauteur}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Largeur"/>
                        </f:facet>
                        <h:outputText value="#{item.largeur}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TopFacAg"/>
                        </f:facet>
                        <h:outputText value="#{item.topFacAg}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TopFacMn"/>
                        </f:facet>
                        <h:outputText value="#{item.topFacMn}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="THoraire"/>
                        </f:facet>
                        <h:outputText value="#{item.THoraire}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="NbPortique"/>
                        </f:facet>
                        <h:outputText value="#{item.nbPortique}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="OkAgent"/>
                        </f:facet>
                        <h:outputText value="#{item.okAgent}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="OkCapitaine"/>
                        </f:facet>
                        <h:outputText value="#{item.okCapitaine}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="OkManutentionnaire"/>
                        </f:facet>
                        <h:outputText value="#{item.okManutentionnaire}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DateAgent"/>
                        </f:facet>
                        <h:outputText value="#{item.dateAgent}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="HeureAgent"/>
                        </f:facet>
                        <h:outputText value="#{item.heureAgent}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DateCapitaine"/>
                        </f:facet>
                        <h:outputText value="#{item.dateCapitaine}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="HeureCapitaine"/>
                        </f:facet>
                        <h:outputText value="#{item.heureCapitaine}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DateManutentionnaire"/>
                        </f:facet>
                        <h:outputText value="#{item.dateManutentionnaire}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="HeureManutentionnaire"/>
                        </f:facet>
                        <h:outputText value="#{item.heureManutentionnaire}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="ProvenanceI"/>
                        </f:facet>
                        <h:outputText value="#{item.provenanceI}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="ProvenanceO"/>
                        </f:facet>
                        <h:outputText value="#{item.provenanceO}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DestinationI"/>
                        </f:facet>
                        <h:outputText value="#{item.destinationI}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DestinationF"/>
                        </f:facet>
                        <h:outputText value="#{item.destinationF}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Navire"/>
                        </f:facet>
                        <h:outputText value="#{item.navire}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DDemande"/>
                        </f:facet>
                        <h:outputText value="#{item.DDemande}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="HDemande"/>
                        </f:facet>
                        <h:outputText value="#{item.HDemande}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Referenc"/>
                        </f:facet>
                        <h:outputText value="#{item.referenc}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TotPrimeEq1"/>
                        </f:facet>
                        <h:outputText value="#{item.totPrimeEq1}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TotPrimeEq2"/>
                        </f:facet>
                        <h:outputText value="#{item.totPrimeEq2}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Voyage"/>
                        </f:facet>
                        <h:outputText value="#{item.voyage}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="NbrHtrb"/>
                        </f:facet>
                        <h:outputText value="#{item.nbrHtrb}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="NbrTrb"/>
                        </f:facet>
                        <h:outputText value="#{item.nbrTrb}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="NbrNtrb"/>
                        </f:facet>
                        <h:outputText value="#{item.nbrNtrb}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="HrsNdf"/>
                        </f:facet>
                        <h:outputText value="#{item.hrsNdf}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="HrsNbr"/>
                        </f:facet>
                        <h:outputText value="#{item.hrsNbr}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Gestion"/>
                        </f:facet>
                        <h:outputText value="#{item.gestion}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Statut"/>
                        </f:facet>
                        <h:outputText value="#{item.statut}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Createur"/>
                        </f:facet>
                        <h:outputText value="#{item.createur}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DCreat"/>
                        </f:facet>
                        <h:outputText value="#{item.DCreat}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="HCreat"/>
                        </f:facet>
                        <h:outputText value="#{item.HCreat}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Utilisat"/>
                        </f:facet>
                        <h:outputText value="#{item.utilisat}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DModif"/>
                        </f:facet>
                        <h:outputText value="#{item.DModif}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="HModif"/>
                        </f:facet>
                        <h:outputText value="#{item.HModif}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Facleunik"/>
                        </f:facet>
                        <h:outputText value="#{item.facleunik}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="ChargB"/>
                        </f:facet>
                        <h:outputText value="#{item.chargB}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Pavillon"/>
                        </f:facet>
                        <h:outputText value="#{item.pavillon}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Armateur"/>
                        </f:facet>
                        <h:outputText value="#{item.armateur}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="JaugeNet"/>
                        </f:facet>
                        <h:outputText value="#{item.jaugeNet}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="RedemU"/>
                        </f:facet>
                        <h:outputText value="#{item.redemU}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="ChefPoste"/>
                        </f:facet>
                        <h:outputText value="#{item.chefPoste}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="OkFactNav"/>
                        </f:facet>
                        <h:outputText value="#{item.okFactNav}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="OkFactEqu"/>
                        </f:facet>
                        <h:outputText value="#{item.okFactEqu}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TraiteHier"/>
                        </f:facet>
                        <h:outputText value="#{item.traiteHier}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DateStat"/>
                        </f:facet>
                        <h:outputText value="#{item.dateStat}">
                            <f:convertDateTime pattern="MM/dd/yyyy HH:mm:ss" />
                        </h:outputText>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Priorite"/>
                        </f:facet>
                        <h:outputText value="#{item.priorite}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DatePasseEntree"/>
                        </f:facet>
                        <h:outputText value="#{item.datePasseEntree}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="HeurePasseEntree"/>
                        </f:facet>
                        <h:outputText value="#{item.heurePasseEntree}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DatePasseSortie"/>
                        </f:facet>
                        <h:outputText value="#{item.datePasseSortie}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="HeurePasseSortie"/>
                        </f:facet>
                        <h:outputText value="#{item.heurePasseSortie}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DateArriveeRade"/>
                        </f:facet>
                        <h:outputText value="#{item.dateArriveeRade}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="HeureArriveeRade"/>
                        </f:facet>
                        <h:outputText value="#{item.heureArriveeRade}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="ResponsableShipping"/>
                        </f:facet>
                        <h:outputText value="#{item.responsableShipping}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="ChefEscale"/>
                        </f:facet>
                        <h:outputText value="#{item.chefEscale}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TelAgent"/>
                        </f:facet>
                        <h:outputText value="#{item.telAgent}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TelResponsableShipping"/>
                        </f:facet>
                        <h:outputText value="#{item.telResponsableShipping}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TelChefEscale"/>
                        </f:facet>
                        <h:outputText value="#{item.telChefEscale}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="ArriveeRade"/>
                        </f:facet>
                        <h:outputText value="#{item.arriveeRade}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="ArrHRade"/>
                        </f:facet>
                        <h:outputText value="#{item.arrHRade}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DepartEffectif"/>
                        </f:facet>
                        <h:outputText value="#{item.departEffectif}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DepHEffectif"/>
                        </f:facet>
                        <h:outputText value="#{item.depHEffectif}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="MouillDepart"/>
                        </f:facet>
                        <h:outputText value="#{item.mouillDepart}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="MouillhDepart"/>
                        </f:facet>
                        <h:outputText value="#{item.mouillhDepart}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="AgentSortie"/>
                        </f:facet>
                        <h:outputText value="#{item.agentSortie}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TelephoneAgentSortie"/>
                        </f:facet>
                        <h:outputText value="#{item.telephoneAgentSortie}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="OkApparaux"/>
                        </f:facet>
                        <h:outputText value="#{item.okApparaux}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="OkAssurance"/>
                        </f:facet>
                        <h:outputText value="#{item.okAssurance}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="OkDeclaration"/>
                        </f:facet>
                        <h:outputText value="#{item.okDeclaration}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="FreeGaz"/>
                        </f:facet>
                        <h:outputText value="#{item.freeGaz}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Reparation"/>
                        </f:facet>
                        <h:outputText value="#{item.reparation}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Controle"/>
                        </f:facet>
                        <h:outputText value="#{item.controle}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Avaries"/>
                        </f:facet>
                        <h:outputText value="#{item.avaries}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="ManutentionnaireSortie"/>
                        </f:facet>
                        <h:outputText value="#{item.manutentionnaireSortie}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DateStatut"/>
                        </f:facet>
                        <h:outputText value="#{item.dateStatut}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="HeureStatut"/>
                        </f:facet>
                        <h:outputText value="#{item.heureStatut}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="MobileChefEscale"/>
                        </f:facet>
                        <h:outputText value="#{item.mobileChefEscale}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="MobileResponsableShipping"/>
                        </f:facet>
                        <h:outputText value="#{item.mobileResponsableShipping}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Quai2"/>
                        </f:facet>
                        <h:outputText value="#{item.quai2}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Quai3"/>
                        </f:facet>
                        <h:outputText value="#{item.quai3}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DateModifEta"/>
                        </f:facet>
                        <h:outputText value="#{item.dateModifEta}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="HeureModifEta"/>
                        </f:facet>
                        <h:outputText value="#{item.heureModifEta}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DateAppelVigie"/>
                        </f:facet>
                        <h:outputText value="#{item.dateAppelVigie}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="HeureAppelVigie"/>
                        </f:facet>
                        <h:outputText value="#{item.heureAppelVigie}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="ControleurVigie"/>
                        </f:facet>
                        <h:outputText value="#{item.controleurVigie}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="SaisieNavire"/>
                        </f:facet>
                        <h:outputText value="#{item.saisieNavire}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DateModifEtd"/>
                        </f:facet>
                        <h:outputText value="#{item.dateModifEtd}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="HeureModifEtd"/>
                        </f:facet>
                        <h:outputText value="#{item.heureModifEtd}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Bassin"/>
                        </f:facet>
                        <h:outputText value="#{item.bassin}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DateFeux"/>
                        </f:facet>
                        <h:outputText value="#{item.dateFeux}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="HeureFeux"/>
                        </f:facet>
                        <h:outputText value="#{item.heureFeux}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DateFeuxSortie"/>
                        </f:facet>
                        <h:outputText value="#{item.dateFeuxSortie}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="HeureFeuxSortie"/>
                        </f:facet>
                        <h:outputText value="#{item.heureFeuxSortie}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Position"/>
                        </f:facet>
                        <h:outputText value="#{item.position}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="EtaNavire"/>
                        </f:facet>
                        <h:outputText value="#{item.etaNavire}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="HEtaNavire"/>
                        </f:facet>
                        <h:outputText value="#{item.HEtaNavire}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="ModifEtaNavire"/>
                        </f:facet>
                        <h:outputText value="#{item.modifEtaNavire}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="ModifHEtaNavire"/>
                        </f:facet>
                        <h:outputText value="#{item.modifHEtaNavire}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="UtilisatEtaNavire"/>
                        </f:facet>
                        <h:outputText value="#{item.utilisatEtaNavire}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TeauArEntree"/>
                        </f:facet>
                        <h:outputText value="#{item.teauArEntree}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TeauArSortie"/>
                        </f:facet>
                        <h:outputText value="#{item.teauArSortie}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="OkAgentSortie"/>
                        </f:facet>
                        <h:outputText value="#{item.okAgentSortie}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="OkCapitaineSortie"/>
                        </f:facet>
                        <h:outputText value="#{item.okCapitaineSortie}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DateAgentSortie"/>
                        </f:facet>
                        <h:outputText value="#{item.dateAgentSortie}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="HeureAgentSortie"/>
                        </f:facet>
                        <h:outputText value="#{item.heureAgentSortie}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DateCapitaineSortie"/>
                        </f:facet>
                        <h:outputText value="#{item.dateCapitaineSortie}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="HeureCapitaineSortie"/>
                        </f:facet>
                        <h:outputText value="#{item.heureCapitaineSortie}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="EMail"/>
                        </f:facet>
                        <h:outputText value="#{item.EMail}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="LongitudeRade"/>
                        </f:facet>
                        <h:outputText value="#{item.longitudeRade}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="LatitudeRade"/>
                        </f:facet>
                        <h:outputText value="#{item.latitudeRade}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="NumeroVetting"/>
                        </f:facet>
                        <h:outputText value="#{item.numeroVetting}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TypeManutention"/>
                        </f:facet>
                        <h:outputText value="#{item.typeManutention}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TonnageDeb"/>
                        </f:facet>
                        <h:outputText value="#{item.tonnageDeb}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TonnageEmb"/>
                        </f:facet>
                        <h:outputText value="#{item.tonnageEmb}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="PiloteEntree"/>
                        </f:facet>
                        <h:outputText value="#{item.piloteEntree}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="PiloteSortie"/>
                        </f:facet>
                        <h:outputText value="#{item.piloteSortie}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DateAppelVigieSortie"/>
                        </f:facet>
                        <h:outputText value="#{item.dateAppelVigieSortie}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="HeureAppelVigieSortie"/>
                        </f:facet>
                        <h:outputText value="#{item.heureAppelVigieSortie}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DDebPilote"/>
                        </f:facet>
                        <h:outputText value="#{item.DDebPilote}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="HDebPilote"/>
                        </f:facet>
                        <h:outputText value="#{item.HDebPilote}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DEmbPilote"/>
                        </f:facet>
                        <h:outputText value="#{item.DEmbPilote}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="HEmbPilote"/>
                        </f:facet>
                        <h:outputText value="#{item.HEmbPilote}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DateProgrammation"/>
                        </f:facet>
                        <h:outputText value="#{item.dateProgrammation}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="HeureProgrammation"/>
                        </f:facet>
                        <h:outputText value="#{item.heureProgrammation}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DureeProgrammation"/>
                        </f:facet>
                        <h:outputText value="#{item.dureeProgrammation}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="StatutConferenceEntree"/>
                        </f:facet>
                        <h:outputText value="#{item.statutConferenceEntree}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DateConferenceEntree"/>
                        </f:facet>
                        <h:outputText value="#{item.dateConferenceEntree}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="HeureConferenceEntree"/>
                        </f:facet>
                        <h:outputText value="#{item.heureConferenceEntree}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="StatutConferenceSortie"/>
                        </f:facet>
                        <h:outputText value="#{item.statutConferenceSortie}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DateConferenceSortie"/>
                        </f:facet>
                        <h:outputText value="#{item.dateConferenceSortie}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="HeureConferenceSortie"/>
                        </f:facet>
                        <h:outputText value="#{item.heureConferenceSortie}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TonnageDebDeclare"/>
                        </f:facet>
                        <h:outputText value="#{item.tonnageDebDeclare}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TonnageEmbDeclare"/>
                        </f:facet>
                        <h:outputText value="#{item.tonnageEmbDeclare}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="NbreBl"/>
                        </f:facet>
                        <h:outputText value="#{item.nbreBl}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TonnageFPilotageImport"/>
                        </f:facet>
                        <h:outputText value="#{item.tonnageFPilotageImport}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TonnageFPilotageExport"/>
                        </f:facet>
                        <h:outputText value="#{item.tonnageFPilotageExport}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TonnageFPilotageTotal"/>
                        </f:facet>
                        <h:outputText value="#{item.tonnageFPilotageTotal}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TonnageMaxFacture"/>
                        </f:facet>
                        <h:outputText value="#{item.tonnageMaxFacture}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="NumEscCt"/>
                        </f:facet>
                        <h:outputText value="#{item.numEscCt}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="OkDepotManifesteEntree"/>
                        </f:facet>
                        <h:outputText value="#{item.okDepotManifesteEntree}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DateDepotManifesteEntree"/>
                        </f:facet>
                        <h:outputText value="#{item.dateDepotManifesteEntree}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="HeureDepotManifesteEntree"/>
                        </f:facet>
                        <h:outputText value="#{item.heureDepotManifesteEntree}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="OkDepotManifesteSortie"/>
                        </f:facet>
                        <h:outputText value="#{item.okDepotManifesteSortie}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DateDepotManifesteSortie"/>
                        </f:facet>
                        <h:outputText value="#{item.dateDepotManifesteSortie}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="HeureDepotManifesteSortie"/>
                        </f:facet>
                        <h:outputText value="#{item.heureDepotManifesteSortie}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="NombreConteneur20Import"/>
                        </f:facet>
                        <h:outputText value="#{item.nombreConteneur20Import}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="NombreConteneur40Import"/>
                        </f:facet>
                        <h:outputText value="#{item.nombreConteneur40Import}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="NombreConteneur20Export"/>
                        </f:facet>
                        <h:outputText value="#{item.nombreConteneur20Export}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="NombreConteneur40Export"/>
                        </f:facet>
                        <h:outputText value="#{item.nombreConteneur40Export}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="NombreConteneur20Transbi"/>
                        </f:facet>
                        <h:outputText value="#{item.nombreConteneur20Transbi}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="NombreConteneur40Transbi"/>
                        </f:facet>
                        <h:outputText value="#{item.nombreConteneur40Transbi}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="NombreConteneur20Transbe"/>
                        </f:facet>
                        <h:outputText value="#{item.nombreConteneur20Transbe}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="NombreConteneur40Transbe"/>
                        </f:facet>
                        <h:outputText value="#{item.nombreConteneur40Transbe}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TopTdr"/>
                        </f:facet>
                        <h:outputText value="#{item.topTdr}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TopTdrDate"/>
                        </f:facet>
                        <h:outputText value="#{item.topTdrDate}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TopTdrHeure"/>
                        </f:facet>
                        <h:outputText value="#{item.topTdrHeure}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TopTimesheet"/>
                        </f:facet>
                        <h:outputText value="#{item.topTimesheet}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TopTimesheetDate"/>
                        </f:facet>
                        <h:outputText value="#{item.topTimesheetDate}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TopTimesheetHeure"/>
                        </f:facet>
                        <h:outputText value="#{item.topTimesheetHeure}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TopTdrMensuel"/>
                        </f:facet>
                        <h:outputText value="#{item.topTdrMensuel}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TopTdrMensuelDate"/>
                        </f:facet>
                        <h:outputText value="#{item.topTdrMensuelDate}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="TopTdrMensuelHeure"/>
                        </f:facet>
                        <h:outputText value="#{item.topTdrMensuelHeure}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DateMatrice"/>
                        </f:facet>
                        <h:outputText value="#{item.dateMatrice}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DateBrouillard"/>
                        </f:facet>
                        <h:outputText value="#{item.dateBrouillard}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DateFacture"/>
                        </f:facet>
                        <h:outputText value="#{item.dateFacture}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DateValidationTimesheet"/>
                        </f:facet>
                        <h:outputText value="#{item.dateValidationTimesheet}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="UtilisatValidationTimesheet"/>
                        </f:facet>
                        <h:outputText value="#{item.utilisatValidationTimesheet}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="UtilisatMatrice"/>
                        </f:facet>
                        <h:outputText value="#{item.utilisatMatrice}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="UtilisatBrouillard"/>
                        </f:facet>
                        <h:outputText value="#{item.utilisatBrouillard}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="UtilisatFacture"/>
                        </f:facet>
                        <h:outputText value="#{item.utilisatFacture}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DateEscaleInitiale"/>
                        </f:facet>
                        <h:outputText value="#{item.dateEscaleInitiale}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Nacleunik"/>
                        </f:facet>
                        <h:outputText value="#{item.nacleunik}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Id"/>
                        </f:facet>
                        <h:outputText value="#{item.id}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText escape="false" value="&nbsp;"/>
                        </f:facet>
                        <h:commandLink value="Show" action="#{escale.detailSetup}">
                            <f:param name="jsfcrud.currentEscale" value="#{jsfcrud_class['com.github.adminfaces.starter.bean.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][escale.converter].jsfcrud_invoke}"/>
                        </h:commandLink>
                        <h:outputText value=" "/>
                        <h:commandLink value="Edit" action="#{escale.editSetup}">
                            <f:param name="jsfcrud.currentEscale" value="#{jsfcrud_class['com.github.adminfaces.starter.bean.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][escale.converter].jsfcrud_invoke}"/>
                        </h:commandLink>
                        <h:outputText value=" "/>
                        <h:commandLink value="Destroy" action="#{escale.remove}">
                            <f:param name="jsfcrud.currentEscale" value="#{jsfcrud_class['com.github.adminfaces.starter.bean.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][escale.converter].jsfcrud_invoke}"/>
                        </h:commandLink>
                    </h:column>

                </h:dataTable>
            </h:panelGroup>
            <br />
            <h:commandLink action="#{escale.createSetup}" value="New Escale"/>
            <br />
        </h:form>
    </h:body>
</html>
