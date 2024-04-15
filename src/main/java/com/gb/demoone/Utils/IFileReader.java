package com.gb.demoone.Utils;

import com.gb.demoone.Model.Book;

import java.util.List;

public interface IFileReader {
    List<Book> readFile(String path);
}
