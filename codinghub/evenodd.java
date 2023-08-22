package codinghub;

public class evenodd {
	public static void main(String args[]) {
		int rem=0;
		for(int i=1754;i>0;i/=10) {
			rem=i%10;
			
			if(rem%2==0) {
				rem=rem+2;
				System.out.println("the even numbers is incremented:"+rem);
			
			}
			else if(rem%2!=0) {
				rem=rem+1;
				System.out.println("the odd numbers is incremented by 1:"+rem);
			}
		
		}
		
		
	}

}
