package stringproblems;

public class convertuppertolowwer
{
    public static void main(String args[])
    {
    	String s=new String("Hello all Good Morning");
    	for(int i=0;i<s.length();i++) 
    	{

    		if(s.charAt(i)>='A' && s.charAt(i)<='Z')
    		{
    			System.out.print((char)(s.charAt(i)+32)+" ");
    			
    		}
    		if(s.charAt(i)>='a' && s.charAt(i)<='z')
    		{
    			System.out.print((char)(s.charAt(i)-32)+" ");
    		}
    		
    	}
    }
}
