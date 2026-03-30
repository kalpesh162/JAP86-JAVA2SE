package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
/*
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
*/

// Implementing Singleton Design Pattern for DBUtilty  --> Connection only one

public class DBUtility {
	// Step 1 : make DBUtility instance field as a private
	private static final DBUtility instance = new DBUtility();
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	private static final String URL = "jdbc:mysql://localhost:3306/studtech";

	static {

		try {
			Class.forName(DRIVER);
		} catch (Exception e) {

		}

	}

	// Step 2 make Constructor Private
	private DBUtility() {
		/*
		 * try { Class.forName(DRIVER); } catch (Exception e) {
		 * 
		 * }
		 */
	}

	public Connection getDBConnection() {

		Connection connection = null;
		try {

			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			System.out.println("DBUTILITY  " + e);
		}
		return connection;
	}

	public static DBUtility getInstance() {

		return instance;
	}

}
