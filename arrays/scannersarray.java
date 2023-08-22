package arrays;
import java.util.*;

public class scannersarray {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int size=5;
		System.out.println("please enter the values");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
			}

}
