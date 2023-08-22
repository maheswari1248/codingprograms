package patterns;

public class practice {

	public static void main(String[] args) 
	{
		patternmerge p=new patternmerge();
		p.merge3();
		

	}

}
class patternmerge
{
	int rows=5;
	public void merge()
	{
		for(int i=rows;i>=1;i--) 
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		rows=5;
		for(int i=1;i<=rows;i++) 
		{
			for(int j=i;j<=rows;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	public void merge2()
	{
		for(int i=1;i<=rows;i++) 
		{
			for(int j=i;j<=rows;j++) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public  void merge3() 
	{
		int rows=4;
	for(int i=1;i<=rows;i++) 
	{
	for(int j=rows;j>=i;j--) 
	{
		System.out.print(" ");
		
	}
	for(int k=1;k<=i;k++) {
		System.out.print("*");
	}
	for(int l=1;l<i;l++) {
		System.out.print("*");
	}
	
	
	for(int i1=1;i1<=rows;i1++) 
	{
	for(int j=1;j<=i1;j++) 
	{
		System.out.print(" ");
		
	}
	for(int k=rows;k>=i1;k--) {
		System.out.print("*");
	}
	for(int l=rows;l>=i1;l--) {
		System.out.print("*");
	}
	System.out.println();
	}
	}
	}
}
	
