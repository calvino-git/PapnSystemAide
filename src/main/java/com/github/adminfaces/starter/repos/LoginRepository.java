package com.github.adminfaces.starter.repos;

import com.github.adminfaces.starter.model.User;
import java.util.List;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.QueryParam;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface LoginRepository extends EntityRepository<User,Integer> {
    @Query("SELECT u FROM User u WHERE u.userid =:userid and u.password=:password")
    List<User> check(@QueryParam("userid") String userid, @QueryParam("password") String password);
}
