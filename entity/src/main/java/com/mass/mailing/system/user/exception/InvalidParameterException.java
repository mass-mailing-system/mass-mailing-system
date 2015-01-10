package com.mass.mailing.system.user.exception;

public class InvalidParameterException extends Exception {

    public InvalidParameterException(String message) {
        super(message);
    }

    public InvalidParameterException(Exception ex) {
        super(ex);
    }

    public InvalidParameterException() {
        super();
    }
}
