package uz.pdp.securityservice.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import uz.pdp.securityservice.dto.UserRegistrationDto;
import uz.pdp.securityservice.model.User;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto userRegistrationDto);
}
