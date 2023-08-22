package arraychapter1;

public class banking {

	public static void main(String[] args) {
		User u=new User(2000, 5000, 1000);
		u.deposit();
		

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
	public void change() {
		
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}
	
}
class User
{
	 static int deposit,withdraw;
	 int total,cash;
	User(int deposit,int withdraw,int cash)
	 {
		 this.deposit=deposit;
		 this. withdraw=withdraw;
		 this.cash=cash;
	}
	public void deposit() 
	{
		total=deposit+cash;
		System.out.println(total);
	}
}