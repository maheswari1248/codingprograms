package stringproblems;

import java.util.Arrays;

public class lappynumber {

	public static void main(String[] args)
	{
		StringBuffer s1=new StringBuffer("the quick brown fox jumps over a lazy dog");
	    String s3="abcdefghijklmnopqrstuvwxyz";
	    char c2[]=s3.toCharArray();
	    System.out.println(c2);
	    int x,y;
		   for(x=0;x<s1.length();x++)
		   {
			  for(y=x+1;y<s1.length();y++) 
			   {
				  if(s1.charAt(x)==s1.charAt(y)) {
					  s1.replace(y, y+1, "");
				  }
			   }
			   
		   }
		   String temp="";
		   for(int i=0;i<s1.length();i++) 
		   {
			   if(s1.charAt(i)!=' ')
			   {
				   temp=temp+s1.charAt(i);
			   }
		   }
		   String s=String.valueOf(temp);
		   s.trim();
		 //  System.out.println(s);
           char c[]=s.toCharArray();
          Arrays.sort(c);
          System.out.println(c);
          if(Arrays.equals(c, c2)) {
        	  System.out.println("yes");
          }
          
           		   
			
		   
		}
}
		

	


