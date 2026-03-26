package com.dao;

import java.util.List;

import com.model.Student;

public interface StudentDao {

	int addStudent(Student student);

	int updateStudent(Student student);

	int deleteStudent(Student student);

	List<Student> findAllStudents();

	Student findById(int id);

}
