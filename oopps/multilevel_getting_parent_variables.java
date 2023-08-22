package oopps;

public class multilevel_getting_parent_variables {

	public static void main(String[] args)
	{ 
    B a=new B(100,200);
	  a.print1();
	  a.print();
	  
	}

}
class Apple
{
	int a;
	int b;
	Apple(int a,int b){
		this.a=a;
		this.b=b;
	}
	public void print() {
		System.out.println(a+" "+b);
	}
}
class B extends Apple
{
	
	B(int a,int b) 
	{
	    super(10,20);
	}
	public void print1() {
		System.out.println(a+" "+b);
	}
	
}
