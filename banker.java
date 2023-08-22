
public class banker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M m=new M();
		m.change();
		m.deposit();
		m.withdraw();
		N n=new N();
		n.print();
		n.deposit();
		n.withdraw();
		Manager ma=new Manager();
		ma.manage();
		ma.withdraw();
		m.deposit();
		m.change();

	}

}
interface bank
{
	public abstract void deposit();	

	public abstract void change();
	public abstract void withdraw();
	
}
interface user
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
	
interface clerk extends user
{
	default void change() 
	{
		String name1="mahe";
		if(name1.equals("mahe") ){
			System.out.println("changed name   "+name1);
		}
		else {
			System.out.println("Not changed name   "+name1);
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
class M implements clerk
{
	public void mains() {
		System.out.println("i am clerk");
	}
}
class N implements user{
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


