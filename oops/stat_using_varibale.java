package oops;

public class stat_using_varibale {
	
	
	public static  void main(String[] args) 
	{
		
	 apple a=new apple();
	 apple.display();
     a.d();
     banana.printdata();
	}

}
class apple{
	
	static int a;
	public static void display() 
	{
		 a=20;
		
		
		System.out.println(a);
	
	}
	static int b;
	public void d() 
	{
		b=11;
		System.out.println(b);
		
		
	}
}
class banana
{
	 static int a=10;
	public static  void printdata() 
	{
		a=a+1;
		System.out.println(a);
	}
	
}

