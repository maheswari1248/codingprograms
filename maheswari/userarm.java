package maheswari;
import java.util.Scanner;

public class userarm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		int a=sc.nextInt();
		int rem=0,count=0,temp=0,arm=0;
		temp=a;
		while(a>0) {
			rem=a%10;
			count++;
			a=a/10;
		}
		 a=temp;
		while(a>0) {
			rem=a%10;
			arm=arm+(int)Math.pow(rem, count);
			a=a/10;
			
		}
			if(arm==temp) {
				System.out.println("armstrong");
			}
			else {
				System.out.println("not a armstrong");
			}
		

	}

}
