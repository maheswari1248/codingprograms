package stringproblems;

public class vowelsconsonants {

	public static void main(String[] args) {
		String s=new String("hello all good morning");
		int vowels=0,consonants=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
			   vowels++;
			}
			   
			else
			{
				consonants++;
				System.out.print(s.charAt(i)+" ");
			}
				
			}
			
		
		
		System.out.println(consonants);
		System.out.println(vowels);

	}

}
