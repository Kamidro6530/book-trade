package com.example.domain.book;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
public class Book {

    @Id
    private String isbn;
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
