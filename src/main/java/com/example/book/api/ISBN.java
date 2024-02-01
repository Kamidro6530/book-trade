package com.example.book.api;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Getter
@ToString
@Embeddable
public class ISBN implements Serializable {
    private String isbnCode;
}
