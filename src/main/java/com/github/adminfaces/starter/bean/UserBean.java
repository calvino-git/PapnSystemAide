/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.bean;

import com.github.adminfaces.persistence.bean.BeanService;
import com.github.adminfaces.persistence.bean.CrudMB;
import com.github.adminfaces.starter.model.User;
import com.github.adminfaces.starter.service.LoginService;
import org.omnifaces.cdi.ViewScoped;
import org.omnifaces.util.Faces;

import javax.inject.Named;
import java.io.Serializable;
import java.util.logging.Level;
import javax.inject.Inject;
import javax.security.enterprise.identitystore.Pbkdf2PasswordHash;
import org.glassfish.soteria.identitystores.hash.Pbkdf2PasswordHashImpl;

/**
 * @author rmpestano
 */
@Named
@ViewScoped
@BeanService(LoginService.class)//use annotation instead of setter
public class UserBean extends CrudMB<User> implements Serializable {

    
    @Override
    public User save(){
        String password = entity.getPassword();
        Pbkdf2PasswordHash passwordHash =  new Pbkdf2PasswordHashImpl();
        entity.setPassword(passwordHash.generate(password.toCharArray()));
        return super.save();
    }
    @Override
    public void afterRemove() {
        try {
            addDetailMsg("User " + entity.toString()
                    + " a été supprimé.");
            Faces.redirect("user.xhtml");
            clear();
            sessionFilter.clear(UserBean.class.getName());//removes filter saved in session for CarListMB.
        } catch (Exception e) {
            log.log(Level.WARNING, "", e);
        }
    }

    @Override
    public void afterInsert() {
        addDetailMsg("User " + entity.toString() + " créé avec succès.");
    }

    @Override
    public void afterUpdate() {
        addDetailMsg("User " + entity.toString() + " mis à jour avec succès");
    }


}
