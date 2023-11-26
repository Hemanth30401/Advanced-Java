package Class_objects_methods;

public class String_Arrays_classes_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S s1 = new S();
		String[] s2 = s1.getS();
		for(String t:s2)
			System.out.print(t + " ");
	}
}
class S{
	String s = "Hello hi";
	String[] a = s.split(" ");
	public String[] getS()
	{
		for(int x=0;x<a.length;x++)
			a[x]=a[x].toUpperCase();
		return a;
	}
}