package com.gb.demoone.Dao.Implement;
import com.gb.demoone.Dao.BookDAO;
import com.gb.demoone.Database.BookDB;
import com.gb.demoone.Model.Book;
import com.gb.demoone.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
}
