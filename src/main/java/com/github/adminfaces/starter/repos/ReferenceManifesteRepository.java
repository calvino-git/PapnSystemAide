package com.github.adminfaces.starter.repos;

import com.github.adminfaces.starter.model.ReferenceManifeste;
import java.util.List;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.QueryParam;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface ReferenceManifesteRepository extends EntityRepository<ReferenceManifeste,Integer> {


    @Query("SELECT m FROM ReferenceManifeste m WHERE upper(m.consignataire) like :consignataire")
    List<ReferenceManifeste> referenceManifesteParConsignataire(@QueryParam("consignataire") String consignataire);

}
