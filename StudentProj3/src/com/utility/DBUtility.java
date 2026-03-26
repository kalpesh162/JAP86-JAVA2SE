package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtility {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	private static final String URL = "jdbc:mysql://localhost:3306/studtech";

	public static Connection getDBConnection() {

		Connection connection = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			System.out.println("DBUTILITY  " + e);
		}
		return connection;
	}

}
