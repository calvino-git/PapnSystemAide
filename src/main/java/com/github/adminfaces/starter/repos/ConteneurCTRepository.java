package com.github.adminfaces.starter.repos;

import com.github.adminfaces.starter.model.ConteneurCT;
import java.util.List;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.QueryParam;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface ConteneurCTRepository extends EntityRepository<ConteneurCT,Integer> {

    @Query("SELECT c FROM ConteneurCT c WHERE c.date between :debut and :fin")
    List<ConteneurCT> getList(@QueryParam("debut") String debut,@QueryParam("fin") String fin);
    
}
