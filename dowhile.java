
public class dowhile {

	public static void main(String[] args) 
	{
		int a=121;
		int rem=0,rev=0;
		do {
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}

		while(a>0);
		System.out.println(rev);
	}

}
