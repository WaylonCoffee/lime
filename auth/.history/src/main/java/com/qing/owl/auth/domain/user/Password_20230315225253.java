package com.qing.owl.auth.domain.user;

import org.springframework.util.StringUtils;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Password {

    private String password;

    public Password(String password) {
        if (!StringUtils.hasLength(password)) {
            throw new IllegalArgumentException("密码不能为空！");
        }
        if (!isValid(password)) {
            throw new IllegalArgumentException("密码长度需大于8，且至少包含1个大写字母，1个小写字母，1个特殊字符，1位数字！");
        }
        this.password = password;
    }

    public Boolean isValid(String password) {
        String pattern = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
        return password.matches(pattern);
    }

}
