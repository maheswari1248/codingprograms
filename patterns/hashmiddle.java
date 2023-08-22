package patterns;

public class hashmiddle {

	public static void main(String[] args)
	{
		int rows=5,a=1;
		for(int i=1;i<=rows;i++) 
		{
			for(int j=1;j<=i;j++)
			{
				if(i==rows||j==1||i==j ) 
				{
					System.out.print(i);
				}
				else {
					System.out.print("#");
				}
				
				
			}
			System.out.println();
		}
		A a1=new A();
		a1.method1();

	}

}
class A
{
	public void method1() 
	{
		int rows=5,a=1;
		for(int i=1;i<=rows;i++) 
		{
			for(int j=1;j<=i;j++)
			{
				if(i==rows||j==1||i==j ) 
				{
					System.out.print(a);
				}
				else {
					System.out.print("#");
				}
				
				a++;
			}
			System.out.println();
		}
	}
	
}
