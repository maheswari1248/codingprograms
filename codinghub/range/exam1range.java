package codinghub.range;

public class exam1range {
  public static void main(String args[]) {
	  int rem=0,sum=0;
	  for(int i=1;i<=100;i++) {
		  sum=0;
		  int sqr=i*i;
		  for(int j=sqr;j!=0;j/=10) {
			  rem=j%10;
			  
			  sum=sum+rem;
		  }
		  if(sum==i) {
			  System.out.println("equals"+i);
		  }
		  else {
			  System.out.println("not equals"+i);
		  }
	  }
  }
}
