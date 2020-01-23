package com.kelvin.bookstore.controller;

import com.kelvin.bookstore.model.Book;
import com.kelvin.bookstore.service.BookService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

class BookControllerTest {

    @MockBean
    private BookService bookService;

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getAllBooks() {
    }

    @Test
    void getBookByName() throws Exception {
//        Book book = new Book();
//        Mockito.when(bookService.getBookByName("Java")).thenReturn(book);
//        Mockito.verify(bookService).getBookByName("Java");

        mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/api/books/bookName/java"))
                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(MockMvcResultMatchers.content().contentType(""))
                .andReturn();
    }

    @Test
    void getBookById() {
    }

    @Test
    void saveBook() {
    }
}