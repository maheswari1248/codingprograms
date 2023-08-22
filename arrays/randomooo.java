package arrays;
import java.util.*;

public class randomooo {
	
	public void method1(int a[]) {
		for(int i=0;i<=(a.length-1)/2;i++) {
			System.out.print(a[i]+" ");
			
		}
		
		
	}
	public void method2(int a[]) {
		for(int i=a.length-1;i>(a.length-1)/2;i--) {
			System.out.print(a[i]+ " ");
			
		}
	}
	public static void main(String args[]) {
		Random r=new Random();
		int a[]=new int[6];
		for(int i=0;i<a.length;i++) {
			a[i]=r.nextInt(100);
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		
		System.out.println("random reverese"+"   ");
		randomooo r1=new randomooo();
		r1.method1(a);
		r1.method2(a);
		
		
	}

}
