package com.qing.owl.auth.domain.user;

import com.qing.owl.auth.domain.user.service.PasswordEncoderService;

public class UserFactory {
    PasswordEncoderService passwordEncoderService;

    public User create(String userName, String sex, Password password) {
        return new User(userName, sex, password);
    }
}
