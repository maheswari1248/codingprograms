package arrays;
import java.util.Scanner;
public class sumproduct {

	public static void main(String[] args) {
		int a[]=new int[] {10,20,30,40,50};
		int sum=0,prod=1;
		for(int x=0;x<a.length;x++) {
			sum=sum+a[x];
		}
		System.out.println(sum);
		for(int y=0;y<a.length;y++) {
			prod=prod*a[y];
		}
		System.out.println(prod);
		if(sum==prod) {
			System.out.println("Good");
		}
		else {
			System.out.println("Bad");
		}
		
	}

}
