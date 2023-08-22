package collections;
import java.util.*;

public class duplicate_elements 
{
  public static void main(String args[])
  {
	int a[]=new int[] {1,2,3,4,5,6,1,2,3,4,5};
	List <Integer>l=new ArrayList<Integer>();
	for(int i=0;i<a.length;i++) {
		l.add(a[i]);
	}
	HashSet<Integer> h=new HashSet<>();
	for(Integer temp:l) 
	{
		if(h.add(temp)==false)
			System.out.println(temp);
	}
	dup d=new dup();
	  d.method();
  }
}
