package br.edu.ifce.lp2.onlinelibrary.api.controller;

import br.edu.ifce.lp2.onlinelibrary.api.controller.request.BookRequest;
import br.edu.ifce.lp2.onlinelibrary.api.controller.response.BookResponse;
import br.edu.ifce.lp2.ports.driver.CreateBookPort;
import br.edu.ifce.lp2.ports.driver.FindBookByIdPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    private FindBookByIdPort findBookByIdPort;

    @GetMapping("{id}")
    public BookResponse findById(@PathVariable String id) {
        var book = findBookByIdPort.apply(id);
        return new BookResponse().fromBook(book);
    }
}
