package com.example.author.api;

import com.example.author.Author;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AuthorQueryRepository {
    Optional<Author> findById(AuthorId id);

    List<Author> findByIds(List<AuthorId> ids);
}
