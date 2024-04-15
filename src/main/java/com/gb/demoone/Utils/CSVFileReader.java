package com.gb.demoone.Utils;

import com.gb.demoone.Model.Book;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

@Component
public class CSVFileReader implements IFileReader {
    @Override
    public List<Book> readFile(String path) {
        List<Book> books = new ArrayList<>();
        try (Reader in = new FileReader(path)) {
            Iterable<CSVRecord> records = CSVFormat.DEFAULT
                    .withFirstRecordAsHeader()
                    .parse(in);
            for (CSVRecord record : records) {
                Book book = new Book();
                book.setId(record.get("id"));
                book.setTitle(record.get("title"));
                book.setAuthor(record.get("author"));
                book.setYear(Integer.parseInt(record.get("year")));
                books.add(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;
    }
}