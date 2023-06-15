package com.crypto.bank.exception;

public class ExpiredDateException extends ServiceException{
    public ExpiredDateException(String errorCode) {
        super(errorCode);
    }

    public ExpiredDateException(String message, String errorCode) {
        super(message, errorCode);
    }

    public ExpiredDateException(String message, Throwable cause, String errorcode) {
        super(message, cause, errorcode);
    }

    public ExpiredDateException(Throwable cause, String errorcode) {
        super(cause, errorcode);
    }

    protected ExpiredDateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String errorcode) {
        super(message, cause, enableSuppression, writableStackTrace, errorcode);
    }
}
