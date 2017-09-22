package com.matthewlqm.exception;

/**
 * Created by huafu on 2017/9/22.
 */
public class UnimplementMethodException extends RuntimeException {

    public UnimplementMethodException() {
        super();
    }

    public UnimplementMethodException(String message) {
        super(message);
    }

    public UnimplementMethodException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnimplementMethodException(Throwable cause) {
        super(cause);
    }

}
