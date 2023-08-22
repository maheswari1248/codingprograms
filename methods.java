
public class methods {
	void mahe() {
		int a=28,i=1,count=0,temp=a,rem=0,rev=0,count1=0;
		while(a>=i) {
			if(a%i==0) {
				count++;
				i++;
			}
			if(count==2) {
				System.out.println("prime"+temp);
			}
			else {
				System.out.println("not a prime");
			}
			a=a/10;
		}
		while(temp>0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println(rev);
		int j=1;
		int temp1=rev;
		while(rev>j) {
			if(rev%j==0) {
				count1++;
				
			}
			if(count1==2) {
				System.out.println(temp1);
			}
			rev=rev/10;
			
			
			
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         methods m=new methods();
         m.mahe();
         
	}

}
