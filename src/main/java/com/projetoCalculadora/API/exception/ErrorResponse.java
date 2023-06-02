package com.projetoCalculadora.API.exception;

public class ErrorResponse {

    private String error;

    public ErrorResponse() {

    }

    public ErrorResponse(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }
}
