package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exception.StudentDaoException;
import com.model.Student;
import com.util.DBUtility;

public class StudentDaoImpl implements StudentDao {

	@Override
	public int addStudent(Student student) {
		int noOfRows = 0;
		String sql = "insert into student (id,name,marks) values (?,?,?)";
		try (Connection connection = DBUtility.getInstance().getDBConnection();
				PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			ps.setDouble(3, student.getMarks());
			noOfRows = ps.executeUpdate();
		} catch (Exception e) {
            throw new StudentDaoException("add Student StudentDAO "+e);
		}
		if(noOfRows>0)
		return noOfRows;
		
		throw new StudentDaoException("Failed To ADD in DB  ");
	}

	@Override
	public int updateStudent(Student student) {
		int noOfRows = 0;
		// Connection connection=DBUtility.getDBConnection(); // Connectionr r1
		String sql = "update student set name=? , marks=? where id=?";
		try (Connection connection = DBUtility.getInstance().getDBConnection();
				PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setInt(3, student.getId());
			ps.setString(1, student.getName());
			ps.setDouble(2, student.getMarks());

			noOfRows = ps.executeUpdate();
			// System.out.println(" "+noOfRows);
		} catch (Exception e) {
			System.out.println(" --->  " + e);
		}
		return noOfRows;
	}

	@Override
	public int deleteStudent(Student student) {
		int noOfRows = 0;
		// Connection connection=DBUtility.getDBConnection(); // Connectionr r1
		String sql = "DELETE FROM student where id=?";
		try (Connection connection = DBUtility.getInstance().getDBConnection();
				PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setInt(1, student.getId());
			noOfRows = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(" --->  " + e);
		}
		return noOfRows;
	}

	@Override
	public List<Student> findAllStudents() {
		List<Student> students = new ArrayList<Student>();
		String sql = "SELECT * FROM STUDENT";

		try (Connection connection = DBUtility.getInstance().getDBConnection();
				PreparedStatement ps = connection.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {

			while (rs.next()) {
				Student student2 = new Student();
				student2.setId(rs.getInt("id"));
				student2.setName(rs.getString("name"));
				student2.setMarks(rs.getDouble("marks"));
				students.add(student2);
			}

		} catch (SQLException e) {
			System.out.println(e);
		}
		return students;
	}

	@Override
	public Student findById(int id) {
		String sql = "SELECT * FROM STUDENT WHERE id=?";
		Student student = null;

		try (Connection connection = DBUtility.getInstance().getDBConnection();
				PreparedStatement ps = connection.prepareStatement(sql);) {

			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				student = new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setMarks(rs.getDouble("marks"));

			}

			return student;
		} catch (SQLException e) {
			System.out.println(e);
		}
		return student;
	}

}
