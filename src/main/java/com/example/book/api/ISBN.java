package com.example.book.api;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Getter
@ToString
@Embeddable
public class ISBN implements Serializable {
    private String isbnCode;
}
