package com.kelvin.bookstore.service;

import com.kelvin.bookstore.model.Book;

import java.util.List;

public interface BookService {
    public List<Book> getAllBooks();
    public Book getBookByName(String name);
    public Book getBookById(Long id);
    public Book saveBook(Book book);
}
