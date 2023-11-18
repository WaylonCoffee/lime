package com.qing.owl.core.infra.common.facade;

import cn.hutool.json.JSONUtil;
import lombok.Getter;

@Getter
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;
    private Long timestamp;

    public Result (Integer code, String msg,T data){
       this.code = code;
       this.msg = msg;
       this.data = data;
    }

    public Result (Integer code, String msg){
       this.code = code;
       this.msg = msg;
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMsg(),data);
    }

    public static <T> Result<T> fail() {
         return new Result<>(ResultCode.FAILED.getCode(),ResultCode.FAILED.getMsg());
    }
    
}
