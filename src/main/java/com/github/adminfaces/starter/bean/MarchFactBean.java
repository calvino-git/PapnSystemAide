package com.github.adminfaces.starter.bean;

import com.github.adminfaces.starter.model.Marchfact;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import com.github.adminfaces.starter.service.MarchfactService;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

/**
 * Created by rmpestano on 12/02/17.
 */
@Named
@SessionScoped
public class MarchFactBean implements Serializable {
    private Date debut;
    private Date fin;
    private List<Marchfact> list;
    private List<Marchfact> filtered;
    private List<String> columnHeaders;
    private static List<String> VALID_COLUMN_KEYS;
    private List<ColumnModel> columns;
    private String columnTemplate = "id departEffectif type";

    @Inject
    private MarchfactService marchFactService;

    @PostConstruct
    public void init() {
        System.out.println("MarchFacture initialisé...");
        list = marchFactService.getList();
        int t = Marchfact.class.getFields().length;
        for(int i=0; i<t; i++){
            String field = Marchfact.class.getDeclaredFields()[i].getName();
            System.out.println("Champ : " + field);
            columnHeaders.add(field);
        }
        VALID_COLUMN_KEYS = columnHeaders;
        createDynamicColumns();
    }
    
    public void updateList(){
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        marchFactService.listMarchFactByDepart(format.format(debut), format.format(fin));
        list = marchFactService.getList();
    }
    
    public List<ColumnModel> getColumns() {
        return columns;
    }
 
    private void createDynamicColumns() {
        String[] columnKeys = columnTemplate.split(" ");
        columns = new ArrayList<>();   
         
        for(String columnKey : columnKeys) {
            String key = columnKey.trim();
             
            if(VALID_COLUMN_KEYS.contains(key)) {
                columns.add(new ColumnModel(columnKey.toUpperCase(), columnKey));
            }
        }
    }

    public List<Marchfact> getFiltered() {
        return filtered;
    }

    public void setFiltered(List<Marchfact> filtered) {
        this.filtered = filtered;
    }

    public static List<String> getVALID_COLUMN_KEYS() {
        return VALID_COLUMN_KEYS;
    }

    public static void setVALID_COLUMN_KEYS(List<String> VALID_COLUMN_KEYS) {
        MarchFactBean.VALID_COLUMN_KEYS = VALID_COLUMN_KEYS;
    }

    public String getColumnTemplate() {
        return columnTemplate;
    }

    public void setColumnTemplate(String columnTemplate) {
        this.columnTemplate = columnTemplate;
    }
     
    public void updateColumns() {
        //reset table state
        UIComponent table = FacesContext.getCurrentInstance().getViewRoot().findComponent(":form:mfTable");
        table.setValueExpression("sortBy", null);
         
        //update columns
        createDynamicColumns();
    }
    
    static public class ColumnModel implements Serializable {
 
        private String header;
        private String property;
 
        public ColumnModel(String header, String property) {
            this.header = header;
            this.property = property;
        }
 
        public String getHeader() {
            return header;
        }
 
        public String getProperty() {
            return property;
        }
    }

    public List<String> getColumnHeaders() {
        return columnHeaders;
    }

    public void setColumnHeaders(List<String> columnHeaders) {
        this.columnHeaders = columnHeaders;
    }

    public List<Marchfact> getList() {
        return list;
    }

    public void setList(List<Marchfact> list) {
        this.list = list;
    }

    public Date getDebut() {
        return debut;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    

    public MarchfactService getMarchFactService() {
        return marchFactService;
    }

    public void setMarchFactService(MarchfactService marchFactService) {
        this.marchFactService = marchFactService;
    }

   

}
