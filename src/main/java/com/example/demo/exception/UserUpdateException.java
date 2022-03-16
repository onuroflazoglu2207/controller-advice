package com.example.demo.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class UserUpdateException extends RuntimeException {
    public UserUpdateException(String message) {
        super(message + ", function = update", null, false, false);
    }
}
