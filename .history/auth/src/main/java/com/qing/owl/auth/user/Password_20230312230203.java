package com.qing.owl.auth.user;

import org.springframework.util.DigestUtils;

public class Password {
    private String salt;
    private String password;

    public Password(String password) {
        DigestUtils.md5DigestAsHex(null)
    }

    public boolean isValid(String password) {

    }
}
