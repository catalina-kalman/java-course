package com.example.service;

import java.util.List;
import com.example.dto.entity.Book;

public interface BookService {
	public Book insertBook(Book Book);
	public List<Book> getAllBooks();
	public Book searchBookById(int empId);
	public Book deleteBookById(int empId);
	public Book incrementBookRating(int empId,int incrementAmount);
	public List<Book> getBooksByGenre(String department);
	public List<Book> getBookByName(String name);
}
