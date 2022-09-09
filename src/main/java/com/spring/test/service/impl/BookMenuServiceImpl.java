package com.spring.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.test.dao.BookMapper;
import com.spring.test.entity.Book;
import com.spring.test.service.BookService;

@Service
public class BookMenuServiceImpl implements BookService {
	@Autowired
	private BookMapper bookMapper;
	
	
	@Override
	public long insert(Book book) {
		// TODO 2:
		// 书名不能相同
		// 书名相同 提示有相同的
		bookMapper.insert(book);
		return book.getId();

	}

	@Override
	public List<Book> select() {
		// 做一个分页
		
		return bookMapper.select();
	}

}
