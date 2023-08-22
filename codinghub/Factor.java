package codinghub;

public class Factor {
	 public static void main(String args[]) {
		 int a=1,b=6,sum=0;
		 while(a<=b) {
			 if(b%a==0) {
				 sum=sum+a;
			 }
			 a++;
		 }
		System.out.println(sum);
		 
		 
			 
	 }

}
