package app1;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface Service 
{
	public int insertC(Dto dto) throws ClassNotFoundException,SQLException;
	public int updateC(Dto dto) throws ClassNotFoundException,SQLException;
	public int deleteC(Dto dto) throws ClassNotFoundException,SQLException;
	public ResultSet displayC() throws ClassNotFoundException,SQLException;
}
