package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Student;

public class UpdateData {

	public static void main(String[] args) {
		int id = 13;
		String name = "Rakesh";
		double marks = 84.44;
		Student student = new Student(id, name, marks);
		int noRows = 0;
		Connection con = null;
		PreparedStatement ps = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studtech", "root", "root");

			String sql = "update student set name=? , marks=? where id=?";

			ps = con.prepareStatement(sql);
			ps.setString(1, student.getName());
			ps.setDouble(2, student.getMarks());
			ps.setInt(3, id);
			noRows = ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		} finally {
			try {
				con.close();
				ps.close();
			} catch (Exception e) {

			}
		}
		if (noRows > 0)
			System.out.println("Data UPDATE");
		else
			System.out.println("Failed To ADD");

	}

}
