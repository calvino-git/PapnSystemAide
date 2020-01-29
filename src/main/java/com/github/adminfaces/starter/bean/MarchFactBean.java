package com.github.adminfaces.starter.bean;

import com.github.adminfaces.starter.model.Marchfact;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import com.github.adminfaces.starter.service.MarchfactService;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import org.apache.poi.ss.usermodel.Color;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

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
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        try {
            debut = format.parse(marchFactService.getDebut());
            fin = format.parse(marchFactService.getFin());
        } catch (ParseException ex) {
            Logger.getLogger(MarchFactBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        columnHeaders = new ArrayList<>();
        list = marchFactService.getList();
        Marchfact march = new Marchfact();
        Field[] fields = march.getClass().getDeclaredFields();
        int t = fields.length;
        for (int i = 2; i < t; i++) {
            String field = Marchfact.class.getDeclaredFields()[i].getName();
            columnHeaders.add(field);
        }
        VALID_COLUMN_KEYS = columnHeaders;
        createDynamicColumns();
        System.out.println("MarchFactureBean initialisé...");
    }
    
    public String simpleDate(Date date){
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        return format.format(date);
    }

    public void postProcessXLS(Object document) {
    XSSFWorkbook wb = (XSSFWorkbook) document;
    XSSFSheet sheet = wb.getSheetAt(0);
    XSSFRow header = sheet.getRow(0);
    XSSFCellStyle cellStyle = wb.createCellStyle();
    cellStyle.setFillForegroundColor((short) 12);

    for(int i=0; i < header.getPhysicalNumberOfCells();i++) {
        header.getCell(i).setCellStyle(cellStyle);
    }
}
    public void updateList() {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        marchFactService.listMarchFactByDepart(format.format(debut), format.format(fin));
        list = marchFactService.getList();
    }

    public List<ColumnModel> getColumns() {
        return columns;
    }

    private void createDynamicColumns() {
        List<String> columnKeys = columnHeaders.stream().filter(col-> !col.startsWith("_"))
                .collect(Collectors.toList());
        columns = new ArrayList<>();

        columnKeys.forEach((columnKey) -> {
            String key = columnKey;
            if (VALID_COLUMN_KEYS.contains(key)) {
                columns.add(new ColumnModel(columnKey.toUpperCase(), columnKey));
            }
        });
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
