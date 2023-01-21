package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	
	private static Connection connect;
	
	public  static Connection openConnection() throws SQLException {
		
		connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","root123");
		return connect;
	}
	public static void closeConnection() throws SQLException {
		if(connect!=null)
		connect.close();
	}

}
