package package2;

import package1.protectedA;

public class protecedB  extends protectedA
{   
	 protected String a;
	 protecedB()
	 {
		 a="maheswari";
	 }

	public static void main(String[] args)
	{
	  protecedB p=new 	protecedB();
	  p.display();
	  System.out.println(p.a);

	}

}
