package codinghub.range;

import java.util.Scanner;

public class exam4range {
     public static void main(String args[]) {
    	 Scanner sc=new Scanner(System.in);
    	 int a=sc.nextInt();
    	 int b=sc.nextInt();
    	 int rem=0,count=0;
    	 for(int i=a;i<=b;i++)
    	 {
    		 for(int j=a;j!=0;j/=10) {
    			 rem=a%10;
    			 count++;
    		 }
    		 System.out.println(count);
    		 
    		 
    		 }
    	 }
}
