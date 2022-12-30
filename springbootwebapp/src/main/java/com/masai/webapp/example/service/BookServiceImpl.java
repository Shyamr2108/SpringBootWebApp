package com.masai.webapp.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.webapp.example.entity.Book;
import com.masai.webapp.example.repository.BookRepository;

import jakarta.annotation.PostConstruct;




@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookRepository repository;


	@Override
	public List<Book> addBook(Book book) {

		repository.save(book);
		return repository.findAll();
	}
	
	@Override
	public boolean deleteBook(int book_id) {
		repository.deleteById(book_id);
		return true;
	}

	@Override
	@PostConstruct
	public List<Book> getBooks() {

		return repository.findAll();
	}

	@Override
	public Book getBook(int book_id) {

		return repository.findById(book_id).get();
	}

}
