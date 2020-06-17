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
import org.primefaces.component.export.ExcelXExporter;
import org.primefaces.util.Constants;

/**
 *
 * @author calviniloki
 */
public class XlsxExporter extends ExcelXExporter{
    @Override
    protected void writeExcelToResponse(ExternalContext externalContext, Workbook generatedExcel, String filename) throws IOException {
        externalContext.setResponseContentType(getContentType());
        externalContext.setResponseHeader("Expires", "0");
        externalContext.setResponseHeader("Cache-Control", "must-revalidate, post-check=0, pre-check=0");
        externalContext.setResponseHeader("Pragma", "public");
        externalContext.setResponseHeader("Content-disposition", getContentDisposition(filename));
        externalContext.addResponseCookie(Constants.DOWNLOAD_COOKIE, "true", Collections.<String, Object>emptyMap());

        OutputStream out = externalContext.getResponseOutputStream();
        generatedExcel.write(out);
    }
}
