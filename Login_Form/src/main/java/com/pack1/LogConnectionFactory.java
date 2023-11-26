package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LogConnectionFactory 
{
	public static Connection getconnect() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/workers";
		String u="root",p="ROOT#30";
		return DriverManager.getConnection(url,u,p);
	}
}
