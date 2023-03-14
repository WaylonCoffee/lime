package com.qing.owl.auth.infra.common.data;

public class ResultCode {
    UNAUTHORIZED(403, "未经授权，无法访问"),
    UNAUTHORIZED(403, "未经授权，无法访问"),
    OK(200, "成功");

    private int code;
    private String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
