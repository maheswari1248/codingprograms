package patterns;

public class diamond {

	public static void main(String[] args) 
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

	}
	}

}
