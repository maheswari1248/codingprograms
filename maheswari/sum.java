package maheswari;

public class sum {
	public static void main(String args[]) {
		int n=25567,rem=0,sum=0,count=0;
		/*while(n>0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
			count++;
			
			
		}
		System.out.print(sum);
		System.out.println(count);
		System.out.println(rem);*/
		for(int i=4567;i>0;i/=10) {
			rem=i%10;
			sum=sum+rem;
		}
		System.out.print(sum);
	}

}
