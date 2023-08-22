package stringproblems;

public class palindrome {

	public static void main(String[] args) {
		String s=new String("MaDAMi");
		
		String s1="";
		boolean b=false;
		int i=0,j=s.length()-1;
		while(j>i) {
			if(s.charAt(i)==s.charAt(j)) {
				b=true;
			}
			else {
				b=false;
			}
			i++;
			j--;
			
		}
		if(b)
		{
		System.out.println("palindrome");
		}
		else {
			System.out.println(" not palindrome");
		}
				
			

		

	}

}
