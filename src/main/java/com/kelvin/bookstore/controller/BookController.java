package com.kelvin.bookstore.controller;

import com.kelvin.bookstore.model.Book;
import com.kelvin.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api/")
public class BookController {
    private Logger logger = Logger.getLogger(BookController.class.getName());
    @Autowired
    private BookService bookService;
    @GetMapping(value = "/books")
    public ResponseEntity<List<Book>> getAllBooks(){
        logger.log(Level.INFO, "Getting all books");
        return new  ResponseEntity<List<Book>>(bookService.getAllBooks(), HttpStatus.OK);
    }

    @GetMapping(value = "/books/bookName/{name}")
    public ResponseEntity<Book> getBookByName(@PathVariable("name") String name){
        return new  ResponseEntity<Book>(bookService.getBookByName(name), HttpStatus.OK);
    }
    @GetMapping(value = "/books/bookId/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id") Long id){
        return new  ResponseEntity<Book>(bookService.getBookById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/books")
    public ResponseEntity<Book> saveBook(@RequestBody Book book){
        logger.log(Level.INFO,"Saving book");
        Book savedBook = null;
        try{
            savedBook = bookService.saveBook(book);
        }
        catch (Exception e){
            logger.log(Level.WARNING,"Book not saved");
            return new ResponseEntity<>(null,HttpStatus.UNPROCESSABLE_ENTITY);
        }
        logger.log(Level.INFO,"Saved book successfully");
        return new ResponseEntity<>(savedBook, HttpStatus.OK);
    }

}
