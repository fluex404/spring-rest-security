package com.fluex404.springrestsecurity.api;

import com.fluex404.springrestsecurity.entity.Book;
import com.fluex404.springrestsecurity.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Validated
public class BookAPI {
    private BookRepository bookRepository;

    @Autowired
    public BookAPI(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/books")
    Iterable<Book> findAll(){
        return bookRepository.findAll();
    }
    @PostMapping("/books")
    Book newBook(@Valid @RequestBody Book book){
        return bookRepository.save(book);
    }
    @GetMapping("/books/{id}")
    Book findOne(@PathVariable("id") Book book){
        return book;
    }
    @DeleteMapping("/books/{id}")
    void delete(@PathVariable("id") Book book){
        bookRepository.delete(book);
    }
}
