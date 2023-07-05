package com.example.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dto.entity.Book;
import com.example.persistence.BookDao;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDao bookDao;

	@Override
	public Book insertBook(Book book) {
		if (searchBookById(book.getBookId()) == null)
			return bookDao.save(book);
		return null;
	}

	@Override
	public List<Book> getAllBooks() {
		return bookDao.findAll();
	}

	@Override
	public Book searchBookById(int bookId) {
		Optional<Book> optional = bookDao.findById(bookId);
		
		if (optional.isPresent())
			return optional.get();
		else
			return null;
	}

	@Override
	public Book deleteBookById(int bookId) {
		Book book = searchBookById(bookId);
		
		if (book == null)
			return null;
		
		bookDao.deleteById(bookId);
		return book;
	}

	@Override
	public Book incrementBookRating(int bookId, int incrementAmount) {
		Book book = searchBookById(bookId);
		
		if (book == null)
			return null;
		
		book.setRatingOutOf10(book.getRatingOutOf10() + incrementAmount);
		bookDao.save(book);
		return book;
	}

	@Override
	public List<Book> getBooksByGenre(String genre) {
		return bookDao.findBooksByGenre(genre);
//		return null;
	}

	@Override
	public List<Book> getBookByName(String title) {
		return bookDao.findBooksByTitle(title);
//		return null;
	}

}
