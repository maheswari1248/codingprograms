package codinghub;

public class minimum {

	public static void main(String[] args) {
		int n=74526,min=9,rem=0;
		while(n>0) {
			rem=n%10;
			if(rem<min) {
				min=rem;
			}
			n=n/10;
		}
		System.out.println(min);

	}

}
