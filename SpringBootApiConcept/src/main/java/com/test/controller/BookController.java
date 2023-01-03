package com.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public ResponseEntity<List<Book>> getBooks() {
		
		List<Book> list = this.service.getAllBooks();
		if(list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
		
	}
	
	@GetMapping("/test/{id}")
	public ResponseEntity<Book> getBook(@PathVariable("id") int id) {
		
		Book book = this.service.getBookById(id);
		if(book == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.of(Optional.of(book));
	}
	
	@PostMapping("/test")
	public ResponseEntity<Book> addBook(@RequestBody Book book) {
		
		Book b = null;
		
		try {
			b = this.service.addBook(book);
			return ResponseEntity.status(HttpStatus.CREATED).body(b);
		} catch(Exception e) {
			// handle exception
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@DeleteMapping("/test/{bookId}")
	public ResponseEntity<Void> deleteBook(@PathVariable("bookId") int bookId) {
		
		try {
			 this.service.deleteBook(bookId);
			 
			 return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@PutMapping("/test/{bookId}") 
	public ResponseEntity<Book> updateBook(@RequestBody Book book ,@PathVariable("bookId") int bookId) {
		
		try {
			this.service.updateBook(book,bookId);
			return ResponseEntity.ok().body(book);
		} catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	
}
