/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.service;

import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.starter.model.Agent;
import com.github.adminfaces.starter.repos.AgentRepository;
import java.io.Serializable;
import javax.ejb.Startup;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Calvin ILOKI
 */
@Stateless
@Startup
public class AgentService extends CrudService<Agent, String> implements Serializable {
    @Inject
    protected AgentRepository escaleRepo;
}
