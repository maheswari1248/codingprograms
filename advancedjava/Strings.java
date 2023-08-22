package advancedjava;

public class Strings
{

	public static void main(String[] args) 
	{
		cal c=new cal();
		String s2=c.method1();
		System.out.println(s2);
		

	}

}
class cal{
	int a,b,c;
	cal(){
		a=10;
		b=20;
	}
	public String method1()
	{
		c=a+b;
		
		return c+" ";
		
		}
	}

