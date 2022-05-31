package com.example.classDependencyInjectionv1.service;

import com.example.classDependencyInjectionv1.model.Book;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface IBookService {
    Book createBook(Book book);
    Optional<Book> findByIdBook(String idBook);

    Collection<Book> find();

    Collection<Book> deleteBook(String book);

    Optional<Book> updateBook(String idBook, Book book);

}
