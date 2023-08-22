package package1;
import package2.third;
public class protectedA {
	protected int a;
   protected protectedA() 
   {
	   a=500;
   }
   protected void display() {
	   System.out.println("hello i am in protectedA");
   }
	public static void main(String[] args)
	{
		protectedA p=new protectedA();
		p.display();

	}

}
