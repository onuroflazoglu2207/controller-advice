package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class UserDeleteException extends RuntimeException {
    public UserDeleteException(Long identity) {
        super(identity + " is not found, function = delete", null, false, false);
    }
}
