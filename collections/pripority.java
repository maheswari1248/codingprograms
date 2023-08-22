package collections;
import java.util.*;
public class pripority {

	public static void main(String[] args) 
	{
		int a[]=new int[]{10,20,4,5,1};
		PriorityQueue p=new PriorityQueue();
		for(int i=0;i<a.length;i++) {
			p.add(a[i]);
		}
		System.out.println(p);
		System.out.println("to array");
		Object m[]=p.toArray();
		for(Object var:m) {
			System.out.println(var);
		}

	}

}
