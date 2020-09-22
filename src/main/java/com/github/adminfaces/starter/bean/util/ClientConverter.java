/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.bean.util;

import com.github.adminfaces.starter.model.Client;
import com.github.adminfaces.starter.model.Client_;
import com.github.adminfaces.starter.model.User;
import com.github.adminfaces.template.exception.BusinessException;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import org.apache.deltaspike.data.api.AbstractFullEntityRepository;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.impl.criteria.QueryCriteria;
import org.hibernate.criterion.CriteriaQuery;

/**
 *
 * @author Calvin ILOKI
 */
@Named
@RequestScoped
public class ClientConverter implements Converter {

    @Inject
    EntityManager entityManager;
    QueryCriteria cr ;

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String string) {
        cr = new QueryCriteria(Client.class, Client.class, entityManager);
        if (string != null && !string.isEmpty()) {
            return cr.eq(Client_.code, string)
                    .getSingleResult();
        } else {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null) {
            return "";
        }
        if (object instanceof Client) {
            Client client = (Client) object;
            return client.getCode();

        } else {
            throw new BusinessException("object " + object + " is of type " + object.getClass().getName() + "; expected type: com.github.adminfaces.starter.model.Client");
        }
    }

}
