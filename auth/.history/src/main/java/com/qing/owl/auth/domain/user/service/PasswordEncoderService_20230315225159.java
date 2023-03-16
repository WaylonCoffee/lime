package com.qing.owl.auth.domain.user.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.qing.owl.auth.domain.user.Password;

import jakarta.annotation.Resource;

@Service
public class PasswordEncoderService {

    @Resource
    BCryptPasswordEncoder encoder;

    public Password encrypt(Password password) {
        password.setPassword(encoder.encode(password.getPassword()));
        return password;
    }
}
