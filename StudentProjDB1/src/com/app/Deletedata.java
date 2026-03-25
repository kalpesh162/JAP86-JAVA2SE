package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Student;

public class Deletedata {
	
	public static void main(String[] args) {
		
		int id=12;
		


		int noRows = 0;
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studtech", "root", "root");

			String sql = "delete from student where id=?";

			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
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
			System.out.println("Data DELETED");
		else
			System.out.println("Failed To ADD");

	
		
		
	}

}
