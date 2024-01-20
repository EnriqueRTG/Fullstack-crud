package com.enrique.crud.backend.config;

import com.enrique.crud.backend.dtos.ErrorDTO;
import com.enrique.crud.backend.exceptions.AppException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler(value = {AppException.class})
    @ResponseBody
    public ResponseEntity<ErrorDTO> handleException(AppException exception) {
        return ResponseEntity.status(exception.getStatus())
                .body(new ErrorDTO(exception.getMessage()));
    }
}
