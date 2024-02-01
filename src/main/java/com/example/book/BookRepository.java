package com.example.book;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

interface BookRepository extends JpaRepository<Book,String>{

    List<Book> findByTitle(String title);
}

