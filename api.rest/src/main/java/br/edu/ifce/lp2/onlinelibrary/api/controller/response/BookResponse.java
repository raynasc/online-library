package br.edu.ifce.lp2.onlinelibrary.api.controller.response;

import br.edu.ifce.lp2.domain.Book;
import lombok.Getter;

@Getter
public class BookResponse {
    private String id;
    private String title;
    private String sinopse;

    public BookResponse fromBook(Book book) {
        this.id = book.getId();
        this.title = book.getTitle();
        this.sinopse = book.getSynopsis();

        return this;
    }
}
