package codinghub.range;

public class primefibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2,temp=0,count=0,c=0,a1=0,b=1;
		for(int i=10;i<=100;i++) {
			count=0;
			c=0;
			temp=i;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					count++;
					break;
				}
				
			}
			if(count==0) {
				System.out.println(i);
				
				while(temp>0) {
					
					c=a1+b;
					System.out.println(a1);
					
					a1=b;
					b=c;
					break;
					
				}
			}
			
		}
	}

}
