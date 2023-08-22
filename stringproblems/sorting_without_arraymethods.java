package stringproblems;

public class sorting_without_arraymethods {

	public static void main(String[] args) {
		String s1=new String("Apple");
		String s2=" ";
		for(int i=65;i<=122;i++) {
			for(int j=0;j<s1.length();j++) {
				if((char)(i)==s1.charAt(j)) {
					s2=s2+s1.charAt(j);
					
				}
				
			}
			
		}
		System.out.println(s2);
	}

}
