package com.github.adminfaces.starter.bean;

import com.github.adminfaces.starter.model.Marchfact;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import com.github.adminfaces.starter.service.MarchfactService;
import java.awt.Color;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import org.apache.poi.hssf.usermodel.HSSFPalette;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.TableStyle;
import org.apache.poi.ss.usermodel.TableStyleType;
import org.apache.poi.ss.util.AreaReference;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.DefaultIndexedColorMap;
import org.apache.poi.xssf.usermodel.IndexedColorMap;
import org.apache.poi.xssf.usermodel.XSSFBuiltinTableStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFTable;
import org.apache.poi.xssf.usermodel.XSSFTableStyle;
import org.apache.poi.xssf.usermodel.XSSFTableStyleInfo;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.schema.SchemaTypeImpl;
import org.apache.xmlbeans.impl.schema.SchemaTypeSystemImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxfs;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyle;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTDxfsImpl;

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
        Field[] fields = Marchfact.class.getDeclaredFields();
        int t = fields.length;
        for (int i = 2; i < t; i++) {
            String field = Marchfact.class.getDeclaredFields()[i].getName();
            columnHeaders.add(field);
        }
        VALID_COLUMN_KEYS = columnHeaders;
        createDynamicColumns();
        System.out.println("MarchFactureBean initialisé...");
    }

    public String simpleDate(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        return format.format(date);
    }

    public void postProcessXLS(Object document) {
        XSSFWorkbook wb = (XSSFWorkbook) document;
        XSSFSheet sheet = wb.getSheetAt(0);
        CellReference cellRefTopLeft = new CellReference(sheet.getFirstRowNum(), 0);
        CellReference cellRefBottomRight = new CellReference(sheet.getLastRowNum(), sheet.getRow(sheet.getLastRowNum()).getLastCellNum());

        AreaReference areaReference = new AreaReference(cellRefTopLeft, cellRefBottomRight, SpreadsheetVersion.EXCEL97);
        XSSFTable tab = sheet.createTable(areaReference);
        tab.getCTTable().addNewTableStyleInfo();
//        tab.getCTTable().getTableStyleInfo().setName("TableStyleMedium2"); 
        
////        tab.setStyleName(XSSFBuiltinTableStyle.TableStyleMedium2.name());

        XSSFTableStyleInfo style = (XSSFTableStyleInfo) tab.getStyle();
        style.setName("TableStyleMedium2");
        style.setShowRowStripes(true);
        XSSFColor color1 = new XSSFColor(Color.BLACK, new DefaultIndexedColorMap());
        XSSFCellStyle cellStyle = wb.createCellStyle();
        XSSFFont font = wb.createFont();
        cellStyle.setWrapText(false);
        cellStyle.setAlignment(HorizontalAlignment.LEFT);
        font.setColor((short) 2);
        cellStyle.setFont(font);
        System.out.println("Style :" + sheet.getRow(1).getCell(0).getCellStyle().getFont());
//        cellStyle.setAlignment(HorizontalAlignment.LEFT);
        sheet.getRow(1).setRowStyle(cellStyle);
        tab.updateHeaders();
        tab.updateReferences();
//        System.out.println("Color : " + style.getStyle().isBuiltin());
//        style.getStyle().getStyle(TableStyleType.firstRowStripe).getFontFormatting().setFontColor(color1);
//        style.getStyle().getStyle(TableStyleType.headerRow).getFontFormatting().setFontColor(color2);
//        tab.getStyle().getStyle().getStyle(TableStyleType.firstRowStripe).getPatternFormatting().setFillBackgroundColor(color1);
//        tab.getStyle().getStyle().getStyle(TableStyleType.headerRow).getFontFormatting().setFontColor(color2);
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
        List<String> columnKeys = columnHeaders.stream().filter(col -> !col.startsWith("_"))
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
