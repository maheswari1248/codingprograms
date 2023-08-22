package patterns;

public class last0 
{
public static void main(String args[])
{
	int rows=3,a=1;
	for(int i=1;i<=rows;i++) 
	{
		for(int j=1;j<=i;j++) 
		{
			if(i==rows &&j==rows)
			System.out.print(0);
			else {
				System.out.print(a);
			}
			a++;
		}
		System.out.println();
	}
	
}
}
