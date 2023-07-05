package com.example.presentation;

import java.util.List;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.dto.entity.Book;
import com.example.service.BookServiceImpl;

@Component
public class BookPresentationImpl implements BookPresentation {
	
	@Autowired
	private BookServiceImpl bookService;
	
	@Override
	public void showMenu() {
		System.out.println("1. Add New Book");
		System.out.println("2. List All Books ");
		System.out.println("3. Search Book By ID");
		System.out.println("4. Delete Book By ID");
		System.out.println("5. Change Book Rating");
		System.out.println("6. Search Book By Name");
		System.out.println("7. Search Books By Genre");
		System.out.println("8. Exit");
	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch (choice) {
		case 1:
			Book Book=new Book();
			
			System.out.println("Enter Book ID : ");
			Book.setBookId(scanner.nextInt());
			System.out.println("Enter Book Title : ");
			Book.setTitle(scanner.nextLine());
			System.out.println("Enter Book Author : ");
			Book.setAuthor(scanner.nextLine());
			System.out.println("Enter Book Genre : ");
			Book.setGenre(scanner.nextLine());
			System.out.println("Enter Book rating/10 : ");
			Book.setRatingOutOf10(scanner.nextInt());
			
			if(bookService.insertBook(Book)!=null)
				System.out.println("Book Added");
			else
				System.out.println("Book Not Added");
			break;

		case 2:
			List<Book> Books=bookService.getAllBooks();
			for(Book emp:Books) {
				System.out.println(emp);
			}
			break;
		case 3:
			System.out.println("Enter Book ID : ");
			int id=scanner.nextInt();
			Book searchedBook=bookService.searchBookById(id);
			if(searchedBook!=null)
				System.out.println(searchedBook);
			else
				System.out.println("Book with id "+id+" does not exist");
			break;
		case 4:
			System.out.println("Enter Book ID : ");
			int empId=scanner.nextInt();
			if(bookService.deleteBookById(empId)!=null)
				System.out.println("Book Deleted with id "+empId);
			else
				System.out.println("Book with id "+empId+" does not exist");
			break;
		case 5:
			System.out.println("Enter Book ID : ");
			int bookId=scanner.nextInt();
			System.out.println("Enter Increment Amount :");
			int incrementAmount=scanner.nextInt();
			Book incrementedSalariedBook=bookService.incrementBookRating(bookId, incrementAmount);
			if(incrementedSalariedBook!=null) {
				System.out.print("After Increment Book Details : ");
				System.out.println(incrementedSalariedBook);
			}
			else
				System.out.println("Book with id "+bookId+" does not exist for rating increment");
			break;
		case 6:
			System.out.println("Enter Title : ");
			String title=scanner.next();
			List<Book> bookList=bookService.getBookByName(title);
			if(bookList.size()!=0) {
			for(Book anBook:bookList) {
				System.out.println(anBook);
			}
			}
			else
				System.out.println("No Book with title '"+title+"' exist in our records");
			break;
		case 7:
			System.out.println("Enter Genre : ");
			String genre=scanner.next();
			List<Book> emplList=bookService.getBooksByGenre(genre);
			if(emplList.size()!=0) {
			for(Book emp:emplList) {
				System.out.println(emp);
			}
			}
			else
				System.out.println("No Book works for "+genre+" department");
			break;
		case 8:
			System.out.println("Thanks for using Book Management System");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}


	}

}
