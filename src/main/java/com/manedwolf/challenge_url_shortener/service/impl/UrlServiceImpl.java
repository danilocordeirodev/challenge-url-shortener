package com.manedwolf.challenge_url_shortener.service.impl;

import com.manedwolf.challenge_url_shortener.domain.dto.UrlRequestDTO;
import com.manedwolf.challenge_url_shortener.domain.dto.UrlResponseDTO;
import com.manedwolf.challenge_url_shortener.service.UrlService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpHeaders;

public class UrlServiceImpl implements UrlService {
    @Override
    public UrlResponseDTO shortenUrl(UrlRequestDTO data, HttpServletRequest request) {
        return null;
    }

    @Override
    public HttpHeaders redirect(String id) {
        return null;
    }
}
