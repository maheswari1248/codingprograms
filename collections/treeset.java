package collections;

import java.util.*;

public class treeset {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x;
		int a[]=new int[5];
		System.out.println("please enter the values");
		for(x=0;x<a.length;x++) 
		{
			a[x]=sc.nextInt();
		}
		TreeSet <Integer>t=new TreeSet<>();
		for(int i=0;i<a.length;i++) {
			t.add(a[i]);
		}
		System.out.println(t);
		System.out.println("after to array");
		Object[] y=t.toArray();
		for(Object var:y) {
			System.out.println(var);
		}

	}

}
