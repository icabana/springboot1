package com.example.classDependencyInjectionv1.controller;

import com.example.classDependencyInjectionv1.controller.dto.BookDto;
import com.example.classDependencyInjectionv1.model.Book;
import com.example.classDependencyInjectionv1.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/v1/books")
public class BookController {
    /*@Autowired
    private IBookService iBookService;*/

    private final IBookService iBookService;

    public BookController(@Autowired  IBookService iBookService) {
        this.iBookService = iBookService;
    }

    @GetMapping("/{idBook}")
    public Optional<Book> findById(@PathVariable String idBook){
        return iBookService.findByIdBook(idBook);
    }

    @GetMapping("")
    public Collection<Book> find(){
        return iBookService.find();
    }

    @PostMapping("/")
    public Book createBook(@RequestBody BookDto bookDto) { return iBookService.createBook(new Book(bookDto)); }


    @DeleteMapping("/{idBook}")
    public Collection<Book> deleteBook(@PathVariable String idBook) {
        return iBookService.deleteBook(idBook);
    }

    @PostMapping("/{idBook}")
    public Optional<Book> updateBook(@PathVariable String idBook, @RequestBody Book book) {
        return iBookService.updateBook(idBook, book);
    }


}
