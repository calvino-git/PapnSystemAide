package com.github.adminfaces.starter.repos;

import com.github.adminfaces.starter.model.Facture;
import java.util.List;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.QueryParam;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface FactureRepository extends EntityRepository<Facture,Integer> {
    @Query("SELECT f FROM Facture f WHERE  substring(f.moisComptable,0,4) = :annee order by f.fDate desc")
    List<Facture> listFactureParAn(@QueryParam("annee") String annee);
}
