package arrays;

import java.util.Scanner;

public class sortingdescending {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=6;
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			int	temp=0;
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}

	}

}
