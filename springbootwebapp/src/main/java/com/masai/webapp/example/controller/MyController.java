package com.masai.webapp.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.webapp.example.entity.Book;
import com.masai.webapp.example.service.BookService;

@RestController
@RequestMapping("/bookservice")
public class MyController {

	@Autowired
	BookService service;
	
	@GetMapping("/books")
	public List<Book> getBooks(){
		return service.getBooks();
	}
	
	@PostMapping("/books")
	public List<Book> createBook(@RequestBody Book book) {
		return service.addBook(book);
	}
	
	@GetMapping("/books/{book_id}")
	public Book getBook(@PathVariable int book_id) {
		return service.getBook(book_id);
	}
	
	
	
	@DeleteMapping("/books/{book_id}")
	public List<Book> deleteBook(@PathVariable int book_id){
		
		service.deleteBook(book_id);
			
		
		return service.getBooks();
	}
	
	
}
