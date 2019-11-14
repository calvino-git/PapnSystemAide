<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <title>Editing Navire</title>
            <link rel="stylesheet" type="text/css" href="/sysaide/jsfcrud.xhtml" />
        </head>
        <body>
            <h:panelGroup id="messagePanel" layout="block">
                <h:messages errorStyle="color: red" infoStyle="color: green" layout="table"/>
            </h:panelGroup>
            <h1>Editing Navire</h1>
            <h:form>
                <h:panelGrid columns="2">
                    <h:outputText value="Nacleunik:"/>
                    <h:outputText value="#{navire.navire.nacleunik}" title="Nacleunik" />
                    <h:outputText value="Numero:"/>
                    <h:inputText id="numero" value="#{navire.navire.numero}" title="Numero" />
                    <h:outputText value="Radio:"/>
                    <h:inputText id="radio" value="#{navire.navire.radio}" title="Radio" />
                    <h:outputText value="Nom:"/>
                    <h:inputText id="nom" value="#{navire.navire.nom}" title="Nom" />
                    <h:outputText value="Libelle:"/>
                    <h:inputText id="libelle" value="#{navire.navire.libelle}" title="Libelle" />
                    <h:outputText value="Pavillon:"/>
                    <h:inputText id="pavillon" value="#{navire.navire.pavillon}" title="Pavillon" />
                    <h:outputText value="Armateur:"/>
                    <h:inputText id="armateur" value="#{navire.navire.armateur}" title="Armateur" />
                    <h:outputText value="Affreteur:"/>
                    <h:inputText id="affreteur" value="#{navire.navire.affreteur}" title="Affreteur" />
                    <h:outputText value="Capitaine:"/>
                    <h:inputText id="capitaine" value="#{navire.navire.capitaine}" title="Capitaine" />
                    <h:outputText value="Construc:"/>
                    <h:inputText id="construc" value="#{navire.navire.construc}" title="Construc" />
                    <h:outputText value="Type:"/>
                    <h:inputText id="type" value="#{navire.navire.type}" title="Type" />
                    <h:outputText value="Nature:"/>
                    <h:inputText id="nature" value="#{navire.navire.nature}" title="Nature" />
                    <h:outputText value="Volume:"/>
                    <h:inputText id="volume" value="#{navire.navire.volume}" title="Volume" />
                    <h:outputText value="Capacite:"/>
                    <h:inputText id="capacite" value="#{navire.navire.capacite}" title="Capacite" />
                    <h:outputText value="ChargB:"/>
                    <h:inputText id="chargB" value="#{navire.navire.chargB}" title="ChargB" />
                    <h:outputText value="ChargN:"/>
                    <h:inputText id="chargN" value="#{navire.navire.chargN}" title="ChargN" />
                    <h:outputText value="Tare:"/>
                    <h:inputText id="tare" value="#{navire.navire.tare}" title="Tare" />
                    <h:outputText value="Conten:"/>
                    <h:inputText id="conten" value="#{navire.navire.conten}" title="Conten" />
                    <h:outputText value="Longu:"/>
                    <h:inputText id="longu" value="#{navire.navire.longu}" title="Longu" />
                    <h:outputText value="Largeur:"/>
                    <h:inputText id="largeur" value="#{navire.navire.largeur}" title="Largeur" />
                    <h:outputText value="Hauteur:"/>
                    <h:inputText id="hauteur" value="#{navire.navire.hauteur}" title="Hauteur" />
                    <h:outputText value="Nombre:"/>
                    <h:inputText id="nombre" value="#{navire.navire.nombre}" title="Nombre" />
                    <h:outputText value="PortAttac:"/>
                    <h:inputText id="portAttac" value="#{navire.navire.portAttac}" title="PortAttac" />
                    <h:outputText value="Person:"/>
                    <h:inputText id="person" value="#{navire.navire.person}" title="Person" />
                    <h:outputText value="PropAv:"/>
                    <h:inputText id="propAv" value="#{navire.navire.propAv}" title="PropAv" />
                    <h:outputText value="PropAr:"/>
                    <h:inputText id="propAr" value="#{navire.navire.propAr}" title="PropAr" />
                    <h:outputText value="Unite:"/>
                    <h:inputText id="unite" value="#{navire.navire.unite}" title="Unite" />
                    <h:outputText value="Passag:"/>
                    <h:inputText id="passag" value="#{navire.navire.passag}" title="Passag" />
                    <h:outputText value="Quantite:"/>
                    <h:inputText id="quantite" value="#{navire.navire.quantite}" title="Quantite" />
                    <h:outputText value="Texte:"/>
                    <h:inputText id="texte" value="#{navire.navire.texte}" title="Texte" />
                    <h:outputText value="LDeb:"/>
                    <h:inputText id="LDeb" value="#{navire.navire.LDeb}" title="LDeb" />
                    <h:outputText value="Desserte:"/>
                    <h:inputText id="desserte" value="#{navire.navire.desserte}" title="Desserte" />
                    <h:outputText value="NbMot:"/>
                    <h:inputText id="nbMot" value="#{navire.navire.nbMot}" title="NbMot" />
                    <h:outputText value="NbRem:"/>
                    <h:inputText id="nbRem" value="#{navire.navire.nbRem}" title="NbRem" />
                    <h:outputText value="Ligne:"/>
                    <h:inputText id="ligne" value="#{navire.navire.ligne}" title="Ligne" />
                    <h:outputText value="TraitSht:"/>
                    <h:inputText id="traitSht" value="#{navire.navire.traitSht}" title="TraitSht" />
                    <h:outputText value="Emplac:"/>
                    <h:inputText id="emplac" value="#{navire.navire.emplac}" title="Emplac" />
                    <h:outputText value="Affret:"/>
                    <h:inputText id="affret" value="#{navire.navire.affret}" title="Affret" />
                    <h:outputText value="CapGrain:"/>
                    <h:inputText id="capGrain" value="#{navire.navire.capGrain}" title="CapGrain" />
                    <h:outputText value="CapBalle:"/>
                    <h:inputText id="capBalle" value="#{navire.navire.capBalle}" title="CapBalle" />
                    <h:outputText value="GrueBab:"/>
                    <h:inputText id="grueBab" value="#{navire.navire.grueBab}" title="GrueBab" />
                    <h:outputText value="GrueTri:"/>
                    <h:inputText id="grueTri" value="#{navire.navire.grueTri}" title="GrueTri" />
                    <h:outputText value="Categorie:"/>
                    <h:inputText id="categorie" value="#{navire.navire.categorie}" title="Categorie" />
                    <h:outputText value="TLong:"/>
                    <h:inputText id="TLong" value="#{navire.navire.TLong}" title="TLong" />
                    <h:outputText value="TLargeur:"/>
                    <h:inputText id="TLargeur" value="#{navire.navire.TLargeur}" title="TLargeur" />
                    <h:outputText value="Chateau:"/>
                    <h:inputText id="chateau" value="#{navire.navire.chateau}" title="Chateau" />
                    <h:outputText value="Cellularise:"/>
                    <h:inputText id="cellularise" value="#{navire.navire.cellularise}" title="Cellularise" />
                    <h:outputText value="Rampe:"/>
                    <h:inputText id="rampe" value="#{navire.navire.rampe}" title="Rampe" />
                    <h:outputText value="Gestion:"/>
                    <h:inputText id="gestion" value="#{navire.navire.gestion}" title="Gestion" />
                    <h:outputText value="Statut:"/>
                    <h:inputText id="statut" value="#{navire.navire.statut}" title="Statut" />
                    <h:outputText value="Createur:"/>
                    <h:inputText id="createur" value="#{navire.navire.createur}" title="Createur" />
                    <h:outputText value="DCreat:"/>
                    <h:inputText id="DCreat" value="#{navire.navire.DCreat}" title="DCreat" />
                    <h:outputText value="HCreat:"/>
                    <h:inputText id="HCreat" value="#{navire.navire.HCreat}" title="HCreat" />
                    <h:outputText value="Utilisat:"/>
                    <h:inputText id="utilisat" value="#{navire.navire.utilisat}" title="Utilisat" />
                    <h:outputText value="DModif:"/>
                    <h:inputText id="DModif" value="#{navire.navire.DModif}" title="DModif" />
                    <h:outputText value="HModif:"/>
                    <h:inputText id="HModif" value="#{navire.navire.HModif}" title="HModif" />
                    <h:outputText value="Ports:"/>
                    <h:inputText id="ports" value="#{navire.navire.ports}" title="Ports" />
                    <h:outputText value="Manifold:"/>
                    <h:inputText id="manifold" value="#{navire.navire.manifold}" title="Manifold" />
                    <h:outputText value="JaugeUms:"/>
                    <h:inputText id="jaugeUms" value="#{navire.navire.jaugeUms}" title="JaugeUms" />
                    <h:outputText value="Consignes:"/>
                    <h:inputText id="consignes" value="#{navire.navire.consignes}" title="Consignes" />
                    <h:outputText value="DateConsignes:"/>
                    <h:inputText id="dateConsignes" value="#{navire.navire.dateConsignes}" title="DateConsignes" />
                    <h:outputText value="PuisPropAv:"/>
                    <h:inputText id="puisPropAv" value="#{navire.navire.puisPropAv}" title="PuisPropAv" />
                    <h:outputText value="PuisPropAr:"/>
                    <h:inputText id="puisPropAr" value="#{navire.navire.puisPropAr}" title="PuisPropAr" />
                    <h:outputText value="NomCourt:"/>
                    <h:inputText id="nomCourt" value="#{navire.navire.nomCourt}" title="NomCourt" />
                    <h:outputText value="Agent:"/>
                    <h:inputText id="agent" value="#{navire.navire.agent}" title="Agent" />
                    <h:outputText value="LongueurPorte:"/>
                    <h:inputText id="longueurPorte" value="#{navire.navire.longueurPorte}" title="LongueurPorte" />
                    <h:outputText value="NumeroOmi:"/>
                    <h:inputText id="numeroOmi" value="#{navire.navire.numeroOmi}" title="NumeroOmi" />
                    <h:outputText value="NumeroCertificat:"/>
                    <h:inputText id="numeroCertificat" value="#{navire.navire.numeroCertificat}" title="NumeroCertificat" />
                    <h:outputText value="DateCertificat:"/>
                    <h:inputText id="dateCertificat" value="#{navire.navire.dateCertificat}" title="DateCertificat" />
                    <h:outputText value="DatePeremption:"/>
                    <h:inputText id="datePeremption" value="#{navire.navire.datePeremption}" title="DatePeremption" />
                    <h:outputText value="NiveauSurete:"/>
                    <h:inputText id="niveauSurete" value="#{navire.navire.niveauSurete}" title="NiveauSurete" />
                    <h:outputText value="OrganismeCertification:"/>
                    <h:inputText id="organismeCertification" value="#{navire.navire.organismeCertification}" title="OrganismeCertification" />
                    <h:outputText value="PaysCertificat:"/>
                    <h:inputText id="paysCertificat" value="#{navire.navire.paysCertificat}" title="PaysCertificat" />
                    <h:outputText value="EspaceOuvert:"/>
                    <h:inputText id="espaceOuvert" value="#{navire.navire.espaceOuvert}" title="EspaceOuvert" />
                    <h:outputText value="NombreCale:"/>
                    <h:inputText id="nombreCale" value="#{navire.navire.nombreCale}" title="NombreCale" />
                    <h:outputText value="TonnageDeb:"/>
                    <h:inputText id="tonnageDeb" value="#{navire.navire.tonnageDeb}" title="TonnageDeb" />
                    <h:outputText value="TonnageEmb:"/>
                    <h:inputText id="tonnageEmb" value="#{navire.navire.tonnageEmb}" title="TonnageEmb" />
                    <h:outputText value="ValideCapitainerie:"/>
                    <h:inputText id="valideCapitainerie" value="#{navire.navire.valideCapitainerie}" title="ValideCapitainerie" />
                    <h:outputText value="OkCapitaine:"/>
                    <h:inputText id="okCapitaine" value="#{navire.navire.okCapitaine}" title="OkCapitaine" />
                    <h:outputText value="DateCapitaine:"/>
                    <h:inputText id="dateCapitaine" value="#{navire.navire.dateCapitaine}" title="DateCapitaine" />
                    <h:outputText value="HeureCapitaine:"/>
                    <h:inputText id="heureCapitaine" value="#{navire.navire.heureCapitaine}" title="HeureCapitaine" />
                    <h:outputText value="NavirePression:"/>
                    <h:inputText id="navirePression" value="#{navire.navire.navirePression}" title="NavirePression" />
                    <h:outputText value="EscaleCollection:"/>
                    <h:selectManyListbox id="escaleCollection" value="#{navire.navire.jsfcrud_transform[jsfcrud_class['com.github.adminfaces.starter.bean.util.JsfUtil'].jsfcrud_method.collectionToArray][jsfcrud_class['com.github.adminfaces.starter.bean.util.JsfUtil'].jsfcrud_method.arrayToList].escaleCollection}" title="EscaleCollection" size="6" converter="#{escale.converter}" >
                        <f:selectItems value="#{escale.escaleItemsAvailableSelectMany}"/>
                    </h:selectManyListbox>

                </h:panelGrid>
                <br />
                <h:commandLink action="#{navire.edit}" value="Save">
                    <f:param name="jsfcrud.currentNavire" value="#{jsfcrud_class['com.github.adminfaces.starter.bean.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][navire.navire][navire.converter].jsfcrud_invoke}"/>
                </h:commandLink>
                <br />
                <br />
                <h:commandLink action="#{navire.detailSetup}" value="Show" immediate="true">
                    <f:param name="jsfcrud.currentNavire" value="#{jsfcrud_class['com.github.adminfaces.starter.bean.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][navire.navire][navire.converter].jsfcrud_invoke}"/>
                </h:commandLink>
                <br />
                <h:commandLink action="#{navire.listSetup}" value="Show All Navire Items" immediate="true"/>
                <br />

            </h:form>
        </body>
    </html>
</f:view>
