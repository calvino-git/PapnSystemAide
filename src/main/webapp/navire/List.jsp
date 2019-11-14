<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <title>Listing Navire Items</title>
            <link rel="stylesheet" type="text/css" href="/sysaide/jsfcrud.xhtml" />
        </head>
        <body>
            <h:panelGroup id="messagePanel" layout="block">
                <h:messages errorStyle="color: red" infoStyle="color: green" layout="table"/>
            </h:panelGroup>
            <h1>Listing Navire Items</h1>
            <h:form styleClass="jsfcrud_list_form">
                <h:outputText escape="false" value="(No Navire Items Found)<br />" rendered="#{navire.pagingInfo.itemCount == 0}" />
                <h:panelGroup rendered="#{navire.pagingInfo.itemCount > 0}">
                    <h:outputText value="Item #{navire.pagingInfo.firstItem + 1}..#{navire.pagingInfo.lastItem} of #{navire.pagingInfo.itemCount}"/>&nbsp;
                    <h:commandLink action="#{navire.prev}" value="Previous #{navire.pagingInfo.batchSize}" rendered="#{navire.pagingInfo.firstItem >= navire.pagingInfo.batchSize}"/>&nbsp;
                    <h:commandLink action="#{navire.next}" value="Next #{navire.pagingInfo.batchSize}" rendered="#{navire.pagingInfo.lastItem + navire.pagingInfo.batchSize <= navire.pagingInfo.itemCount}"/>&nbsp;
                    <h:commandLink action="#{navire.next}" value="Remaining #{navire.pagingInfo.itemCount - navire.pagingInfo.lastItem}"
                                   rendered="#{navire.pagingInfo.lastItem < navire.pagingInfo.itemCount && navire.pagingInfo.lastItem + navire.pagingInfo.batchSize > navire.pagingInfo.itemCount}"/>
                    <h:dataTable value="#{navire.navireItems}" var="item" border="0" cellpadding="2" cellspacing="0" rowClasses="jsfcrud_odd_row,jsfcrud_even_row" rules="all" style="border:solid 1px">
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Nacleunik"/>
                            </f:facet>
                            <h:outputText value="#{item.nacleunik}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Numero"/>
                            </f:facet>
                            <h:outputText value="#{item.numero}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Radio"/>
                            </f:facet>
                            <h:outputText value="#{item.radio}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Nom"/>
                            </f:facet>
                            <h:outputText value="#{item.nom}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Libelle"/>
                            </f:facet>
                            <h:outputText value="#{item.libelle}"/>
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
                                <h:outputText value="Affreteur"/>
                            </f:facet>
                            <h:outputText value="#{item.affreteur}"/>
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
                                <h:outputText value="Type"/>
                            </f:facet>
                            <h:outputText value="#{item.type}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Nature"/>
                            </f:facet>
                            <h:outputText value="#{item.nature}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Volume"/>
                            </f:facet>
                            <h:outputText value="#{item.volume}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Capacite"/>
                            </f:facet>
                            <h:outputText value="#{item.capacite}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="ChargB"/>
                            </f:facet>
                            <h:outputText value="#{item.chargB}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="ChargN"/>
                            </f:facet>
                            <h:outputText value="#{item.chargN}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Tare"/>
                            </f:facet>
                            <h:outputText value="#{item.tare}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Conten"/>
                            </f:facet>
                            <h:outputText value="#{item.conten}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Longu"/>
                            </f:facet>
                            <h:outputText value="#{item.longu}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Largeur"/>
                            </f:facet>
                            <h:outputText value="#{item.largeur}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Hauteur"/>
                            </f:facet>
                            <h:outputText value="#{item.hauteur}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Nombre"/>
                            </f:facet>
                            <h:outputText value="#{item.nombre}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="PortAttac"/>
                            </f:facet>
                            <h:outputText value="#{item.portAttac}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Person"/>
                            </f:facet>
                            <h:outputText value="#{item.person}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="PropAv"/>
                            </f:facet>
                            <h:outputText value="#{item.propAv}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="PropAr"/>
                            </f:facet>
                            <h:outputText value="#{item.propAr}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Unite"/>
                            </f:facet>
                            <h:outputText value="#{item.unite}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Passag"/>
                            </f:facet>
                            <h:outputText value="#{item.passag}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Quantite"/>
                            </f:facet>
                            <h:outputText value="#{item.quantite}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Texte"/>
                            </f:facet>
                            <h:outputText value="#{item.texte}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="LDeb"/>
                            </f:facet>
                            <h:outputText value="#{item.LDeb}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Desserte"/>
                            </f:facet>
                            <h:outputText value="#{item.desserte}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="NbMot"/>
                            </f:facet>
                            <h:outputText value="#{item.nbMot}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="NbRem"/>
                            </f:facet>
                            <h:outputText value="#{item.nbRem}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Ligne"/>
                            </f:facet>
                            <h:outputText value="#{item.ligne}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="TraitSht"/>
                            </f:facet>
                            <h:outputText value="#{item.traitSht}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Emplac"/>
                            </f:facet>
                            <h:outputText value="#{item.emplac}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Affret"/>
                            </f:facet>
                            <h:outputText value="#{item.affret}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="CapGrain"/>
                            </f:facet>
                            <h:outputText value="#{item.capGrain}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="CapBalle"/>
                            </f:facet>
                            <h:outputText value="#{item.capBalle}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="GrueBab"/>
                            </f:facet>
                            <h:outputText value="#{item.grueBab}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="GrueTri"/>
                            </f:facet>
                            <h:outputText value="#{item.grueTri}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Categorie"/>
                            </f:facet>
                            <h:outputText value="#{item.categorie}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="TLong"/>
                            </f:facet>
                            <h:outputText value="#{item.TLong}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="TLargeur"/>
                            </f:facet>
                            <h:outputText value="#{item.TLargeur}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Chateau"/>
                            </f:facet>
                            <h:outputText value="#{item.chateau}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Cellularise"/>
                            </f:facet>
                            <h:outputText value="#{item.cellularise}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Rampe"/>
                            </f:facet>
                            <h:outputText value="#{item.rampe}"/>
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
                                <h:outputText value="Ports"/>
                            </f:facet>
                            <h:outputText value="#{item.ports}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Manifold"/>
                            </f:facet>
                            <h:outputText value="#{item.manifold}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="JaugeUms"/>
                            </f:facet>
                            <h:outputText value="#{item.jaugeUms}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Consignes"/>
                            </f:facet>
                            <h:outputText value="#{item.consignes}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="DateConsignes"/>
                            </f:facet>
                            <h:outputText value="#{item.dateConsignes}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="PuisPropAv"/>
                            </f:facet>
                            <h:outputText value="#{item.puisPropAv}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="PuisPropAr"/>
                            </f:facet>
                            <h:outputText value="#{item.puisPropAr}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="NomCourt"/>
                            </f:facet>
                            <h:outputText value="#{item.nomCourt}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Agent"/>
                            </f:facet>
                            <h:outputText value="#{item.agent}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="LongueurPorte"/>
                            </f:facet>
                            <h:outputText value="#{item.longueurPorte}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="NumeroOmi"/>
                            </f:facet>
                            <h:outputText value="#{item.numeroOmi}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="NumeroCertificat"/>
                            </f:facet>
                            <h:outputText value="#{item.numeroCertificat}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="DateCertificat"/>
                            </f:facet>
                            <h:outputText value="#{item.dateCertificat}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="DatePeremption"/>
                            </f:facet>
                            <h:outputText value="#{item.datePeremption}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="NiveauSurete"/>
                            </f:facet>
                            <h:outputText value="#{item.niveauSurete}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="OrganismeCertification"/>
                            </f:facet>
                            <h:outputText value="#{item.organismeCertification}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="PaysCertificat"/>
                            </f:facet>
                            <h:outputText value="#{item.paysCertificat}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="EspaceOuvert"/>
                            </f:facet>
                            <h:outputText value="#{item.espaceOuvert}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="NombreCale"/>
                            </f:facet>
                            <h:outputText value="#{item.nombreCale}"/>
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
                                <h:outputText value="ValideCapitainerie"/>
                            </f:facet>
                            <h:outputText value="#{item.valideCapitainerie}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="OkCapitaine"/>
                            </f:facet>
                            <h:outputText value="#{item.okCapitaine}"/>
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
                                <h:outputText value="NavirePression"/>
                            </f:facet>
                            <h:outputText value="#{item.navirePression}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText escape="false" value="&nbsp;"/>
                            </f:facet>
                            <h:commandLink value="Show" action="#{navire.detailSetup}">
                                <f:param name="jsfcrud.currentNavire" value="#{jsfcrud_class['com.github.adminfaces.starter.bean.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][navire.converter].jsfcrud_invoke}"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Edit" action="#{navire.editSetup}">
                                <f:param name="jsfcrud.currentNavire" value="#{jsfcrud_class['com.github.adminfaces.starter.bean.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][navire.converter].jsfcrud_invoke}"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Destroy" action="#{navire.remove}">
                                <f:param name="jsfcrud.currentNavire" value="#{jsfcrud_class['com.github.adminfaces.starter.bean.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][navire.converter].jsfcrud_invoke}"/>
                            </h:commandLink>
                        </h:column>

                    </h:dataTable>
                </h:panelGroup>
                <br />
                <h:commandLink action="#{navire.createSetup}" value="New Navire"/>
                <br />


            </h:form>
        </body>
    </html>
</f:view>
