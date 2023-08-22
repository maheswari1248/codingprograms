package package1;

public class A {

	public static void main(String[] args) {
		banana b=new banana();
		b.display();
       privateA a=new privateA();
       System.out.println(a.getA());
        		
	}

}
class apple{
	int a;
	private int b;
	apple()
	{ 
		b=22333;
		a=1000;
	}
	public void printdata() {
		System.out.println("hey i am in a"+(a+b));
	}
}