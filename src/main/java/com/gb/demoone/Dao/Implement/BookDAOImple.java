package com.gb.demoone.Dao.Implement;
import com.gb.demoone.Dao.BookDAO;
import com.gb.demoone.Database.BookDB;
import com.gb.demoone.Model.Book;
import com.gb.demoone.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class BookDAOImple implements BookDAO {



    @Override
    public List<Book> findAll() {
        return BookDB.books;
    }

    @Override
    public Book findById(String id) {
        return BookDB.books.stream().filter(book -> book.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<Book> sortBooksByYear() {
        if (!BookDB.books.isEmpty()) {
            BookDB.books.sort((book1, book2) -> book2.getYear() - book1.getYear());
        }
        return BookDB.books;
    }

    @Override
    public Book findBookByName(String name) {
        for(Book book : BookDB.books) {
            if(book.getTitle().equals(name)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public List<Book> findBookByYear(int yearStart, int yearEnd) {
        List<Book> books = BookDB.books;
        List<Book> result = new ArrayList<>();
        for(Book book : books) {
            if(book.getYear() >= yearStart && book.getYear() <= yearEnd) {
                result.add(book);
            }
        }
        return result;
    }




}
