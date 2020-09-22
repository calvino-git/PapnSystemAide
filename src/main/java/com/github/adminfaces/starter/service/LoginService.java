/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.service;

import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.starter.model.User;
import com.github.adminfaces.starter.repos.LoginRepository;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

/**
 * @author rmpestano
 *@Stateless
 **/
public class LoginService extends CrudService<User, Integer> implements Serializable {
    @Inject
    LoginRepository loginRepo;
    
    public User checkUser(String userid,String password){
        List<User> users = loginRepo.check(userid, password);
        return users.isEmpty()?null:users.get(0);
    }
}
