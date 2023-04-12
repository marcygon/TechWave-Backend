package com.techevents.app.security.auth;


import com.techevents.app.security.user.Role;
import com.techevents.app.security.user.User;
import com.techevents.app.security.user.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class InitUsers {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationService authenticationService;

    public InitUsers(UserRepository userRepository, PasswordEncoder passwordEncoder, AuthenticationService authenticationService) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.authenticationService = authenticationService;
    }

    @PostConstruct
    public void initUsers() {
        var user = User.builder()
                .email("admin@admin.com")
                .name("Admin")
                .password(passwordEncoder.encode("password"))
                .role(Role.ADMIN)
                .build();
        userRepository.save(user);
        var authReq = AuthenticationRequest.builder()
                .email("admin@admin.com")
                .password("password")
                .build();
        authenticationService.authenticate(authReq);
        var registerRequest = RegisterRequest.builder()
                .email("user@user.com")
                .name("User")
                .password("password")
                .build();
        authenticationService.register(registerRequest);
    }

}
