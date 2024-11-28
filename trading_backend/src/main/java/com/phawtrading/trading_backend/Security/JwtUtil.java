package com.phawtrading.trading_backend.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;
import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    private String secretKey = "mySecretKey"; // KEY NICHT SICHER!! NUR TEST

    // Token generieren
    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))  // 1 Stunde Gültigkeit
                .signWith(SignatureAlgorithm.HS256, secretKey)
                .compact();
    }

    // Token validieren
    public boolean validateToken(String token, String username) {
        String extractedUsername = extractUsername(token);
        return (extractedUsername.equals(username) && !isTokenExpired(token));
    }

    // Benutzername aus dem Token extrahieren
    public String extractUsername(String token) {
        return Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }

    // Token Ablaufdatum prüfen
    private boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }

    // Ablaufdatum des Tokens extrahieren
    private Date extractExpiration(String token) {
        return Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJws(token)
                .getBody()
                .getExpiration();
    }
}
