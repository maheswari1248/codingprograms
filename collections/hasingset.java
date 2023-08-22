package collections;
import java.util.*;
public class hasingset 
{
	public static void main(String args[])
	{
		HashSet h=new HashSet();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(1);
		h.add(2);
		System.out.println(h);
		System.out.println("LinkedHashset");
		bhanu b=new bhanu();
		b.linked();
	}

}
class bhanu{
	public void linked() 
	{
		int a[]=new int[]{10,20,30,40,5};
		LinkedHashSet l=new LinkedHashSet();
		for(int i=0;i<a.length;i++) {
			l.add(a[i]);
		}
		System.out.println(l);
	}
}