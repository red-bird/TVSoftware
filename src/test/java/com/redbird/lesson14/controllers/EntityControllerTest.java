package com.redbird.lesson14.controllers;

import com.redbird.lesson14.models.Book;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EntityControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private EntityController entityController;

    @Test
    void get() {
        List<Book> books = new ArrayList<Book>();
        assertEquals(books, entityController.get());
    }

    @Test
    void postBook() {
        List<Book> books = new ArrayList<Book>();
        Book book = new Book("Shrek");
        books.add(book);
        assertEquals(books, entityController.postBook("Shrek"));
    }

    @Test
    void deleteBook() {
        List<Book> books = new ArrayList<Book>();
        entityController.postBook("Shrek");
        entityController.deleteBook("Shrek");
        assertEquals(books, entityController.get());
    }

}