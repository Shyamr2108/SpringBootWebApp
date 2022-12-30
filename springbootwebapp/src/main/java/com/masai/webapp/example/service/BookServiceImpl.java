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
	
	//List<Book> books = new ArrayList<>();

	@Override
	public List<Book> addBook(Book book) {
		//books.add(book);
		//List<Book> books = repository.findAll();
		//books.add(book);
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
		// TODO Auto-generated method stub
		//books.add(new Book(101,"C++","Nitesh","Rajput Publication", "Computer Programming", 1500, 240, "G452"));
		//books.add(new Book(102,"Java","Ritesh","Rajput Publication", "Computer Programming", 1200, 220, "G552"));
		//books.add(new Book(103,"Python","Mukesh","Rajput Publication", "Computer Programming", 1000, 200, "G652"));
		//books.add(new Book(104,"JavaScript","Ramesh","Rajput Publication", "Computer Programming", 1400, 235, "G752"));
		//books.add(new Book(105,"Golang","Hitesh","Rajput Publication", "Computer Programming", 1800, 250, "G852"));
		return repository.findAll();
	}

	@Override
	public Book getBook(int book_id) {
		/*
		 * for(Book b : books) { if(b.getBook_id() == book_id) { return b; } } return
		 * null;
		 */
		return repository.findById(book_id).get();
	}

}
