package Class_objects_methods;
import java.util.*;
public class Collection_class_return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add1 a = new Add1();
		Queue q = a.getData();
		System.out.println(q);
	}

}
class Add1{
	Queue<Integer> q = new PriorityQueue<>();
	public Queue getData()
	{
		q.add(32);q.add(3);q.add(21);q.add(1);
		return q;
	}
}