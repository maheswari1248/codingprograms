package maheswari;
import java.util.*;
public class numberadd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),count=0,rem=0,p=0,temp=a,num=0,num2=0,sum=0,sqr=0;
		while(a>0) {
			rem=a%10;
			count++;
			a=a/10;
			
		}
		a=temp;
		count=count/2;
		p=(int)Math.pow(10, count);
		num=a%p;
		num2=a/p;
		System.out.println("num value:"+num);
		System.out.println("num1 value:"+num2);
		sum=num+num2;
		sqr=sum*sum;
		if(sqr==temp) {
			System.out.println("tech number");
		}
		else {
			System.out.println("not a tech number");
		}
		
		
		
		
	}

}
