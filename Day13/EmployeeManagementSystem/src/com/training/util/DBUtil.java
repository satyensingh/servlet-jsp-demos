package com.training.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBUtil {
	private static Connection connection;
	//Follow a Principle : Open-Close Principle
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		if (connection == null) {
			ResourceBundle bundle = ResourceBundle.getBundle("dbutil");
			Class.forName(bundle.getString("driverClassName"));
			String url = bundle.getString("url");
			String username = bundle.getString("userName");
			String password = bundle.getString("password");
			connection = DriverManager.getConnection(url, username, password);
		}
		return connection;
	}

	public static void closeConnection() throws SQLException {
		if(connection!=null)
			connection.close();
	}
}
