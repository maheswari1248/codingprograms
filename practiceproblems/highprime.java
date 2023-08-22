package practiceproblems;

public class highprime {
	int rem=0,max=0;
	public int high(int a) {
		for(a=123456;a>0;a=a/10) {
			rem=a%10;
			if(rem>max) {
				max=rem;
			}
			
		}
		return max;
	}
	public void prime(int result) {
		int i=2,count=0;
		    while(result>=i/2) {
		    	if(result%i==0) {
		    		count++;
		    	}
		}
		    if(count==0) {
		    	System.out.println(i);
		    }
		
	}
	

	public static void main(String[] args) {
		int a=6,rem=0,max=0,i=1,count=0,j=1;
		highprime h=new highprime();
		int result=h.high(a);
		System.out.println(result);
		 
		
				
			
	
		
		
		
	}

}
