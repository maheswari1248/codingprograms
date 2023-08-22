package codinghub;

public class primes {
     public static void main(String args[]) {
    	 int a=11,b=13,n=1,count=0,counts=0,m=1,c=0,count2=0;

    	 while(n<=b  ) {
     		if(b%n==0 ) {
     		   count++;
     		
     		    	}
     	
     		n++;
      }
    	 System.out.println(count);
    	 if(count==2) {
     		 System.out.println("prime is"+b);
     	 }
     	 else {
     		 System.out.println("not a prime for b");
     	 }
    	 while(m<=a  ) {
      		if(a%m==0 ) {
      		   counts++;
      		
      		    	}
      	
      		m++;
       }
     	 System.out.println(counts);
     	 if(count==2) {
     		 System.out.println("prime for a");
     	 }
     	 else {
     		 System.out.println("not a prime for a");
     	 }
     	 
     	 if(count==2 && counts==2) {
     	 
     	 
     	 for(a=a+1;a<b;a++) {
     		 count2++;
     		 
     	 }
     	 System.out.println("count for 11 and 13 is:"+count2);
     	 if(count2==1) {
     		 System.out.println("it satisifies as co prime");
     		 
     	 }
     	 
     	 }
     	 else {
     		 System.out.println("it doesnot satisifies");
     	 }
     	
     	
     }
}

