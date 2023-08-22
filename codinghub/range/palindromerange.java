package codinghub.range;

public class palindromerange {

	public static void main(String[] args) {
		  int rem=0,rev=0;
		  int x=121,copy=x,y,count=0;
		  
		for(x=1;count<=10;x++) {
			rev=0;
			for( y=x;y>0;y/=10) {
				rem=y%10;
				rev=rev*10+rem;
			}
			if(x==rev) {
				
				System.out.println(rev);
				
				count++;
				
			}
			
			
			
			
		}
		System.out.println("the count is"+count);

	}

}
