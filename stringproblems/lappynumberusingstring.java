package stringproblems;

import java.util.Arrays;

public class lappynumberusingstring {

	public static void main(String[] args) {
		String s=new String("The quick brown fox jumps over a lazy dog");
		char c[]=s.toLowerCase().toCharArray();
		Arrays.sort(c);
		int i,j;
		String ans="";
		for( i=0;i<c.length;i++) 
		{
			for( j=0;j<c.length;j++)
			{
				if(c[i]==c[j]) {
					break;
				}
				
			}
			if(i==j) 
			{
			ans=ans+c[i];
			}
			
		}
		ans=ans.trim();
		System.out.println(ans);
		String s2= new String("abcdefghijklmnopqrstuvwxyz");
		if(s2.equals(ans)) {
			System.out.println("yes");
		}
	}

}
