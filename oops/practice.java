package oops;

public class practice {

	public static void main(String[] args)
	{
		String s=new String("Hello All Good Morning");
		String s1[]=s.split(" ");
		String s2="";
		char ans='0';
		for(int i=0;i<s1.length;i++)
		{
			 s2=s1[i];
			 for(int j=0;j<s2.length();j++) 
			 {
				 ans=s2.charAt(0);
			 }	
			 System.out.println(ans);
		}
		

	}

}
