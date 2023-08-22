package arrays;

import java.util.Scanner;

public class sum2darray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=3,col=3;
		int a[][]=new int[row][col];
		int b[][]=new int[row][col];
		int c[][]=new int[row][col];
        System.out.println("enter  a elements");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(" enter b elements");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("c elements");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
