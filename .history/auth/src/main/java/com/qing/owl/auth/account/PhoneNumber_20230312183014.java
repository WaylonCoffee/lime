package com.qing.owl.auth.account;

import org.springframework.util.StringUtils;

import jakarta.validation.ValidationException;
import lombok.Getter;

@Getter
public class PhoneNumber {

    private final String number;

    public PhoneNumber(String number) {
        if (StringUtils.hasLength(number)) {
            throw new ValidationException("手机号不能为空！");
        } else if (isValid(number)) {
            throw new ValidationException("请输入正确的手机号！");
        }
    }

    private boolean isValid(String number) {
        String pattern = "^0?[1-9]{2,3}-?\\d{8}$";
        return number.matches(pattern);
    }

}
