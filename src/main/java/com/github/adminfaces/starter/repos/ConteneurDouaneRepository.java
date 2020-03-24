package com.github.adminfaces.starter.repos;

import com.github.adminfaces.starter.model.ConteneurCT;
import com.github.adminfaces.starter.model.ConteneurDouane;
import java.util.List;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.QueryParam;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface ConteneurDouaneRepository extends EntityRepository<ConteneurDouane,Integer> {
    
}
