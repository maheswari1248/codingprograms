package codinghub;
import java.util.*;

public class userminimum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the value:");
		int a=sc.nextInt();
		int rem=0,sum=0;
		while(a>0) {
			rem=a%10;
			sum=sum*10+rem;
			a=a/10;
			
			
		}
		while(sum>0) {
			rem=sum%10;
			System.out.println(rem);
			sum=sum/10;
		}
		
		

	}

}
