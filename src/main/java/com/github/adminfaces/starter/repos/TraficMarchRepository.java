package com.github.adminfaces.starter.repos;

import com.github.adminfaces.starter.model.TraficMarchandise;
import java.util.List;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.QueryParam;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface TraficMarchRepository extends EntityRepository<TraficMarchandise,Integer> {

    @Query("SELECT tm FROM TraficMarchandise tm WHERE tm.dateDepart between :debut and :fin")
    List<TraficMarchandise> listTraficMarch(@QueryParam("debut") String debut,@QueryParam("fin") String fin);
    
}
