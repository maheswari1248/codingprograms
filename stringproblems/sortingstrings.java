package stringproblems;

import java.util.Arrays;

public class sortingstrings 
{

	public static void main(String[] args) {
		String s=new String("hello all good morning");
		String[] a=s.split(" ");
	     String temp=a[0];
	    for(int i=0;i<a.length-1;i++) {
	    	if(a[i].length()>a[i+1].length()) 
	    	{
	    	temp=a[i];
	    	a[i]=a[i+1];
	    	a[i+1]=temp;
	    	i=-1;
	    	}
	    }
	    for(String var:a) {
	    	System.out.print(var+"   ");
	    	System.out.println();
	    }
	    charactersi  c=new charactersi() ;
	    c.checking(s);

	}

}
class charactersi
{
	public void checking(String s)
	{
		char [] a=s.toCharArray();
	     char temp=a[0];
	    for(int i=0;i<a.length-1;i++) {
	    	if(a[i]>a[i+1]) 
	    	{
	    	temp=a[i];
	    	a[i]=a[i+1];
	    	a[i+1]=temp;
	    	i=-1;
	    	}
	    }
	    for(char var:a) {
	    	System.out.print(var);
	    }
	}
	
}
