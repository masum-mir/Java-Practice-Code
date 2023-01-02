package com.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.test.entities.Book;

@Component
//@Service
public class BookService {
	
	private static List<Book> list = new ArrayList<>();
	
	static {
		list.add(new Book(12,"java is modern language.","abc"));
		list.add(new Book(13,"java ", "efg"));
		list.add(new Book(14,"angular", "ijk"));
	}
	
	// gets all books
	public List<Book> getAllBooks() {
		
		return list;
	}
	
	// get single book by id
	
	public Book getBookById(int id) {
		
		Book book = null;
		book = list.stream().filter(e -> 
			e.getId() == id
		).findFirst().get();
		
		return book;
	}

}
