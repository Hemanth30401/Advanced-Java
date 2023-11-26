package app1;
import java.sql.Connection;
import java.sql.*;

public class DaoImpl implements Dao
{
	@Override
	public int insertCandidate(Dto dto) throws ClassNotFoundException, SQLException
	{
		Connection con = ConnectionFactory.getconnection();
		String Query = "INSERT INTO CANDIDATE VALUES(?,?,?,?);";
		PreparedStatement ps = con.prepareStatement(Query);
		ps.setString(1, dto.getCandname());
		ps.setString(2, dto.getCandbranch());
		ps.setInt(3, dto.getCandESal());
		ps.setInt(4, dto.getCId());
		boolean b = ps.execute();
		return ps.getUpdateCount();
	}
	
	@Override
	public int updateCandidate(Dto dto) throws ClassNotFoundException, SQLException
	{
		Connection con = ConnectionFactory.getconnection();
		String Query="UPDATE CANDIDATE SET NAME=?,BRANCH=?,ESAL=? WHERE ID=?";
		PreparedStatement ps = con.prepareStatement(Query);
		ps.setString(1, dto.getCandname());
		ps.setString(2, dto.getCandbranch());
		ps.setInt(3, dto.getCandESal());
		ps.setInt(4, dto.getCId());
		boolean b = ps.execute();
		return ps.getUpdateCount();
	}
	
	@Override
	public int deleteCandidate(Dto dto) throws ClassNotFoundException, SQLException
	{
		Connection con = ConnectionFactory.getconnection();
		String Query="DELETE FROM CANDIDATE WHERE ID=?";
		PreparedStatement ps = con.prepareStatement(Query);
		ps.setInt(1,dto.getCId());
		boolean b = ps.execute();
		return ps.getUpdateCount();
	}
	
	@Override
	public ResultSet displayCandidate() throws ClassNotFoundException,SQLException
	{
		Connection c = ConnectionFactory.getconnection();
		String Query="Select * from Candidate;";
		PreparedStatement ps = c.prepareStatement(Query);
		boolean b = ps.execute();
		return ps.getResultSet();
	}
}
