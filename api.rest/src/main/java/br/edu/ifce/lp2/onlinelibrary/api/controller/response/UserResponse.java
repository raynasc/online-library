package br.edu.ifce.lp2.onlinelibrary.api.controller.response;

import br.edu.ifce.lp2.domain.User;
import lombok.Getter;

@Getter
public class UserResponse {
    private String id;
    private String email;
    private String password;

    public UserResponse fromUser(User user) {
        this.id = user.getId();
        this.email = user.getEmail();
        this.password = user.getPassword();

        return this;
    }
}