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
public class DateConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String string) {
        if (string != null && !string.isEmpty() && string.length() == 10) {
            String[] str = string.split("/");
            return str[2] + str[1] + str[0];
        } else {
            return "";
        }
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null) {
            return "";
        }
        if (object instanceof String) {
            String string = (String) object;
            if (!string.isEmpty() && string.length() == 8) {
                return string.substring(6) + "/" + string.substring(4, 6) + "/" + string.substring(0, 4);
            } else {
                return "";
            }

        } else {
            throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: com.github.adminfaces.starter.model.Escale");
        }
    }

}
