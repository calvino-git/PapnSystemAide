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
public class MoisComptableConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String string) {
        return string;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null) {
            return "";
        }
        if (object instanceof String) {
            String string = (String) object;
            if (!string.isEmpty() && string.length() == 6) {
                switch (string.substring(4)) {
                    case "01":
                        return "JAN. " + string.substring(0, 4);
                    case "02":
                        return "FEV. " + string.substring(0, 4);
                    case "03":
                        return "MARS " + string.substring(0, 4);
                    case "04":
                        return "AVR. " + string.substring(0, 4);
                    case "05":
                        return "MAI " + string.substring(0, 4);
                    case "06":
                        return "JUIN " + string.substring(0, 4);
                    case "07":
                        return "JUIL. " + string.substring(0, 4);
                    case "08":
                        return "AOUT " + string.substring(0, 4);
                    case "09":
                        return "SEPT. " + string.substring(0, 4);
                    case "10":
                        return "OCT. " + string.substring(0, 4);
                    case "11":
                        return "NOV. " + string.substring(0, 4);
                    case "12":
                        return "DÉC. " + string.substring(0, 4);
                    default:
                        return "";
                }
            } else {
                return "";
            }

        } else {
            throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: com.github.adminfaces.starter.model.Escale");
        }
    }

}
