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
    private BigInteger totalImpEVPParAn;
    private BigInteger totalExpEVPParAn;
    private BigInteger totalTstEVPParAn;
    private BigInteger totalTrbEVPParAn;
    private BigInteger totalImpTonnageParAn;
    private BigInteger totalExpTonnageParAn;
    private BigInteger totalTstTonnageParAn;
    private BigInteger totalTrbTonnageParAn;

    @PostConstruct
    public void init(){
        update();
        System.out.println("[" + LocalDateTime.now() + "] CCTService initialisé...");
    }
    
    @Schedule(minute = "*/8",persistent = false)
    public void update(){
        System.out.println("[" + LocalDateTime.now() + "] Tonnage et EVP mis à jour ...");
        String annee = String.valueOf(LocalDate.now().getYear());
        this.totalEVPParAn = tctRepo.getTotalEVPParAn(annee);
        this.totalImpEVPParAn = tctRepo.getTotalImportEVPParAn(annee);
        this.totalExpEVPParAn = tctRepo.getTotalExportEVPParAn(annee);
        this.totalTrbEVPParAn = tctRepo.getTotalTransboEVPParAn(annee);
        this.totalTstEVPParAn = tctRepo.getTotalTransitEVPParAn(annee);
        this.totalImpTonnageParAn = tctRepo.getTotalImportTonnageParAn(annee);
        this.totalExpTonnageParAn = tctRepo.getTotalExportTonnageParAn(annee);
        this.totalTrbTonnageParAn = tctRepo.getTotalTransboTonnageParAn(annee);
        this.totalTstTonnageParAn = tctRepo.getTotalTransitTonnageParAn(annee);
        this.totalTonnageParAn = tctRepo.getTotalPoidsConteneurParAn(annee);
    }

    public BigInteger getTotalImpTonnageParAn() {
        return totalImpTonnageParAn;
    }

    public void setTotalImpTonnageParAn(BigInteger totalImpTonnageParAn) {
        this.totalImpTonnageParAn = totalImpTonnageParAn;
    }

    public BigInteger getTotalExpTonnageParAn() {
        return totalExpTonnageParAn;
    }

    public void setTotalExpTonnageParAn(BigInteger totalExpTonnageParAn) {
        this.totalExpTonnageParAn = totalExpTonnageParAn;
    }

    public BigInteger getTotalTstTonnageParAn() {
        return totalTstTonnageParAn;
    }

    public void setTotalTstTonnageParAn(BigInteger totalTstTonnageParAn) {
        this.totalTstTonnageParAn = totalTstTonnageParAn;
    }

    public BigInteger getTotalTrbTonnageParAn() {
        return totalTrbTonnageParAn;
    }

    public void setTotalTrbTonnageParAn(BigInteger totalTrbTonnageParAn) {
        this.totalTrbTonnageParAn = totalTrbTonnageParAn;
    }

    
    public BigInteger getTotalTstEVPParAn() {
        return totalTstEVPParAn;
    }

    public void setTotalTstEVPParAn(BigInteger totalTstEVPParAn) {
        this.totalTstEVPParAn = totalTstEVPParAn;
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

    public BigInteger getTotalImpEVPParAn() {
        return totalImpEVPParAn;
    }

    public void setTotalImpEVPParAn(BigInteger totalImpEVPParAn) {
        this.totalImpEVPParAn = totalImpEVPParAn;
    }

    public BigInteger getTotalExpEVPParAn() {
        return totalExpEVPParAn;
    }

    public void setTotalExpEVPParAn(BigInteger totalExpEVPParAn) {
        this.totalExpEVPParAn = totalExpEVPParAn;
    }

    public BigInteger getTotalTrbEVPParAn() {
        return totalTrbEVPParAn;
    }

    public void setTotalTrbEVPParAn(BigInteger totalTrbEVPParAn) {
        this.totalTrbEVPParAn = totalTrbEVPParAn;
    }
    
}
