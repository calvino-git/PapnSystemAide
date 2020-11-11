package com.github.adminfaces.starter.bean;

import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.persistence.service.Service;
import com.github.adminfaces.starter.model.User;
import com.github.adminfaces.template.config.AdminConfig;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import java.io.Serializable;
import javax.security.enterprise.identitystore.Pbkdf2PasswordHash;


@Singleton
@Startup
public class InitAppBean implements Serializable {

    @Inject
    @Service
    private CrudService<User, Integer> crudService;

    @Inject
    AdminConfig adminConfig;
    
    @Inject
    Pbkdf2PasswordHash passwordHash;

    @PostConstruct
    public void init() {
        adminConfig.setRenderFormAsterisks(true);
        adminConfig.setDateFormat("dd/MM/yyyy HH:mm:ss");
        create();
    }
    
    private void create() {
        User user = new User(Long.valueOf(1), "admin", "Administrateur", "Administration", passwordHash.generate("admin".toCharArray()));
        user.setId(10);
        crudService.insert(user);
    }
}
