/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.bean;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.annotation.sql.DataSourceDefinition;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.sql.DataSource;
import net.sf.jasperreports.engine.export.oasis.TableStyle;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.util.AreaReference;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFBuiltinTableStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFTable;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author Calvin ILOKI
 */
@Named
@Dependent
public class ImportExcel {

    private String QUERY_CT;
    private UploadedFile excel;
    private Double progress;

    @Resource(name = "java:app/cargo",
            shareable = true,
            description = "java:app/cargo")
    private DataSource ds;

    @PostConstruct
    public void init() {
        QUERY_CT = "INSERT INTO CONGO_TERMINAL VALUES (SEQ_PAPN_CONGO_TERMINAL.nextval"
                + ",?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    public void insertData(FileUploadEvent event) throws SQLException {
        excel = event.getFile();
        File excelFile = new File(excel.getFileName());

        System.out.println(excelFile.getAbsolutePath());
        try {
            excelFile = Files.write(excelFile.toPath(), excel.getContents()).toFile();
//            FileWriter fileWriter = new FileWriter(excelFile);
//            fileWriter.flush();
//            fileWriter.close();
//            Files.write(excelFile.toPath(), excel.getContents());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        XSSFWorkbook workbk;

        Connection con = ds.getConnection();
        try {
            PreparedStatement stmt = con.prepareStatement(QUERY_CT);
            workbk = new XSSFWorkbook(excelFile);
            XSSFSheet sheet = workbk.getSheetAt(0);
            Iterator rows = sheet.rowIterator();
            DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
            System.out.println("Nombre de table:" + sheet.getTables().size());
//            XSSFTable tab = sheet.getTables().get(0);
            CellReference cellRefTopLeft = new CellReference(sheet.getFirstRowNum(), 0);
            CellReference cellRefBottomRight = new CellReference(sheet.getLastRowNum(), sheet.getRow(sheet.getLastRowNum()).getLastCellNum());
            
            AreaReference areaReference = new AreaReference(cellRefTopLeft, cellRefBottomRight, SpreadsheetVersion.EXCEL97);
            XSSFTable tab = sheet.createTable(areaReference);
            
            System.out.println("Style:" + tab.getStyle().getName());
            System.out.println("Style:" + tab.getStyle().getStyle().isBuiltin());
            tab.setStyleName(XSSFBuiltinTableStyle.TableStyleMedium2.name());

            File file = new File(excelFile.getName()+"2");
            try (FileOutputStream out = new FileOutputStream(file)) {
                workbk.write(out);
                out.close();
            }
            int i = 0;
            while (rows.hasNext()) {
                XSSFRow row = (XSSFRow) rows.next();

                if (row.getRowNum() == 0) {
                    System.out.println(" LIGNE " + row.getRowNum());
                    continue;
                }
                stmt.setInt(1, Integer.valueOf(excelFile.getName().substring(0, 6))); //MOIS                
                stmt.setString(2, row.getCell(0).toString()); //NUM_CTN
                stmt.setString(3, row.getCell(11) == null ? "" : row.getCell(11).toString()); //DAT
                stmt.setString(4, row.getCell(1) == null ? ""
                        : row.getCell(1).toString().trim().equalsIgnoreCase("DSCH") ? "DEBA"
                        : row.getCell(1).toString().trim().equalsIgnoreCase("LOAD") ? "EMBA" : ""); //MVNT
                stmt.setString(5, row.getCell(10) == null ? ""
                        : row.getCell(10).toString().trim().equalsIgnoreCase("Transbo") ? "T"
                        : row.getCell(10).toString().trim().equalsIgnoreCase("Import") ? "I"
                        : row.getCell(10).toString().trim().equalsIgnoreCase("Export") ? "E" : ""); //TRAFIC
                stmt.setString(6, row.getCell(9) == null ? "" : row.getCell(9) == null ? ""
                        : row.getCell(9).toString().trim().equalsIgnoreCase("FCL") ? "PLEIN"
                        : row.getCell(9).toString().trim().equalsIgnoreCase("MTY") ? "VIDE" : ""); //P V
                stmt.setString(7, row.getCell(2) == null ? "" : row.getCell(2).toString());//ISO
                stmt.setString(8, row.getCell(3) == null ? "" : row.getCell(3).toString());//TARE
                stmt.setString(9, row.getCell(6) == null ? "" : row.getCell(6).toString());//EXPLOITANT
                stmt.setString(10, row.getCell(14) == null ? "" : row.getCell(14).toString());//NAVIRE
                stmt.setString(11, row.getCell(15) == null ? "" : row.getCell(15).toString()); //VOYAGE
                stmt.setString(12, row.getCell(23) == null ? "" : row.getCell(23).toString());//POL
                stmt.setString(13, row.getCell(24) == null ? "" : row.getCell(24).toString());//POD
                stmt.setString(14, row.getCell(8) == null ? "" : row.getCell(8).toString());//OWNER
                stmt.setString(15, row.getCell(5) == null ? "" : row.getCell(5).toString().replace(".0", ""));//POIDS
                stmt.setString(16, row.getCell(17) == null ? "" : row.getCell(17).toString());//DATE ATA
                stmt.setString(17, row.getCell(18) == null ? "" : row.getCell(18).toString());//DATE ATD
                stmt.setString(18, row.getCell(3) == null ? "" : row.getCell(3).toString()); //TYPE
                stmt.setString(19, row.getCell(4) == null ? "" : row.getCell(4).toString().replace(".0", "")); //EVP
                stmt.setString(20, ""); //PARC
                stmt.setString(21, row.getCell(12) == null ? "" : row.getCell(12).toString());//TRUCK VESSEL
                stmt.setString(22, row.getCell(16) == null ? "" : row.getCell(16).toString());//TYPE NAVIRE
                stmt.setString(23, row.getCell(19) == null ? "" : row.getCell(19).toString());//DGX
                stmt.setString(24, row.getCell(20) == null ? "" : row.getCell(20).toString());//REFF
                stmt.setString(25, row.getCell(21) == null ? "" : row.getCell(21).toString()); //OOG
                stmt.setString(26, row.getCell(22) == null ? "" : row.getCell(22).toString()); //OPL
                stmt.setString(27, row.getCell(25) == null ? "" : row.getCell(25).toString()); //PDESF
                stmt.setString(28, row.getCell(26) == null ? "" : row.getCell(26).toString().replace(".0", ""));//PRESENCE
                stmt.setString(29, "");//TRUCK VESSEL IN
                stmt.setString(30, "");//NAVIRE IN
                stmt.setString(31, "");//VOYAGE IN
                stmt.setString(32, "");//TYPE IN 
                stmt.setString(33, row.getCell(13) == null ? "" : row.getCell(13).toString());//CARRIER
                if (i % 1000 == 0) {
                    progress = (row.getRowNum() * 100.0) / (sheet.getLastRowNum());
                    System.out.print("*");
                }

                stmt.executeUpdate();

                i++;
            }

            excelFile.deleteOnExit();

//                MYWORKS.put(listFile.getName(),workbk);
        } catch (IOException | InvalidFormatException | SQLException ex) {
            ex.printStackTrace();
        }
    }

    public String getMvnt(String mvnt) {
        switch (mvnt) {
            case "LOAD":
                return "EMBA";
            case "DSCH":
                return "DEBA";
            default:
                return "";
        }
    }

    public void onComplete() {
        FacesMessage message = new FacesMessage(excel.getFileName() + " importé avec succès.");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public UploadedFile getExcel() {
        return excel;
    }

    public void setExcel(UploadedFile excel) {
        this.excel = excel;
    }

    public String getQUERY_CT() {
        return QUERY_CT;
    }

    public void setQUERY_CT(String QUERY_CT) {
        this.QUERY_CT = QUERY_CT;
    }

    public Double getProgress() {
        return progress;
    }

    public void setProgress(Double progress) {
        this.progress = progress;
    }

}
