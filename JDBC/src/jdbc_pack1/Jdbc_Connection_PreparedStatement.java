package jdbc_pack1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Jdbc_Connection_PreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/Products";
		String u = "root";
		String p = "ROOT#30";
		Connection c = DriverManager.getConnection(url,u,p);
		System.out.println("Enter your choice");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		switch(s)
		{
			case 1:
				String Query="Insert into wc1(Name,points) values(?,?)";
				PreparedStatement ps = c.prepareStatement(Query);
				ps.setString(1, "Afg");
				ps.setInt(2, 5);
				int r = ps.executeUpdate();
				System.out.println(r);
			break;
			case 2:
				String Query1="select * from wc1";
				PreparedStatement ps1 = c.prepareStatement(Query1);
				ResultSet rs = ps1.executeQuery();
				while(rs.next())
				{
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getInt(3) + "\t");
					System.out.println();
				}
			break;
			default:
				System.out.println("INVALID");
		}
	}

}
