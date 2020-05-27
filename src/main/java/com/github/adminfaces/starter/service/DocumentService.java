package com.github.adminfaces.starter.service;

import com.github.adminfaces.starter.model.Document;
import com.github.adminfaces.starter.model.RedevMarch;
import com.github.adminfaces.starter.repos.RedevMarchRepository;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import org.primefaces.model.CheckboxTreeNode;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

@Singleton
@Startup
public class DocumentService implements Serializable {

    @Inject
    RedevMarchRepository redMarchRepo;

    private String totalTonnageConteneur;
    private String totalTonnageConvent;
    private String totalMontantConteneur;
    private String totalMontantConvent;
    private List<RedevMarch> listRedevMarch;
    private Stream<RedevMarch> streamConteneurTonnage;
    private Stream<RedevMarch> streamConventionTonnage;
    private Stream<RedevMarch> streamConteneurMontant;
    private Stream<RedevMarch> streamConventionMontant;

    @PostConstruct
    public void init() {
        
    }
    
    public void update(Integer annee){
        listRedevMarch = redMarchRepo.listRedevMarchByAn(annee);
        streamConteneurTonnage = listRedevMarch.stream().filter(rm -> rm.getCondit() != null && rm.getCondit().startsWith("TCS"));
        streamConventionTonnage = listRedevMarch.stream().filter(rm -> rm.getCondit() != null && !rm.getCondit().startsWith("TCS"));
        streamConteneurMontant = listRedevMarch.stream().filter(rm -> rm.getTarif() != null && rm.getTarif().startsWith("MARCHANDTCS"));
        streamConventionMontant = listRedevMarch.stream().filter(rm -> rm.getTarif() != null && !rm.getTarif().startsWith("MARCHANDTCS"));

        DecimalFormat df = new DecimalFormat("#,##0");

        totalTonnageConteneur = df.format(streamConteneurTonnage.collect(Collectors.summingDouble(rm -> rm.getTonnage()))/1000);
        System.out.println("[" + LocalDateTime.now() + "] Total Tonnage Conteneur : " + totalTonnageConteneur);

        totalTonnageConvent = df.format(streamConventionTonnage.collect(Collectors.summingDouble(rm -> rm.getTonnage()))/1000);
        System.out.println("[" + LocalDateTime.now() + "] Total Tonnage Conventionnel : " + totalTonnageConvent);

        totalMontantConteneur = df.format(streamConteneurMontant.collect(Collectors.summingDouble(rm -> rm.getMontant())));
        System.out.println("[" + LocalDateTime.now() + "] Total Montant Conteneur : " + totalMontantConteneur);

        totalMontantConvent = df.format(streamConventionMontant.collect(Collectors.summingDouble(rm -> rm.getMontant())));
        System.out.println("[" + LocalDateTime.now() + "] Total Montant Conventionnel : " + totalMontantConvent);
    }

