package patterns;

public class primepattern
{
	public static void main(String args[])
	{
		int rows=5;
		int k=2;
		int count;
		for(int i=0;i<rows;i++) 
		{
			for(int j=0;j<=i;j++) 
			{
				count=0;
				for(int x=1;x<=k;x++) {
					if(k%x==0) 
					{
						count++;
					}
				}
				if(count==2) {
					System.out.print(k+" ");
				}
				else
					j--;
				    k++;
			}
			System.out.println();
		}
        
	}

}
