package app1;
import java.sql.Connection;
public class ServiceFactory {

	static Service ser;
	static {
		ser=new ServiceImpl();
	}
	public static Service getSData() 
	{
		return ser;
	}

}
