package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtility {

	public static Connection getDBConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studtech", "root", "root");
		} catch (Exception e) {
			// Logger
			System.out.println(e);
		}

		return connection;
	}

}
