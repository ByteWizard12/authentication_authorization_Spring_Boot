package com.example.authentication_and_authorization_Spring_Boot.dto;

import com.example.authentication_and_authorization_Spring_Boot.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationRequest {
    private String username;
    private String password;
    private Role role;
} 