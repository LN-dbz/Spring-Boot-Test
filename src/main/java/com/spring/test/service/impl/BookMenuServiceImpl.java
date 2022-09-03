package com.spring.test.service.impl;

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
	public int insert(Book book) {
		// 书名不能相同
		// 价格的合理范围
		// 返回异常类
		bookMapper.insert(book);
		return book.getId();
	}

}
