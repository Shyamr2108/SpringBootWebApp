package com.masai.webapp.example.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue
	private int bookId;
	private String b_name;
	private String author;
	private String publ;
	private String category;
	private int pages;
	private int price;
	private String auth_no;
	//private List<Book> books = new ArrayList();
	
	public Book() {}

	public Book(int book_id, String b_name, String author, String publ, String category, int pages, int price,
			String auth_no) {
		super();
		this.bookId = book_id;
		this.b_name = b_name;
		this.author = author;
		this.publ = publ;
		this.category = category;
		this.pages = pages;
		this.price = price;
		this.auth_no = auth_no;
	}

	public int getBook_id() {
		return bookId;
	}

	public void setBook_id(int book_id) {
		this.bookId = book_id;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPubl() {
		return publ;
	}

	public void setPubl(String publ) {
		this.publ = publ;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAuth_no() {
		return auth_no;
	}

	public void setAuth_no(String auth_no) {
		this.auth_no = auth_no;
	}
/*
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
*/
	
	
}
