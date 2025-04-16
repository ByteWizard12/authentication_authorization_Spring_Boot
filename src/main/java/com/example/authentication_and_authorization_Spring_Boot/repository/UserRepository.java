package com.example.authentication_and_authorization_Spring_Boot.repository;

import com.example.authentication_and_authorization_Spring_Boot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
} 