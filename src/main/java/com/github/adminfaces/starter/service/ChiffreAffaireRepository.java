package com.github.adminfaces.starter.service;

import com.github.adminfaces.starter.model.PrestationChiffreAffaire;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.QueryParam;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface ChiffreAffaireRepository extends EntityRepository<PrestationChiffreAffaire,Integer> {

    @Query("SELECT SUM(c.montant) FROM PrestationChiffreAffaire c WHERE c.annee = :annee")
    Double getMontantTotalByAnnee(@QueryParam("annee") Integer annee);

}
