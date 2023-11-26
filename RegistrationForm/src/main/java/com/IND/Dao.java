package com.IND;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao 
{
	public static int getData(String fullName,String rollNumber,String email,String mobileNumber) throws SQLException, ClassNotFoundException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/workers";
		String u = "root";
		String p="ROOT#30";
		Connection con = DriverManager.getConnection(url,u,p);
		PreparedStatement pst = con.prepareStatement("INSERT INTO REGISTER VALUES(?,?,?,?);");
		pst.setString(1, fullName);
		pst.setString(2, rollNumber);
		pst.setString(3, email);
		pst.setString(4, mobileNumber);
		return pst.executeUpdate();
	}
}
