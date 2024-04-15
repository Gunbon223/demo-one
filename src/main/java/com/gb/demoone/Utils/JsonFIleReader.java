package com.gb.demoone.Utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gb.demoone.Model.Book;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Component
public class JsonFIleReader implements IFileReader{
    @Override
    public List<Book> readFile(String path) {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Book> books = null;
        try {
            books = objectMapper.readValue(new File(path), objectMapper.getTypeFactory().constructCollectionType(List.class, Book.class));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;
    }
}
