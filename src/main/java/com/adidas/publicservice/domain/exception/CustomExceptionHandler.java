package com.adidas.publicservice.domain.exception;

import com.adidas.publicservice.application.response.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class CustomExceptionHandler {


    @ExceptionHandler(AuthorizationException.class)
    public ResponseEntity<ErrorResponse> authorizationException(AuthorizationException exception) {
        log.error("Error: ", exception);
        return new ResponseEntity<>(ErrorResponse.builder()
                .code(exception.getApiError().name())
                .message(exception.getMessage())
                .build(), HttpStatus.UNAUTHORIZED);
    }

}
