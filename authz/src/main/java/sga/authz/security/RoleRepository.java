package sga.authz.security;
import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface RoleRepository extends CrudRepository <Role, Long> {

    List<Role> findAll();
    
}
