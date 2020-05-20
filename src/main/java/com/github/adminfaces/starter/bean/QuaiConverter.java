/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.bean;

import com.github.adminfaces.starter.model.Quais;
import com.github.adminfaces.starter.repos.EscaleRepository;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Calvin ILOKI
 */
@Named
@SessionScoped
public class QuaiConverter implements Serializable,Converter {

    @Inject
    EscaleRepository escaleRepo;

    public Object getAsObject(FacesContext facesContext, UIComponent component, String string) {
        if (string == null || string.length() == 0) {
            return null;
        }
        Quais t = escaleRepo.listeQuai(string).get(0);
        return t;
    }

    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof Quais) {
            Quais o = (Quais) object;
            return o == null ? "" : o.getLibelle();
        } else {
            throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: com.github.adminfaces.starter.model.Quais");
        }
    }

}
