package com.spring.test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.test.entity.Book;
import com.spring.test.service.BookService;


@RestController
public class HelloController {
	@Autowired
	private BookService bookService;
	
    @RequestMapping(value="/new/{name}/{number}")
    private String hello(@PathVariable String name,@PathVariable int number){   
        
        Book book = new Book(name,number);
        int newId = bookService.insert(book);
        return "新的数据 id : " + newId;
    }
}