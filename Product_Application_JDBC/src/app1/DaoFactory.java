package app1;

public class DaoFactory 
{
	static Dao obj = new DaoImpl();
	public static Dao getData()
	{
		return obj;
	}
}
