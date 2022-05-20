package uz.pdp.securityservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.securityservice.model.User;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByEmail(String email);
}
