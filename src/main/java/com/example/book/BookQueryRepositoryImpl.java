package com.example.book;

import com.example.book.api.BookQueryRepository;
import com.example.book.api.ISBN;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
class BookQueryRepositoryImpl implements BookQueryRepository {
    private final BookRepository bookRepository;

    @Override
    public Optional<Book> findByISBN(ISBN isbn) {
        return bookRepository.findById(isbn.getIsbnCode());
    }

    @Override
    public List<Book> findByTitle(String title) {
        return bookRepository.findByTitle(title);
    }
}
