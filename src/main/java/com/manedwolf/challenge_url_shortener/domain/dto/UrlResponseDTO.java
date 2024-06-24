package com.manedwolf.challenge_url_shortener.domain.dto;

public record UrlResponseDTO(
        String url,
        String shortenUrl
) {
}
