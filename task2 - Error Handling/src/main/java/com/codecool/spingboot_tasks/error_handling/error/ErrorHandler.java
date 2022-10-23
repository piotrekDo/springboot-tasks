package com.codecool.spingboot_tasks.error_handling.error;

import com.codecool.spingboot_tasks.error_handling.model.BackendError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ErrorHandler {


    @ExceptionHandler(value = ProductNotFoundException.class)
    ResponseEntity<BackendError> handleNoSuchElementException(ProductNotFoundException e) {
        return new ResponseEntity<>(new BackendError(
                e.getMessage(),
                BackendError.Level.ERROR
        ), HttpStatus.BAD_REQUEST);
    }
}
