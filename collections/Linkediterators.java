package collections;
import java.util.*;

public class Linkediterators {

	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		ListIterator l=a.listIterator();
		System.out.println("forward");
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		System.out.println("backward");
		while(l.hasPrevious()) {
			System.out.println(l.previous());
		}
		
		
	}

}
