package com.pack2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RegConnectionFactory 
{
	public static Connection getconnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/workers";
		String u = "root";
		String p="ROOT#30";
		return DriverManager.getConnection(url,u,p);
	}
}
