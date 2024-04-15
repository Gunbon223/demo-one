package com.gb.demoone.Dao.Implement;

import com.gb.demoone.Dao.BookDAO;
import com.gb.demoone.Database.BookDB;
import com.gb.demoone.Model.Book;
import com.gb.demoone.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BookDAOImple implements BookDAO {

    @Override
    public List<Book> findAll() {
        return BookDB.books;
    }

    @Override
    public Book findById(String id) {
        return BookDB.books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Book> sortBooksByYear() {
        return BookDB.books.stream()
                .sorted(Comparator.comparing(Book::getYear).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public Book findBookByName(String name) {
        return BookDB.books.stream()
                .filter(book -> book.getTitle().equals(name))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Book> findBookByYear(int yearStart, int yearEnd) {
        return BookDB.books.stream()
                .filter(book -> book.getYear() >= yearStart && book.getYear() <= yearEnd)
                .collect(Collectors.toList());
    }
}