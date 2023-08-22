package stringproblems;

public class vowelsinone {
	public static void main(String args[]) {
		String s=("hello");
		String s1="";
		
		String s2="";
		for(int i=0;i<s.length();i++)
		{
		if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') 
		{
			   s1=s1+s.charAt(i);	
			   
		}
		
		}
		for(int j=0;j<s.length();j++)
		{
		if(s.charAt(j)!='a'&& s.charAt(j)!='e' && s.charAt(j)!='i' && s.charAt(j)!='o' && s.charAt(j)!='u') 
		{
			   s1=s1+s.charAt(j);	
			   
		}
		
		}
		
		
		
		
		System.out.println(s1);
		
	}

}
