package codinghub;

public class automorphicnumber {

	public static void main(String[] args) {
		/*Example
		Input : 5
		Output : 25
		Explanation : Number = 5
		when squared you get 25
		as 25 ends with 5*/
		int a=9,rem=0,rev=0,rem1=0,r=a;
		int b=(int)Math.pow(a,2);
		while(b>0) {
			rem=b%10;
			rev=rev*10+rem;
			b=b/10;
		}
		int temp=rev;
		while(temp>0) {
			rem1=temp%10;
			temp=temp/10;
		}
		if(rem1==r) {
			System.out.println("automorphic");
		}
		else {
			System.out.println("not automorphic");
		}
		

	}

}
