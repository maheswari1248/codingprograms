package codinghub;

public class factorial_of_three {
	public static void main(String args[]) {
		int a=145,rem=0,rev=0,b=0,c=0,m=0,d=0,sum=0,temp=a;
		
	  
	  while(a>0) {
		  rem=a%10;
		  int fact1=1;
		  for(b=1;b<=rem;b++) {
			  fact1=fact1*b;
		  }
		  
		  sum=sum+fact1;
		  a=a/10;
	  }
	  System.out.println(sum);
	  
	
	  if(sum==temp) {
		  System.out.println("Strong number");
	  }
	  else {
		  System.out.println("not a strong number");
	  }
	 
	  
	  
	  
	  	  
	  
		
		
			
		}
		
	}


