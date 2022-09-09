package com.spring.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.spring.test.entity.Book;



public interface BookMapper {
	@Insert("INSERT INTO book(name, number,type,price,author)"
			+ " VALUES(#{name}, #{number}, #{type}, #{price}, #{author})")
	// 让实体类自动写入主键
	@Options(useGeneratedKeys = true, keyProperty = "id")
	void insert(Book book);
	
	@Select("select * from book ")
	List<Book> select();
}
