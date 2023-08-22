package practiceproblems;

import java.util.Arrays;

public class alternateNumbers 
{

	public static void main(String[] args)
	{
		int a[]=new int[]{10,20};
		int a1[]=new int[] {50,60,70,80};
		int c[]=new int[a.length+a1.length];
		int x,y=0;
		for( x=0;x<c.length;x++) 
		{
			if(x<a.length)
				System.out.println(a[x]);
			if(x<a1.length)
				System.out.println(a1[x]);
		}
		//System.out.println("In Strings Alternative");
		//A b=new A();
		
		

	}

}

