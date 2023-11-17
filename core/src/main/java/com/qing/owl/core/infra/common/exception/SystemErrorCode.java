package com.qing.owl.core.infra.common.exception;

public enum SystemErrorCode implements ErrorCode{

    SYSTEM_ERROR(500, "系统错误");

    private int status;
    private String message;

    SystemErrorCode(int status, String message) {
        this.status = status;
        this.message = message;
    }
 
    @Override
    public int getStatus() {
       return this.status;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public String getCode() {
        return this.name();
    }
    
}
