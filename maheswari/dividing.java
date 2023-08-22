package maheswari;
import java.util.*;
public class dividing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the value:");
		int a=sc.nextInt();
				int rem=0,count=0,rev=1,temp=0;
				a=temp;
		while(a>0) {
			rem=a%10;
			count++;
			
			if(count%2==0) {
				System.out.println(rem);
			
				
		}
			a=a/10;
		
			
			
	      
	
		}
		
	}

}
