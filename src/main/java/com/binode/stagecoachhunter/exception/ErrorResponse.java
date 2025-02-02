package com.binode.stagecoachhunter.exception;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public  class ErrorResponse {
    // Getters and setters
    private String errorCode;
    private String message;

    public ErrorResponse(String errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

}

