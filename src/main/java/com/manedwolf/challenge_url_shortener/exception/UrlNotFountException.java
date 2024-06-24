package com.manedwolf.challenge_url_shortener.exception;

import lombok.Getter;

@Getter
public class UrlNotFountException extends RuntimeException {
    private final String urlId;

    public UrlNotFountException(String urlId) {
        super(String.format("Url %s not found " , urlId));
        this.urlId = urlId;
    }
}
