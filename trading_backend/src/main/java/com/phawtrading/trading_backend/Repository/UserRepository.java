package com.phawtrading.trading_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phawtrading.trading_backend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    User findByEmail(String email);
}


