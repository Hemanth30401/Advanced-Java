package app1;
import java.sql.*;

interface Dao 
{
	public int insertCandidate(Dto dto) throws ClassNotFoundException,SQLException;
	public int updateCandidate(Dto dto) throws ClassNotFoundException,SQLException;
	public int deleteCandidate(Dto dto) throws ClassNotFoundException,SQLException;
	public ResultSet displayCandidate() throws ClassNotFoundException,SQLException;
}
