package com.qing.owl.auth.user;

import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

import com.qing.owl.auth.infra.common.utils.RandomUtils;

import ch.qos.logback.core.testUtil.RandomUtil;

public class Password {
    private Integer salt;
    private String password;

    public Password(String password) {
        if (!StringUtils.hasLength(password)) {
            throw new IllegalArgumentException("密码不能为空！");
        }
        if (!isValid(password)) {
            throw new IllegalArgumentException("密码长度需大于8，且至少包含1个大写字母，1个小写字母，1个特殊字符，1位数字！");
        }
    }

    private String encrypt(String password) {
        this.salt = RandomUtils.genFourBitRandomNum();
        return DigestUtils.md5DigestAsHex((password + salt).getBytes());
    }

    public Boolean isValid(String password) {

        String pattern = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
        return password.matches(pattern);
    }
}
