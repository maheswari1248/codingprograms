package package1;

import java.util.Scanner;

public class banker {

	public static void main(String[] args)
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("please enter the access");
		String access=sc.next();
		String name,name1,email,email1;
		int num,num1;
		
        
        switch(access) 
        {
        case "User":
        	System.out.println("please enter deposit values");
    		int deposit=sc.nextInt();
		User u=new User(deposit, 1000);
		u.deposit();
		System.out.println("please enter the withdraw amount");
        int withdraw=sc.nextInt();
		User u1=new User(withdraw);
		u1.withdraw();
		break;
		case "Manager":
		manager m=new manager();
	    
	    System.out.println("Please enter the deposit");
	    deposit=sc.nextInt();
		User u2=new User(deposit,1000);
		m.deposit();
		System.out.println("please enter the withdraw");
		withdraw=sc.nextInt();
		User u3=new User(withdraw);
		m.withdraw();
		System.out.println("please enter name");
		 name=sc.next();
		System.out.println("please enter email");
		 email=sc.next();
		System.out.println("please enter num");
		 num=sc.nextInt();
		clerk c=new clerk(name,email,num);
		clerk.change();
		break;
		case "clerk":
			System.out.println("please enter name");
			 name=sc.next();
			System.out.println("please enter email");
			 email=sc.next();
			System.out.println("please enter num");
			 num=sc.nextInt();
			clerk c1=new clerk(name,email,num);
			c1.change();
			
			break;
		case "Accountant":
			System.out.println("please enter deposit values");
    	 deposit=sc.nextInt();
		User b=new User(deposit, 1000);
		b.deposit();
		System.out.println("please enter the withdraw amount");
        withdraw=sc.nextInt();
		User b1=new User(withdraw);
		b1.withdraw();
			break;
			
        }
        
        	

	}

}
abstract class sbi{
	public abstract void change();
	public abstract void  deposit();
	public abstract void withdraw();
	
}
class manager extends sbi
{

	@Override
	public void change() 
	{
		clerk.change();
		
	}

	@Override
	public void deposit() {
	  int deposit=User.deposit;
	  int total=User.total;
	  User.deposit();
	 
		
	}

	@Override
	public void withdraw() {
		 int withdraw=User.withdraw;
		 //System.out.println("the withdraw amount is"+withdraw);
		 User.withdraw();
		
	}
	
}
class User
{
	 static int deposit,withdraw;
	 static int total=deposit+withdraw,cash,total1;
	User(int deposit,int cash)
	 {
		 this.deposit=deposit;
		 //this. withdraw=withdraw;
		 this.cash=cash;
	}
	User(int withdraw)
	{
		this.withdraw=withdraw;
		
		
	}
	static void deposit() 
	{
		System.out.println("your amount in the bank is "+cash);
		total=deposit+cash;
		System.out.println("total amount after depositing"+total);
	}
	static void withdraw() {
		if(withdraw<total) {
		total1=total-withdraw;
		System.out.println("total amount after withdraw"+total1);
		}
		else {
			System.out.println("insufficient balance");
		}
	}
}
class clerk
{
	static Scanner s=new Scanner(System.in);
			
	static String name,name1;
	static String email,email1,check;
	static int num,num1;
	clerk(String name,String email,int num)
	{
		this.name=name;
		this.num=num;
		this.email=email;
		this.name1=name1;
		this.email1=email1;
		this.num1=num1;
	}
	
	static void change() 
	{
		System.out.println("please enter name1");
		  name1=s.next();
		System.out.println("pleasee enter email1");
		 email1=s.next();
		System.out.println("please enter num1");
		 num1=s.nextInt();
		if(name.equalsIgnoreCase(name1))
		{
			System.out.println("Name is not changed ");
		}
		else {
			System.out.println("name is changed");
		}
		if(email==email1) {
			System.out.println("not changed email");
		}
		else {
			System.out.println("Email is changed");
		}
		if(num==num1) {
			System.out.println("Number not Changed");
		}
		else {
			System.out.println("Number changed");
		}
		String check="checking is done";
		System.out.println(check);
	}
}
class Accountant{
	public void deposit() {
		User.deposit();
	}
	public void withdraw() {
		User.withdraw();
	}
	
}