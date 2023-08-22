package maheswari;

public class perfect {
	public static void main(String args[]) {
		int n=1,num=6,sum=0,c=num;
		while(n<num) {
			if(num%n==0) {
				sum=sum+n;
			}
			n++;
		}
		System.out.println((sum==c)?"perfect number":"not a perfect number");
			
	}

}
