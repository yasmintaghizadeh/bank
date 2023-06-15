package com.crypto.bank.exception;

import lombok.Getter;

@Getter
public class ServiceException extends Exception{
    private final String errorCode;

    public ServiceException(String errorCode) {
        super();
        this.errorCode = errorCode;
    }

    public ServiceException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public ServiceException(String message, Throwable cause, String errorcode) {
        super(message, cause);
        this.errorCode = errorcode;
    }

    public ServiceException(Throwable cause, String errorcode) {
        super(cause);
        this.errorCode = errorcode;
    }

    protected ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String errorcode) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errorCode = errorcode;
    }


    public String getErrorCode() {
        return errorCode;
    }
}
