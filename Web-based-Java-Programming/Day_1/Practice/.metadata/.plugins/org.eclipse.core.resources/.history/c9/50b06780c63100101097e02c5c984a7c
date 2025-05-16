package com.cdac.utils;
import java.sql.*;

public class DBUtils {
	private static Connection connection;
	private static final String DB_URL = "jdbc:mysql://localhost:3306/adv_java";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "cdac";
	//open Connection to open DB connection
	public static void openConnection() throws ClassNotFoundException, SQLException {
		//1. In erlier virsion - load JDBC driver -[optional Step]
//		Class.forName("com.mysql.cj.jdbc.Driver");	//fully qualified JDBC driver
		
		//2. Get fixed DB connection from DriverManager
		/*
		 * java.sql.DriverManager - class
		 * method
		 * public static Connection getConnection(String url, String userName, 
		 * String password) throws SQL Exception;
		 */
		// achieve SINGLETON instance of the DB connection (LAZY)------([EGAR]---Static initializer)
		if (connection == null)
		connection = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
	}
	//getter for connection
	public static Connection getConnection() {
		return connection;
	}
	//close connection
	public static void closeConnection() throws SQLException {
		if (connection != null) {
			connection.close();
			connection = null;
		}
	}
	
}
