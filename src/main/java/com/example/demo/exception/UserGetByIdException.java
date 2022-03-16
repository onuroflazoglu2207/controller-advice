package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserGetByIdException extends RuntimeException {
    public UserGetByIdException(Long identity) {
        super(identity + " is not found, function = getById", null, false, false);
    }
}
