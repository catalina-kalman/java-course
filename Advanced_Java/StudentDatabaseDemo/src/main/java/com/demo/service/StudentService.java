package com.demo.service;

import java.util.List;

import com.demo.entity.Student;

public interface StudentService {
	public Student createNewStudent(Student student);
	public List<Student> getStudentsByClassNo(int classNo);
	public Student updateAddress(int id, String adress);
	public Student getStudentById(int id);
	public Student deleteStudentById(int id);
}
