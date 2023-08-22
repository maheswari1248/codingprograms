package practiceproblems;
import java.util.Scanner;
public class legalnumbers {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the number");
	  long  a=sc.nextLong(),count=0,rem,sum=0;
	  while(a>0) {
		  count++;
		  
		  rem=a%10;
		  sum=rem*count+sum;
		  a=a/10;
		  
	  }
	  System.out.println(sum);
	  if(sum%11==0) {
		  System.out.println("legal number");
	  }
	  else {
		  System.out.println("Not a legal number");
	  }
	  
	}

}
