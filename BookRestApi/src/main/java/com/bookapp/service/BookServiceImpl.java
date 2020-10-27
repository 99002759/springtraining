package com.bookapp.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.dao.BookDao;
import com.bookapp.model.Book;
@Service
public class BookServiceImpl implements BookService {
	@Autowired
    BookDao bookDAO ;
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookDAO.getAllBooks();
	}

	@Override
	public List<Book> getByAuthor(String author) {
		// TODO Auto-generated method stub
		return bookDAO.getByAuthor(author);
	}

	@Override
	public Book getById(int id) {
		// TODO Auto-generated method stub
		return bookDAO.getById(id);
	}

	@Override
	public List<Book> getBycategory(String category) {
		// TODO Auto-generated method stub
		return bookDAO.getBycategory(category);
	}

}
