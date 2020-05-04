package com.github.adminfaces.starter.repos;

import com.github.adminfaces.starter.model.TypeNavire;
import java.util.List;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.QueryParam;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface TypeNavireRepository extends EntityRepository<TypeNavire,Integer> {
    @Query("SELECT t FROM TypeNavire t WHERE upper(t.code) like :code")
    TypeNavire rechercherTypeNavireParCode(@QueryParam("code") String code);
    
    @Query("SELECT t FROM TypeNavire t WHERE upper(t.libelle) like :libelle")
    TypeNavire rechercherTypeNavireParLibelle(@QueryParam("libelle") String libelle);
    
    @Query("SELECT DISTINCT t FROM TypeNavire t WHERE t.code is not null and t.libelle is not null and (upper(t.code) like :expr or upper(t.libelle) like :expr ) ")
    List<TypeNavire> listeTypeNavireContains(@QueryParam("expr") String expr);
    
    @Query("SELECT DISTINCT t FROM TypeNavire t WHERE upper(t.code) in ('BG','PM','NC','VD','SV','RM','VL')")
    List<TypeNavire> listeTypePetitNavire();
    
    @Query("SELECT DISTINCT t FROM TypeNavire t WHERE upper(t.code) not in ('BG','PM','NC','VD','SV','RM','VL')")
    List<TypeNavire> listeTypeGrandNavire();

}
