package polymorphism;

public class methodoverriding {

	public static void main(String[] args) {
		
		m s1=new m();
		s1.method1();

	}

}
class S{
	int a=10,b=20;
	public void method1() 
	{
	System.out.println(a+" "+b);	
	}
	
	
	
}
class m extends S
{
	public void method1()
	{
		super.method1();
		//System.out.println("hello");
	}
}
