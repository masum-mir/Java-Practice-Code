package com.test.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
		try {
			book = list.stream().filter(e -> 
			e.getId() == id
		).findFirst().get();
		
		} catch(Exception e) {
			System.out.println(e);
		}
		return book;
	}
	
	// adding the book
	
	public Book addBook(Book book) {
		
		list.add(book);
		
		return book;
	}
	
//	public Book deleteBook(int id) {
//		
//		Book book = list.stream().filter(e-> e.getId() == id).findFirst().get();
//		
//		return book;
//	}
	
	public void deleteBook(int id) {
//		list = list.stream().filter(e-> {
//			if(e.getId() != id) {
//				return true;
//			} else {
//				return false;
//			}
//		}).collect(Collectors.toList());
		
		list = list.stream().filter(e-> e.getId() != id).collect(Collectors.toList());
		
	}
	
	public void updateBook(Book book, int id) {
		
		list = list.stream().map(b-> {
			if(b.getId() == id) {
				b.setTitle(book.getTitle());
				b.setAuthor(book.getAuthor());
			}
			return b;
		}).collect(Collectors.toList());
		
	}

}
