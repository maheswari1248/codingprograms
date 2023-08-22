package stringproblems;

public class longestsubstring_without_repeated_characters {

	public static void main(String[] args) {
		String s1="abcabcbbdefg";
		char a[]=s1.toCharArray();
		String ans=" ";
		int i,j;
		for( i=0;i<a.length;i++) {
			for( j=0;j<a.length;j++) {
				if(a[i]==a[j]) 
				{
					break;
				}
			}
			if(i==j) {
				ans=ans+a[i];
			}
		}
		System.out.println(ans);

	}

}
