package com.example.classDependencyInjectionv1.model;

import com.example.classDependencyInjectionv1.controller.dto.BookDto;

import java.util.UUID;

public class Book {
    private String idBook;
    private String nameBook;
    private String autor;

    public Book(String nameBook, String autor) {
        this.idBook = UUID.randomUUID().toString();
        this.nameBook = nameBook;
        this.autor = autor;
    }

    public Book(BookDto bookDto) {
        this(bookDto.getNameBook(),bookDto.getAutor());
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
