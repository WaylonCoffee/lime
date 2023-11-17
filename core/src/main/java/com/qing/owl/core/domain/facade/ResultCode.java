package com.qing.owl.core.domain.facade;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultCode {
    SUCCESS(200,"成功"),
    FAILED(500,"未知错误");

    private int code;
    private String msg;
}
