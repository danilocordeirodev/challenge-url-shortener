package com.manedwolf.challenge_url_shortener.service;

import com.manedwolf.challenge_url_shortener.domain.dto.UrlRequestDTO;
import com.manedwolf.challenge_url_shortener.domain.dto.UrlResponseDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpHeaders;

public interface UrlService {
    UrlResponseDTO shortenUrl(UrlRequestDTO data, HttpServletRequest request);
    HttpHeaders redirect(String id);
}
