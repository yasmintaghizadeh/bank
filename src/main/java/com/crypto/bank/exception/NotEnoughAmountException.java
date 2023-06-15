package com.crypto.bank.exception;

public class NotEnoughAmountException extends ServiceException{
    public NotEnoughAmountException(String errorcode) {
        super(errorcode);
    }

    public NotEnoughAmountException(String message, String errorcode) {
        super(message, errorcode);
    }

    public NotEnoughAmountException(String message, Throwable cause, String errorcode) {
        super(message, cause, errorcode);
    }

    public NotEnoughAmountException(Throwable cause, String errorcode) {
        super(cause, errorcode);
    }

    protected NotEnoughAmountException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String errorcode) {
        super(message, cause, enableSuppression, writableStackTrace, errorcode);
    }
}
