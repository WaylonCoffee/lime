package com.qing.owl.auth.domain.user.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.qing.owl.auth.domain.user.model.Password;

import jakarta.annotation.Resource;

@Service
public class PasswordEncoderService {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    public Password encrypt(Password password) {
        password.setPassword(encoder.encode(password.getPassword()));
        return password;
    }
}
