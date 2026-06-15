package com.app;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookServiceImpl implements BookService {

    private final List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    @Override
    public List<Book> viewBooks() {
        return books;
    }
}
