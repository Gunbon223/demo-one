package com.gb.demoone.Service;

import com.gb.demoone.Model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    Book getBookByID(String id);
    List<Book> sortBooksByYear();
    Book findBookByName(String name);
    List<Book> findBookByYear(int yearStart, int yearEnd);
}
