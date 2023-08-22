package oops;

public class multiple {

	public static void main(String[] args) {
		c ca=new c();
		ca.print();
      
	}

}
class A{
	String name;
	int age;
	A(){
		name="mahe";
		age=21;
	}

}
class B
{
	int a;
	B(){
		a=10;
	}
	
}
class c extends A,B{
	String name;
	int age;
	c(){
		super();
		name="bhanu";
		age=21;
	}
	public void print() 
	{
	System.out.println(a+" "+name+" "+age);
	}
}