    public TreeNode createDocuments(Integer annee) {
        update(annee);
        DecimalFormat df = new DecimalFormat("#,##0");
        TreeNode root = new DefaultTreeNode(new Document("Marchandise", "-", "-"), null);

        TreeNode tcs = new DefaultTreeNode(new Document("CONTENEUR", totalTonnageConteneur, totalMontantConteneur), root);
        TreeNode cv = new DefaultTreeNode(new Document("AUTRES", totalTonnageConvent, totalMontantConvent), root);

        //Conteneurisée
        streamConteneurTonnage = listRedevMarch.stream().filter(rm -> rm.getCondit() != null && rm.getCondit().startsWith("TCS"));
        Map<String, Double> mapStreamConteneurTonnage = streamConteneurTonnage
                .collect(Collectors.collectingAndThen(Collectors.toMap(rm -> rm.getCondit(), rm -> rm.getTonnage()), Collections::<String, Double>unmodifiableMap));
        streamConteneurMontant = listRedevMarch.stream().filter(rm -> rm.getTarif() != null && rm.getTarif().startsWith("MARCHANDTCS"));
        Map<String, Double> mapStreamConteneurMontant = streamConteneurMontant
                .collect(Collectors.collectingAndThen(Collectors.toMap(rm -> rm.getTarif(), rm -> rm.getMontant()), Collections::<String, Double>unmodifiableMap));
        
        
        for (Map.Entry<String, Double> entry : mapStreamConteneurTonnage.entrySet()) {
            Document doc = new Document(entry.getKey(), df.format(entry.getValue()/1000), "");
            Double montant = 0.0;
            for (Map.Entry<String, Double> entry2 : mapStreamConteneurMontant.entrySet()) {
                if (entry2.getKey().contains(entry.getKey())) {
                    montant += entry2.getValue();
                }
            }
            doc.setMontant(df.format(montant));
            TreeNode expenses = new DefaultTreeNode("document", doc, tcs);
        }
        //Conventionnelle
        streamConventionTonnage = listRedevMarch.stream().filter(rm -> rm.getCondit() != null && !rm.getCondit().startsWith("TCS"));
        Map<String, Double> mapStreamConventionTonnage = streamConventionTonnage
                .collect(Collectors.collectingAndThen(Collectors.toMap(rm -> rm.getCondit(), rm -> rm.getTonnage()), Collections::<String, Double>unmodifiableMap));
        streamConventionMontant = listRedevMarch.stream().filter(rm -> rm.getTarif() != null && !rm.getTarif().startsWith("MARCHANDTCS"));
        Map<String, Double> mapStreamConventionMontant = streamConventionMontant
                .collect(Collectors.collectingAndThen(Collectors.toMap(rm -> rm.getTarif(), rm -> rm.getMontant()), Collections::<String, Double>unmodifiableMap));
        
        
        for (Map.Entry<String, Double> entry : mapStreamConventionTonnage.entrySet()) {
            Document doc = new Document(entry.getKey(), df.format(entry.getValue()/1000), "");
            Double montant = 0.0;
            for (Map.Entry<String, Double> entry2 : mapStreamConventionMontant.entrySet()) {
                if (entry2.getKey().contains(entry.getKey())) {
                    montant += entry2.getValue();
                }
            }
            doc.setMontant(df.format(montant));
            TreeNode expenses = new DefaultTreeNode("document", doc, cv);
        }

        return root;
    }

    public TreeNode createCheckboxDocuments() {
        TreeNode root = new CheckboxTreeNode(new Document("Files", "-", "Folder"), null);

        TreeNode documents = new CheckboxTreeNode(new Document("Documents", "-", "Folder"), root);
        TreeNode pictures = new CheckboxTreeNode(new Document("Pictures", "-", "Folder"), root);
        TreeNode movies = new CheckboxTreeNode(new Document("Movies", "-", "Folder"), root);

        TreeNode work = new CheckboxTreeNode(new Document("Work", "-", "Folder"), documents);
        TreeNode primefaces = new CheckboxTreeNode(new Document("PrimeFaces", "-", "Folder"), documents);

        //Documents
        TreeNode expenses = new CheckboxTreeNode("document", new Document("Expenses.doc", "30 KB", "Word Document"), work);
        TreeNode resume = new CheckboxTreeNode("document", new Document("Resume.doc", "10 KB", "Word Document"), work);
        TreeNode refdoc = new CheckboxTreeNode("document", new Document("RefDoc.pages", "40 KB", "Pages Document"), primefaces);

        //Pictures
        TreeNode barca = new CheckboxTreeNode("picture", new Document("barcelona.jpg", "30 KB", "JPEG Image"), pictures);
        TreeNode primelogo = new CheckboxTreeNode("picture", new Document("logo.jpg", "45 KB", "JPEG Image"), pictures);
        TreeNode optimus = new CheckboxTreeNode("picture", new Document("optimusprime.png", "96 KB", "PNG Image"), pictures);

        //Movies
        TreeNode pacino = new CheckboxTreeNode(new Document("Al Pacino", "-", "Folder"), movies);
        TreeNode deniro = new CheckboxTreeNode(new Document("Robert De Niro", "-", "Folder"), movies);

        TreeNode scarface = new CheckboxTreeNode("mp3", new Document("Scarface", "15 GB", "Movie File"), pacino);
        TreeNode carlitosWay = new CheckboxTreeNode("mp3", new Document("Carlitos' Way", "24 GB", "Movie File"), pacino);

        TreeNode goodfellas = new CheckboxTreeNode("mp3", new Document("Goodfellas", "23 GB", "Movie File"), deniro);
        TreeNode untouchables = new CheckboxTreeNode("mp3", new Document("Untouchables", "17 GB", "Movie File"), deniro);

        return root;
    }
}
