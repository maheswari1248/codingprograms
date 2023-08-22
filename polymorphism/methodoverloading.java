package polymorphism;

public class methodoverloading {

	public static void main(String[] args) {
		A a=new A();
		a.method1(10, 20);
		a.method1(10, 20, 30);
		a.method1(10, 20, '0');
		a.method1('0', 20, "mahe");

	}

}
class A
{
	public void method1(int a,int b) {
		System.out.println(a+" "+b);
	}
	public void method1(int a,int b,int c) {
		System.out.println(a+" "+b+" "+c);
	}
	public void method1(int a,int b,char c) {
		System.out.println(a+" "+b+" "+c);
	}
	public void method1(char a,int b,String c) {
		System.out.println(a+" "+b+" "+c);
	}
}