package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
		int noOfRows = 0;
		Connection connection = DBUtility.getDBConnection();
		String sql = "update student set name = ?, marks = ? where id = ?";
		PreparedStatement ps = null;

		try {
			ps = connection.prepareStatement(sql);

			ps.setString(1, student.getName());
			ps.setDouble(2, student.getMarks());
			ps.setInt(3, student.getId());

			noOfRows = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("StudentDAO " + e);
		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return noOfRows;
	}

	public int deleteStudent(int id) {
		int noOfRows = 0;
		Connection connection = DBUtility.getDBConnection();
		String sql = "delete from student where id = ?";
		PreparedStatement ps = null;

		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, id);

			noOfRows = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("StudentDAO " + e);
		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return noOfRows;
	}

	public int deleteStudent(Student student) {
		return deleteStudent(student.getId());
	}

	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<>();
		Connection connection = DBUtility.getDBConnection();
		String sql = "select * from student";
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				Student student = new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setMarks(rs.getDouble("marks"));

				students.add(student);
			}
		} catch (Exception e) {
			System.out.println("StudentDAO " + e);
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (ps != null)
					ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return students;
	}
}
