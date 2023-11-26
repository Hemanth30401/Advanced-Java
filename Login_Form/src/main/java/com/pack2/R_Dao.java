package com.pack2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class R_Dao 
{
	public static int getData(String fullName,String rollNumber,String email,String password) throws SQLException, ClassNotFoundException 
	{
		Connection con=RegConnectionFactory.getconnection();
		PreparedStatement pst = con.prepareStatement("INSERT INTO REGISTER1 VALUES(?,?,?,?);");
		pst.setString(1, fullName);
		pst.setString(2, rollNumber);
		pst.setString(3, email);
		pst.setString(4, password);
		return pst.executeUpdate();
	}
}
