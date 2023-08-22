package patterns;

public class one_diagonals {

	public static void main(String[] args)
	{
		int k=row-2*i-1;
		for(int i=1;i<=5;i++) 
		{
			
			for(int j=1;j<=5;j++) 
			{
				if(i==j || i==k-2*i)
				System.out.print(i);
				else
					System.out.print("-");
				
			}
			System.out.println();
			
		}

	}

}
