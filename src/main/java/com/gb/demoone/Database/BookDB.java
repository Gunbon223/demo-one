package com.gb.demoone.Database;

import com.gb.demoone.Model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDB
{
    public static List<Book> books = new ArrayList<>(
            List.of(
                    new Book("1", "Java", "Programming Language", 2004),
                    new Book("2", "Python", "Programming Language", 2000),
                    new Book("3", "C++", "Programming Language", 1990),
                    new Book("4", "C", "Programming Language", 1972)
            )
    );
}
