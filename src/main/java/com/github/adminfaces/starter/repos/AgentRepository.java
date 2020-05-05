package com.github.adminfaces.starter.repos;

import com.github.adminfaces.starter.model.Agent;
import java.util.List;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.QueryParam;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface AgentRepository extends EntityRepository<Agent,String> {
}
