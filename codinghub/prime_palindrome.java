package codinghub;

public class prime_palindrome {
	public static void main(String args[]) {
	   int a=11,rev=0,rem=0,temp=a,count=0;
		while(a>0) {
			rem=a%10;
			rev=(rev*10)+rem;
			a=a/10;
		}
		if(rev==temp) {
			System.out.println("palindrome");
		}
		
		for(int i=1;i<=temp;i++) {
			if(temp%i==0) {
				count++;
			}
			
		}
		System.out.println(count);
		if(count==2) {
			System.out.println("prime");
		}
		if(rev==temp && count==2) {
			System.out.println("palindrome prime");
		}
		else {
			System.out.println("not palindrome prime");
		}
		
		
		
	}
	

}
