package oopps;

public class inheritanceobject extends Object{

	public static void main(String[] args) {
		A a=new A();
		System.out.println(a.getClass());
		System.out.println(a.hashCode());
		System.out.println(a.toString());
		
		}

}
class A 
{
	int a;
	A()
	{
	a=10;	
	}
	public static void main(String args[]) {
		System.out.println("hello");
	}
	
}
