package model2methods;


public class palindrome {
      int a;
	int rev;
	int rem;
	int temp;
	public int reverse() {
		temp=a;
		while(a>0) {
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		return rev;
		
		
	}
	public String checking() {
		if(rev==temp)
			return "palindrome";
			else
				return "not palindrome";
		
	}
	

	public static void main(String[] args) {
		palindrome p=new palindrome();
		p.a=123;
		
		System.out.println(p.reverse());
		System.out.println(p.checking());
		
		
			}
}

