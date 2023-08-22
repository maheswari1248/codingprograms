package arrays;

public class palindrome {

	public static void main(String[] args) {
		int a[]= {1,2,132,121,9};
		int rem=0,rev=0,i,j,y;
		for( i=0;i<a.length;i++) {
			 
			rev=0;
			for( y=a[i];y>0;y/=10) {
				rem=y%10;
				rev=rev*10+rem;
			}
		
			if(rev==a[i]) {
				System.out.println(a[i]);
			}
		}

	}

}
