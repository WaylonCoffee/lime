package com.qing.owl.auth.account;

public class PhoneNumber {

    String number;

    public PhoneNumber(String number) {
        if (StringUtils.isEmpty(number)) {

        }
    }

    private boolean isValid(String number) {
        String pattern = "^0?[1-9]{2,3}-?\\d{8}$";
        return number.matches(pattern);
    }

}
