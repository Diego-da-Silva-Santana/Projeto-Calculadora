package com.projetoCalculadora.API.exception;

import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice // classe especifica para excecão
@Order(Integer.MIN_VALUE)
public class HandlerException {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorResponse> illegalArgumentException(IllegalArgumentException exception){

        ErrorResponse errorResponse = new ErrorResponse(exception.getMessage());

        return ResponseEntity.badRequest().body(errorResponse);

    }

}
