package com.gb.demoone.Service.Implement;

import com.gb.demoone.Dao.BookDAO;
import com.gb.demoone.Model.Book;
import com.gb.demoone.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImplement implements BookService {

    @Autowired
    private BookDAO bookDAO;

    @Override
    public List<Book> getAllBooks() {
        return bookDAO.findAll();
    }

    @Override
    public Book getBookByID(String id) {
        return bookDAO.findById(id);
    }

    @Override
    public List<Book> sortBooksByYear() {
        return bookDAO.sortBooksByYear();
    }

    @Override
    public Book findBookByName(String name) {
        return bookDAO.findBookByName(name);
    }

    @Override
    public List<Book> findBookByYear(int yearStart, int yearEnd) {
        return bookDAO.findBookByYear(yearStart, yearEnd);
    }


}
