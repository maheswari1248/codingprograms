package stringproblems;

public class first_non_repeating 
{

	public static void main(String[] args) 
	{
		String s=new String("MAHE PROGRAMMING QUOTES");
		char[] c=s.toCharArray();
		int count=1,a=0,i;
		char d='0';
		boolean[] b=new boolean[c.length];
		for( i=0;i<c.length;i++) 
		{
			count=1;a=1;
			if(b[i]==true)
				continue;
			for(int j=i+1;j<c.length;j++) 
			{
				if(c[i]==c[j])
				{
					b[j]=true;
					count++;
				}
				
			}
			if(count==1)
			{
			  System.out.println(c[i]);
			  break;
			}
			
			
			
			
			
		}
		
		
		

	}

}
