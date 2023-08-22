package model2methods;
 class prime{
	 int a,count,x;
	 public int primes() {
	          int i=1;  
		 while(a>=i) {
			 if(a%i==0) {
				 count++;
			 }
			 i++;
			 
		 }
		 return count;
		 
	 }
 }
public class primeornot {

	public static void main(String[] args) {
		prime p=new prime();
		p.a=11;
		int result=p.primes();
		if(result==2) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
	}

}
