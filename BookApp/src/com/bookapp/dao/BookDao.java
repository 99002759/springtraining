package com.bookapp.dao;

import java.util.List;

import com.bookapp.model.book;

public interface BookDao {
	List<book>getAllBooks();
	List<book>getByAuthor(String author);
	book getById(int id);
	List<book> getBycategory(String category);


}
