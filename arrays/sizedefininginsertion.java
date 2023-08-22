package arrays;

import java.util.Scanner;

public class sizedefininginsertion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[11];
		
		int i,k,element=55;
		for(i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]+"   ");
		}
		System.out.println();
		for( k=a.length-1;k>5;k--) {
			a[k]=a[k-1];
		}
		a[k]=element;
		for(int var:a) {
			System.out.print(var+"   ");
		}

	}

}
