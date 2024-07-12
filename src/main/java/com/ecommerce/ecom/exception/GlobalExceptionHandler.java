package com.ecommerce.ecom.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.stream.Collectors;


@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<CategoryErrorResponse> myMethodArgumentNotValidException (MethodArgumentNotValidException exc){
        CategoryErrorResponse CategoryError = new CategoryErrorResponse();
        CategoryError.setStatus(HttpStatus.BAD_REQUEST.value());
        String errorMessage = exc.getBindingResult().getFieldErrors()
        .stream().map(error -> error.getField() + " " + error.getDefaultMessage()).collect(Collectors.joining(", "));
        CategoryError.setMessage(errorMessage);
        CategoryError.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(CategoryError, HttpStatus.BAD_REQUEST);

    }
}
