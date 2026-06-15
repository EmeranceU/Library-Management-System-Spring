package com.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.app")
public class AppConfig {

    @Bean
    public LibraryManager libraryManager(BookService bookService) {
        return new LibraryManager(bookService);
    }
}
