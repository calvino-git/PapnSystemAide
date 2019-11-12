/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.service;

import com.github.adminfaces.starter.repos.TdrCongoTerminalRepository;
import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.annotation.PostConstruct;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import javax.inject.Inject;

/**
 *
 * @author Calvin ILOKI
 */
@Singleton
@Startup
public class ConteneurCongoTerminalService implements Serializable {
    
    @Inject
    TdrCongoTerminalRepository tctRepo;
    
    private BigInteger totalTonnageParAn;
    private BigInteger totalEVPParAn;

    @PostConstruct
    public void init(){
        update();
        System.out.println("CCTService initialisé...");
    }
    
    @Schedule(minute = "*/8",persistent = false)
    public void update(){
        this.totalEVPParAn = tctRepo.getTotalEVPParAn(String.valueOf(LocalDate.now().getYear()));
        this.totalTonnageParAn = tctRepo.getTotalPoidsConteneurParAn(String.valueOf(LocalDate.now().getYear()));
        System.out.println("[" + LocalDateTime.now() + "] Tonnage et EVP mis à jour ...");
    }

    public BigInteger getTotalTonnageParAn() {
        return totalTonnageParAn;
    }

    public void setTotalTonnageParAn(BigInteger totalTonnageParAn) {
        this.totalTonnageParAn = totalTonnageParAn;
    }

    public BigInteger getTotalEVPParAn() {
        return totalEVPParAn;
    }

    public void setTotalEVPParAn(BigInteger totalEVPParAn) {
        this.totalEVPParAn = totalEVPParAn;
    }
}
