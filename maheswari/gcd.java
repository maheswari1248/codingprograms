package maheswari;

public class gcd {

	public static void main(String[] args) {
		int a=10,b=20,c=1,res=1;
		while(c<=10 && c<=20) {
			if(a%c==0 && b%c==0) {
				res=c;
			}
			c++;
		}
		System.out.println(res);
	}

}
