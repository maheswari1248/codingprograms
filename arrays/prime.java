package arrays;

import java.util.Arrays;

public class prime
{
	public static void main(String[] args)
	{
		int a[]=new int[] {1,2,3,4,5,6,7,8,9};
		int b[]=new int[10];
		int count=0,count1=0,x=0;
		for(int i=0;i<a.length;i++)
		{
			count=0;
			for(int j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
					count++;
			}
			if(count==2)
			{
				count1++;
				b=new int[count1];
				b[x]=a[i];
				System.out.println(b[x]);
				x++;
			}
		}
		
		
	}
}



