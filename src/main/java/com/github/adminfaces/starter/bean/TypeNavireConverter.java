/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.bean;

import com.github.adminfaces.starter.model.TypeNavire;
import com.github.adminfaces.starter.repos.TypeNavireRepository;
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
public class TypeNavireConverter implements Serializable,Converter {

    @Inject
    TypeNavireRepository typeNavireRepo;

    public Object getAsObject(FacesContext facesContext, UIComponent component, String string) {
        if (string == null || string.length() == 0) {
            return null;
        }
        TypeNavire t = typeNavireRepo.rechercherTypeNavireParLibelle(string);
        return t;
    }

    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof TypeNavire) {
            TypeNavire o = (TypeNavire) object;
            return o == null ? "" : o.getLibelle();
        } else {
            throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: com.github.adminfaces.starter.model.TypeNavire");
        }
    }

}
