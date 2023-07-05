/*
 * Class Assignment
Create SpringBoot JPA Application to display and perform the following menu options.
 Create New Student
 Search Students By Class
 Update Student Address
 Delete Student By ID
 Exit
Student Table( RollNo(PK), Name, Age, Class, Address, PhoneNumber)
 */

package com.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.demo.presentation.UserInterface;

@SpringBootApplication
@EntityScan
@EnableJpaRepositories
public class StudentDatabaseDemoApplication implements CommandLineRunner{
	
	@Autowired
	UserInterface userInterface;

	public static void main(String[] args) {
		SpringApplication.run(StudentDatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		while(true) {
			userInterface.showMenu();
			System.out.println("Enter choice : ");
			int choice=scanner.nextInt();
			userInterface.performMenu(choice);
		}
	}

}
