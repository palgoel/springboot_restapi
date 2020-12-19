package com.sprintrest.springrest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sprintrest.springrest.entities.Book;
import com.sprintrest.springrest.services.BookService;

@RestController
public class MyController {

	@Autowired
	private BookService bookService;

	@GetMapping("/home")
	public String home() {
		return "Welcome to the homepage of books.";
	}
	//Get the books
	@GetMapping("/books")
	public List<Book> getBooks(){
		return this.bookService.getBooks();		
	}

	@GetMapping("/books/{bookId}")
	public Book getSingleBook(@PathVariable String bookId) {
		return this.bookService.getSingleBook(Long.parseLong(bookId));
	}

	@PostMapping(path= "/books", consumes = "application/json")
	public Book addBook(@RequestBody Book book) {
		return this.bookService.addBook(book);
	}

	@PutMapping(path= "/books", consumes = "application/json")
	public Book updateBook(@RequestBody Book book) {
		return this.bookService.updateBook(book);
	}

	@DeleteMapping("/books/{bookId}")
	public ResponseEntity<HttpStatus> deleteBook(@PathVariable String bookId) {
		try {
			this.bookService.deleteBook(Long.parseLong(bookId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
