package com.bookapp.service;

import java.util.List;

import com.bookapp.dao.BookDao;
import com.bookapp.dao.BookDaoImpl;
import com.bookapp.model.book;

public class BookServiceImpl implements BookService {

	BookDao bookDAO= new BookDaoImpl();
	@Override
	public List<book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookDAO.getAllBooks();
	}

	@Override
	public List<book> getByAuthor(String author) {
		// TODO Auto-generated method stub
		return bookDAO.getByAuthor(author);
	}

	@Override
	public book getById(int id) {
		// TODO Auto-generated method stub
		return bookDAO.getById(id);
	}

	@Override
	public List<book> getBycategory(String category) {
		// TODO Auto-generated method stub
		return bookDAO.getBycategory(category);
	}

}
