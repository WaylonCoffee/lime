package com.qing.owl.auth.infra.common.data;

import java.io.Serializable;

public class Result<T> implements Serializable {
    private Integer code;
    private T data;
    private String message;
    private String timestamp;

    public Result(int code, String message, T data) {
        this.timestamp = String.valueOf(System.currentTimeMillis());
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public Result(int code, String message) {
        this.timestamp = String.valueOf(System.currentTimeMillis());
        this.code = code;
        this.message = message;
    }

    public static <T> Result<T> success(T data) {
        return new Result(ResultCode.OK.getCode(), ResultCode.OK.getMessage(), data);
    }

    public static <T> Result<T> success() {
        return new Result(ResultCode.OK.getCode(), ResultCode.OK.getMessage());
    }

    public static <T> Result<T> fail(String message) {
        return new Result(ResultCode.FAIL.getCode(), result.getMessage(), null);
    }

}
