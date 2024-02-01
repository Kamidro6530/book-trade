package com.example.user;

import com.example.book.Book;
import com.example.user.api.UserId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    private UserId id;
    private String firstName;
    private String lastName;
    private String nickname;
    private String email;
    private String password;
    @OneToMany
    private List<Book> booksCollection;
    private Long rating;
    private boolean isCollectionPrivate;

    public void addBookToTheCollection(Book book){
        booksCollection.add(book);
    }


}
