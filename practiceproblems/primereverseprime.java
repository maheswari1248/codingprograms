package practiceproblems;

public class primereverseprime {
	public static void main(String args[]) {
	int a=27,i=1,count=0,temp=a,rem=0,rev=0,count1=0;
	while(a>=i) {
		if(a%i==0) {
			count1++;
		}
		i++;
	

	}
	if(count1==2)
		System.out.println("prime");
	else
		System.out.println("not prime");
	
	while(temp>0) {
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
		
	}
	System.out.println(rev);
	int j=1;
	while(rev>=j) {
		if(rev%j==0) {
			
			count++;
		}
		j++;
	}
	if(count==2) 
	System.out.println("prime");
	else {
		System.out.println("not prime");
	
	}
	if(count==2&&count1==2)
		System.out.println(" both are primes");
	else
		System.out.println("both are not prime");
	}
	
}
