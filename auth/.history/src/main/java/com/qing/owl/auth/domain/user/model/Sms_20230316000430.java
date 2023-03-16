package com.qing.owl.auth.domain.user.model;

import java.util.Random;

import com.qing.owl.auth.infra.common.utils.BusinessCodeGenUtils;

import lombok.Data;

@Data
public class Sms {

    private PhoneNumber phoneNumber;
    private String text;

    public Sms(PhoneNumber phoneNumber, String text) {
        this.text = text;
        this.phoneNumber = phoneNumber;
    }

    public static Sms genRegisterCode(PhoneNumber phoneNumber) {
        return new Sms(phoneNumber, Integer.toString(BusinessCodeGenUtils.genFourBitRandomNum()));
    }

}
