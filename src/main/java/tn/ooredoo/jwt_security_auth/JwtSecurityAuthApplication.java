package tn.ooredoo.jwt_security_auth;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import tn.ooredoo.jwt_security_auth.models.Role;
import tn.ooredoo.jwt_security_auth.models.RoleName;
import tn.ooredoo.jwt_security_auth.repository.RoleRepository;
import tn.ooredoo.jwt_security_auth.repository.UserRepository;
import tn.ooredoo.jwt_security_auth.services.IUserService;

@SpringBootApplication
public class JwtSecurityAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtSecurityAuthApplication.class, args);
    }
    @Bean
    CommandLineRunner run (IUserService iUserService , RoleRepository
            roleRepository , UserRepository userRepository , PasswordEncoder
                                   passwordEncoder)
    {return args ->
    { iUserService.saveRole(new Role(RoleName.USER));
        iUserService.saveRole(new Role(RoleName.ADMIN));
    };}
}
