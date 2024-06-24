package com.manedwolf.challenge_url_shortener.exception.handler;

import com.manedwolf.challenge_url_shortener.exception.UrlNotFountException;
import com.manedwolf.challenge_url_shortener.exception.model.UrlShortenerError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.List;

@ControllerAdvice
public class UrlShortenerExceptionHandler {
    @ExceptionHandler(UrlNotFountException.class)
    public ResponseEntity<UrlShortenerError> handlerNotFound(UrlNotFountException ex) {
        UrlShortenerError errorResponse = UrlShortenerError.builder()
                .timestamp(LocalDateTime.now())
                .code(HttpStatus.NOT_FOUND.value())
                .status(HttpStatus.NOT_FOUND.name())
                .errors(List.of(ex.getMessage()))
                .build();
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}
