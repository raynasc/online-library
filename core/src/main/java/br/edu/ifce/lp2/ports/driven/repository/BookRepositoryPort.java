package br.edu.ifce.lp2.ports.driven.repository;

import br.edu.ifce.lp2.domain.Book;

import java.util.Optional;

public interface BookRepositoryPort {
    Book save(Book book);
    Optional<Book> findById(String id);
}
