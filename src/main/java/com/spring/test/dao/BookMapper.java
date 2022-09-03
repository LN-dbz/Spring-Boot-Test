package com.spring.test.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

import com.spring.test.entity.Book;



public interface BookMapper {
	@Insert("INSERT INTO book(name, number) VALUES(#{name}, #{number})")
	// 让实体类自动写入主键
	@Options(useGeneratedKeys = true, keyProperty = "id")
	void insert(Book book);
}
