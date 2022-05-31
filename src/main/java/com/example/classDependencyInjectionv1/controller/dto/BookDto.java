package com.example.classDependencyInjectionv1.controller.dto;

public class BookDto {
    private String nameBook;
    private String autor;

    public BookDto(String nameBook, String autor) {
        this.nameBook = nameBook;
        this.autor = autor;
    }

    public BookDto() {
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
