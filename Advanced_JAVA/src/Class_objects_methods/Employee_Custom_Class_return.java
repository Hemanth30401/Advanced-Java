package Class_objects_methods;

public class Employee_Custom_Class_return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new Emp();
		E1 e2 = e1.getData();
		System.out.println(e2.getName() + " " + e2.getEid());
	}

}
class Emp
{
	E1 e = new E1();
	public E1 getData()
	{
		e.setEid(30);
		e.setName("Hemanth");
		return e;
	}
}
class E1{
	private String name;
	private int Eid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
}
