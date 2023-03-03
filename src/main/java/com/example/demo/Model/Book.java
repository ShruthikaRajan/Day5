package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
	private int id;
	private String bookname;
	private float price;
	private int quantity;
	private String authorname;
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String bookname, float price, int quantity, String authorname) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.price = price;
		this.quantity = quantity;
		this.authorname = authorname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
}