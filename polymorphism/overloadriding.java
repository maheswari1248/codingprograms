package polymorphism;

public class overloadriding {

	public static void main(String[] args) {
		child c=new child();
		System.out.println("method overriding");
		c.method();
		System.out.println("method overloading");
		c.method(2900, 300);
	}

}
class student
{
	int a;int b;
	student()
	{
		a=10;b=20;
	}
	public void method() {
		System.out.println(a+b);
	}
	public void method(int a,int b) {
		System.out.println(a-b);
	}
	
}
class child extends student
{
	public void  method() {
		System.out.println(a+b+a);
	}
}