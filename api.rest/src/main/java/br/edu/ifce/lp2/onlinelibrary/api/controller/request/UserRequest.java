package br.edu.ifce.lp2.onlinelibrary.api.controller.request;

import br.edu.ifce.lp2.domain.User;
import lombok.Setter;

@Setter
public class UserRequest {
    private String email;
    private String password;


    public User toUser() {
        var user = new User();

        user.setEmail(email);
        user.setPassword(password);
        
        return user;
    }  
}
