package com.github.adminfaces.starter.repos;

import com.github.adminfaces.starter.model.Escale;
import com.github.adminfaces.starter.model.Quai;
import com.github.adminfaces.starter.model.Quais;
import com.github.adminfaces.starter.model.TypeNavire;
import java.util.List;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.QueryParam;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface EscaleRepository extends EntityRepository<Escale,Integer> {
    @Query("SELECT e FROM Escale e WHERE  substring(e.departEffectif,0,4) = :annee order by e.arrivee desc")
    Long listEscaleByAnnee(@QueryParam("annee") String annee);

    @Query("SELECT COUNT(e.id) FROM Escale e WHERE e.situat = :situat and substring(e.departEffectif,0,4) = :annee")
    Long getNombreEscaleByAnnee(@QueryParam("situat") String situat,@QueryParam("annee") String annee);
    
    @Query("SELECT COUNT(e.id) FROM Escale e left join e.nacleunik n  "
            + "WHERE n.type.code in ('BG', 'PM', 'NC', 'VD', 'SV', 'RM', 'VL') and e.situat = :situat "
            + "and substring(e.departEffectif,0,4) = :annee")
    Long getNombrePetitEscaleByAnnee(@QueryParam("situat") String situat,@QueryParam("annee") String annee);
    
    @Query("SELECT COUNT(e.id) FROM Escale e left join e.nacleunik n  "
            + "WHERE n.type.code not in ('BG', 'PM', 'NC', 'VD', 'SV', 'RM', 'VL') and e.situat = :situat "
            + "and substring(e.departEffectif,0,4) = :annee")
    Long getNombreGrandEscaleByAnnee(@QueryParam("situat") String situat,@QueryParam("annee") String annee);
    
    @Query("SELECT e FROM Escale e left join e.nacleunik n "
            + "WHERE n.type.code in ('BG', 'PM', 'NC', 'VD', 'SV', 'RM', 'VL') "
            + "and substring(e.arrivee,0,4) ='2020'")
    List<Escale> listEscaleGrandNav2020();

    @Query("SELECT q FROM Quais q WHERE q.code is not null and (q.code like :quai or q.libelle like :quai)")
    List<Quais> listeQuai(@QueryParam("quai") String quai);
}
