package patterns;

public class fiververese {

	public static void main(String[] args)
	{
		five f=new five();
		f.normal();
		System.out.println("====");
		f.methodreverese();

	}

}
class five
{
	public void methodreverese() 
	{
		int a=5,rows=5;
		for(int i=5;i>=1;i--) 
		{
			
			for(int j=i;j<=5;j++)
			{
				
			System.out.print(j);
				
			
			}
			System.out.println();
		}
	}
	public void normal() 
	{
		
			int a=5,rows=5;
			for(int i=5;i>=1;i--) 
			{
				
				for(int j=5;j>=i;j--)
				{
					
				System.out.print(j);
					
				
				}
				System.out.println();
			}
	}
	
}
