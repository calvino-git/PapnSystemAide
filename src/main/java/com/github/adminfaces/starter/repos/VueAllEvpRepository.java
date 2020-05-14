package com.github.adminfaces.starter.repos;

import com.github.adminfaces.starter.model.VueAllEvp;
import java.util.List;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.QueryParam;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface VueAllEvpRepository extends EntityRepository<VueAllEvp,Integer> {

    @Query("SELECT v FROM VueAllEvp v WHERE v.departEff between :debut and :fin")
    List<VueAllEvp> listVueAllEvpByDate(@QueryParam("debut") String debut,@QueryParam("fin") String fin);
    @Query("SELECT v FROM VueAllEvp v WHERE v.escale =:escale order by v.source desc")
    List<VueAllEvp> listVueAllEvpByEscale(@QueryParam("escale") String escale);

}
