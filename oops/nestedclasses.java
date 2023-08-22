package oops;

public class nestedclasses

{
	 int data=30;  
	 class Inner
	 {  
	  void msg()
	  {
		  System.out.println("data is "+data);
	  }  
	 }  
	 

	public static void main(String[] args)
	{
		nestedclasses ns=new nestedclasses();
		nestedclasses.Inner in=ns.new Inner();
		in.msg();

	}

}
