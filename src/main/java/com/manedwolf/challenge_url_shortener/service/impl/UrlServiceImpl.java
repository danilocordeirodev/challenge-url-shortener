package com.manedwolf.challenge_url_shortener.service.impl;

import com.manedwolf.challenge_url_shortener.domain.dto.UrlRequestDTO;
import com.manedwolf.challenge_url_shortener.domain.dto.UrlResponseDTO;
import com.manedwolf.challenge_url_shortener.exception.UrlNotFountException;
import com.manedwolf.challenge_url_shortener.repository.UrlRepository;
import com.manedwolf.challenge_url_shortener.repository.entity.UrlEntity;
import com.manedwolf.challenge_url_shortener.service.UrlService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class UrlServiceImpl implements UrlService {

    private final UrlRepository urlRepository;

    @Override
    public UrlResponseDTO shortenUrl(UrlRequestDTO data, HttpServletRequest request) {
        String id;

        do {
            id = RandomStringUtils.randomAlphanumeric(5, 10);
        } while (urlRepository.existsById(id));

        urlRepository.save(new UrlEntity(id, data.url(), LocalDateTime.now().plusMinutes(1)));

        String redirectUrl = request.getRequestURL().toString().replace("shorten-url", id);

        return new UrlResponseDTO(data.url(), redirectUrl);
    }

    @Override
    public HttpHeaders redirect(String id) {
        UrlEntity url = urlRepository.findById(id)
                .orElseThrow(() -> new UrlNotFountException(id));

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(URI.create(url.getUrl()));
        return headers;
    }
}
