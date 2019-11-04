package com.github.adminfaces.starter.repos;

import com.github.adminfaces.starter.model.Marchfact;
import java.util.List;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.QueryParam;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface MarchFactRepository extends EntityRepository<Marchfact,Integer> {

    @Query("SELECT m FROM Marchfact m WHERE m.departEffectif between :debut and :fin")
    List<Marchfact> getListMarch(@QueryParam("debut") String debut,@QueryParam("fin") String fin);
    
}
