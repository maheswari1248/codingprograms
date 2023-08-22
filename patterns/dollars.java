package patterns;

public class dollars {

	public static void main(String[] args) {
	int	temp=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			System.out.print("1");
			for(int j=1;j<i;j++)
			{
				System.out.print("$");temp=1;
			}
			
			for(int j=1;j<i-1;j++)
			{
				System.out.print("$");
				temp=1;
			}
			if(temp==1)
			System.out.print("1");
			System.out.println();
		}
	}

}
