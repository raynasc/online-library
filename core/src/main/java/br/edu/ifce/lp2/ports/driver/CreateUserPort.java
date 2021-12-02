package br.edu.ifce.lp2.ports.driver;

import br.edu.ifce.lp2.domain.User;

public interface CreateUserPort {
    User apply(User user);
}
