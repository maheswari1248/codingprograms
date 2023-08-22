package stringproblems;

public class vowels_deletion 
{

	public static void main(String[] args) 
	{
		String s=new String("apple");
		char c[]=s.toCharArray();int i,count=1;
		for( i=0;i<c.length;i++) {
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u') 
			{
				count++;
				continue;
			}
			else {
				System.out.println(c[i]);
			}
		}
		

	}

}
