package br.edu.ifce.lp2.onlinelibrary.api.controller;

import br.edu.ifce.lp2.onlinelibrary.api.controller.request.BookRequest;
import br.edu.ifce.lp2.onlinelibrary.api.controller.response.BookResponse;
import br.edu.ifce.lp2.ports.driver.CreateBookPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("books")
public class BookController {

    @Autowired
    private CreateBookPort createBookPort;

    @PostMapping
    public BookResponse post(@RequestBody BookRequest request){
        var book = request.toBook();
        return new BookResponse().fromBook(createBookPort.apply(book));
    }
}
