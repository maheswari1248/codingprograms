package collections;

public class garbage 
{
	public void finalize() 
	{
	System.out.println("hello");	
	}
	static {
		System.out.println("hello all");
	}

	public static void main(String[] args) 
	{
		String s1=new String();
		String s2=new String();
		s1=null;
		s2=null;
		System.gc();
		garbage g=new garbage();
		g.finalize();
		
		

	}

}
