package oops;

public class intreface_using_multiple {

	public static void main(String[] args) {
		C c=new C();
		c.add();
		c.div();
		c.mul();
		c.sub();

	}

}
interface A
{
	int a=10,b=20;
	public  void add();
	public void sub();
}
interface B 
{
	int c=10;
	int d=20;
	public void mul();
	public void div();
}
class C implements A,B{

	
	public void add() {
		System.out.println("the sum:"+a+b);
		
	}

	@Override
	public void sub() {
		System.out.println("The sub:"+(a-b));		
	}

	@Override
	public void mul() {
		System.out.println("the mul:"+(c*d));
		
	}

	@Override
	public void div() {
		System.out.println("the div :"+(c/d));
		
	}
	
}
