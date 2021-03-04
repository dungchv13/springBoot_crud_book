package com.example.demo.controller;

import com.example.demo.model.entities.Book;
import com.example.demo.model.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@CrossOrigin("*")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping()
    public List<Book> getAll(){
        return bookService.getAll();
    }

    @GetMapping("/search/{id}")
    public Book findById(@PathVariable("id")int id){
        return bookService.findById(id);
    }

    @PostMapping("/create")
    public Book create(@RequestBody Book book){
        return bookService.save(book);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id")int id){
        return bookService.delete(id);
    }

    @PutMapping("/update")
    public Book update(@RequestBody Book book){
        return bookService.save(book);
    }

}
