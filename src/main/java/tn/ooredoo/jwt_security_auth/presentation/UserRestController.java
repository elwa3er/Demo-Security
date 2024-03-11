package tn.ooredoo.jwt_security_auth.presentation;

import jakarta.annotation.security.RolesAllowed;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.ooredoo.jwt_security_auth.dto.LoginDto;
import tn.ooredoo.jwt_security_auth.dto.RegisterDto;
import tn.ooredoo.jwt_security_auth.services.IUserService;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserRestController {
    private final IUserService iUserService ;
    @RolesAllowed("user")
    @PostMapping("/register")
    public ResponseEntity<?> register (@RequestBody RegisterDto registerDto) {
        return iUserService.register(registerDto);
    }
    @RolesAllowed("user")
    @PostMapping("/authenticate")
    public String authenticate(@RequestBody LoginDto loginDto) {
        return iUserService.authenticate(loginDto);
    }
}
