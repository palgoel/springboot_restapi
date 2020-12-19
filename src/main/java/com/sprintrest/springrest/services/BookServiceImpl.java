package com.sprintrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprintrest.springrest.dao.BookDao;
import com.sprintrest.springrest.entities.Book;

@Service
public class BookServiceImpl implements BookService {
//	List<Book> list;
	
	@Autowired
	private BookDao bookDao;

	public BookServiceImpl() {
		
//		list = new ArrayList<>();
//		list.add(new Book(145,"Java Book","This is basic java book"));
//		list.add(new Book(338,"Sprintboot Book","This is basic springboot book"));
	}

	@Override
	public List<Book> getBooks() {
//		return list;
		return bookDao.findAll();
	}

	@Override
	public Book getSingleBook(long bookId) {
//		Book c = null;
//		for(Book book : list ) {
//			if(book.getId() == bookId) {
//				c = book;
//				break;
//			}
//		}
//		return c;
		return bookDao.findById(bookId).get();
	}
	@Override
	public Book addBook(Book book) {
//		list.add(book);
//		return book;
		bookDao.save(book);
		return book;
	}

	@Override
	public Book updateBook(Book book) {
//		list.forEach(b->{
//			if(b.getId() == book.getId()) {
//				b.setTitle(book.getTitle());	
//				b.setDescription(book.getDescription());			
//			}		
//		});
//		return book;
		bookDao.save(book);
		return book;
	}

	@Override
	public void deleteBook(long bookId) {
//		list=this.list.stream().filter(e->e.getId()!=bookId).collect(Collectors.toList());
		Book entity = bookDao.getOne(bookId);
		bookDao.delete(entity);
	}	
}
