package com.service;

import java.util.List;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.model.Student;

public class StudentServiceImpl implements StudentService {

	StudentDao studentDao = new StudentDaoImpl();

	@Override
	public int registerStudent(Student student) {
		return studentDao.addStudent(student);
	}

	@Override
	public int modifyStudent(Student student) {
		return studentDao.updateStudent(student);
	}

	@Override
	public int removeStudent(Student student) {

		return studentDao.deleteStudent(student);
	}

	@Override
	public List<Student> getAllStudents() {

		return studentDao.findAllStudents();
	}

	@Override
	public Student getById(int id) {
		return studentDao.findById(id);
	}

}
