package oops;
interface a
{
	public void m1();
	
}
interface b extends a
{
	public void m2();
}
interface c extends a
{
	public void m3();
	
}
class d implements b,c
{

	@Override
	public void m1() {
		System.out.println("hello");
		
	}

	@Override
	public void m3() {
		System.out.println("all");
		
	}

	@Override
	public void m2() {
		System.out.println("goodmorning");
		
	}
	
}
public class hybrid_using_interface
{
  public static void main(String args[]) 
  {
	  d da=new d();
	  da.m1();
	  da.m2();
	  da.m3();
	  
  }
}
