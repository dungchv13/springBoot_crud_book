package com.example.demo.model.service;

import com.example.demo.model.entities.Book;
import com.example.demo.model.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAll(){
        return this.bookRepository.findAll();
    }

    public Book findById(int id){
        return bookRepository.findById(id).get();
    }

    public Book save(Book book){
        return bookRepository.save(book);
    }

    public boolean delete(int id){
        if(findById(id) != null){
            bookRepository.deleteById(id);
            return true;
        }
        return false;

    }
}
