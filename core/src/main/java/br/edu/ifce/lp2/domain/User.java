package br.edu.ifce.lp2.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class User {
    private String id;
    private String email;
    private String password;
    private List<Book> favoriteBooks;
}
