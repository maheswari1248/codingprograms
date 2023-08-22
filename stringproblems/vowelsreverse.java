package stringproblems;

public class vowelsreverse {

	public static void main(String[] args)
	{
		String s="hello";
		String s1="";
		char a[]=s.toCharArray();
		int i,j;
		for( i=0;i<a.length;i++)
		{
			if(a[i]=='a' || a[i]=='i'|| a[i]=='e'|| a[i]=='o'|| a[i]=='u') 
			{
				
				
				
			}
			else {
				s1=s1+a[i];
				
			}
			
			
			
		}
		System.out.println(s1);

	}

}
