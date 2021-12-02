package br.edu.ifce.lp2.us;

import br.edu.ifce.lp2.domain.User;
import br.edu.ifce.lp2.ports.driven.repository.UserRepositoryPort;
import br.edu.ifce.lp2.ports.driver.CreateUserPort;
import org.springframework.stereotype.Service;

@Service
public record CreateUserUS(
       UserRepositoryPort Repository) implements CreateUserPort {

    @Override
    public User apply(User user) {

        user = Repository.save(user);

        return user;
    }
}
