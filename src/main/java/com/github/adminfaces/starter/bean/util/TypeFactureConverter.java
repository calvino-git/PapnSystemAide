/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.bean.util;

import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Named;

/**
 *
 * @author Calvin ILOKI
 */
@Named
@RequestScoped
public class TypeFactureConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String string) {
        switch (string) {
            case "FACTURE":
                return "1";
            case "AVOIR":
                return "2";
            case "AVOIR INTERNE":
                return "3";
            case "BROUILLARD":
                return "4";
            case "ACOMPTE":
                return "5";
            case "DUPLICATA":
                return "6";
            case "NOTE DE CREDIT":
                return "7";
            case "COMPLEMENTAIRE":
                return "8";
            case "REMPLACEMENT":
                return "9";
            default:
                return "";
        }
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null) {
            return "";
        }
        if (object instanceof String) {
            String type = (String) object;
            switch (type) {
                case "1":
                    return "FACTURE";
                case "2":
                    return "AVOIR";
                case "3":
                    return "AVOIR INTERNE";
                case "4":
                    return "BROUILLARD";
                case "5":
                    return "ACOMPTE";
                case "6":
                    return "DUPLICATA";
                case "7":
                    return "NOTE DE CREDIT";
                case "8":
                    return "COMPLEMENTAIRE";
                case "9":
                    return "REMPLACEMENT";
                default:
                    return "";
            }
        } else {
            throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: com.github.adminfaces.starter.model.Escale");
        }
    }

}
