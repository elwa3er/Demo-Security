package tn.ooredoo.jwt_security_auth.presentation;

import jakarta.annotation.security.RolesAllowed;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
@RequiredArgsConstructor
public class PublicRestController {

    @GetMapping("/welcome")
    public String welcome ()
    {
        return "Welcome! This is a public content!" ;
    }
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    @GetMapping("/testP")
    public String testP(){
        return "Acces avec @PreAuthorize est ok)";
    }
}
