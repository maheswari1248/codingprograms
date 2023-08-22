package arraychapter1;

import java.util.*;

public class class_As_returntype 
{

	public static void main(String[] args) 
	{
	 iter i=	Add.caldata();
	 
	}

}
class Add
{
  static 	iter i=new iterimple();
	public static  iter caldata() {
		i.m1();
		return i;
	}
}
interface iter
{
	public void m1();
	
}
class iterimple implements iter{

	@Override
	public void m1() {
		System.out.println("method1");
		
	}
	
}