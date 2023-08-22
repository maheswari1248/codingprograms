package BasicPrograms;
import java.util.*;
public class Insurance {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter input as string");
		String s=sc.next();
		System.out.println("age");
		int age=sc.nextInt();
		System.out.println("lives in");
		String lives=sc.next();
		System.out.println("gender");
		String gender=sc.next();
		System.out.println("policy_amount");
		int policy_amount=sc.nextInt();
		double premium=0;
		if(s.equals("excellent") && ( age<=35 && age>=25) && gender.equals("male") && policy_amount<=200000 && lives.equals("city")) {
			 premium=(4000*policy_amount)/1000;
		}
		
		else  if(s.equals("excellent") && ( age<=35 && age>=25) && gender.equals("female") && policy_amount<=100000 &&lives.equals("city") ) 
		{
			 premium=(3000*policy_amount)/1000;
		}
		else  if(s.equals("poor") && ( age<=35 && age>=25) && gender.equals("male") && policy_amount<=10000 && lives.equals("village")) 
		{
			 premium=(6000*policy_amount)/1000;
		}
		
		else {
			System.out.println("she did not get insurance");
		}
		System.out.println(premium);
		
		
		
	}

}
