package com.github.adminfaces.starter.repos;

import com.github.adminfaces.starter.model.Navire;
import java.util.List;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.QueryParam;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface NavireRepository extends EntityRepository<Navire,Integer> {
    @Query("SELECT n FROM Navire n left join n.type t WHERE t.code not in ('BG', 'PM', 'NC', 'VD', 'SV', 'RM', 'VL')")
    List<Navire> listeGrandNavire();
}
