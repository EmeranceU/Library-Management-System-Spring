package com.app;

import java.util.List;

public class LibraryManager {

    private final BookService bookService;

    public LibraryManager(BookService bookService) {
        this.bookService = bookService;
    }

    public void addBook(Book book) {
        bookService.addBook(book);
    }

    public void printAllBooks() {
        List<Book> books = bookService.viewBooks();
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Library books:");
            for (Book book : books) {
                System.out.println("  - " + book);
            }
        }
    }
}
