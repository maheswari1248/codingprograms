package collections;
import java.util.*;

public class index {

	public static   void main(String[] args)
	{
		ArrayList a=new ArrayList();
		a.add(20);
		a.add(50);
		a.add("hello");
		System.out.println(a);
		A a2=new A();
		a2.foreach();
        a2.wrapping();
        List <product> p=new ArrayList();
                      
	}

}
class A
{

	public void foreach() {
		ArrayList a1=new ArrayList();
		a1.add(20);
		a1.add(30);
		a1.add("hello");
		a1.add("bhanu");
		System.out.println("using for each loop");
		for(Object var:a1) {
			System.out.println(var);
		}
	}
	public <integer> void wrapping() {
		//ArrayList<integer> a3=new ArrayList<>();
		List<Integer> a3=new ArrayList<>();
        a3.add(10);
        a3.add(20);
        System.out.println("wrapper");
        System.out.println(a3);
	}
}
class product
{
	long Id;
	int number;
	String name;
	int phno;
	public String toString()
	{
		return name+" "+number+" "+Id+" "+phno;
		
	}
}