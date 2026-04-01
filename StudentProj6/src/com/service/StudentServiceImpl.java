package com.service;

import java.util.List;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.exception.StudentServiceException;
import com.model.Student;
import com.validate.StudentValidation;

public class StudentServiceImpl implements StudentService {

	StudentDao studentDao = new StudentDaoImpl();

	@Override
	public int registerStudent(Student student) {

		StudentValidation.validStudent(student);

		int noOfRows = studentDao.addStudent(student);
		if (noOfRows > 0) {
			return noOfRows;
		}
		throw new StudentServiceException("Student Failed To Add " + noOfRows);
	}

	@Override
	public int modifyStudent(Student student) {
		StudentValidation.validStudent(student);
		int noOfRows = studentDao.updateStudent(student);
		if (noOfRows > 0) {
			return noOfRows;
		}
		throw new StudentServiceException("Student Failed To UPDATE " + noOfRows);
	}

	@Override
	public int removeStudent(Student student) {
		StudentValidation.validStudent(student);
		int noOfRows = studentDao.deleteStudent(student);
		if (noOfRows > 0) {
			return noOfRows;
		}
		throw new StudentServiceException("Student Failed To DELETE " + noOfRows);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentDao.findAllStudents();
	}

	@Override
	public Student getById(int id) {
		Student student = null;
		student = studentDao.findById(id);
		if (student != null)
			return student;

		throw new StudentServiceException("Student With ID " + id + "  NOT FOUND");
	}

}
