package com.spring.test.entity;


public class Book {
	// ID
	private long id;
	// 书名
	private String name;
	// 价格
	private long number;
	
	private int type;
	
	private int price;
	private String author;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book() {}
	
	public Book(String name, long number, int type, int price, String author) {
		this.name = name;
		this.number = number;
		this.type = type;
		this.price = price;
		this.author = author;
	}
}


