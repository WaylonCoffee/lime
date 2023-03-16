package com.qing.owl.auth.domain.user.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.qing.owl.auth.domain.user.model.Password;

@Service
public class PasswordEncoderService {

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public Password encrypt(Password password) {
        password.setPassword(encoder.encode(password.getPassword()));
        return password;
    }
}
