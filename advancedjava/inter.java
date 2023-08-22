package advancedjava;
import java.util.*;
public  class inter
{
	public static void main(String args[]) 
	{
		inters i1=add.caldata();
		System.out.println(i1);
	}

}
class add
{
	static inters i=new interimple();
	public static inters caldata() {
		i.m1();
		return i;
	}
	
}
interface inters
{
	public  void m1();
	
	
}
class interimple implements inters{

	@Override
	public void m1() 
	{
		System.out.println("method1");
	}
	
}