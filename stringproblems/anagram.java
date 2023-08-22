package stringproblems;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		
		String s1=new String("Listen");
		String s2=new String("Silent");
		char c1[]=s1.toUpperCase().toCharArray(); 
	     char c2[]=s2.toUpperCase().toCharArray();
		
		if(s1.length()==s2.length()) {
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2)) {
				
				System.out.println("Anagaram");
			}
			else {
				System.out.println("not anagaram");
			}
		}
		else {
			System.out.println("not anagaram");
		}

	}

}
