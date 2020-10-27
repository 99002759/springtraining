package com.bookapp.client;

import java.util.List;

import com.bookapp.model.book;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImpl;

public class User {

	public static void main(String[] args) {
		BookService bookService =new BookServiceImpl();
		List<book> bookList =bookService.getAllBooks();
		for(book book : bookList)
			System.out.println(book);
		
	}

}
