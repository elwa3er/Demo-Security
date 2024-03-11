package tn.ooredoo.jwt_security_auth.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LoginDto {
    private String email ;
    private String password ;
}
