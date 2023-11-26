package jdbc_pack2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class Student_Appl {

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		// TODO Auto-generated method stub
		String name;
		int roll;
		String section;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Details: ");
		name=sc.next();
		roll = sc.nextInt();
		section=sc.next();
		Student s = new Student();
		s.setName(name);
		s.setRoll(roll);
		s.setSection(section);
		String Query="Insert into Student values(?,?,?);";
		Connection c=ConnectionFactory.getConnection();
		PreparedStatement ps = c.prepareStatement(Query);
		ps.setString(1, name);
		ps.setInt(2, roll);
		ps.setString(3, section);
		System.out.println(ps.executeUpdate());
	}

}
