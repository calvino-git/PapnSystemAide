package com.github.adminfaces.starter.repos;

import com.github.adminfaces.starter.model.Ports;
import java.util.List;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.QueryParam;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface PortsRepository extends EntityRepository<Ports,Integer> {
    @Query("SELECT p FROM Ports p WHERE upper(p.code) like :code")
    Ports rechercherPortsParCode(@QueryParam("code") String code);
    
    @Query("SELECT p FROM Ports p WHERE upper(p.libelle) like :libelle")
    Ports rechercherPortsParLibelle(@QueryParam("libelle") String libelle);
    
    @Query("SELECT DISTINCT p.libelle FROM Ports p WHERE upper(p.code) like :code")
    List<Ports> listePortsParCode(@QueryParam("code") String code);

}
