package br.edu.ifce.lp2.repository;

import br.edu.ifce.lp2.domain.User;
import br.edu.ifce.lp2.ports.driven.repository.UserRepositoryPort;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String>, UserRepositoryPort {
}
