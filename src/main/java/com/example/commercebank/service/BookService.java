package com.example.commercebank.service;

import com.example.commercebank.domain.Book;
import com.example.commercebank.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookService {
    private final BookRepository bookRepository;

    // Insert a book into our h2-database
    //Dependency Injection: it is a design pattern used in software development to achieve Inversion of Control between classes and their dependency
    //The CRUD and Dependency Injection is much likely to be asked during your interviews to find a SDE job.

//    @Autowired
//    public BookService(BookRepository bookRepository){
//        this.bookRepository = bookRepository;
//    }

    @Transactional
    public Book create(Book book){
        return bookRepository.save(book);
    }

    @Transactional(readOnly = true)
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

}
