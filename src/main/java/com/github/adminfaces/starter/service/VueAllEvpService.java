/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.service;

import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.starter.model.VueAllEvp;
import com.github.adminfaces.starter.model.VueSourceEvp;
import com.github.adminfaces.starter.model.VueSourceEvpAnnee;
import com.github.adminfaces.starter.repos.VueAllEvpRepository;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import javax.ejb.Startup;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Calvin ILOKI
 */
@Stateless
@Startup
public class VueAllEvpService extends CrudService<VueAllEvp, Integer> implements Serializable {
    @Inject
    protected VueAllEvpRepository vueAllEvpRepo;

    public BigInteger totalEVPParSourceParTraficEtParAn(String annee, String trafic, String source) {
        BigInteger total = vueAllEvpRepo.totalEVPParSourceParTraficEtParAn(annee,"%" + trafic + "%", source);
        return total;
    }
    public List<VueSourceEvpAnnee> listeEVPParSourceEtParAnnee(Integer annee) {
        List<VueSourceEvpAnnee> list = vueAllEvpRepo.listeEVPParSourceEtParAnnee(annee.toString());
        return list;
    }
    
}
