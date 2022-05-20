package uz.pdp.securityservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.securityservice.model.Role;

public interface RoleRepository extends JpaRepository<Role,Integer> {
    Role findByName(String name);
}
