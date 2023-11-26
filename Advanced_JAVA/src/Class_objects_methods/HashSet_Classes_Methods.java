package Class_objects_methods;
import java.util.*;
public class HashSet_Classes_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s1 = A.getData();
		System.out.println(s1);
	}

}
class A
{
	static Set<String> s = new HashSet<>();
	public static Set getData()
	{
		s.add("He");s.add("rO");s.add("HI");s.add("Hello");
		return s;
	}
	
}