package com.bookapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bookapp.model.book;

public class BookDaoImpl implements BookDao{

	@Override
	public List<book> getAllBooks() {
		// TODO Auto-generated method stub
		return showBookList();
	}

	@Override
	public List<book> getByAuthor(String author) {
		List<book> newBookList =new ArrayList<>();
		for(book book:showBookList()) {
			if(book.getAuthor().equals(author))
				newBookList.add(book);
		}
		// TODO Auto-generated method stub
		return showBookList();
	}

	@Override
	public book getById(int id) {
		for(book book:showBookList()) {
			if(book.getBookId()==id)
				return book;
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<book> getBycategory(String category) {
		List<book> newBookList =new ArrayList<>();
		for(book book : showBookList() ) {
			if(book.getAuthor().equals(category))
				newBookList.add(book);
		}
		// TODO Auto-generated method stub
		return newBookList;
	}
	private List<book> showBookList(){
		return Arrays.asList(
				new book(1,"Learn Java","loke","Tech",900.0),
				new book(1,"7 habbits","mohit","SelfHelp",900.0)
				
	);
	}
}
