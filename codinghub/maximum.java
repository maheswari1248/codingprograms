package codinghub;
import java.util.Scanner;
 class maximum {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the value:");
		
		int max=0,rem=0;
		int a=sc.nextInt();
		while(a>0) {
			rem=a%10;
			if(rem>max) {
				max=rem;
			}
			a=a/10;
			
			
		}
		System.out.println(max);
		
		
	}

}
