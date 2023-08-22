package maheswari;
import java.util.*;

public class number {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int number=12300,rem=0,rev=0,digit=0,digit2=0,rev1=0,rem1=0;
		int copy=number;
		for(;number>0;number/=10) {
			rem=number%10;
			rev=rev*10+rem;
			digit++;
			
		}
		System.out.println(rev);

		number=copy;
		int temp=rev;
		for(;rev>0;rev/=10) {
			digit2++;
			
			rem=rev%10;
			
			
			
		}
		while(temp!=0) {
			rem=temp%10;
		
		
		
		
		switch(rem) {

		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		case 6:
			System.out.println("six");
			break;
		case 7:
			System.out.println("seven");
			break;
		case 8:
			System.out.println("eight");
			break;
		case 9:
			System.out.println("nine");
			break;
		
		default:
			System.out.println("nothing");
		}
		temp=temp/10;
	}
		
		
	int digit1=digit-digit2;
	for(int i=1;i<=digit1;i++) {
		System.out.println("zero");
	}
		
	}
}
	


