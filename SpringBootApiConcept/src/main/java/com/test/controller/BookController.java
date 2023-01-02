package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.entities.Book;
import com.test.service.BookService;

//@Controller
//@ResponseBody
@RestController
public class BookController {

//	@RequestMapping(value="/test", method = RequestMethod.GET)
//	@GetMapping("/test")
//	public Book getBook() {
//		
//		Book book = new Book();
//		book.setId(10);
//		book.setAuthor("abc");
//		book.setTitle("this is a book");
//		
//		return book;
//	}
	
	@Autowired
	private BookService service;
	
	@GetMapping("/test")
	public List<Book> getBooks() {
		
		return this.service.getAllBooks();
	}
	
	@GetMapping("/test/{id}")
	public Book getBook(@PathVariable("id") int id) {
		
		return this.service.getBookById(id);
	}
	
}
