package jdbc_pack2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		String url="jdbc:mysql://localhost:3306/Products";
		String username="root";
		String pass="ROOT#30";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection(url,username,pass);
		return c;
	}

}
