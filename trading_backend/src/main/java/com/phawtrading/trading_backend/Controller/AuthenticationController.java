package com.phawtrading.trading_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.phawtrading.trading_backend.model.User;
import com.phawtrading.trading_backend.service.AuthenticationService;

@RestController
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    // @PostMapping("/login")
    // public String login(@RequestParam String username, @RequestParam String password) {
    //     String token = authenticationService.login(username, password);
    //     if (token != null) {
    //         return "Bearer " + token;  // Token im Bearer Format zurückgeben
    //         // Frontend kann das nun nutzen um Sessions zu speichern. 
    //     }
    //     return "Invalid credentials";  // Fehler, wenn Anmeldedaten ungültig
    // }
    @PostMapping("/login")
    public String login(@RequestBody User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        
        String token = authenticationService.login(username, password);
        if (token != null) {
            return "Bearer " + token;  // Token im Bearer Format zurückgeben
        }
        return "Invalid credentials";  // Fehler, wenn Anmeldedaten ungültig
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user) {
        // Passiertes User-Objekt direkt an die Service-Methode weitergeben
        authenticationService.registerUser(user);
        return ResponseEntity.ok("User registered successfully!");
    }
}
