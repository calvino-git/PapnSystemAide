package com.github.adminfaces.starter.bean;


import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import javax.inject.Named;

@Named
@ApplicationScoped
public class ReferenceBean implements Serializable {
    public String modeReglement(Integer code) {
        return code==1?"ESPECE":code==2?"CHEQUE":code==3?"VIREMENT":code==4?"TRAITE":code==5?"CB":code==6?"AVOIR":code==7?"AUTRE":code==8?"NOTE DE CREDIT":code==9?"COMPENSATION":"";
    }
    
    public String redevFacture(Integer code) {
        return code==1?"ESPECE":code==2?"CHEQUE":code==3?"VIREMENT":code==4?"TRAITE":code==5?"CB":code==6?"AVOIR":code==7?"AUTRE":code==8?"NOTE DE CREDIT":code==9?"COMPENSATION":"";
    }
    

}
