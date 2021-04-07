package com.example.vuedemo.controller;

import com.example.vuedemo.entity.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {

    @RequestMapping("findAll")
    public List<Book> findAll(){
        ArrayList<Book> books = new ArrayList<>();
        Book book1 = new Book();
        Book book2 = new Book();
        book1.setAuthor("zs");
        book1.setId(1);
        book1.setName("武侠");
        books.add(book1);

        book2.setAuthor("ls");
        book2.setId(2);
        book2.setName("动作");
        books.add(book2);
        return books;
    }
}
