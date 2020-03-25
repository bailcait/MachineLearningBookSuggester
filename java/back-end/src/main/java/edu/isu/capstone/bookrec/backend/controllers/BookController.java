package edu.isu.capstone.bookrec.backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@RestController
public class BookController {
    @GetMapping("/book/{id}")
    public String getBookById(@PathVariable Long id) {
        throw new NotImplementedException();
    }

    @GetMapping("/book/{title}")
    public String getBookByTitle(@PathVariable String title) {
        throw new NotImplementedException();
    }

    @GetMapping("/book/{isbn}")
    public String getBookByIsbn(@PathVariable int isbn) {
        throw new NotImplementedException();
    }
}
