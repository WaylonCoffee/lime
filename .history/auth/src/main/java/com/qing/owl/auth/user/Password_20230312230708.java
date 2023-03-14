package com.qing.owl.auth.user;

import org.springframework.util.DigestUtils;

import com.qing.owl.auth.infra.common.utils.RandomUtils;

import ch.qos.logback.core.testUtil.RandomUtil;

public class Password {
    private Integer salt;
    private String password;

    public Password(String password) {
        salt = RandomUtils.genFourBitRandomNum();
        DigestUtils.md5DigestAsHex(password + salt);
    }

    public boolean isValid(String password) {

    }
}
