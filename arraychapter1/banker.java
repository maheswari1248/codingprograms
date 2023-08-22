package arraychapter1;

import java.util.Scanner;

public class banker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("M----> CLERK");
		System.out.println("N----->USER");
		System.out.println("please select the username");
		String username=sc.next();
         switch(username) {
         case "M":
		M m=new M();
		m.mains();
		m.change();
		
		
		break;
         case "N":
		N n=new N();
		n.print();
		n.deposit();
		n.withdraw();
		break;
         case "Manager":
		Manager ma=new Manager();
		ma.manage();
		ma.withdraw();
		ma.deposit();
		ma.change();
		break;
         case "Accountant":
        	 Accountant a=new Accountant();
        	 a.deposit();
        	 a.withdraw();
        	 
         }
	}

}
interface bank
{
	public abstract void deposit();	

	public abstract void change();
	public abstract void withdraw();
	
}
interface user extends bank
{

	public static  int deposit = 5000,cash=1000,avaialable_balance=cash+deposit; 

	 default void deposit() 
	{
		
		
		System.out.println("deposited amount is"+deposit+" availbalance"+avaialable_balance);
		
	}
	default void withdraw() {
		String name="maheswari";
		int withdraw=140000;
		int last_amount=avaialable_balance-withdraw;
		System.out.println(name+" "+"withdraws this amount"+withdraw+" available_balance"+last_amount);
		if(withdraw>last_amount) {
			System.out.println("insufficient balance");
		}
	}
	
}
	
interface clerk extends bank
{
	
	default void change() 
	{
		
		String name1="mahe";
		if(name1.equals("mahe") ){
			System.out.println("NOT changed name   "+name1);
		}
		else {
			System.out.println("changed name   "+name1);
		}
		String email="mahe@1248";
		if(email.equals("mahe@1248")) {
			System.out.println("not changed email   "+email);
		}
		else {
			System.out.println("changed email   "+email);
		}
		int num=986544345;
		if(num!=986544345) {
			System.out.println("changed Mobilenumber  "+num);
		}
		else {
			System.out.println("not changed Mobilenumber  "+num);
		}
		
	
	}
}
class M implements clerk,user
{
	public void mains() {
		System.out.println("i am clerk");
	}
}
 class N implements user,clerk{
	public void print() {
		System.out.println("i am user");
	}
	

	
}
class Manager implements clerk,user
{
	public void manage() {
		System.out.println("i am maanger");
	}

	


}
 class Accountant implements user,clerk{
	public void account() {
		System.out.println("I am Accountant");
	}
}


