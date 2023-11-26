package jdbc_pack1;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
public class Jdbc_Connection {

	public static void main(String[] args) throws SQLException,ClassNotFoundException
	{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String Url="jdbc:mysql://localhost:3306/workers";
		String Username="root";
		String Password="ROOT#30";
		Connection con = DriverManager.getConnection(Url,Username,Password);
		Statement st = con.createStatement();
		System.out.println("Enter your choice");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		switch(s)
		{
			case 1:
				int r = st.executeUpdate("create table wc1 (rank_coun int,Name varchar(45),points int)");
				if(r>=0)
					System.out.println("Table created");
				else
					System.out.println("Try again");
			break;
			case 2:
				int r1 = st.executeUpdate("insert into wc1 values(1,'India',10);");
				int r2 = st.executeUpdate("insert into wc1 values(2,'Austraila',8);");
				int r3 = st.executeUpdate("insert into wc1 values(3,'England',7);");
				int r4 = st.executeUpdate("insert into wc1 values(4,'Pakistan',7);");
				if(r1>0 && r2>0 && r3>0 && r4>0)
					System.out.println("Inserted Successfully");
				else
					System.out.println("Try again");
			break;
			case 3:
				int r5 = st.executeUpdate("update wc1 set points=12 where rank_coun=1");
				if(r5>0)
					System.out.println("Updated Successfully");
				else
					System.out.println("Try again");
			break;
			case 4:
				ResultSet rs = st.executeQuery("Select * from wc1;");
				while(rs.next())
				{
					System.out.print(rs.getInt(1) + "\t");
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
