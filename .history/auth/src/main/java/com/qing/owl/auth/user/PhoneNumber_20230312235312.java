package com.qing.owl.auth.user;

import org.springframework.util.StringUtils;

import jakarta.validation.ValidationException;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PhoneNumber {

    private final String number;

    public PhoneNumber(String number) {
        if (!StringUtils.hasLength(number)) {
            throw new ValidationException("手机号不能为空！");
        } else if (!isValid(number)) {
            throw new ValidationException("请输入正确的手机号！");
        }
        this.number = number;
    }

    private boolean isValid(String number) {
        String pattern = "^1[0-9]{10}$";
        return number.matches(pattern);
    }

}
