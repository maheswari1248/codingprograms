
public class abstractionproblem {

	public static void main(String[] args) {
		C c=new C();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		c.m5();
		c.m6();
		System.out.println();
		System.out.println("upcasting when grandparent");
		
		A a=new C();
		
		a.m1();
		a.m2();
		a.m3();
		
		System.out.println();
		System.out.println("all access when we are taking parent");
		
		B b=new C();
		b.m1();
		b.m2();
		b.m3();
		b.m4();
		b.m5();
		b.m6();
		
		
	}

}
abstract class A
{
	public  abstract void m1() ;
	public void m2() {
		System.out.println("parentt - m2");//concrete method
	}
	public abstract void m3();
	
	
}
abstract class B extends A{
	public  abstract void m4() ;
	
	public void m5() {
		System.out.println("hello");
	}
	public abstract void m6();
		
}
class C extends B{

	@Override
	public void m3() {
		System.out.println("override - m3");
		
	}

	@Override
	public void m4() {
		System.out.println("b -m4");
		
	}

	@Override
	public void m6() {
		System.out.println("b-m6");
		
	}

	@Override
	public   void m1() {
		System.out.println("a-m1");
		
	}
	
}