package br.edu.ifce.lp2.ports.driven.repository;

import br.edu.ifce.lp2.domain.Book;
import br.edu.ifce.lp2.domain.User;

import java.util.Optional;

public interface UserRepositoryPort {
    User save(User user);
    Optional<User> findById(String id);
}
