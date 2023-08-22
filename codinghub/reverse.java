package codinghub;
import java.util.Scanner;

public class reverse {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=12300,rem=0,sum=0;
	while(a>0) {
		rem=a%10;
		sum=sum*10+rem;
		a=a/10;
		

	}
	System.out.println(sum);
	while(sum!=0) {
		rem=sum%10;
		System.out.print(rem);
		sum=sum/10;
	}
	
}

}
