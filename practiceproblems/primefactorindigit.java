package practiceproblems;
import java.util.*;
public class primefactorindigit {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("please enter");
		long a=sc.nextLong(),i=1,count=0,rem = 0,fact=1,temp=0;
		while(a>0) {
		 	count=0;
		 rem=a%10;i=1;fact=1;
		 while(i<=rem) {
			 if(rem%i==0) {
				 count++;
			 }
			 i++;
			 
		 }
		 
		 if(count==2) {
			  
			  int i1=1;
			 while(rem>=i1) {
				 fact=fact*i1;
				 i1++;
				 
			}
			 System.out.println("The Factorial of  "+rem+"  is  "+fact);
		 
		
		 }
		 
		 
		 
		 
		 
		 a=a/10;
		}
		}
		
	}


