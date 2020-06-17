package com.github.adminfaces.starter.repos;

import com.github.adminfaces.starter.model.VueAllEvp;
import com.github.adminfaces.starter.model.VueSourceEvp;
import com.github.adminfaces.starter.model.VueSourceEvpAnnee;
import java.math.BigInteger;
import java.util.List;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.QueryParam;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface VueAllEvpRepository extends EntityRepository<VueAllEvp,Integer> {

    @Query("SELECT v FROM VueAllEvp v WHERE v.departEff like :annee")
    List<VueAllEvp> listVueAllEvpByAn(@QueryParam("annee") String annee);
    @Query("SELECT v FROM VueAllEvp v WHERE v.departEff between :debut and :fin")
    List<VueAllEvp> listVueAllEvpByDate(@QueryParam("debut") String debut,@QueryParam("fin") String fin);
    @Query("SELECT v FROM VueAllEvp v WHERE v.escale =:escale order by v.source desc")
    List<VueAllEvp> listVueAllEvpByEscale(@QueryParam("escale") String escale);
    @Query("SELECT sum(v.totalEvp) FROM VueAllEvp v WHERE v.departEff like :annee and v.tarfic like :trafic and v.source =:source")
    BigInteger totalEVPParSourceParTraficEtParAn(@QueryParam("annee") String annee,@QueryParam("trafic") String trafic,@QueryParam("source") String source);
    @Query("SELECT v FROM VueSourceEvp v WHERE v.mois =:mois")
    List<VueSourceEvp> listeEVPParSourceEtParMois(@QueryParam("mois") String mois);
    @Query("SELECT v FROM VueSourceEvpAnnee v WHERE v.annee =:annee")
    List<VueSourceEvpAnnee> listeEVPParSourceEtParAnnee(@QueryParam("annee") String annee);

}
