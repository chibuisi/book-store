package com.kelvin.bookstore.service.serviceimpl;

import com.kelvin.bookstore.BookRepository;
import com.kelvin.bookstore.service.BookService;
import com.kelvin.bookstore.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;
    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookByName(String name) {
        return bookRepository.getBookByNameEquals(name).orElse(null);
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }


}
