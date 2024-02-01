package com.example.author;

import com.example.author.api.AuthorId;
import com.example.author.api.AuthorQueryRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@RequiredArgsConstructor
class AuthorQueryRepositoryImpl implements AuthorQueryRepository {
    AuthorRepository authorRepository;

    @Override
    public Optional<Author> findById(AuthorId id) {
        return authorRepository.findById(id.getId());
    }

    @Override
    public List<Author> findByIds(List<AuthorId> ids) {
        return ids.stream()
                .map(id -> authorRepository.findById(id.getId()))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
    }
}
