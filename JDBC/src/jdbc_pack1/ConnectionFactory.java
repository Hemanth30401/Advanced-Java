package jdbc_pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnection() throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/workers";
		String u = "root";
		String p = "ROOT#30";
		Connection c = DriverManager.getConnection(url,u,p);
		return c;
	}

}
