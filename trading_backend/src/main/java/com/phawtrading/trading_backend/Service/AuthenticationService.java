package com.phawtrading.trading_backend.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.phawtrading.trading_backend.model.User;
import com.phawtrading.trading_backend.repository.UserRepository;
import com.phawtrading.trading_backend.security.JwtUtil;

@Service
public class AuthenticationService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public String login(String username, String password) {
        // Benutzer in der DB finden
        User user = userRepository.findByUsername(username);
        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
            // Generiere ein JWT-Token
            return jwtUtil.generateToken(username);
        }
        return null;  // Anmeldedaten ungültig
    }

    public void registerUser(User user) {
        
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        userRepository.save(user);

        
    }
}
