package com.github.adminfaces.starter.bean;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.file.UploadedFile;
import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Model
public class FileuploadMB {

    private UploadedFile file;

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public void handleFileUpload(FileUploadEvent event) {
        FacesMessage message = new FacesMessage(event.getFile().getFileName() + " importé avec succès.");
        FacesContext.getCurrentInstance().addMessage(null, message);
        
        
    }
}
