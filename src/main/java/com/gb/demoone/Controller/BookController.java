package com.gb.demoone.Controller;

import com.gb.demoone.Model.Book;
import com.gb.demoone.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;


    //lay danh sach sach
    @GetMapping
    @ResponseBody
    public List<Book> getBooks() {
        return bookService.getAllBooks();
    }
    //lay sach theo id
    @GetMapping("/{id}")
    @ResponseBody
    public Book getBook(@PathVariable String id) {
        return bookService.getBookByID(id);
    }
    HttpStatus status = HttpStatus.CREATED;
//    //them sach
//    @PostMapping
//    public void addBook(@RequestBody Book book) {
//        books.add(book);
//    }
//    @GetMapping("/home")
//    public String getHome() {
//        return "index";
//    }
//
//    @GetMapping("/getAllBooks")
//    public ResponseEntity<List<Book>> getAllBooks() {
//        return new ResponseEntity<>(books, status);
//    }


}

