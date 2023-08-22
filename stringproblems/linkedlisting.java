package stringproblems;
import java.util.*;
public class linkedlisting 
{

	

	public static void main(String[] args) {
    LinkedList l=new LinkedList();
    l.add(10);
    l.add(20);
    l.add(30);
    l.add(40);
    LinkedList l1=new LinkedList();
    l1.add(l);
    System.out.println(l1);
   desc m=new desc();
   m.method1();
 
	}

}
class desc
{ 
	 public void method1() 
	 {
		 int a[]= {10,20,30,40};
		 ArrayList a1=new ArrayList();
		 for(int i=0;i<a.length;i++) {
			 a1.add(a);
		 }
		 System.out.println(a1);
		 
	 } 
	
}