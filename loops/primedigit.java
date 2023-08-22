package loops;

public class primedigit {
	public static void main(String args[]) {
		int a=1734,count=0,rem=0,c=0;
		int b=1;
		int temp=a;
		while(a>0) {
			rem=a%10;
			while(rem>=b) {
			if(rem%b==0) {
				count++;
			}
			
			if(count==2) {
				
			
			System.out.println(rem);
		   	
		}
			b++;
			rem=rem/10;
			
			
			}
			a=a/10;	
		
		}
		
		
	}

}
