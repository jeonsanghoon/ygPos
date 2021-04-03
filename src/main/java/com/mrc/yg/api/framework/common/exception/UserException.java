package com.mrc.yg.api.framework.common.exception;


public class UserException extends Exception {
    private final int errorCode;
    public UserException(int errorCode) {
        super();
        this.errorCode = errorCode;
    }
    public UserException(String message) {
        super(message);
        this.errorCode=0;
    }

    public UserException(int errorCode,String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public UserException(String message, Throwable cause, int errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }
    public UserException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    public UserException(Throwable cause, int errorCode) {
        super(cause);
        this.errorCode = errorCode;
    }


    public int getCode() {
        return this.errorCode;
    }
}
