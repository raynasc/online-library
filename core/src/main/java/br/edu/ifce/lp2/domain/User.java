package br.edu.ifce.lp2.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String id;
    private String email;
    private String password;
}
