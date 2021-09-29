package com.redbird.lesson14.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Just usual book with name
 */
@Data
@Component
@NoArgsConstructor
public class Book {

    private String name;

    /**
     * constructor
     * @param name is name of book
     */
    public Book(String name) {
        this.name = name;
    }
}
