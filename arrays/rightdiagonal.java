package arrays;

import java.util.Scanner;

public class rightdiagonal 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int row=3,col=3;
		int a[][]=new int[row][col];
        System.out.println("enter elements");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		/*for(int i=0,j=col-1;i<row;i++,j--)
		{
		    
			
				//System.out.println(a[i][j]);
			}*/
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++) 
			{
				if(i+j==col-1) {
					System.out.print(a[i][j]);
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
		
			
		}

	}


