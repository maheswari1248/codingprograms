package stringproblems;

public class madammcapital {

	public static void main(String[] args) {
		String s1=new String("hello all good morning");
		String[] s2=s1.split(" ");
		String ans="";
		for(int x=0;x<s2.length;x++)
		{
			String s=s2[x];
			 
			
			ans+=s.substring(0,1).toUpperCase()+s.substring(1,s.length())+" ";//+s.substring(s.length()-1).toLowerCase()+" ";
		
		}
		System.out.println(ans);
	
		
	}
		

	
}
