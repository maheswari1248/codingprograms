package advancedjava;
import java.util.*;
public class lis {

	public static void main(String[] args)
	{
	 List l=	listing.method1();
	 System.out.println(l);

	}

}
class listing
{
	static List l=new ArrayList();
	public static List method1()
	{
		l.add(10);
		l.add(20);
		return l;
	}
	
}
