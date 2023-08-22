package codinghub.range;

import java.util.Scanner;

public class palindromerangeprime {

	public static void main(String[] args) 
	{
		int count=0,rem=0,rev=0,temp=0,x=1,temp1=0,count1=1,j=0,z=0;
		for( x=1;count1<=10;x++) {
			count=0;rev=0;
			for( j=2;j<=x/2;j++) {//i=1 ,count=1 and break no need
				if(x%j==0) {
					count++;
					break;//accuracy is decreased by keeping it break
				}
			}
			for(z=x;z>0;z=z/10) {
				rem=z%10;
				rev=rev*10+rem;
		}
			if(rev==x &&count==0&&x!=1) {
				System.out.println(x);
				count1++;
			}
	}
		
	}
}