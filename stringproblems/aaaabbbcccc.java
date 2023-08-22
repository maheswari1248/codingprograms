package stringproblems;

public class aaaabbbcccc 
{

	public static void main(String[] args) 
	{
		String s=new String("aaaabbbcc");
		char s2[]=s.toCharArray();
		int count=1,j;
		boolean b[]=new boolean[s2.length];
		for(int i=0;i<s2.length;i++) 
		{
			
				count=1;
				if(b[i]==true)
					continue;
				for(j=i+1;j<s2.length;j++)
				{
					if(s2[i]==s2[j])
					{
						count++;
						b[j]=true;
					}
				}
				if(count>1)
				{
					System.out.print(s2[i]+""+count);
				}
			
		

	}
	}

}
