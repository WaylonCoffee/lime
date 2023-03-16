package com.qing.owl.auth.domain.user.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.qing.owl.auth.domain.user.Password;

import jakarta.annotation.Resource;

@Service
public class PasswordEncoderService {

    @Resource
    BCryptPasswordEncoder encoder;

    public Password encrypt(Password password) {
        String encryptPassword = DigestUtils.md5DigestAsHex(password.getPasswordSalt().getBytes());
        password.setPassword(encryptPassword);
        return password;
    }
}
