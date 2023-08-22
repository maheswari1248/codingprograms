package codinghub;

public class swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=123456,rem=0,p,r;
		while(a>0) {
			rem=a%10;
			p=rem%10;
			r=rem/10;
			
			System.out.print(p);
			a=a/10;
		}

	}

}
