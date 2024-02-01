package com.example.book.api;

import com.example.author.api.AuthorId;

import java.util.List;

public record BookDto (
     ISBN isbn,
     String title,
     List<AuthorId> authors,
     Long pages,
     BookState state
){

}
