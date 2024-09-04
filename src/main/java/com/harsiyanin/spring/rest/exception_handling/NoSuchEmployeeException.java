package com.harsiyanin.spring.rest.exception_handling;

public class NoSuchEmployeeException extends RuntimeException {

    public NoSuchEmployeeException(String message) {
        super(message);
    }
}
