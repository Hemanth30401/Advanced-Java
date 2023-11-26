package app1;

import java.sql.*;

public class ServiceImpl implements Service
{
	Dao dao = DaoFactory.getData();
	@Override
	public int insertC(Dto dto) throws ClassNotFoundException, SQLException 
	{
		return dao.insertCandidate(dto);
	}

	@Override
	public int updateC(Dto dto) throws ClassNotFoundException, SQLException 
	{
		return dao.updateCandidate(dto);
	}
	
	@Override
	public int deleteC(Dto dto) throws ClassNotFoundException, SQLException 
	{
		return dao.deleteCandidate(dto);
	}

	@Override
	public ResultSet displayC() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return dao.displayCandidate();
		
	}
	
}
