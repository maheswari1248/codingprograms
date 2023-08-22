package sorting;

import java.util.Scanner;

public class mixedoddeven
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a[]= new int [3],i,j;//2 4 6
		int even =0,odd=0;
		
		System.out.println("enter elements");
		for( i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		for(i=0;i<a.length;i++) 
		{
			if(a[i]%2==0) {
				even++;
				
			}
			
			else 
			{
				odd++;
				
			}
			
		}
		if(even==a.length) 
		{
			System.out.println("even");
		}
		else if(odd==a.length) 
			{
				System.out.println("odd");
			}
			else 
			{
				System.out.println("mixed");
			}
			
	
				
		}
		

	}


