package com.qing.owl.auth.account;

import org.springframework.util.StringUtils;

public class PhoneNumber {

    String number;

    public PhoneNumber(String number) {
        if (StringUtils.hasLength(number)) {
            throw new ValidationException();
        }
    }

    private boolean isValid(String number) {
        String pattern = "^0?[1-9]{2,3}-?\\d{8}$";
        return number.matches(pattern);
    }

}
