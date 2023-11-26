package app1;
import java.sql.*;
import java.sql.SQLException;
public class ConnectionFactory 
{
	public static Connection getconnection() throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/Products";
		String u = "root";
		String p = "ROOT#30";
		Connection c = DriverManager.getConnection(url,u,p);
		return c;
	}

}
