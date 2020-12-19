package com.sprintrest.springrest.services;

import java.util.List;

import com.sprintrest.springrest.entities.Book;

public interface BookService {
	public List<Book> getBooks();
	public Book getSingleBook(long bookId);
	public Book addBook(Book book);
	public Book updateBook(Book book);
	public void deleteBook(long bookId);
}
