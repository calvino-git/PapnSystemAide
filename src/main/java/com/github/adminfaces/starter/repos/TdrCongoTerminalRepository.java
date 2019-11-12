package com.github.adminfaces.starter.repos;

import com.github.adminfaces.starter.model.TdrCongoTerminal;
import java.math.BigInteger;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.QueryParam;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface TdrCongoTerminalRepository extends EntityRepository<TdrCongoTerminal,Integer> {

    @Query("SELECT sum(t.evp) FROM TdrCongoTerminal t WHERE t.annee = :annee")
    BigInteger getTotalEVPParAn(@QueryParam("annee") String annee);
    
    @Query("SELECT sum(t.poids) FROM TdrCongoTerminal t WHERE t.annee = :annee")
    BigInteger getTotalPoidsConteneurParAn(@QueryParam("annee") String annee);
    
}
