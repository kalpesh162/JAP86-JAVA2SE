package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Student;

public class App2 {

	public static void main(String[] args) {

		int noRows = 0;
		Connection con = null;
		PreparedStatement ps = null;
		Student student = new Student(13, "Rajesh", 64.44);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studtech", "root", "root");

			String sql = "insert into student (id,name,marks) values(?,?,?)";

			ps = con.prepareStatement(sql);
			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			ps.setDouble(3, student.getMarks());
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
			System.out.println("Data Added");
		else
			System.out.println("Failed To ADD");

	}

}
