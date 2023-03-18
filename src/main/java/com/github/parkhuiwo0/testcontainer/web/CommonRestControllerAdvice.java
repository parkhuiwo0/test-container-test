package com.github.parkhuiwo0.testcontainer.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.persistence.Version;

@RestControllerAdvice(basePackageClasses = CommonRestControllerAdvice.class)
class CommonRestControllerAdvice {

    @Version
    @ExceptionHandler(Exception.class)
    ResponseEntity<?> handle(Exception ex) {
        return new ResponseEntity<>(
                ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
