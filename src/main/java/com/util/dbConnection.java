package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {

	public static Connection getConnection() {
		Connection con = null;
		try {

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			try {
				con = DriverManager.getConnection(
						"jdbc:sqlserver://localhost:56219;DatabaseName=RESOURCE_MANAGEMENT_WEBAPP;trustServerCertificate=true;",
						"sa", "admin123$");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public static void main(String[] args) {
		Connection con = dbConnection.getConnection();
		if (con == null) {
			System.out.println("db is not connected...");
		} else {
			System.out.println("db is connected.....");
		}
	}
}
