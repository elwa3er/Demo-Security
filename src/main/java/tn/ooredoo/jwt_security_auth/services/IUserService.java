package tn.ooredoo.jwt_security_auth.services;

import org.springframework.http.ResponseEntity;
import tn.ooredoo.jwt_security_auth.dto.LoginDto;
import tn.ooredoo.jwt_security_auth.dto.RegisterDto;
import tn.ooredoo.jwt_security_auth.models.Role;
import tn.ooredoo.jwt_security_auth.models.User;

public interface IUserService {
    String authenticate(LoginDto loginDto);
    ResponseEntity<?> register (RegisterDto registerDto);
    Role saveRole(Role role);
    User saverUser (User user) ;
}
