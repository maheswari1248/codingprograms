
public class bank {

	public static void main(String[] args)
	{
	  banka a=new banka();
	  a.getbalance();
	  bankb b=new bankb();
	  b.getbalance();
	  bankc c=new bankc();
	  c.getbalance();
	}

}
abstract  class banks
{
	public abstract  void getbalance();
	
}
class banka extends banks{

	@Override
	public void getbalance() {
		System.out.println("1000");
		
	}
	
}
class bankb extends banks{

	@Override
	public void getbalance() {
		System.out.println("5000");
		
	}
	
}
class bankc extends banks{

	@Override
	public void getbalance() {
		System.out.println("2000");
		
	}
	
}

