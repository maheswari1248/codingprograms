package collections;

public class recursion_rev
{
	int rem,rev=0;
	public int  number(int a)
	{
		
		if(a>0) 
		{
			rem=a%10;
			rev=rev*10+rem;
		return number(a/10);
			
		}
		else 
		{
			return a/10;
		}
		
	}

	public static void main(String[] args)
	{
		int a=121,rev = 0;
		recursion_rev r=new recursion_rev();
		System.out.println(r.number(a));
	}

}
