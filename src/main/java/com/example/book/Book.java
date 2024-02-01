package com.example.book;

import com.example.book.api.ISBN;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
class Book {
    @Id
    private ISBN isbn;
    private String title;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "book_authors",
            joinColumns = {@JoinColumn(name = "isbn") },
            inverseJoinColumns = {@JoinColumn(name = "author_id")}
    )
    private List<Author> authors;
    private Long pages;
    @Enumerated(EnumType.STRING)
    private BookState state;
}
