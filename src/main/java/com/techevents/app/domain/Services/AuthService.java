package com.techevents.app.domain.Services;

import com.techevents.app.security.user.User;
import com.techevents.app.security.user.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    User getAuthUser(){
        return this.userRepository.findById(2).get();
    }
}
