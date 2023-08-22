package practiceproblems;

public class twinprime {

	public static void main(String[] args) {
		int n=11,count=0,n1=13,count1=0,count2=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				count++;
			}
			
		}
		if(count==0) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
		for(int i=2;i<=n1/2;i++) {
			if(n1%i==0) {
				count1++;
			}
			
		}
		if(count1==0) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
		if(count==0&&count1==0) {
			for(n=11;n<=13;n++) {
				count2++;
			}
			if(count==2) {
				System.out.println("twin prime");
			}
		}
	}

}
