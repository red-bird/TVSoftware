package com.redbird.lesson14.controllers;

import com.redbird.lesson14.models.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/entities/book")
public class EntityController {

    List<Book> books = new ArrayList<Book>();

    /**
     * return list of all saved books
     * @return list of all saved books
     */
    @GetMapping()
    public List<Book> get() {
        return books;
    }

    /**
     * save book
     * @param name is name of book
     * @return updated list of books
     */
    @PostMapping()
    public List<Book> postBook(@RequestBody String name) {
        Book book = new Book(name);
        books.add(book);
        return books;
    }

    /**
     * delete book from list
     * @param name is name of book
     */
    @DeleteMapping("{name}")
    public void deleteBook(@PathVariable String name) {
        books.removeIf(book -> book.getName().equals(name));
    }
}