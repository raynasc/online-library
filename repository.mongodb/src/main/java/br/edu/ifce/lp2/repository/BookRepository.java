package br.edu.ifce.lp2.repository;

import br.edu.ifce.lp2.domain.Book;
import br.edu.ifce.lp2.ports.driven.repository.BookRepositoryPort;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String>, BookRepositoryPort {
}
