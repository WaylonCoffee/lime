package com.qing.owl.auth.account;

import java.util.Random;

import lombok.Data;

@Data
public class Sms {
    private String text;

    public Sms(String text) {
        this.text = text;
    }

    public Sms genRegisterCode() {
        Random random = new Random();
        return new Sms(random.nextInt(1000 + random.nextInt(9000)).toString());
    }

}
