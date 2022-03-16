package com.example.demo.advice;

import com.example.demo.exception.*;
import com.example.demo.service.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

//@ControllerAdvice(value = "com.example.demo.service")
//@ControllerAdvice(basePackages = "com.example.demo.service")
//@ControllerAdvice(assignableTypes = UserServiceImpl.class)
//@ControllerAdvice(basePackageClasses = UserServiceImpl.class)
@ControllerAdvice(annotations = Service.class)
public class UserExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(UserGetByIdException.class)
    public void getByIdHandler(UserGetByIdException ex) {}

    @ExceptionHandler(UserSaveException.class)
    public void saveHandler() {}

    @ExceptionHandler(UserUpdateException.class)
    public void updateHandler(UserUpdateException ex) {}

    @ExceptionHandler(UserDeleteException.class)
    public void deleteHandler() {}
}
