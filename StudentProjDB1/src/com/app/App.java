package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Student;

public class App {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Student student=new Student(12, "Kalpesh", 44.44);
		
		// Step1 
		// com.mysql.cj.jdbc.Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studtech", "root", "root");
		
		String sql="insert into student (id,name,marks) values (?,?,?)";
		
		PreparedStatement ps=con.prepareStatement(sql);
		
		ps.setInt(1, student.getId());
		ps.setString(2, student.getName());
		ps.setDouble(3, student.getMarks());
		
		int noOfRows=ps.executeUpdate();
		
		if(noOfRows>0)
			System.out.println("Data Added");
		else
			System.out.println("Data NOT Added");
		
		
		
		
		
	}

}
