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
    //sap xep sach theo nam
    @GetMapping("/sortByYear")
    @ResponseBody
    public List<Book> sortBooksByYear() {
        return bookService.sortBooksByYear();
    }

    //tim sach theo ten
    @GetMapping("/search/{name}")
    @ResponseBody
    public Book findBookByName(@PathVariable String name) {
        return bookService.findBookByName(name);
    }

    //3. Tìm kiếm book có year nằm trong khoảng thời gian chỉ định (startYear, endYear)
    @GetMapping("/searchByYear/startyear/{startYear}/endyear/{endYear}")
    @ResponseBody
    public List<Book> findBookByYear(@PathVariable int startYear, @PathVariable int endYear) {
        return bookService.findBookByYear(startYear, endYear);
    }




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

