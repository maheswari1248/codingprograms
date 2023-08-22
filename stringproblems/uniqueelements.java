package stringproblems;

import java.util.Scanner;

public class uniqueelements {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the unique");
		String s1=sc.nextLine();
		
		char a[]=s1.toCharArray();
		int count=1,j,i,count1=0;
		boolean[] b=new boolean[a.length];
		for( i=0;i<s1.length();i++)
		{
			 
			if(a[i]!=' ')
				
			{
				count=1;
			  if(b[i]==true)
			   continue;
			  
			for( j=i+1;j<s1.length();j++) 
			{
				if(a[i]==a[j])
				{
					count++;
					b[j]=true;
					
				}
			}
			if(count==1) {
	        	count1++;
	        }
			
		  }
			
		}
		System.out.println(count1);
	        
	}

}
