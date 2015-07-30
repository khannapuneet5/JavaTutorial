package com.msci.dblogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {

	private static String driverClassName = "com.mysql.jdbc.Driver";
		private static String url = "jdbc:mysql://localhost/msci";
		private static String userName = "root";
		private static String password = "admin";
		
		static {
			try {
				Class.forName(driverClassName);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		public static Connection getConnection()throws SQLException{
			return DriverManager.getConnection(url,userName,password);
		}
	
}
