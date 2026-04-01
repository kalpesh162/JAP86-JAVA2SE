package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.UUID;

public class DBUtility {

	private static final DBUtility instance = new DBUtility();

	private static String URL = "";
	private static String USER = "";
	private static String PASSWORD = "";
	private static String DRIVER = "";

	static {

		// "com/config/db.properties"
		try (FileInputStream input = new FileInputStream("./resources/db.properties")) {
			Properties prop = new Properties();
			prop.load(input);

			URL = prop.getProperty("db.url");
			USER = prop.getProperty("db.user");
			PASSWORD = prop.getProperty("db.password");

			DRIVER = prop.getProperty("db.driver");

			// No need of Driver to load manually
			// After JDBC API 4.0 + Driver Class Loads Automatically
			// Class.forName(DRIVER);

		} catch (Exception e) {
			throw new RuntimeException("Confi file missing ");
		}

	}

	private DBUtility() {
	}

	public static DBUtility getInstance() {
		return instance;
	}

	public Connection getDBConnection() throws SQLException {
		System.out.println(URL);
		System.out.println(USER);
		System.out.println(PASSWORD);
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}

}
