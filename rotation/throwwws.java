package rotation;

import java.io.FileNotFoundException;

public class throwwws {

	public static void main(String[] args) throws FileNotFoundException
	{
		
		A a=new A();
		a.method1();
		a.method2();

	}

}
class A{
	public void method1() throws FileNotFoundException
	{
		try {
		method2();
		}
		catch(FileNotFoundException fe) {
			System.out.println("i am in hello");
		}
	}
	public void method2() throws FileNotFoundException
	{
		throw new FileNotFoundException("hello");
	}
}