package com.service;

import java.util.List;

import com.model.Student;

public interface StudentService {
	int registerStudent(Student student);

	int modifyStudent(Student student);

	int removeStudent(Student student);

	List<Student> getAllStudents();

	Student getById(int id);

}
