package br.edu.ifce.lp2.ports.driver;

import br.edu.ifce.lp2.domain.Book;

public interface CreateBookPort {
    Book apply(Book book);
}
