package oops;

public class arthimeticproblem {
	public static void main(String args[])
	{
	arth a=new arth();
	a.add();
	a.sub();
	a.mul();
	a.div();
	}

}
interface Calc1{
	public void add();
	public void sub();
}
interface Calc2 extends Calc1{
	public void mul();
	public void div();
}
class arth implements Calc2{
	int a=10;
	int b=20;
	@Override
	public void add() {
		
		System.out.println(a+b);
		
	}

	@Override
	public void sub() {
		System.out.println(a-b);
		
	}

	@Override
	public void mul() {
		System.out.println(a*b);
		
	}

	@Override
	public void div() {
		System.out.println(a/b);
		
	}
	
}
