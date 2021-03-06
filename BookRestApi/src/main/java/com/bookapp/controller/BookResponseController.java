package com.bookapp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookService;

@RestController
@RequestMapping("/book-api")
public class BookResponseController {
	@Autowired
	BookService bookService;
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> showAllBooks(){
		List<Book> bookList =bookService.getAllBooks();
		ResponseEntity<List<Book>> entity = new ResponseEntity<List<Book>>(bookList, HttpStatus.OK);
		return entity;
	}
	@GetMapping("/books-by-author/{author}")
	public ResponseEntity<List<Book>> showAllBooksByAuthor(@PathVariable("author")String author){
		List<Book>bookList = bookService.getByAuthor(author);
		HttpHeaders header = new HttpHeaders();
		header.add("description","bookList by author");
		ResponseEntity<List<Book>> entity = new ResponseEntity<List<Book>>(bookList, HttpStatus.OK);
		return entity;
	
	}
	@GetMapping("/books-by-category")
	public ResponseEntity<List<Book>> showBookByCategory(@RequestParam("category")String category){
		List<Book> bookList = bookService.getBycategory(category);
		return ResponseEntity.ok(bookList);
	}
	@GetMapping("/books-by-id/{bookId}")
	public ResponseEntity<Book> showById(@PathVariable("bookId")int id){
		Book book= bookService.getById(id);
		return  ResponseEntity.status(HttpStatus.ACCEPTED).body(book);
	}
	@ExceptionHandler(BookNotFoundException.class)
	public String handleException(Exception e) {
		return "error: "+e.getMessage();
	}

}
