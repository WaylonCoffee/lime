package com.qing.owl.auth.domain.user.model;

import org.springframework.stereotype.Component;

import com.qing.owl.auth.domain.user.service.PasswordEncoderService;

import jakarta.annotation.Resource;

@Component
public class UserFactory {

    @Resource
    IdGeneratorService idGeneratorService;

    @Resource
    PasswordEncoderService passwordEncoderService;

    public User create(String name, String phone, String password, String sex) {
        return new User(idGeneratorService.generate(), name, new Phone(phone),
                passwordEncoderService.encrypt(new Password(password)), sex);
    }
}
