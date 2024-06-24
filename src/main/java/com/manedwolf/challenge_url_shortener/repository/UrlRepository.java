package com.manedwolf.challenge_url_shortener.repository;

import com.manedwolf.challenge_url_shortener.repository.entity.UrlEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UrlRepository extends MongoRepository<UrlEntity, String> {
}
