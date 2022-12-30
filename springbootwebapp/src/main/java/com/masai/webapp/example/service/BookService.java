package com.masai.webapp.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.webapp.example.entity.Book;

@Service
public interface BookService {

	public List<Book> addBook(Book book);
	public boolean deleteBook(int book_id);
	public List<Book> getBooks();
	public Book getBook(int book_id);
}
