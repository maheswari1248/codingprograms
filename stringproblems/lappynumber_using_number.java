package stringproblems;

public class lappynumber_using_number {

	public static void main(String[] args) {
		String s1=new String("192");
		int s2=Integer.parseInt(s1)*2;
		int s3=Integer.parseInt(s1)*3;
		String num=s1+s2+s3;
		String ans="";
		int j;
		//System.out.println(num);
		
		for(int i=0;i<num.length();i++)
		{
			for(j=0;j<num.length();j++) 
			{
				if(num.charAt(i)==num.charAt(j)) 
				{
					break;
				}
				
			}
			if(i==j) 
			{
				ans=ans+num.charAt(i);
			}
			
			
		}
		if(num.equals(ans))
		{
			System.out.println(num);
		}
		

	}

}
