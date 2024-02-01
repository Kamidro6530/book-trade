package com.example.book;

import com.example.book.api.AuthorId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
class Author {
    @Id
    private AuthorId id;
    private String firstName;
    private String lastName;
    @ManyToMany(mappedBy = "authors")
    private List<Book> books;
}
