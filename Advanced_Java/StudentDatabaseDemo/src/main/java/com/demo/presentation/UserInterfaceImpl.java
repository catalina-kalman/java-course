package com.demo.presentation;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.entity.Student;
import com.demo.service.StudentService;

@Component
public class UserInterfaceImpl implements UserInterface {

	@Autowired
	StudentService studentService;

	@Override
	public void showMenu() {
		System.out.println("1. Create New Student");
		System.out.println("2. Get Students By Class");
		System.out.println("3. Update Student Address");
		System.out.println("4. Delete Student By ID");
		System.out.println("5. Exit");
	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner = new Scanner(System.in);
		switch (choice) {
		case 1:
			Student student = new Student();

			System.out.println("Enter Student ID : ");
			student.setRollNo(scanner.nextInt());
			scanner.nextLine();
			System.out.println("Enter Student Name : ");
			student.setName(scanner.nextLine());
			System.out.println("Enter Age : ");
			student.setAge(scanner.nextInt());
			scanner.nextLine();
			System.out.println("Enter Address : ");
			student.setAddress(scanner.nextLine());
			System.out.println("Enter Class Number : ");
			student.setClassNo(scanner.nextInt());
			scanner.nextLine();
			System.out.println("Enter Phone Number : ");
			student.setPhoneNumber(scanner.nextLong());

			if (studentService.createNewStudent(student) != null)
				System.out.println("Student Added");
			else
				System.out.println("Student Not Added");
			break;

		case 2:
			System.out.println("Enter Class Number : ");
			int classNo = scanner.nextInt();
			scanner.nextLine();

			List<Student> students = studentService.getStudentsByClassNo(classNo);
			
			if (students == null)
				System.out.println("No Students enrolled in class " + classNo);
			
			for (Student aStudent : students) {
				System.out.println(aStudent);
			}
			break;
		case 3:
			System.out.println("Enter Student ID : ");
			int id = scanner.nextInt();
			scanner.nextLine();

			if (studentService.getStudentById(id) == null) {
				System.out.println("Incorrect ID. Student could not be found.");
				break;
			}

			System.out.println("Enter New Address : ");
			String address = scanner.nextLine();

			if (studentService.updateAddress(id, address) == null)
				System.out.println("Some error occured. Address could not be updated.");
			else
				System.out.println("Address updated successfully.");
			break;
		case 4:
			System.out.println("Enter Student ID : ");
			int rollNo = scanner.nextInt();
			scanner.nextLine();

			if (studentService.deleteStudentById(rollNo) != null)
				System.out.println("Student deleted successfully.");
			else
				System.out.println("Some error occured. Student does not exist");
			break;
		case 5:
			System.out.println("Thanks for using the Student Management System!");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");

		}

	}
}
