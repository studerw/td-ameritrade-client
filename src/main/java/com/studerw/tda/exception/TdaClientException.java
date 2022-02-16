package com.studerw.tda.exception;

public class TdaClientException extends RuntimeException {

    public TdaClientException(String message) {
        super(message);
    }

    public TdaClientException(Throwable cause) {
        super(cause);
    }

    public TdaClientException(String message, Throwable cause) {
        super(message, cause);
    }
}
