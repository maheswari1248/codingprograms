package stringproblems;

public class largeststring {

	public static void main(String[] args) {
		String s1=new String("Hello all good morning");
		String a[]=s1.split(" ");
		int max=0;
		String index="";
		for( i=0;i<a.length;i++)
		{
			if(a[i].length()>max) {
				max=a[i].length();
				index=i;
			}
		}
		System.out.println(max);

	}

}
