package com.github.parkhuiwo0.testcontainer.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackageClasses = CommonRestControllerAdvice.class)
class CommonRestControllerAdvice {

    @ExceptionHandler(Exception.class)
    ResponseEntity<?> handle(Exception ex) {
        return new ResponseEntity<>(
                ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
