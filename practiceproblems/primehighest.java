package practiceproblems;

public class primehighest {
	int n=1246;
public int high(int a)
{
	int rem=0,max=0;
	while(a>0) 
	{
		rem=a%10;
		if(rem>max) 
			max=rem;
	}
		return max;	
}
	public int primefactors(int a)
	{
		int x=a, count=0,max1=0,i;
		for( i=1;i<=x;i++)
		{
			if(x%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			if(i>max1)
			{
				max1=i;
			}
		}
		return max1;
	}
	public static void main(String[] args) 
	{
		primehighest o=new primehighest();
	int r=	o.primefactors(o.n);System.out.println(r);
	}
}
