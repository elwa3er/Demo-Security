package tn.ooredoo.jwt_security_auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.ooredoo.jwt_security_auth.models.Role;
import tn.ooredoo.jwt_security_auth.models.RoleName;

@Repository
public interface RoleRepository extends JpaRepository<Role,Integer> {
    Role findByRoleName(RoleName roleName);
}
