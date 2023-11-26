package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class L_Dao 
{
	
	public static ResultSet getData(L_Dto dto) throws ClassNotFoundException, SQLException
	{
		
		Connection con = LogConnectionFactory.getconnect();
		PreparedStatement pst = con.prepareStatement("SELECT * FROM REGISTER1 WHERE EMAIL=? AND PASSWORD=?");
		pst.setString(1, dto.getEmailId());
		pst.setString(2, dto.getPassword());
		return pst.executeQuery();
		
	}
}
