package jdbc_pack1;
import java.sql.*;
public class jdbc_Connection_CallableStatement_without_Parameters {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		// TODO Auto-generated method stub
		Connection c = ConnectionFactory.getConnection();
		CallableStatement cs = c.prepareCall("{call three('2001-05-10 01:01:01',3)}");
		ResultSet rs = cs.executeQuery();
		while(rs.next())
		{
			System.out.print(rs.getInt(1) + "\t");
			System.out.print(rs.getString(2) + "\t");
			System.out.print(rs.getInt(3) + "\t");
			System.out.println();
		}
	}

}
