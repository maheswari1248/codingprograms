package codinghub;

public class count {

	public static void main(String[] args) {
	   int i=1234,count=0,sum=0,rem=0,product=1;
	   for(i=1234;i>0;i/=10) {
		   rem=i%10;
		   count++;
		   sum=sum+rem;
		   product=product*rem;
		   
		   
	   }
	    System.out.println("The count is :"+count);
	    if(count%2==0) {
	    	System.out.println("the sum of the digits is:"+sum);
	    	
	    }
	    else {
	    	System.out.println("The product of the digits is:"+product);
	    }
	   
	   
	}

}
