package arrays;
import java.util.*;

public class midfirstreverse {
   public void midsecondreverese(int a[]) {
	   System.out.println("second reverse:");
	   for(int i=0;i<=(a.length-1)/2;i++) {
		   System.out.println(a[i]);
	   }
	   for(int i=a.length-1;i>=((a.length-1)/2)+1;i--) {
		   System.out.println(a[i]);
	   }
	   
   }
   public void midfirst(int a[]) {
	   System.out.println("first reverese:");
	   for(int i=(a.length-1)/2;i>=0;i--) {
			System.out.println(a[i]);
		}
		for(int i=((a.length-1)/2)+1;i<a.length;i++) {
			System.out.println(a[i]);
		}
   }

	public static void main(String[] args) {
		int a[]= {10,20,30,40,70,50,78};
		
	
		midfirstreverse m=new midfirstreverse();
		m.midfirst(a);
		m.midsecondreverese(a);
		
	}

}
