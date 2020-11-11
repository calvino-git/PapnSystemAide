/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.bean.util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import javax.faces.context.ExternalContext;
import org.apache.poi.ss.usermodel.Workbook;
import org.primefaces.extensions.component.exporter.ExcelExporter;
import org.primefaces.util.Constants;

/**
 *
 * @author calviniloki
 */
public class XlsxExporter extends ExcelExporter{
    @Override
    protected void writeExcelToResponse(ExternalContext externalContext, Workbook generatedExcel, String filename) throws IOException {
        super.writeExcelToResponse(externalContext, generatedExcel, filename);
    }
}
