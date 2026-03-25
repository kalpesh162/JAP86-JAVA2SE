package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.model.Student;
import com.util.DBUtility;

public class StudentDao {

	public int addStudent(Student student) {
		int noOfRows = 0;
		Connection connection = DBUtility.getDBConnection();
		String sql = "insert into student (id,name,marks) values (?,?,?)";
		PreparedStatement ps = null;
		try {
			ps = connection.prepareStatement(sql);

			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			ps.setDouble(3, student.getMarks());

			noOfRows = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("StudentDAO " + e);
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return noOfRows;
	}

	public int updateStudent(Student student) {

		return 0;
	}

	public int deleteStudent(int id) {

		return 0;
	}

	public int deleteStudent(Student student) {

		return 0;
	}

	public List<Student> getAllStudents() {

		return null;
	}

}
