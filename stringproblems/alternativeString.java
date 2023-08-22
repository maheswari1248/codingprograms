package stringproblems;

public class alternativeString {

	public static void main(String[] args) 
	{
		String s=new String("abcdef");
		String s1=new String("pqrstuv");
		
		A a=new A();
		a.alternate(s, s1);

	}

}
class A
{
	public void alternate(String s,String s1)
	{
		int c=s.length()+s1.length();
		for(int i=0;i<c;i++) {
			if(i<s.length())
				System.out.print(s.charAt(i));
			if(i<s1.length())
				System.out.print(s1.charAt(i));
		}
	}
}

