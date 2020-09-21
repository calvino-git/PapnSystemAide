package com.github.adminfaces.starter.repos;

import com.github.adminfaces.starter.model.Cheque;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.QueryParam;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface ChequeRepository extends EntityRepository<Cheque,Integer> {

    @Query("SELECT c FROM Cheque c WHERE c.client like :client")
    List<Cheque> list(@QueryParam("client") String client);
    
    @Query("SELECT c FROM Cheque c WHERE c.chcleunik like :chcleunik")
    Cheque getCheque(@QueryParam("chcleunik") BigInteger chcleunik);

}
