package com.example.demo;

import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.example.presentation.BookPresentationImpl;

@SpringBootApplication(scanBasePackages = "com.example")
@EntityScan(basePackages = "com.example")
@EnableJpaRepositories(basePackages = "com.example")
public class BookDatabaseDemoApplication implements CommandLineRunner {
	
	@Autowired
	private BookPresentationImpl bookPresentation;

	public static void main(String[] args) {
		SpringApplication.run(BookDatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		while(true) {
			bookPresentation.showMenu();
			System.out.println("Enter choice : ");
			int choice=scanner.nextInt();
			bookPresentation.performMenu(choice);
		}
	}
}
