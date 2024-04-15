package com.gb.demoone.Database;

import com.gb.demoone.Model.Book;
import com.gb.demoone.Utils.IFileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitDB implements CommandLineRunner {
    @Qualifier("execFileReader") // uu tien dung JsonFIleReader
    @Autowired
    private IFileReader fileReader;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Khoi tao database");
        BookDB.books = fileReader.readFile("book.xlsx");
        for (Book book : BookDB.books) {
            System.out.println(book.toString());
        }
        System.out.println(BookDB.books.size());
    }
}
