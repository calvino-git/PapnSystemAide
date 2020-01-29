package com.github.adminfaces.starter.repos;

import com.github.adminfaces.starter.model.RedevMarch;
import java.util.List;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.QueryParam;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface RedevMarchRepository extends EntityRepository<RedevMarch,Integer> {


    @Query("SELECT SUM(rm.tonnage) FROM RedevMarch rm WHERE rm.annee =:annee and rm.condit like 'TCS%'")
    Double getTotalTonnageConteneurByAn(@QueryParam("annee") Integer annee);
    @Query("SELECT SUM(rm.tonnage) FROM RedevMarch rm WHERE rm.annee =:annee and rm.condit not like 'TCS%'")
    Double getTotalTonnageConventByAn(@QueryParam("annee") Integer annee);
    @Query("SELECT SUM(rm.montant) FROM RedevMarch rm WHERE rm.annee =:annee and rm.tarif like '%TCS%'")
    Double getTotalMontantConteneurByAn(@QueryParam("annee") Integer annee);
    @Query("SELECT SUM(rm.montant) FROM RedevMarch rm WHERE rm.annee =:annee and rm.tarif not like '%TCS%'")
    Double getTotalMontantConventByAn(@QueryParam("annee") Integer annee);
    
    @Query("SELECT rm FROM RedevMarch rm WHERE rm.annee =:annee")
    List<RedevMarch> listRedevMarchByAn(@QueryParam("annee") Integer annee);

}
