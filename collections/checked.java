package collections;

public class checked {

	public static void main(String[] args) 
	{
		
  Add a=new Add();
  a.method1();
		  
	}

}
class Add
{
	public void method1() 
	{
		try {
		method2();
		}
		catch(Exception ae) {
			System.out.println("hello");
		}
		
	}
	public void method2()
	{
		
		throw new ArithmeticException("i am in exception");
	}
	
}