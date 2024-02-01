package com.example.author;

import com.example.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

interface AuthorRepository extends JpaRepository<Author, UUID> {

}
