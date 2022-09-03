package com.spring.test.entity;


public class Book {
	// ID
	private int id;
	// 书名
	private String name;
	// 价格
	private int number;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public Book(String name, int number ) {
		this.name = name;
		this.number = number;
	}
	

}
