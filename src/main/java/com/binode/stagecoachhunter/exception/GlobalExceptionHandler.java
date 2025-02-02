package com.binode.stagecoachhunter.exception;


import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;



@ControllerAdvice
public class GlobalExceptionHandler {

    // Handle generic exceptions
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseEntity<Object> exceptionHandler(Exception e) {
        // Log the exception for debugging (optional)
        // log.error("Exception occurred: ", e);

        // Default error response
        ErrorResponse errorResponse = new ErrorResponse("INTERNAL_SERVER_ERROR", e.getMessage());

        // Return a ResponseEntity with dynamic status code based on the exception
        HttpStatus status = getHttpStatus(e);
        return new ResponseEntity<>(errorResponse, status);
    }

    // You can add more specific exception handlers below as needed
    // Example: @ExceptionHandler(value = ResourceNotFoundException.class)

    // Method to map exception to HTTP status
    private HttpStatus getHttpStatus(Exception e) {
        if (e instanceof ResourceNotFoundException) {
            return HttpStatus.NOT_FOUND;
        } else if (e instanceof BadRequestException) {
            return HttpStatus.BAD_REQUEST;
        } else if (e instanceof UnauthorizedException) {
            return HttpStatus.UNAUTHORIZED;
        } else if (e instanceof ForbiddenException) {
            return HttpStatus.FORBIDDEN;
        }
        // Default to internal server error if no match
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }



    // Example of custom exceptions to map specific HTTP statuses
    public static class ResourceNotFoundException extends RuntimeException {
        public ResourceNotFoundException(String message) {
            super(message);
        }
    }

    public static class BadRequestException extends RuntimeException {
        public BadRequestException(String message) {
            super(message);
        }
    }

    public static class UnauthorizedException extends RuntimeException {
        public UnauthorizedException(String message) {
            super(message);
        }
    }

    public static class ForbiddenException extends RuntimeException {
        public ForbiddenException(String message) {
            super(message);
        }
    }
}

