package collections;

import java.util.Arrays;
import java.util.*;

public class uniqueelements_using_array_and_hash 
{
	public static void main(String args[]) 
	{
	ArrayList a=new ArrayList(Arrays.asList(1,2,3,4,1,2,3,4));
	HashSet h=new HashSet(a);
	
	System.out.println(h);
	checking_true t=new checking_true();
	t.method();
	check_normally c=new check_normally();
	c.method1();
	}
	
	}

class checking_true
{
	public void method()
	{
		int a[]=new int[]{1,2,3,4,5,6,7,1,2,3};
		List l=new ArrayList();
		for(int i=0;i<a.length;i++)
		{
			l.add(a[i]);
		}
		
		System.out.println("true or false");
		HashSet h=new HashSet();
		for(Object temp:l) {
			System.out.println(h.add(temp));
		}
		
	}
	
}
class check_normally
{
	public void method1() 
	{
		int a[]=new int[]{1,2,3,45,56,45,2,3};
		HashSet l=new HashSet();
		for(int i=0;i<a.length;i++) {
			l.add(a[i]);
		}
		for(Object temp:l)
		{
			System.out.println(temp);
		}
		
	}
}
