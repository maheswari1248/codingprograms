package codinghub.range;

public class exam5range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=123,sum=0,rem=0,prod=1,temp=0;
		for(a=123;a<=1000;a++) {
			 sum=0;
			 prod=1;
			 temp=a;
			 
			for(int b=a;b>0;b=b/10) {
				rem=b%10;
				sum=sum+rem;
				prod=prod*rem;
				
			}
			//System.out.println(sum);
			
			//System.out.println(prod);
			
			if(prod==sum) {
				System.out.println(a);
			}
    	
		}

	}

}
