 package maheswari;

public class second {

	public static void main(String[] args) {
		int a=1034,rem=0,max=0,second=0;
		while(a>0) {
			rem=a%10;
			if(rem>max) {
				max=rem;
			    
			}
			if(rem>second && rem<max) {
				second=rem;
			}
			
			
			a=a/10;
		}
		System.out.println(second);
			
		
		

	}
}


