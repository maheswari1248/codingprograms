package patterns;

public class onetworeverse 
{
public static void main(String args[])
{
	B b=new B();
	b.method1();
	System.out.println("====");
	b.method2();
	
}
	
}
class B{

	public void method1()
	{
		int rows=5;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==j||j==1)
				System.out.print(i);
				else 
				{
					System.out.print("#");
				}
			}
			
			System.out.println();
		}
		for(int i=rows-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==1||j==1||i==j)
				System.out.print(i);
				else
					System.out.print("#");
			}
			System.out.println();
		}
	}
	public void method2() 
	{
	int rows=4;
	for(int i=1;i<=rows;i++) 
	{
		for(int j=i;j>=1;j--) 
		{
			System.out.print(j);
		}
		
		
		
		System.out.println();
	}
	for(int k=rows-1;k>=1;k--) 
	{
		for(int l=1;l<=k;l++) 
		{
			System.out.print(l);
		}
		System.out.println();
		
	}
	
  }
}



