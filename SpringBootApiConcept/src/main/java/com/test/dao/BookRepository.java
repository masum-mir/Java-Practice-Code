package com.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
	
	public Book findById(int id);

}
