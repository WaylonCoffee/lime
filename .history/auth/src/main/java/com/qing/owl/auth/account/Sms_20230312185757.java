package com.qing.owl.auth.account;

import java.util.Random;

import lombok.Data;

@Data
public class Sms {

    private PhoneNumber phoneNumber;
    private String text;

    public Sms(PhoneNumber phoneNumber, String text) {
        this.text = text;
    }

    public static Sms genRegisterCode(PhoneNumber number) {
        Random random = new Random();
        return new Sms(number, Integer.toString(random.nextInt(1000 + random.nextInt(9000))));
    }

}
