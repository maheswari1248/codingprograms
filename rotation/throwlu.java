package rotation;

public class throwlu {

	public static void main(String[] args)
	{
		Add a=new Add();
		a.method1();
		a.method2();
	}

}
class Add{
	public void method1() {
		try {
			method2();
		}
		catch(ArithmeticException ae) {
			System.out.println("hello");
		}
	}
	public void method2() {
		throw new ArithmeticException("hello");
	}
}