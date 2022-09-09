package com.spring.test.service;

import java.util.List;

import com.spring.test.entity.Book;

public interface BookService {
	long insert(Book book);
	List<Book> select();
}
