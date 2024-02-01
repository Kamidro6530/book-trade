package com.example.book.api;

import com.example.book.Book;

import java.util.List;
import java.util.Optional;

public interface BookQueryRepository {

    Optional<Book> findByISBN(ISBN isbn);

    List<Book> findByTitle(String title);

}
