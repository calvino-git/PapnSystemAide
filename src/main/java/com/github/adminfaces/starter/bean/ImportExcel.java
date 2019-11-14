/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.bean;

import com.github.adminfaces.starter.infra.persistence.DbHandler;
import java.io.File;
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
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
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
    
    @Resource(name="java:app/cargo",
            shareable=true,
            description="java:app/cargo")
    private DataSource ds;

    @PostConstruct
    public void init() {
        QUERY_CT = "INSERT INTO CONGO_TERMINAL VALUES (SEQ_PAPN_CONGO_TERMINAL.nextval"
                + ",?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    public void insertData(FileUploadEvent event) {
        excel = event.getFile();
        File excelFile = new File(excel.getFileName());
        
        System.out.println(excelFile.getAbsolutePath());
        try {
            Files.write(excelFile.toPath(), excel.getContents());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        XSSFWorkbook workbk;
        Connection con = DbHandler.getDbConnection();
        try {
            PreparedStatement stmt = con.prepareStatement(QUERY_CT);
            workbk = new XSSFWorkbook(excelFile);
            XSSFSheet sheet = workbk.getSheetAt(0);
            Iterator rows = sheet.rowIterator();
            DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
            int i = 0;
            while (rows.hasNext()) {
                XSSFRow row = (XSSFRow) rows.next();

                if (row.getRowNum() == 0) {
                    System.out.println(" LIGNE " + row.getRowNum());
                    continue;
                }
                stmt.setInt(1, Integer.valueOf(excelFile.getName().substring(0, 6))); //MOIS                
                stmt.setString(2, row.getCell(0).toString()); //NUM_CTN
                stmt.setString(3, row.getCell(11) == null ? "" :dateFormat.format(row.getCell(11).getDateCellValue())); //DAT
                stmt.setString(4, row.getCell(1) == null ? "" : getMvnt(row.getCell(1).toString())); //MOUVEMENT
                stmt.setString(5, row.getCell(10) == null ? "" :row.getCell(10).toString()); //TRAFIC
                stmt.setString(6, row.getCell(9) == null ? "" :row.getCell(9).toString()); //VIDE PLEIN
                stmt.setString(7, row.getCell(3) == null ? "" :row.getCell(3).toString());//ISO
                stmt.setString(8, row.getCell(4) == null ? "" :row.getCell(4).getRawValue());//TARE
                stmt.setString(9, row.getCell(7) == null ? "" :row.getCell(7).toString());//EXP COURS
                stmt.setString(10, row.getCell(14) == null ? "" :row.getCell(14).toString());//NAVIRE
                stmt.setString(11, row.getCell(15) == null ? "" : row.getCell(15).toString()); //VOYAGE
                stmt.setString(12, row.getCell(21) == null ? "" : row.getCell(21).toString());//POL
                stmt.setString(13, row.getCell(22) == null ? "" : row.getCell(22).toString());//POD
                stmt.setString(14, row.getCell(8) == null ? "" :row.getCell(7).toString());//ARMATEUR
                stmt.setString(15, row.getCell(2) == null ? "" :row.getCell(2).getRawValue());//POIDS
                stmt.setString(16, row.getCell(1).toString().equalsIgnoreCase("DSCH") ? "" :dateFormat.format(row.getCell(29).getDateCellValue()));//DATE IN
                stmt.setString(17, row.getCell(11) == null ? "" :dateFormat.format(row.getCell(11).getDateCellValue()));//DATE MOVE
                stmt.setString(18, row.getCell(4) == null ? "" :row.getCell(4).getRawValue()); //TYPE
                stmt.setString(19, row.getCell(5) == null ? "" :row.getCell(5).getRawValue()); //EVP
                stmt.setString(20, row.getCell(12) == null ? "" :row.getCell(12).toString()); //PARC
                stmt.setString(21, row.getCell(13) == null ? "" :row.getCell(13).toString());//TRUCK VESSEL
                stmt.setString(22, row.getCell(16) == null ? "" :row.getCell(16).toString());//TYPE NAVIRE
                stmt.setString(23, row.getCell(17) == null ? "" :row.getCell(17).toString());//DGX
                stmt.setString(24, row.getCell(18) == null ? "" :row.getCell(18).toString());//REFF
                stmt.setString(25, row.getCell(19) == null ? "" :row.getCell(19).toString()); //OOG
                stmt.setString(26, row.getCell(20) == null ? "" :row.getCell(20).toString()); //OPL
                stmt.setString(27, row.getCell(23) == null ? "" :row.getCell(23).toString()); //PDESF
                stmt.setString(28, row.getCell(24) == null ? "" :row.getCell(24).getRawValue());//PRESENCE
                stmt.setString(29, row.getCell(25) == null ? "" :row.getCell(25).toString());//TRUCK VESSEL IN
                stmt.setString(30, row.getCell(26) == null ? "" :row.getCell(26).toString());//NAVIRE IN
                stmt.setString(31, row.getCell(27) == null ? "" :row.getCell(27).toString());//VOYAGE IN
                stmt.setString(32, row.getCell(28) == null ? "" :row.getCell(28).toString());//TYPE IN
                if (i % 1000 == 0) {
                    System.out.print("=");
                }

                stmt.executeUpdate();

                i++;
            }

            excelFile.deleteOnExit();
            FacesMessage message = new FacesMessage(event.getFile().getFileName() + " importé avec succès.\n " + i + " enregistrements.");
            FacesContext.getCurrentInstance().addMessage(null, message);

//                MYWORKS.put(listFile.getName(),workbk);
        } catch (IOException | InvalidFormatException | SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public String getMvnt(String mvnt){
        switch(mvnt){
            case "LOAD":
                return "EMBA";
            case "DSCH":
                return "DEBA";
            default: return "";
        }
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

}
