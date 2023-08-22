package collections;

import java.io.FileNotFoundException;

public class unchecked {

	public static void main(String[] args)throws FileNotFoundException
	{
		Hello h=new Hello();
		h.method1();
		
	}

}
class Hello
{
	public void method1() throws FileNotFoundException
	{
		try {
		method2();
		}
		catch(FileNotFoundException f) {
			System.out.println("hollah");
		}
	}
	public void method2() throws FileNotFoundException {
		throw new FileNotFoundException("hey i am File");
	}
	
}
