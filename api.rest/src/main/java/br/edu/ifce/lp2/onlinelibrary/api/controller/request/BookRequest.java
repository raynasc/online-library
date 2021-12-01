package br.edu.ifce.lp2.onlinelibrary.api.controller.request;

import br.edu.ifce.lp2.domain.Book;
import lombok.Setter;

@Setter
public class BookRequest {
    private String title;
    private String author;
    private String genre;
    private String yearPublication;
    private String sinopse;
    private String publishingCompany;

    public Book toBook() {
        var book = new Book();

        book.setTitle(title);
        book.setAuthor(author);
        book.setGenre(genre);
        book.setYearPublication(yearPublication);
        book.setSynopsis(sinopse);
        book.setPublishingCompany(publishingCompany);

        return book;
    }
}
