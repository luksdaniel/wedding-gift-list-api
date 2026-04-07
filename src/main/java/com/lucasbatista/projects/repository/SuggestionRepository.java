package com.lucasbatista.projects.repository;

import com.lucasbatista.projects.entity.Suggestion;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface SuggestionRepository extends MongoRepository<Suggestion, UUID> {

}
