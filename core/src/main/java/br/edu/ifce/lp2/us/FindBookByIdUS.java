package br.edu.ifce.lp2.us;

import br.edu.ifce.lp2.domain.Book;
import br.edu.ifce.lp2.ports.driven.repository.BookRepositoryPort;
import br.edu.ifce.lp2.ports.driver.FindBookByIdPort;
import org.springframework.stereotype.Service;

@Service
public record FindBookByIdUS(
    BookRepositoryPort repository) implements FindBookByIdPort {

    @Override
    public Book apply(String id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Book not found!"));
    }

}
