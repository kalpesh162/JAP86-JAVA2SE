package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtility {

	private static final DBUtility instance = new DBUtility();

	private static final String URL = "jdbc:mysql://localhost:3306/studtech";
	private static final String USER = "root";
	private static final String PASSWORD = "root";

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Driver not found", e);
		}
	}

	private DBUtility() {
	}

	public static DBUtility getInstance() {
		return instance;
	}

	public Connection getDBConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}

}
