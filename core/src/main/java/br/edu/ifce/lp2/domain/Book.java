package br.edu.ifce.lp2.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private String id;
    private String title;
    private String author;
    private String genre;
    private String yearPublication;
    private String synopsis;
    private String publishingCompany;

}
