package stringproblems;

public class VIRUS 
{
	public static void main(String args[])
	{
		String s1=new String("VITAL INFORMATION RESOURCE UNDER SEIZE");
		String s2[]=s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			System.out.print(s2[i].substring(0,1));
		}
		
	}

}
