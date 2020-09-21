package com.github.adminfaces.starter.repos;

import com.github.adminfaces.starter.model.Cheque;
import com.github.adminfaces.starter.model.Reglement;
import java.util.List;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.QueryParam;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface ReglementRepository extends EntityRepository<Reglement,Integer> {

    @Query("SELECT r FROM Reglement r WHERE r.client like :client")
    List<Reglement> list(@QueryParam("client") String client);
    @Query("SELECT r FROM Reglement r WHERE r.cheque like :cheque")
    Reglement getReglement(@QueryParam("cheque") Cheque cheque);

}
