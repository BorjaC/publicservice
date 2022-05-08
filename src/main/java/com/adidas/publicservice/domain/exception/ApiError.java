package com.adidas.publicservice.domain.exception;

import lombok.Getter;

public enum ApiError {

    ERROR_000("Invalid token security");


    @Getter
    private String message;


    private ApiError(String message) {
        this.message = message;
    }

}
