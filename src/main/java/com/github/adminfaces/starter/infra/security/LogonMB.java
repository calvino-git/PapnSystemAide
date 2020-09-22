package com.github.adminfaces.starter.infra.security;

import com.github.adminfaces.template.session.AdminSession;
import org.omnifaces.util.Faces;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Specializes;
import javax.inject.Named;
import java.io.IOException;
import java.io.Serializable;

import static com.github.adminfaces.persistence.util.Messages.addDetailMessage;
import com.github.adminfaces.starter.model.User;
import com.github.adminfaces.starter.service.LoginService;
import com.github.adminfaces.template.config.AdminConfig;
import javax.inject.Inject;

/**
 * Created by rmpestano on 12/20/14.
 *
 * This is just a login example.
 *
 * AdminSession uses isLoggedIn to determine if user must be redirect to login
 * page or not. By default AdminSession isLoggedIn always resolves to true so it
 * will not try to redirect user.
 *
 * If you already have your authorization mechanism which controls when user
 * must be redirect to initial page or logon you can skip this class.
 */
@Named
@SessionScoped
@Specializes
public class LogonMB extends AdminSession implements Serializable {

    private User currentUser;
    private String email;
    private String password;
    private boolean remember;
    private String errorLogin;
    private Integer tentative=0;

    @Inject
    private AdminConfig adminConfig;
    @Inject
    private LoginService loginService;

    public void login() throws IOException {
        currentUser = loginService.checkUser(email, password);
        if (currentUser != null) {
            addDetailMessage(currentUser + " est connecté avec succès");
            Faces.redirect(adminConfig.getIndexPage());
        }else{
            errorLogin="Login ou mot de passe incorrect! " + ++tentative;
            Faces.redirect(adminConfig.getLoginPage());
        }

    }

    public Integer getTentative() {
        return tentative;
    }

    public void setTentative(Integer tentative) {
        this.tentative = tentative;
    }

    @Override
    public boolean isLoggedIn() {

        return currentUser != null;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRemember() {
        return remember;
    }

    public void setRemember(boolean remember) {
        this.remember = remember;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public String getErrorLogin() {
        return errorLogin;
    }

    public void setErrorLogin(String errorLogin) {
        this.errorLogin = errorLogin;
    }
}
