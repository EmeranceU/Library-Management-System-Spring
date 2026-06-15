package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        LibraryManager libraryManager = context.getBean(LibraryManager.class);

        libraryManager.addBook(new Book("Java For Beginners", "Robert"));
        libraryManager.addBook(new Book("Advanced Java", "Emerance"));
        libraryManager.addBook(new Book("Web Design", "Eme"));

        libraryManager.printAllBooks();

        context.close();
    }
}
