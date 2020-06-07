package com.github.adminfaces.starter.service;

import com.github.adminfaces.starter.model.Document;
import com.github.adminfaces.starter.model.DocumentEVP;
import com.github.adminfaces.starter.model.RedevMarch;
import com.github.adminfaces.starter.model.VueAllEvp;
import com.github.adminfaces.starter.repos.VueAllEvpRepository;
import java.io.Serializable;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
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
public class DocumentEVPService implements Serializable {

    @Inject
    VueAllEvpRepository vueAllEvpRepo;
    private String debut;
    private String fin;
    private List<VueAllEvp> listVueAllEvp;
    private List<DocumentEVP> listDocEVP;

    @PostConstruct
    public void init() {
        listDocEVP = new ArrayList<>();

        System.out.println("LISTE DES EVPS PAR SOURCE ACTUALISEE...");
    }

    public void update(Integer annee) {
        listVueAllEvp = vueAllEvpRepo.listVueAllEvpByAn(annee + "%");
        listVueAllEvp.stream().forEach(evp -> {
            listDocEVP.add(new DocumentEVP(evp.getDepartEff(), evp.getNavire(), evp.getEscale(), evp.getMouvement(), evp.getSource(), 0, 0, 0));
        });
        listDocEVP = listDocEVP.stream().distinct().collect(Collectors.toList());
    }

    public TreeNode createMainDocument(Integer annee) {
        update(annee);
        TreeNode root = new DefaultTreeNode(new DocumentEVP("EVP", "-", "-", "-", "-", 0, 0, 0), null);
        listVueAllEvp.stream()
                .collect(Collectors.groupingBy(evp -> {
                    return evp.getSource();
                }))
                .forEach((t, u) -> {
                    Integer plein = u.stream().collect(Collectors.summingInt(e -> e.getPlein().intValue()));
                    Integer vide = u.stream().collect(Collectors.summingInt(e -> e.getVide().intValue()));
                    Integer total = u.stream().collect(Collectors.summingInt(e -> e.getTotalEvp().intValue()));
                    DocumentEVP doc = new DocumentEVP("", "", "", "", t, plein, vide, total);
                    root.getChildren().add(new DefaultTreeNode(doc));
                });
        return root;
    }

    public TreeNode createDocuments(String debut, String fin) {
        listVueAllEvp = vueAllEvpRepo.listVueAllEvpByDate("20200101", "20200131");
        TreeNode root = new DefaultTreeNode(new DocumentEVP("EVP", "-", "-", "-", "-", 0, 0, 0), null);

        listDocEVP.forEach(doc -> {
            Integer plein = listVueAllEvp.stream().filter(evp -> evp.getDepartEff().equals(doc.getDepartEff())
                    && evp.getEscale().equals(doc.getEscale())
                    && evp.getMouvement().equals(doc.getTrafic())
                    && evp.getNavire().equals(doc.getNavire())
                    && evp.getSource().equals(doc.getSource())).collect(Collectors.summingInt(e -> e.getPlein().intValue()));

            doc.setPlein(plein);

            Integer vide = listVueAllEvp.stream().filter(evp -> evp.getDepartEff().equals(doc.getDepartEff())
                    && evp.getEscale().equals(doc.getEscale())
                    && evp.getMouvement().equals(doc.getTrafic())
                    && evp.getNavire().equals(doc.getNavire())
                    && evp.getSource().equals(doc.getSource())).collect(Collectors.summingInt(e -> e.getVide().intValue()));

            doc.setVide(vide);

            Integer total = listVueAllEvp.stream().filter(evp -> evp.getDepartEff().equals(doc.getDepartEff())
                    && evp.getEscale().equals(doc.getEscale())
                    && evp.getMouvement().equals(doc.getTrafic())
                    && evp.getNavire().equals(doc.getNavire())
                    && evp.getSource().equals(doc.getSource())).collect(Collectors.summingInt(e -> e.getTotalEvp().intValue()));

            doc.setTotalEvp(total);

            TreeNode mouvement = new DefaultTreeNode(doc, root);

        });
        return root;
    }

    public TreeNode createDocuments(Integer annee) {
        update(annee);
        DecimalFormat df = new DecimalFormat("#,##0");
        TreeNode root = new DefaultTreeNode(new DocumentEVP("EVP", "-", "-", "-", "-", 0, 0, 0), null);

        listDocEVP.forEach(doc -> {
            if (doc.getEscale() == null || doc.getTrafic() == null || doc.getNavire() == null || doc.getSource() == null) {
                System.out.println("OK");
            };
            Integer plein = listVueAllEvp.stream().filter(evp ->
                    evp.getDepartEff().equals(doc.getDepartEff())
                    && evp.getMouvement().equals(doc.getTrafic())
                    && evp.getEscale().equals(doc.getEscale())
                    && evp.getNavire().equals(doc.getNavire())
                    && evp.getSource().equals(doc.getSource()))
                    .collect(Collectors.summingInt(e -> e.getPlein() == null ? 0 : e.getPlein().intValue()));

            doc.setPlein(plein);

            Integer vide = listVueAllEvp.stream().filter(evp -> evp.getDepartEff().equals(doc.getDepartEff())
                    && evp.getEscale().equals(doc.getEscale())
                    && evp.getMouvement().equals(doc.getTrafic())
                    && evp.getNavire().equals(doc.getNavire())
                    && evp.getSource().equals(doc.getSource()))
                    .collect(Collectors.summingInt(e -> e.getVide() == null ? 0 : e.getVide().intValue()));

            doc.setVide(vide);

            Integer total = listVueAllEvp.stream().filter(evp -> evp.getDepartEff().equals(doc.getDepartEff())
                    && evp.getEscale().equals(doc.getEscale())
                    && evp.getMouvement().equals(doc.getTrafic())
                    && evp.getNavire().equals(doc.getNavire())
                    && evp.getSource().equals(doc.getSource()))
                    .collect(Collectors.summingInt(e -> e.getTotalEvp() == null ? 0 : e.getTotalEvp().intValue()));

            doc.setTotalEvp(total);

            TreeNode mouvement = new DefaultTreeNode(doc, root);

        });
        return root;
    }

    public String getDebut() {
        return debut;
    }

    public void setDebut(String debut) {
        this.debut = debut;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public List<DocumentEVP> getListDocEVP() {
        return listDocEVP;
    }

    public void setListDocEVP(List<DocumentEVP> listDocEVP) {
        this.listDocEVP = listDocEVP;
    }

}
