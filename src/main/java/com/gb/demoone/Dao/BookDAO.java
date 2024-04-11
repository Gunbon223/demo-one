package com.gb.demoone.Dao;

import com.gb.demoone.Model.Book;

import java.util.ArrayList;
import java.util.List;

public interface BookDAO {
    public List<Book> findAll();
    Book findById(String id);

}
