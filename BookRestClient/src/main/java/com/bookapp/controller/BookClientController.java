package com.bookapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bookapp.model.Book;

@RestController
@RequestMapping("/client-api")
public class BookClientController {
	@Autowired
	RestTemplate restTemplate;
	static final String BASEURL="http://localhost:8080/book-api";

	@GetMapping("/client-books")
	public List<Book> showAllBooks(){
	String url=BASEURL+"/books";
	List<Book> bookList=restTemplate.getForObject(url, List.class);
	return bookList;

	}

	@GetMapping("/client-book/by-author/{author}")
	public List<Book> showBooksByAuthor(@PathVariable("author")String author){
	String url=BASEURL+"/book-by-author/"+author;
	List<Book> bookList=
	restTemplate.getForObject(url, List.class);
	return bookList;

	}

	@GetMapping("/client-book/by-category/{category}")
	public List<Book> showBooksBycategory(@RequestParam("category")String category){
	String url=BASEURL+"/book-by-category?category="+category;
	List<Book> bookList=
	restTemplate.getForObject(url, List.class);
	return bookList;

	}

	@GetMapping("/clientbook/by-Id/{bookId}")
	public Book showBooksByIdr(@PathVariable("bookId")int id){
	String url=BASEURL+"/book-by-Id"+id;
	Book book=
	restTemplate.getForObject(url, Book.class);
	return book;

	}

}
