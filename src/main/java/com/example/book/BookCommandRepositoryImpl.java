package com.example.book;

import com.example.author.Author;
import com.example.author.api.AuthorQueryRepository;
import com.example.book.api.BookCommandRepository;
import com.example.book.api.BookDto;
import com.example.book.api.ISBN;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
class BookCommandRepositoryImpl implements BookCommandRepository {
    private final BookRepository bookRepository;
    private final AuthorQueryRepository authorQueryRepository;

    @Override
    public ISBN save(BookDto book) {
        List<Author> authors = authorQueryRepository.findByIds(book.authors());
        bookRepository.save(new Book(book.isbn(), book.title(),authors,book.pages(),book.state()));
        return null;
    }
}
