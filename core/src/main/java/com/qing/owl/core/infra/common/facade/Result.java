package com.qing.owl.core.infra.common.facade;

import com.qing.owl.core.infra.common.exception.ErrorCode;
import lombok.Getter;

@Getter
public class Result<T> {
    private Integer status;
    private String msg;
    private T data;
    private Long timestamp;

    public Result (Integer status, String msg,T data){
       this.status = status;
       this.msg = msg;
       this.data = data;
    }

    public Result (Integer status, String msg){
       this.status = status;
       this.msg = msg;
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMsg(),data);
    }

    public static <T> Result<T> fail() {
         return new Result<>(ResultCode.FAILED.getCode(),ResultCode.FAILED.getMsg());
    }

    public static <T> Result<T> fail(Integer status,String message) {
         return new Result<>(status,message);
    }
    public static <T> Result<T> fail(ErrorCode errorCode) {
        return new Result<>(errorCode.getStatus(),errorCode.getMessage());
   }
    
}
