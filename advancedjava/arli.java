package advancedjava;
import java.util.*;

import collections.Arraylist;
public class arli {

	public static void main(String[] args) 
	{
		B a=new B();
		ArrayList a1=a.method1();
		System.out.println(a1);

	}

	

	

}
class B
{
	ArrayList al=new ArrayList();
	public ArrayList method1() 
	{
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		return al;
		
		
	}
	
}