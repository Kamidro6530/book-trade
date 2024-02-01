package com.example.book;

import com.example.book.api.BookQueryRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class BookQueryRepositoryImpl implements BookQueryRepository {
    private final BookRepository bookRepository;
}
