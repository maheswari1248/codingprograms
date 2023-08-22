package codinghub;

public class practice {

	public static void main(String[] args) {
		int n=12903,max=0,rem=0;
		
		for(;n>0;n/=10) {
			rem=n%10;
			
			if(rem>max) {
	           max=rem;
			}
		}
		System.out.println(max);
		
		
		
	}

}
