package stringproblems;

public class stringreverse {

	public static void main(String[] args) 
	{
		String s=new String("Hello All Good Morning");
		String s1[]=s.split(" ");
		String s2="";
		for(int i=s1.length-1;i>=0;i--) 
		{
			s2=s2+s1[i];
		}
		System.out.println(s2);

	}

}

