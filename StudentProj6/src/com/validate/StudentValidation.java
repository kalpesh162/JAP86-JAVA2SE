package com.validate;

import com.exception.StudentException;
import com.model.Student;

public class StudentValidation {

	public static boolean validStudent(Student student) {
		if (student.getId() < 0) {
			throw new StudentException("Invalid Id " + student.getId());
		}
		if (student.getName() == null || student.getName().trim().equals("")) {
			throw new StudentException("Name not be null or empty " + student.getName());
		}
		if (student.getMarks() < 0.0 || student.getMarks() >= 100.0)
			throw new StudentException("Marks Never -ve " + student.getMarks());

		return true;
	}

}
