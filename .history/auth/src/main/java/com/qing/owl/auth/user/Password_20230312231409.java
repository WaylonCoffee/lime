package com.qing.owl.auth.user;

import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

import com.qing.owl.auth.infra.common.utils.RandomUtils;

import ch.qos.logback.core.testUtil.RandomUtil;

public class Password {
    private Integer salt;
    private String password;

    public Password(String password) {
        this.salt = RandomUtils.genFourBitRandomNum();
        this.password = DigestUtils.md5DigestAsHex((password + salt).getBytes());
    }

    public boolean isValid(String password) {
        if (!StringUtils.hasLength(password)) {
            throw new IllegalArgumentException("密码不能为空！");
        }
        String pattern = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
    }
}
