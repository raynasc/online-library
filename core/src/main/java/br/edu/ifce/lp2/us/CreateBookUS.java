package br.edu.ifce.lp2.us;

import br.edu.ifce.lp2.domain.Book;
import br.edu.ifce.lp2.ports.driven.repository.BookRepositoryPort;
import br.edu.ifce.lp2.ports.driver.CreateBookPort;
import org.springframework.stereotype.Service;

@Service
public record CreateBookUS(
       BookRepositoryPort Repository) implements CreateBookPort {

    @Override
    public Book apply(Book book) {

        book = Repository.save(book);

        return book;
    }
}
