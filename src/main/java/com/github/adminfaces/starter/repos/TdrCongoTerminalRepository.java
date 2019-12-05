package com.github.adminfaces.starter.repos;

import com.github.adminfaces.starter.model.TdrCongoTerminal;
import java.math.BigInteger;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.QueryParam;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface TdrCongoTerminalRepository extends EntityRepository<TdrCongoTerminal,Integer> {

    @Query("SELECT sum(t.evp) FROM TdrCongoTerminal t WHERE t.numero is not null and t.annee = :annee")
    BigInteger getTotalEVPParAn(@QueryParam("annee") String annee);
    
    @Query("SELECT sum(t.evp) FROM TdrCongoTerminal t WHERE t.trafic = 'IMP' and t.annee = :annee")
    BigInteger getTotalImportEVPParAn(@QueryParam("annee") String annee);
    
    @Query("SELECT sum(t.evp) FROM TdrCongoTerminal t WHERE t.trafic = 'EXP' and t.annee = :annee")
    BigInteger getTotalExportEVPParAn(@QueryParam("annee") String annee);
    
    @Query("SELECT sum(t.evp) FROM TdrCongoTerminal t WHERE t.trafic = 'IMP1' and t.annee = :annee")
    BigInteger getTotalTransitEVPParAn(@QueryParam("annee") String annee);
    
    @Query("SELECT sum(t.evp) FROM TdrCongoTerminal t WHERE t.trafic like 'TRB%' and t.annee = :annee")
    BigInteger getTotalTransboEVPParAn(@QueryParam("annee") String annee);
    
    @Query("SELECT sum(t.poids) FROM TdrCongoTerminal t WHERE t.annee = :annee")
    BigInteger getTotalPoidsConteneurParAn(@QueryParam("annee") String annee);
    
    @Query("SELECT sum(t.poids) FROM TdrCongoTerminal t WHERE t.trafic = 'IMP' and t.annee = :annee")
    BigInteger getTotalImportTonnageParAn(@QueryParam("annee") String annee);
    
    @Query("SELECT sum(t.poids) FROM TdrCongoTerminal t WHERE t.trafic = 'EXP' and t.annee = :annee")
    BigInteger getTotalExportTonnageParAn(@QueryParam("annee") String annee);
    
    @Query("SELECT sum(t.poids) FROM TdrCongoTerminal t WHERE t.trafic = 'IMP1' and t.annee = :annee")
    BigInteger getTotalTransitTonnageParAn(@QueryParam("annee") String annee);
    
    @Query("SELECT sum(t.poids) FROM TdrCongoTerminal t WHERE t.trafic like 'TRB%' and t.annee = :annee")
    BigInteger getTotalTransboTonnageParAn(@QueryParam("annee") String annee);
    
}
