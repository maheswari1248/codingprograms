package stringproblems;

public class spaces {

	public static void main(String[] args) 
	{
		String s=new String("   hello   all   maheswari is here   ");
		int count=0;
		int x,y=0;
		String s1=s.trim();
		for( x=0;x<s1.length();x++)
		{
			if(s1.charAt(x)==' ') {
				count++;
			if(x==y+1) 
			{
				count--;
				y=x;
				
			}
			else {
				y=x;
			}
			
			
		}
			
			
		}
		System.out.println(count+1);
		
		
		
		
	}

}
