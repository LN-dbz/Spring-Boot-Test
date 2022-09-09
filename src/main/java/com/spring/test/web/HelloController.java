package com.spring.test.web;

import java.util.List;

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
	
    @RequestMapping(value="/new/{name}/{number}/{type}")
    private String hello(@PathVariable String name,@PathVariable long number,@PathVariable int type){   
        
        Book book = new Book(name,number,type,3000,"作家1");
        long newId = bookService.insert(book);
        return "新书ID为："+ newId;
    }
    // TODO 1:
    // 分页查询 /select/limit/page   limit 每页有多少条数据， page 这是第几页
    @RequestMapping(value="/test")
    private List<Book>  test(){   
        
    	List<Book> list = bookService.select();
//        Book book = new Book(name,number);
//        int newId = bookService.insert(book);
        return list;
    }
}