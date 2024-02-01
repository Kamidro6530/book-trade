package com.example.book.api;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.UUID;

@Getter
@ToString
@Embeddable
public class AuthorId implements Serializable {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
}
