package stringproblems;

public class evenoddreverse {
	public static void  main(String args[]) {
		String s1=new String("Hello all Good Morning");
		String s2[]=s1.split(" ");
		String temp1="";
		String ans="";
		for(int x=0;x<s2.length;x++) {
			
			if(x%2==0)
			{
				String temp=s2[x];
				for(int i=0;i<temp.length();i++)
				{
				if(temp.charAt(i)>='A' && temp.charAt(i)<='Z') 
				{
					System.out.print((char)(temp.charAt(i)+32)+" ");
				}
				else {
					System.out.print((char)(temp.charAt(i)-32)+" ");
				}
				}
				
			}
			else {
				temp1=s2[x];
				for(int i=temp1.length()-1;i>=0;i--) {
					System.out.print(temp1.charAt(i)+" ");
				}
				
			}
			
			
		}
			
				
				
			}
              
	}

		
		
	


