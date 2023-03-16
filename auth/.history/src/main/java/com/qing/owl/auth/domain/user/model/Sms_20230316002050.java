package com.qing.owl.auth.domain.user.model;

import com.qing.owl.auth.infra.common.utils.BusinessCodeGenUtils;
import lombok.Data;

@Data
public class Sms {

    private Phone phoneNumber;
    private String text;

    public Sms(Phone phoneNumber, String text) {
        this.text = text;
        this.phoneNumber = phoneNumber;
    }

    public static Sms genRegisterCode(Phone phoneNumber) {
        return new Sms(phoneNumber, Integer.toString(BusinessCodeGenUtils.genFourBitRandomNum()));
    }

}
