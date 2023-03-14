package com.qing.owl.auth.account;

public class PhoneNumber {

    String number;

    private void isValid(String number) {
        String pattern = "^0?[1-9]{2,3}-?\\d{8}$";
        return number.matches(pattern);
    }

}
