package com.qing.owl.auth.domain.user.model;

import com.qing.owl.auth.domain.user.service.PasswordEncoderService;

import jakarta.annotation.Resource;

public class UserFactory {

    @Resource
    IdGeneratorService idGeneratorService;

    @Resource
    PasswordEncoderService passwordEncoderService;

    public User create(String userName, String sex, Password password) {
        return null;// new User(userName, sex, passwordEncoderService(Password));
    }
}
