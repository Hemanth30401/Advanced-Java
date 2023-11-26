package Class_objects_methods;

public class Custom_Interface_return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		In i = Add.getData();
	}

}

class Add
{
	static In i = new InImp();
	public static In getData() {
		i.m1();
		return i;
	}
}
interface In
{
	public void m1();
}
class InImp implements In{
	public void m1()
	{
		System.out.println("M1");
	}
}