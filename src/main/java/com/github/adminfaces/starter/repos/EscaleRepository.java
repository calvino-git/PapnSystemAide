package com.github.adminfaces.starter.repos;

import com.github.adminfaces.starter.model.Escale;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.QueryParam;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface EscaleRepository extends EntityRepository<Escale,Integer> {

    @Query("SELECT COUNT(e.escleunik) FROM Escale e WHERE e.situat = :situat and substring(e.departEffectif,0,4) = :annee")
    Long getNombreEscaleByAnnee(@QueryParam("situat") String situat,@QueryParam("annee") String annee);

}
