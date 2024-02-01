package com.example.book;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
class BookConfiguration {
    private final BookRepository bookRepository;

    @Bean
    BookQueryRepositoryImpl bookQueryRepository(){
        return new BookQueryRepositoryImpl(bookRepository);
    }
}
