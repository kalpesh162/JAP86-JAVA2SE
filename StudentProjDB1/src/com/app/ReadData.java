package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Student;

public class ReadData {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement ps = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studtech", "root", "root");

			String sql = "SELECT * FROM STUDENT";

			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			System.out.println("ID          NAME      MARKS");
			while (rs.next()) {
				System.out.printf("%3d ", rs.getInt(1));
				// System.out.println(rs.getInt("id"));
				System.out.printf("%15s", rs.getString(2));
				System.out.printf("%8.2f", rs.getDouble(3));
				System.out.println();
			}
			rs.close();

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		} finally {
			try {
				con.close();
				ps.close();

			} catch (Exception e) {

			}
		}

	}

}
