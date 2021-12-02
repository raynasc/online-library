package br.edu.ifce.lp2.onlinelibrary.api.controller;

import br.edu.ifce.lp2.onlinelibrary.api.controller.request.UserRequest;
import br.edu.ifce.lp2.onlinelibrary.api.controller.response.UserResponse;
import br.edu.ifce.lp2.ports.driver.CreateUserPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private CreateUserPort createUserPort;

    @PostMapping
    public UserResponse post(@RequestBody UserRequest request){
        var user = request.toUser();
        return new UserResponse().fromUser(createUserPort.apply(user));
    }
}
